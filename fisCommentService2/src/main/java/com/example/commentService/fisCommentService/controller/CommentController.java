package com.example.commentService.fisCommentService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.commentService.fisCommentService.model.Comment;
import com.example.commentService.fisCommentService.service.commentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	
	@Autowired
	commentService service;

	
	@GetMapping("/all")
	public List<Comment> getAll(){
		return service.findAllComments();
	}
	
	@PostMapping("/add")
	public Comment addComment(@RequestBody Comment comment) {
		return service.addComment(comment);
	}
	
	@DeleteMapping("/delete/{cid}")
	public String deleteComments(@PathVariable("cid")int cid) {
		return service.deleteComments(cid);
	}
	
	@GetMapping("/commenter/{commenter}")
	public List<Comment> getAllByCommenter(@PathVariable("commenter")String commenter){
		return service.findAllCommentsByCommenter(commenter);
	}

	@GetMapping("/comment/{comment}")
	public List<Comment> getAllByComment(@PathVariable("comment")String comment){
		return service.findAllCommentsByComment(comment);
	}
	

	@GetMapping("/search/{pid}")
	public List<Comment> getAllByPid(@PathVariable("pid")int pid){
		return service.findAllCommentsByPid(pid);
	}
	
}
