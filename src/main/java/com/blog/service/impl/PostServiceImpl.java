package com.blog.service.impl;

import com.blog.entity.Post;
import com.blog.payload.PostDto;
import com.blog.repository.PostRepository;
import com.blog.service.PostService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service public class PostServiceImpl implements PostService {


  private  PostRepository postRepository;
    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post newPost = postRepository.save(post);


        PostDto dto = new PostDto();
        dto.setId(newPost.getId());
        dto.setTitle(postDto.getTitle());
        dto.setDescription(newPost.getDescription());
        dto.setContent(newPost.getContent());

        return dto;
    }

    /**
     * @return
     */
    @Override
    public List<PostDto> listAllPosts(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        return null;
    }
}
