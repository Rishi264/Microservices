package com.example.commentService.fisCommentService.service;

import java.util.List;

import com.example.commentService.fisCommentService.model.Comment;

public interface commentService {
	
	public List<Comment> findAllComments();
	public Comment addComment(Comment comment);
	public String deleteComments(int cid);
	public List<Comment> findAllCommentsByCommenter(String commenter);
	public List<Comment> findAllCommentsByComment(String comment);
	public List<Comment> findAllCommentsByPid(int pid);
}
