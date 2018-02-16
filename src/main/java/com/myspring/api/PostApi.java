package com.myspring.api;

import com.myspring.jpa.domain.Post;

import javax.validation.constraints.NotNull;

public class PostApi {
    String name;
    int price;
    String description;

    public PostApi () {}

    public PostApi(Post post) {
        this.name = post.getName();
        this.price = post.getPrice();
        this.description = post.getDescription();
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
