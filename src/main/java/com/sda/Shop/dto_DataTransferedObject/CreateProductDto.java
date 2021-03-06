package com.sda.Shop.dto_DataTransferedObject;

import lombok.Data;
// dto_DataTransferedObject - służy do tego, by ograniczyć ilość pól,
//                          które klient nam przesyła

@Data
public class CreateProductDto {

    private Integer price;

    private Integer quantity;

    private String description;

    private String image_url;

}
