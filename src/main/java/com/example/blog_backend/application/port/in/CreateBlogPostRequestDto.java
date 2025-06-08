package com.example.blog_backend.application.port.in;

import lombok.Data;
import lombok.Getter;

@Data
public class CreateBlogPostRequestDto {
    @Getter
    private final String title;
    @Getter
    private final String content;

    public CreateBlogPostRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() { return title; }
    public String getContent() { return content; }
}
