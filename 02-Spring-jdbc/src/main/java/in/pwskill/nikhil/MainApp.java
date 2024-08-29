package in.pwskill.nikhil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.pwskill.nikhil.config.AppConfig;
import in.pwskill.nikhil.service.IStudentservice;

/**
 * Hello world!
 *
 */
public class MainApp 
{
	public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	IStudentservice service = context.getBean(IStudentservice.class);
    	//service.insert(4, "sima", 23,"delhi");
    	//service.delete(4);
    	//service.update(2, "NIKHIL");
    	//System.out.println("the number of the student count is  ::"+service.studentCount());
//    	service.getStudentDetails(3).entrySet().forEach(row->{
//    		System.out.println(row.getKey()+"   "+row.getValue());
//    	});
    	service.getAllDetail("NIKHIL","sachin").forEach(map->{
    		map.entrySet().forEach(m->{
    			System.out.println(m.getKey()+"---->"+m.getValue());
    		});
    	});
    	context.close();
    }
}
