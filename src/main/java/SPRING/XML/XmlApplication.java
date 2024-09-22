package SPRING.XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		MySingletonBean mySingletonBean = (MySingletonBean) applicationContext.getBean("mySingletonBean");
	}

}
