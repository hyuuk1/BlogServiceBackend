package com.example.blog_backend.adapter.in.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateBlogPostRequest {
    @NotBlank
    public String title;
    @NotBlank
    public String content; // HTMLコンテンツ

    private String sanitize(String data) {return"";}
}
