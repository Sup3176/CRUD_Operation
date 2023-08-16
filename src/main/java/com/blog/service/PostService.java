package com.blog.service;

import com.blog.payload.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> listAllPosts(int pageNo, int pageSize);
}
