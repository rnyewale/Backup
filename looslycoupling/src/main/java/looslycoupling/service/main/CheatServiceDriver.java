package looslycoupling.service.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import looslycoupling.service.CheatService;
import looslycoupling.service.impl.CheatServiceHandler;
import looslycoupling.service.impl.MathCheat;

public class CheatServiceDriver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		CheatServiceHandler handler = context.getBean("cheatHandler", CheatServiceHandler.class);
		handler.displayCheat();
	}
}
