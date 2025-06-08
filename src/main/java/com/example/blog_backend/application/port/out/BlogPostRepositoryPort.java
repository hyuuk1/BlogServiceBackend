package com.example.blog_backend.application.port.out;

import com.example.blog_backend.domain.model.BlogPost;

public interface BlogPostRepositoryPort {
    void create(BlogPost blogPost);
}
