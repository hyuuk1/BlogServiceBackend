package com.example.blog_backend.application.impl;

import com.example.blog_backend.application.port.in.CreateBlogPostRequestDto;
import com.example.blog_backend.application.port.in.BlogPostUseCase;
import com.example.blog_backend.domain.model.BlogPost;
import com.example.blog_backend.application.port.out.BlogPostRepositoryPort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BlogPostService implements BlogPostUseCase {

    private final BlogPostRepositoryPort repository;

    public BlogPostService(BlogPostRepositoryPort blogPostRepository) {
        this.repository = blogPostRepository;
    }

    @Override
    public boolean create(CreateBlogPostRequestDto request) {
        String sanitizedTitle = sanitize(request.getTitle());
        String sanitizedData = sanitize(request.getContent());
        LocalDateTime now = LocalDateTime.now();
        BlogPost post = new BlogPost(null,sanitizedTitle, sanitizedData,now );
        repository.create(post);
        return true;
    }

    private String sanitize(String input) {
        return input.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }
}
