package com.example.blog_backend.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPostJpaEntity, Long> {
}
