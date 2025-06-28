package com.tekoahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekoahub.model.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {
  
}