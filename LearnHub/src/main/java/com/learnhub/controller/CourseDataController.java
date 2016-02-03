package com.learnhub.controller;

import com.learnhub.model.CourseData;
import com.learnhub.service.SearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseDataController {
	
	@Autowired
	SearchService searchService;

	@ResponseBody
	@RequestMapping(value="/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public CourseData searchByTitle(@RequestParam(value="title", required=true) String title){
		CourseData courseData = new CourseData();
		courseData = searchService.searchByTitle(title);
		return courseData;
	}
	
	@RequestMapping(value="/count", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public CourseData totalCourses(){
		CourseData courseData = new CourseData();
		
		return courseData;
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public CourseData listCourse(@RequestParam(value="type", required=true) String type){
		CourseData courseData = new CourseData();
		return courseData;
	}
	
}
