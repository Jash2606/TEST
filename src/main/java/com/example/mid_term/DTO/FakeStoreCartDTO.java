package com.example.mid_term.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class product{
    int ProductId;
    int quantity;
}
public class FakeStoreCartDTO {
    public Long id;
    public String userId;
    public String date;
    public product products[];
}
