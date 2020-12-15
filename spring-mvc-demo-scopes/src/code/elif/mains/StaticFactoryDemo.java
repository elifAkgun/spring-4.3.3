package code.elif.mains;

import code.elif.model.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactoryDemo {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-static-factory.xml");

        Organization organization = (Organization) applicationContext.getBean("myOrg");

        System.out.println(organization);

        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
