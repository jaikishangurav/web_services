package com.learnhub.model;

public class CourseData {
	
	private int pnum;
	
	private String title;
	
	private String image;
	
	private String url;
	
	private String price;
	
	private String type;
	
	private String category;
	
	private String rating;
	
	private String description;

	public CourseData(int pnum, String title, String image, String url,
			String price, String type, String category, String rating,
			String description) {
		super();
		this.pnum = pnum;
		this.title = title;
		this.image = image;
		this.url = url;
		this.price = price;
		this.type = type;
		this.category = category;
		this.rating = rating;
		this.description = description;
	}

	public CourseData() {
		// TODO Auto-generated constructor stub
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
