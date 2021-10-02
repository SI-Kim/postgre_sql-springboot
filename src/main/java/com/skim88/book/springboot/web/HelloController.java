package com.skim88.book.springboot.web;

import com.skim88.book.springboot.domain.posts.Posts;
import com.skim88.book.springboot.domain.posts.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private PostsRepository repository;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
