package com.activity.library.api.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document(collection = "books")
public class Book {

    @Id
    private String id;
    private String title;
    private String author;
    private String ISBN;
    private BigDecimal price;

 /*   // ===// CONSTRUTORES //===
    public Book() {}

    public Book(String id, String title, String author, String ISBN, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    // ===// GETTERS & SETTERS //===
    /*public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public String getISBN() {return ISBN;}
    public void setISBN(String ISBN) {this.ISBN = ISBN;}
    public BigDecimal getPrice() {return price;}
    public void setPrice(BigDecimal price) {this.price = price;}*/
}
