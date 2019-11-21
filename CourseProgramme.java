import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {
	private String name;
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Module> modules = new ArrayList<Module>();
	private DateTime startDate, endDate;
	
	public CourseProgramme(String name, DateTime startDate, DateTime endDate) {
		this.name = name;
		this.students = students;
		this.modules = modules;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public ArrayList<Module> getModules() {
		return modules;
	}
	
	public DateTime getStartDate() {
		return startDate;
	}
	
	public DateTime getEndDate() {
		return endDate;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void joinStudent(Student student) {
		this.students.add(student);
	}
	
	public void dropStudent(Student student) {
		this.students.remove(student);
	}
	
	
	public void joinModule(Module module) {
		this.modules.add(module);
	}
	
	public void dropModule(Module module) {
		this.modules.remove(module);
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	
}
