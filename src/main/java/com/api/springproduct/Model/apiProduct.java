package com.api.springproduct.Model;

public class apiProduct {

    private String name;
    private String description;
    private Long stock;
    private Long price;
    private Long freightprice;
    private String image;

    public apiProduct(String name, String description, Long stock, Long price, Long freightprice, String image) {
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.freightprice = freightprice;
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

    public Long getFreightprice() {
        return freightprice;
    }

    public void setFreightprice(Long freightprice) {
        this.freightprice = freightprice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
