package com.codeNurbek.blogserver.service;

import com.codeNurbek.blogserver.entity.Comment;

import java.util.List;

public interface CommentService {

    Comment createComment(Long postId, String postedBy, String content);
    List<Comment> getCommentsByPostId(Long postId);
}
