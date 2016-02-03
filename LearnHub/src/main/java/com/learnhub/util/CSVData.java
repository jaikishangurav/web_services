package com.learnhub.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.learnhub.model.CourseData;

public class CSVData {

	public static List<CourseData> parseCSV(String filePath) throws IOException{
		FileReader fileReader = new FileReader(filePath);
		
		CSVParser csvParser = new CSVParser(fileReader, CSVFormat.EXCEL.withHeader("pnum","title","image","url","price","type","category","rating","description"));
		List<CSVRecord> csvRecords = csvParser.getRecords();
		List<CourseData> courseDataList = new ArrayList<CourseData>();
		for (CSVRecord record : csvRecords) {
			CourseData data = new CourseData(Integer.parseInt(record.get("pnum")),record.get("title"),record.get("image"),record.get("url"),record.get("price"),record.get("type"),record.get("category"),record.get("rating"),record.get("description"));
			courseDataList.add(data);		
		 }
		return  courseDataList;
	}
	
	public static void main(String args[]){
		try {
			List<?> lsit= parseCSV("src/main/resources/LearnHub.csv");
			CourseData data = (CourseData)lsit.get(1);
			System.out.println(data.getPnum()+" "+data.getTitle());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
