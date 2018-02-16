package com.myspring.services;

import com.myspring.api.PostApi;
import com.myspring.jpa.domain.Post;
import com.myspring.jpa.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PostService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostService.class);

    @Autowired
    PostRepository postRepository;


    public PostApi getPost(String name) {
        LOGGER.info(String.format("Getting post %s", name));
        Post post = postRepository.findByName(name);
        return post == null ? null : new PostApi(post);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
   public void createPost(PostApi postApi) {
       LOGGER.info(String.format("Creating postApi %s", postApi.getName()));
       postRepository.save(new Post(postApi));
   }
}
