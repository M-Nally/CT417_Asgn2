import java.util.ArrayList;
import java.util.Date;

public class CourseProgramme {
	private String name;
	private ArrayList<Student> students;
	private ArrayList<Module> modules;
	private Date startDate, endDate;
	
	public CourseProgramme(String name, ArrayList<Student> students, ArrayList<Module> modules, Date startDate, Date endDate) {
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
	
	public Date getStartDate() {
		return startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
