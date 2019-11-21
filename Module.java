import java.util.ArrayList;

public class Module {
	private String name, ID;
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
	
	public Module(String name, String ID) {
		this.name = name;
		this.ID = ID;
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
	
	public void joinStudent(Student student) {
		this.students.add(student);
	}
	
	public void dropStudent(Student student) {
		this.students.remove(student);
	}
	
	public void joinCourse(CourseProgramme course) {
		this.courses.add(course);
	}
	
	public void dropCourse(CourseProgramme course) {
		this.courses.remove(course);
	}
}
