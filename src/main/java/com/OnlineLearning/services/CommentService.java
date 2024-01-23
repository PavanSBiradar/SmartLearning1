package com.OnlineLearning.services;
import java.util.List;

import com.OnlineLearning.entity.Comments;

public interface CommentService {
	
	
		List<Comments> commentList();
		String addComment(Comments comment);

}
