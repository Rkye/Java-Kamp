package kodlamaIODemo.entities;

public class Courses {
	
	private int courseId;
	private String courseName;
	private double price;
	private String courseImg;
	private String description;
	private Category category;
	
	public Courses() {
		
	}

	public Courses(int courseId, String courseName, double price, String courseImg, String description, Category category) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.price = price;
		this.courseImg = courseImg;
		this.description = description;
		this.category = category;
	}


	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCourseImg() {
		return courseImg;
	}

	public void setCourseImg(String courseImg) {
		this.courseImg = courseImg;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
