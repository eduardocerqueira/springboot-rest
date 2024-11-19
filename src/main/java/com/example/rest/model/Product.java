package com.example.rest.model;

import lombok.Getter;
import lombok.Setter;;

@Getter
@Setter
public class Product {
    private Long id;
    private String name;
    private Data data;
}
