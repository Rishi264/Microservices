package com.example.commentService.fisCommentService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="comments")
public class Comment {
		@Id
		int cid;
		@Column
		int pid;
		@Column
		String commenter;
		@Column
		String comment;
		public Comment()
		{
			
		}
		public Comment(int cid, int pid, String commenter, String comment) {
			super();
			this.cid = cid;
			this.pid = pid;
			this.commenter = commenter;
			this.comment = comment;
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getCommenter() {
			return commenter;
		}
		public void setCommenter(String commenter) {
			this.commenter = commenter;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		
		
}
