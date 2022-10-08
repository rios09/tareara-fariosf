package ol;

import java.io.Serializable;

public class CCourse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7180444535631670566L;
	private long CourseId;
	private String CourseTitle;
	
	public CCourse() {
		super();
	}
	public long getCourseId() {
		return CourseId;
	}
	public void setCourseId(long courseId) {
		CourseId = courseId;
	}
	public String getCourseTitle() {
		return CourseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		CourseTitle = courseTitle;
	}
	
	
	
}
