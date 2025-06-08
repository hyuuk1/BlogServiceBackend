package com.example.blog_backend.adapter.in.dto;

import java.time.LocalDateTime;

public class BlogPostResponse {
    public Long id;
    public String title;
    public String data;
    public LocalDateTime createdAt;

    public BlogPostResponse(Long id, String title, String data, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.data = data;
        this.createdAt = createdAt;
    }
}