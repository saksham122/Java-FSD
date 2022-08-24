package com;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import Dao.StudentDao;

public class App {

	public static void main(String[] args) 
	{
		
		
		
		/*
		 * first to insert 
		 * 
		 *  System.out.println("My program start");
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		//insert query
		
		String query = "insert into student(id,name,city) values(?,?,?)";
		
		//fire query
		
		int result = template.update(query,456,"raMU","delhi");
		
		System.out.println("inserted"+result); 
		*/
		
		
		// second method insert  isme humne dao class or intre face banaya hai or bean add kre hai config file mai
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/config.xml");
		 StudentDao dao = context.getBean("SDI", StudentDao.class);
		 //insert
//		 Student obj = new Student();
//		 obj.setId(22);
//		 obj.setName("shyam");
//		 obj.setCity("kanpur");
//		 int result = dao.insert(obj);
//		 System.out.println("inserted  "+result);
		 
		 //update
//		 
//		 Student obj1 = new Student();
//		 obj1.setId(22);
//		 obj1.setName("rakesh");
//		 obj1.setCity("luck");
//		 int result = dao.update(obj1);
//		 System.out.println("update  "+result);
		 
		 
//		 
		 
		 //delete
//		
//		 int result = dao.delete(22);
//	 System.out.println("delete  "+result);
		 
		 
		 //select single data 
		 
		Student student= dao.getStudent(456);
		 System.out.println(student);
		 
		 
	List<Student> students=	 dao.getAllStudents();
	System.out.println(students);
			
	}

}
