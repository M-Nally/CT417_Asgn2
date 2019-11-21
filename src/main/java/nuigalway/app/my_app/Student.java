package nuigalway.app.my_app;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {
	private String name, username;
	private DateTime dob;
	private int age, ID;
	private ArrayList<Module> modules = new ArrayList<Module>();
	private ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
	
	public Student(String name, int age, int ID, DateTime dob) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public DateTime getDOB() {
		return dob;
	}
	
	public int getID() {
		return ID;
	}
	
	public ArrayList<Module> getModules() {
		return modules;
	}
	
	public ArrayList<CourseProgramme> getCourses() {
		return courses;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setDOB(DateTime dob) {
		this.dob = dob;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public void joinModule(Module module) {
		this.modules.add(module);
	}
	
	public void joinCourse(CourseProgramme course) {
		this.courses.add(course);
	}
	
	public void dropModule(Module module) {
		this.modules.remove(module);
	}
	
	public void dropCourse(CourseProgramme course) {
		this.courses.remove(course);
	}
	
	
	public String getUsername() {
		if (this.username == null) {
			this.username = name + age;
		} 
		return this.username;
	}
}


