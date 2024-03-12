package com.example.mid_term.Service;

import com.example.mid_term.DTO.FakeStoreCartDTO;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CartService {
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com";
    public FakeStoreCartDTO[] getAllCart() {
        FakeStoreCartDTO response[] = restTemplate.getForObject(url + "/carts" , FakeStoreCartDTO[].class );
        return response;
    }

    public FakeStoreCartDTO getCartbyId(Long id){
        FakeStoreCartDTO response = restTemplate.getForObject(url + "/carts/" + id , FakeStoreCartDTO.class );
        return response;
    }

    public FakeStoreCartDTO[] getUserCartbyId(Long id){
        FakeStoreCartDTO response[] = restTemplate.getForObject(url + "/carts/user/" + id , FakeStoreCartDTO[].class );
        return response;
    }

    public void deleteCartbyId(Long id){
        restTemplate.delete(url + "/" + id);
    }

}
