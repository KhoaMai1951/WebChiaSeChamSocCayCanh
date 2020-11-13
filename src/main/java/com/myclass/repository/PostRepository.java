package com.myclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myclass.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, String>{

}
