package code.elif.springmvcdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import code.elif.model.Organization;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String doWelcome(Model model) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		Organization org2 = (Organization) ctx.getBean("myorg");
		org2.setPostalCode("98989");

		// invoke the company slogan via the bean

		// Print Organization details
		System.out.println(org);
		System.out.println(org2);
		if (org == org2) {
			model.addAttribute("myInfo",
					"Singleton scope test: org and org2 point to the same instance");
		} else {
			model.addAttribute("myInfo",
					"Both org and org2 are separate instances");
		}

		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();

		return "welcomeNew";
	}

}
