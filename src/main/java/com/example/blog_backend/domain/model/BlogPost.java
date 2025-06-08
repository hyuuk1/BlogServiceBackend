package com.example.blog_backend.domain.model;

import lombok.Getter;

import java.time.LocalDateTime;

public class BlogPost {
    @Getter
    private final Integer id;
    @Getter
    private final String title;
    @Getter
    private final String content;
    @Getter
    private final LocalDateTime publishDate;

    public BlogPost(Integer id, String title, String content, LocalDateTime publishDate) {
        if (title == null) {
            throw new IllegalArgumentException("title cannot be null");
        }
        if (content == null) {
            throw new IllegalArgumentException("content cannot be null");
        }
        this.id = id;
        this.title = title;
        this.content= content;
        this.publishDate = publishDate;
    }

}
