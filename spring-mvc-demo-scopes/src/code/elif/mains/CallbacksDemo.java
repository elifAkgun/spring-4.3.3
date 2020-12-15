package code.elif.mains;

import code.elif.model.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallbacksDemo {

     public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-cp.xml");

        Organization organization = (Organization) applicationContext.getBean("myOrg");

        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
