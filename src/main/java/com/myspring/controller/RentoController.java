package com.myspring.controller;

import com.myspring.api.PostApi;
import com.myspring.jpa.domain.Post;
import com.myspring.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/rento")
public class RentoController {

    @Autowired
    PostService postService;

    @GetMapping("/post/{name}")
    public PostApi getMyName(@PathVariable("name") String str) {
        return postService.getPost(str);
    }

    @PostMapping("/post")
    public void createPost(@Valid @RequestBody PostApi postApi) {
        postService.createPost(postApi);
    }

    @GetMapping("/post")
    public List<Post> getAll() {
        return postService.getAllPosts();
    }
}
