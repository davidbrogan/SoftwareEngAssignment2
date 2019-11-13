package nuigalway.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student student = new Student();
        student.setAge(21);
        student.setName("David");
     String test =   student.getUsername();
     System.out.println(test );
    }
}
