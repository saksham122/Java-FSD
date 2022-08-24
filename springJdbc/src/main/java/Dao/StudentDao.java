package Dao;

import java.util.List;

import com.Student;

public interface StudentDao
{
	public int insert(Student student);
	public int update(Student student);
	public int delete(int StudentID);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();

}
