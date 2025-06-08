package com.example.blog_backend.adapter.out;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="blog_post")
@Data
public class BlogPostJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "data", columnDefinition = "TEXT")
    private String content;

    @Column(name = "publish_date")
    private LocalDateTime publishDate;

    public BlogPostJpaEntity() {}

    public BlogPostJpaEntity(String title, String content, LocalDateTime publishDate) {
        this.title = title;
        this.content = content;
        this.publishDate = publishDate;
    }

}
