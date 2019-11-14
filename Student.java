import java.util.ArrayList;
import java.util.Date;

public class Student {
	private String name, username;
	private Date dob;
	private int age, ID;
	private ArrayList<Module> modules;
	private ArrayList<CourseProgramme> courses;
	
	public Student(String name, int age, int ID, Date dob, ArrayList modules, ArrayList courses) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.ID = ID;
		this.modules = modules;
		this.courses = courses;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public Date getDOB() {
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
	
	public void setDOB(Date dob) {
		this.dob = dob;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	public void setCourses(ArrayList<CourseProgramme> courses) {
		this.courses = courses;
	}
	
	public String getUsername() {
		if (this.username == null) {
			this.username = name + age;
		} 
		return this.username;
	}
}


