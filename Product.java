package com.practice.serde;

import java.io.Serializable;

public class Product implements Serializable {
    protected String productName;
    protected String type;

    public Product(String productName, String type) {
        this.productName = productName;
        this.type = type;
    }



}
