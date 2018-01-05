package org.cdx.ww.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("Beans.xml");
		// JavaCollection jc = (JavaCollection)
		// context.getBean("javaCollection");
		//
		// jc.getAddressList();
		// jc.getAddressSet();
		// jc.getAddressMap();
		// jc.getAddressProp();

		// TextEditor te = (TextEditor) context.getBean("textEditor");
		// te.spellCheck();

		// ConfigurableApplicationContext context =
		// new AnnotationConfigApplicationContext(TextEditorConfig.class);
		// TextEditor te2 = context.getBean(TextEditor.class);
		// te2.spellCheck();
		// context.stop();

		// ConfigurableApplicationContext context = new
		// ClassPathXmlApplicationContext("Beans.xml");
		//
		// // Let us raise a start event.
		// context.start();
		//
		// TextEditor obj = (TextEditor) context.getBean("textEditor");
		// obj.spellCheck();
		//
		// // Let us raise a stop event.
		// context.stop();

		// ConfigurableApplicationContext context =
		// new ClassPathXmlApplicationContext("beans.xml");
		//
		// CustomEventPublisher cvp =
		// (CustomEventPublisher) context.getBean("customEventPublisher");
		//
		// cvp.publish();
		// cvp.publish();

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Student student = (Student) context.getBean("student");
		student.getName();
		student.getAge();
		student.printThrowException();
	}
}
