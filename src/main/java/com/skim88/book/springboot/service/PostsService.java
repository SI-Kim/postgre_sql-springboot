package com.skim88.book.springboot.service;

import com.skim88.book.springboot.domain.posts.Posts;
import com.skim88.book.springboot.domain.posts.PostsRepository;
import com.skim88.book.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository repository;

    public PostsResponseDto findById(Long id) {
        Posts entity = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new PostsResponseDto(entity);

    }

}
