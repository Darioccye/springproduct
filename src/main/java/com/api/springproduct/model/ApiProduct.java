package com.api.springproduct.model;

public class ApiProduct {

    private String name;
    private String description;
    private Long stock;
    private Long price;
    private Long freightPrice;
    private String image;

    public ApiProduct(String name, String description, Long stock, Long price, Long freightPrice, String image) {
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.freightPrice = freightPrice;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(Long freightPrice) {
        this.freightPrice = freightPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
