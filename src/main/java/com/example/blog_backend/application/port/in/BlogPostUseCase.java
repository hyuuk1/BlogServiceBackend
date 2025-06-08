package com.example.blog_backend.application.port.in;

public interface BlogPostUseCase {
    boolean  create(CreateBlogPostRequestDto request);
}
