package nuigalway.app;

import java.sql.Date;
import java.util.List;

public class Course {
	private String courseName;
	private List<Module> modules;
	private List<Student> students;
	private Date startDate;
	private Date endDate;
	
public Course()
{
	
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public List<Module> getModules() {
	return modules;
}

public void setModules(List<Module> modules) {
	this.modules = modules;
}

public List<Student> getStudents() {
	return students;
}

public void setStudents(List<Student> students) {
	this.students = students;
}

public Date getStartDate() {
	return startDate;
}

public void setStartDate(Date startDate) {
	this.startDate = startDate;
}

public Date getEndDate() {
	return endDate;
}

public void setEndDate(Date endDate) {
	this.endDate = endDate;
}
}
