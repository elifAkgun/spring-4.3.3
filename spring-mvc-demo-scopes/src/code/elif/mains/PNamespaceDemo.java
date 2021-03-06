package code.elif.mains;

import code.elif.model.forXml.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PNamespaceDemo {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-namespace-p.xml");

        Organization organization = (Organization) applicationContext.getBean("myOrg");

        System.out.println(organization);

        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
