package com.OnlineLearning.services;
import java.util.List;

import com.OnlineLearning.entity.Course;
import com.OnlineLearning.entity.Lesson;

public interface TrainerService {
	
	
		public String addCourse(Course course);
		
		public String saveCourse(Course course);
		
		public String addLesson(Lesson lesson);
		
		public Course getCourse(int courseId);
		
		public List<Course> courseList();

}
