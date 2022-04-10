import org.springframework.beans.factory.aspectj.ConfigurableObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.function.AsyncServerResponse;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      //do pull from github to temp branch and merge with main , should only add changes from github
//can I add method to implementingi interface class and call it with interface object?
      HelloWorld2 obj = (HelloWorld2) context.getBean("helloWorld");
     // obj.setMessage("test12345");
      obj.getMessage();
      //System.out.println(obj.message);


   }
}
