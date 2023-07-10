package com.example.blogplatformapi.repository;


import com.example.blogplatformapi.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
