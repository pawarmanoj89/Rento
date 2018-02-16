package com.myspring.jpa.domain;
import com.myspring.api.PostApi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Post {
    @Id
    @GeneratedValue
    private int id;
    private int price;
    String name;
    String description;

    public Post() {}

    public Post(PostApi postApi) {
        this.price=postApi.getPrice();
        this.name=postApi.getName();
        this.description=postApi.getDescription();
    }

    public Post(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
