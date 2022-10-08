package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import ol.CCourse;

public class CourseDal {
	CCourse Course;
	private String filePath;
	private String fileName;	
	private List<CCourse> Courses;
	public CourseDal() {
		super();
	}
	public CCourse getCourse() {
		return Course;
	}
	public void setCourse(CCourse course) {
		Course = course;
	}
	
	public List<CCourse> getCourses() {
		return Courses;
	}
	public void setCourses(List<CCourse> courses) {
		Courses = courses;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	
	
	public void saveList() {
		
		File CFile = new File(filePath + "\\" + fileName);		
		try {
			
			
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(CFile));
			os.writeObject(Courses);
			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<CCourse> openList() {
		try {
			File CFile = new File(filePath);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CFile));
			List <CCourse> b = (List<CCourse>)ois.readObject();
			ois.close();
			return b;
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
