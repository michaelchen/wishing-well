package org.cdx.ww.test;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	
	static Logger log = Logger.getLogger(TestSpring.class.getName());

	public static void main(String[] args) {
//		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("beans.xml");
//		HelloWorld hw = (HelloWorld)applicationContext.getBean("helloWorld");
//		
//		hw.setMessage("This is hello world!");
//		System.out.println("hello world message=" + hw.getMessage());
//		
//		HelloChina hc = (HelloChina)applicationContext.getBean("helloChina");
//		System.out.println(hc.getMessage1());
//		System.out.println(hc.getMessage2());
//		System.out.println(hc.getMessage3());
		
//		HelloWorld hw2 = (HelloWorld)applicationContext.getBean("helloWorld");
//		System.out.println("hello world message=" + hw2.getMessage());
		
	//	applicationContext.registerShutdownHook();
//		 ((ClassPathXmlApplicationContext) applicationContext).close();  
		//applicationContext.close();
		
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

//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//		Student student = (Student) context.getBean("student");
//		student.getName();
//		student.getAge();
//		student.printThrowException();
		
		// Testing Spring JDBC
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//		Student stu = (Student)context.getBean("student");
//		System.out.println(stu);
//		StudentDAO studentJDBCTemplate = 
//	     (StudentDAO)context.getBean("studentJDBCTemplate");
//	  
//	  System.out.println("------Records Creation--------" );
//	  studentJDBCTemplate.create("Zara", 11);
//	  studentJDBCTemplate.create("Nuha", 2);
//	  studentJDBCTemplate.create("Ayan", 15);
//	
//	  System.out.println("------Listing Multiple Records--------" );
//	  List<Student> students = studentJDBCTemplate.listStudents();
//	  
//	  for (Student record : students) {
//	     System.out.print("ID : " + record.getId() );
//	 System.out.print(", Name : " + record.getName() );
//	 System.out.println(", Age : " + record.getAge());
//	  }
//	
//	  System.out.println("----Updating Record with ID = 2 -----" );
//	  studentJDBCTemplate.update(2, 20);
//	
//	  System.out.println("----Listing Record with ID = 2 -----" );
//	  Student student = studentJDBCTemplate.getStudent(2);
//	  System.out.print("ID : " + student.getId() );
//	  System.out.print(", Name : " + student.getName() );
//	  System.out.println(", Age : " + student.getAge());
		
//      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//
//      StudentDAO studentJDBCTemplate = 
//         (StudentDAO)context.getBean("studentJDBCTemplate");
//      
//      System.out.println("------Records creation--------" );
//      studentJDBCTemplate.create("Zara", 11, 99, 2010);
//      studentJDBCTemplate.create("Nuha", 20, 97, 2010);
//      studentJDBCTemplate.create("Ayan", 25, 100, 2011);
//
//      System.out.println("------Listing all the records--------" );
//      List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
//      
//      for (StudentMarks record : studentMarks) {
//         System.out.print("ID : " + record.getId() );
//         System.out.print(", Name : " + record.getName() );
//         System.out.print(", Marks : " + record.getMarks());
//         System.out.print(", Year : " + record.getYear());
//         System.out.println(", Age : " + record.getAge());
//      }
//      
//      int[] a = {1, 2, 3, 4, 5};
//      int[] b = a;
//      for (int i = 0;i < a.length; i++) {
//    	  a[i] = a[i] * 2;
//      }
//      System.out.println(Arrays.toString(a));
//      System.out.println(Arrays.toString(b));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		  log.info("Going to create HelloWord Obj");
		  HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		  obj.getMessage();
		  
		  log.info("Exiting the program");
	}

}
