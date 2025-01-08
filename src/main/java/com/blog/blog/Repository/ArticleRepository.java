package com.blog.blog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blog.Entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
