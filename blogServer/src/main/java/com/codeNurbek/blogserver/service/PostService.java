package com.codeNurbek.blogserver.service;

import com.codeNurbek.blogserver.entity.Post;

import java.util.List;

public interface PostService {

    Post createPost(Post post);

    List<Post> getAllPosts();

    public Post getPostById(Long postId);

    public void likePost(Long postId);

    public List<Post> searchByName(String name);
}
