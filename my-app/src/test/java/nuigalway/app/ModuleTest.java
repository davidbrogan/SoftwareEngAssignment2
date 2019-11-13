package nuigalway.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ModuleTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldSetandGetModuleName()
    {
      final Module m = new Module();
      m.setName("Software engineering");
      assertEquals("Software engineering",m.getName());
    }
    
    
    @Test
    public void shouldSetandGetModuleId()
    {
      final Module m = new Module();
      m.setModuleId("CT123");
      assertEquals("CT123",m.getModuleId());
    }
    
    @Test
    public void shouldSetandGetModuleStudents()
    {
      final Module m = new Module();
      ArrayList<Student> students = new ArrayList<Student>();
      Student s = new Student();
      students.add(s);
      m.setStudents(students);
      assertEquals(students,m.getStudents());
    }
    @Test
    public void shouldSetandGetModuleCourses()
    {
      final Module m = new Module();
      ArrayList<Course> courses = new ArrayList<Course>();
      Course c = new Course();
      courses.add(c);
      m.setCourses(courses);
      assertEquals(courses,m.getCourses());
    }
}
