package com.learnhub.dao;

import java.io.IOException;
import java.util.List;

import com.learnhub.model.CourseData;
import com.learnhub.util.CSVData;

public class SearchDAO {
	
	public CourseData searchByTitle(String title){
		CourseData data = new CourseData();
		try {
			List<CourseData> courseDataList = CSVData.parseCSV("src/main/resources/LearnHub.csv");
			for(CourseData courseData:courseDataList){
				if(courseData.getTitle().equals(title)){
					data=courseData;
					break;
				}	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
	
	
	
}
