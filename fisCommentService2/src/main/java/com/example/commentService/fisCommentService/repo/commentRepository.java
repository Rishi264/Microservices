package com.example.commentService.fisCommentService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.commentService.fisCommentService.model.Comment;

public interface commentRepository extends JpaRepository<Comment, Integer>{
	@Query("select c from Comment c where c.commenter=?1")
	public List<Comment> findCommentsByCommenter(String commenter);
	
	@Query("select c from Comment c where c.comment=?1")
	public List<Comment> findCommentsByComment(String comment);
	
	@Query("select c from Comment c where c.pid=?1")
	public List<Comment> findCommentsByPid(int pid);
}
