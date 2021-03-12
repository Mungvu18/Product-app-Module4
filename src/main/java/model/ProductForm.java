package model;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class ProductForm {
    private Long id;
    private String name;
    private double price;
    private int amount;
    private MultipartFile image;
    private Date dateTime;

    public ProductForm() {
    }

    public ProductForm(Long id, String name, double price, int amount, MultipartFile image, Date dateTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.image = image;
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
