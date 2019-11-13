package nuigalway.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CourseTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldSetandGetCourseName()
    {
      final Course c = new Course();
      c.setCourseName("Computer Science");
      assertEquals("Computer Science",c.getCourseName());
    }
    
    
    @Test
    public void shouldSetandGetCourseStartDate()
    {
      final Course c = new Course();
      Calendar cal = Calendar.getInstance();
      cal.set(2019, 8, 1);
      c.setStartDate(cal);
      assertEquals(cal,c.getStartDate());
    }
    
    @Test
    public void shouldSetandGetCourseEndDate()
    {
      final Course c = new Course();
      Calendar cal = Calendar.getInstance();
      cal.set(2020, 05, 1);
      c.setEndDate(cal);
      assertEquals(cal,c.getEndDate());
    }
    
    @Test
    public void shouldSetandGetCourseStudents()
    {
      final Course c = new Course();
      ArrayList<Student> students = new ArrayList<Student>();
      Student s = new Student();
      students.add(s);
      c.setStudents(students);
      assertEquals(students,c.getStudents());
    }
    @Test
    public void shouldSetandGetCourseModules()
    {
      final Course c = new Course();
      ArrayList<Module> modules = new ArrayList<Module>();
      Module m = new Module();
      modules.add(m);
      c.setModules(modules);
      assertEquals(modules,c.getModules());
    }
}
