import junit.framework.TestCase;
import org.joda.time.DateTime;
import java.util.ArrayList;

public class UnitTests extends TestCase {

	private DateTime test_dob = new DateTime();
	private Student testStudent = new Student("John Smith",20,123,test_dob);
	private Module testModule = new Module("test","CT417");
	private DateTime test_startDate = new DateTime();
	private DateTime test_endDate = new DateTime();
	private CourseProgramme testCourse = new CourseProgramme("course",test_startDate,test_endDate);

	public void testStudentGetSetName() {
		assertEquals("John Smith", testStudent.getName());
		testStudent.setName("Tom Jones");
		assertEquals("Tom Jones", testStudent.getName());
	}

	public void testStudentGetSetAge() {
		assertEquals(20,testStudent.getAge());
		testStudent.setAge(25);
		assertEquals(25, testStudent.getAge());		
	}

	public void testStudentGetSetDOB() {
		assertEquals(test_dob,testStudent.getDOB());
		DateTime new_dob = new DateTime();
		testStudent.setDOB(new_dob);
		assertEquals(new_dob,testStudent.getDOB());
	}

	public void testStudentGetSetID() {
		assertEquals(123,testStudent.getID());
		testStudent.setID(456);
		assertEquals(456, testStudent.getID());	
	}

	public void testStudentGetSetModules() {
		ArrayList compList = new ArrayList();
		assertEquals(compList,testStudent.getModules());
		testStudent.joinModule(testModule);
		compList.add(testModule);
		assertEquals(compList,testStudent.getModules());
		testStudent.dropModule(testModule);
		compList.remove(testModule);
		assertEquals(compList,testStudent.getModules());
	}

	public void testStudentGetSetCourses() {
		ArrayList compList = new ArrayList();
		assertEquals(compList,testStudent.getCourses());
		testStudent.joinCourse(testCourse);
		compList.add(testCourse);
		assertEquals(compList,testStudent.getCourses());
		testStudent.dropCourse(testCourse);
		compList.remove(testCourse);
		assertEquals(compList,testStudent.getCourses());
	}

	public void testStudentGetUsername() {
		assertEquals("John Smith20", testStudent.getUsername());
	}
	
	public void testModuleGetSetName() {
		assertEquals("test", testModule.getName());
		testModule.setName("New name");
		assertEquals("New name", testModule.getName());
	}
	
	public void testModuelGetSetID() {
		assertEquals("CT417",testModule.getID());
		testModule.setID("qwerty");
		assertEquals("qwerty", testModule.getID());	
	}
	
	public void testModuleGetSetCourses() {
		ArrayList compList = new ArrayList();
		assertEquals(compList,testModule.getCourses());
		testModule.joinCourse(testCourse);
		compList.add(testCourse);
		assertEquals(compList,testModule.getCourses());
		testModule.dropCourse(testCourse);
		compList.remove(testCourse);
		assertEquals(compList,testModule.getCourses());
	}
	
	public void testModuleGetSetStudents() {
		ArrayList compList = new ArrayList();
		assertEquals(compList,testModule.getStudents());
		testModule.joinStudent(testStudent);
		compList.add(testStudent);
		assertEquals(compList,testModule.getStudents());
		testModule.dropStudent(testStudent);
		compList.remove(testStudent);
		assertEquals(compList,testModule.getStudents());
	}
	
	public void testCourseGetSetName() {
		assertEquals("course", testCourse.getName());
		testCourse.setName("new name");
		assertEquals("new name", testCourse.getName());
	}
	
	public void testCourseGetSetModules() {
		ArrayList compList = new ArrayList();
		assertEquals(compList,testCourse.getModules());
		testCourse.joinModule(testModule);
		compList.add(testModule);
		assertEquals(compList,testCourse.getModules());
		testCourse.dropModule(testModule);
		compList.remove(testModule);
		assertEquals(compList,testCourse.getModules());
	}
	
	public void testCourseGetSetStudents() {
		ArrayList compList = new ArrayList();
		assertEquals(compList,testCourse.getStudents());
		testCourse.joinStudent(testStudent);
		compList.add(testStudent);
		assertEquals(compList,testCourse.getStudents());
		testCourse.dropStudent(testStudent);
		compList.remove(testStudent);
		assertEquals(compList,testCourse.getStudents());
	}
	
	public void testCourseGetSetStartDate() {
		assertEquals(test_startDate,testCourse.getStartDate());
		DateTime new_StartDate = new DateTime();
		testCourse.setStartDate(new_StartDate);
		assertEquals(new_StartDate,testCourse.getStartDate());
	}

	public void testCourseGetSetendDate() {
		assertEquals(test_endDate,testCourse.getEndDate());
		DateTime new_EndDate = new DateTime();
		testCourse.setEndDate(new_EndDate);
		assertEquals(new_EndDate,testCourse.getEndDate());
	}

}
