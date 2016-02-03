package com.learnhub.service;

import com.learnhub.dao.SearchDAO;
import com.learnhub.model.CourseData;

public class SearchService {
	public CourseData searchByTitle(String title){
		CourseData courseData = new CourseData();
		courseData = (new SearchDAO()).searchByTitle(title);
		return courseData;
	}
}
