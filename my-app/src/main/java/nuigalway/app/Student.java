package nuigalway.app;

import java.util.List;

public class Student {
	private String name;
	private int age;
	private String dob;
	private String id;
	private String username;
	
	private List<Course> courseList;
	public String getUsername() {
		return this.name + this.age;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	
	public Student()
	{
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public List<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(List<Module> moduleList) {
		this.moduleList = moduleList;
	}

	private List<Module> moduleList;
	
	

}
