package nuigalway.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StudentTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldSetandGetStudentName()
    {
      final Student s = new Student();
      s.setName("David");
      assertEquals("David",s.getName());
    }
    
    @Test
    public void shouldSetandGetStudentAge()
    {
      final Student s = new Student();
      s.setAge(21);
      assertEquals(21,s.getAge());
        
    }
    @Test
    public void shouldSetandGetStudentUsername()
    {
      final Student s = new Student();
      s.setAge(21);
      s.setName("David");
      s.setUsername("David21");
      assertEquals("David21",s.getUsername());

    }
    
    @Test
    public void shouldSetandGetStudentId()
    {
      final Student s = new Student();
      s.setId("12344566");
      assertEquals("12344566",s.getId());
        
    }
    
    @Test
    public void shouldSetandGetStudentDOB()
    {
      final Student s = new Student();
      s.setDob("15/08/1994");
      assertEquals("15/08/1994",s.getDob());
        
    }
    
    @Test
    public void shouldSetandGetStudentCourse()
    {
      final Student s = new Student();
      s.setCourseRegistered("GY350");
      assertEquals("GY350",s.getCourseRegistered());
        
    }
    @Test
    public void shouldSetandGetStudentModuleList()
    {
      final Student s = new Student();
      ArrayList<Module> modules = new ArrayList<Module>();
      Module e = new Module();
      modules.add(e);
      s.setModuleList(modules);
      assertEquals(modules,s.getModuleList());
        
    }
}
