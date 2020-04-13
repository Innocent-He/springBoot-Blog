package com.hgy.service;

import com.hgy.po.Comment;

import java.util.List;

/**
 * Created by He on 2020/4/22.
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
