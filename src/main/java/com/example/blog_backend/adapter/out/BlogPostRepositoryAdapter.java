package com.example.blog_backend.adapter.out;

import com.example.blog_backend.application.port.out.BlogPostRepositoryPort;
import com.example.blog_backend.domain.model.BlogPost;
import org.springframework.stereotype.Repository;

@Repository
public class BlogPostRepositoryAdapter implements BlogPostRepositoryPort {

    private final BlogPostRepository jpaRepository;

    public BlogPostRepositoryAdapter(BlogPostRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public void create(BlogPost blogPost) {
        BlogPostJpaEntity entity = new BlogPostJpaEntity(
                blogPost.getTitle(),
                blogPost.getContent(),
                blogPost.getPublishDate()
        );
        jpaRepository.save(entity);
    }
}
