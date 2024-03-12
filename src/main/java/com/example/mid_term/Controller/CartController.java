package com.example.mid_term.Controller;

import com.example.mid_term.DTO.FakeStoreCartDTO;
import com.example.mid_term.Service.CartService;
//import com.example.mid_term.Service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController

public class CartController {

    CartService cs ;
    public CartController(CartService cs){
        this.cs = cs;
    }

    @GetMapping("/Working")
    public static String sayWorking(){
        return "It is Working";
    }

    @GetMapping("/carts")
    public FakeStoreCartDTO[] getAllCart(){
        return cs.getAllCart();
    }


    @GetMapping("/carts/{id}/")
    public FakeStoreCartDTO getCartbyId(@PathVariable("id") Long id) {
        return cs.getCartbyId(id);
    }

    @GetMapping("/carts/user/{id}/")

    public FakeStoreCartDTO[] getUserCartbyId(@PathVariable("id") Long id){
        return cs.getUserCartbyId(id);
    }

    @DeleteMapping("/carts/delete/{id}/")
    public String deleteCartbyId(@PathVariable("id") Long id){
        cs.deleteCartbyId(id);
        return "Cart is being Deleted";
    }
}
