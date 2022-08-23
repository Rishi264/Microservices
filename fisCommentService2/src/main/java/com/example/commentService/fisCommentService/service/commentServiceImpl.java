package com.example.commentService.fisCommentService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.commentService.fisCommentService.model.Comment;
import com.example.commentService.fisCommentService.repo.commentRepository;

@Service
public class commentServiceImpl implements commentService {
	@Autowired
	commentRepository repo;

	@Override
	public List<Comment> findAllComments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Comment addComment(Comment comment) {
		// TODO Auto-generated method stub
		return repo.save(comment);
	}

	@Override
	public String deleteComments(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "data deleted";
	}

	@Override
	public List<Comment> findAllCommentsByCommenter(String commenter) {
		// TODO Auto-generated method stub
		return repo.findCommentsByCommenter(commenter);
	}

	@Override
	public List<Comment> findAllCommentsByComment(String comment) {
		// TODO Auto-generated method stub
		return repo.findCommentsByComment(comment);
	}

	@Override
	public List<Comment> findAllCommentsByPid(int pid) {
		// TODO Auto-generated method stub
		return repo.findCommentsByPid(pid);
	}

	

	
}
