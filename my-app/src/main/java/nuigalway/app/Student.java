package nuigalway.app;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int age;
	private String dob;
	private String id;
	private String username;
	private String courseRegistered;
	private ArrayList<Module> moduleList;
	
	public Student()
	{
		
	}
	
	public String getUsername() {
		return this.name + this.age;
	}
	public void setUsername(String username) {
		this.username = username;
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

	public String getCourseRegistered() {
		return courseRegistered;
	}

	public void setCourseRegistered(String courseRegistered) {
		this.courseRegistered = courseRegistered;
	}

	public List<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(ArrayList<Module> moduleList) {
		this.moduleList = moduleList;
	}

	
}
