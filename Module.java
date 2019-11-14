import java.util.ArrayList;

public class Module {
	private String name, ID;
	private ArrayList<Student> students;
	private ArrayList<CourseProgramme> courses;
	
	public Module(String name, String ID, ArrayList<Student> students, ArrayList<CourseProgramme> courses) {
		this.name = name;
		this.ID = ID;
		this.students = students;
		this.courses = courses;
	}
	
	public String getName() {
		return name;
	}

	public String getID() {
		return ID;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public ArrayList<CourseProgramme> getCourses() {
		return courses;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public void setCourses(ArrayList<CourseProgramme> courses) {
		this.courses = courses;
	}
}
