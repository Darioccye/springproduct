package com.api.springproduct.Model;

import jakarta.persistence.*;

@Entity
@Table(name= "products")
public class product {

    @Id
    @Column(name="id")
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="stock")
    private Long stock;
    @Column(name="price")
    private Long price;
    @Column(name="freightprice")
    private Long freightprice;
    @Column(name="image")
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getFreightprice() {
        return freightprice;
    }

    public void setFreightprice(Long freightprice) {
        this.freightprice = freightprice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public apiProduct ToApiProduct(){
        return (new apiProduct(name, description, stock, price, freightprice, image));
    }
}
