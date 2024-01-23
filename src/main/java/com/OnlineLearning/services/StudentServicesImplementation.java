package com.OnlineLearning.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineLearning.entity.Course;
import com.OnlineLearning.entity.Lesson;
import com.OnlineLearning.entity.Users;
import com.OnlineLearning.repository.LessonRepository;
import com.OnlineLearning.repository.UserRepository;

@Service

public class StudentServicesImplementation implements StudentServices{
	

	
		@Autowired
		UserRepository ur;
		@Autowired
		LessonRepository lessonRepo;
		@Override
		public Lesson getLesson(int lessonId) {
			
			return lessonRepo.findById(lessonId).get();
			
		
		
		

	}

}
