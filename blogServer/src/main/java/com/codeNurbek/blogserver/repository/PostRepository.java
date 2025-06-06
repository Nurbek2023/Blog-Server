package com.codeNurbek.blogserver.repository;

import com.codeNurbek.blogserver.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository <Post,Long>{
    List<Post> findAllByNameContaining(String name);
}
