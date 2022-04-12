import org.springframework.beans.factory.aspectj.ConfigurableObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      ApplicationContext context1=new ClassPathXmlApplicationContext("Beans.xml");
      //do pull from github to temp branch and merge with main , should only add changes from github
//can I add method to implementingi interface class and call it with interface object?
      HelloWorld2 obj = (HelloWorld2) context.getBean("helloWorld");
     obj.setMessage("test12345_3");
      obj.getMessage();
      //System.out.println(obj.message);

      HelloWorld2 obj2=(HelloWorld2) context.getBean("helloWorld");
      obj2.setMessage("test_4");
      obj2.getMessage();
      obj.getMessage();

      HelloWorld2 obj3=(HelloWorld2) context.getBean("helloWorld");
      //obj2.setMessage("test_10");
      obj3.getMessage();
      obj.getMessage();
   }
}
