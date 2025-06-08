package com.example.blog_backend.adapter.in;

import com.example.blog_backend.adapter.in.dto.CreateBlogPostRequest;
import com.example.blog_backend.application.port.in.CreateBlogPostRequestDto;
import com.example.blog_backend.application.port.in.BlogPostUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class BlogPostController {
    private final BlogPostUseCase useCase;
    public BlogPostController(BlogPostUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createHobby(@RequestBody CreateBlogPostRequest request) {
        CreateBlogPostRequestDto createDto = new CreateBlogPostRequestDto(request.getTitle(), request.content);
        useCase.create(createDto);

        return ResponseEntity.ok().build();
    }
}
