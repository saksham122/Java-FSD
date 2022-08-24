package Dao;



import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Student;

public class StudentDaoImpl  implements StudentDao{

	private JdbcTemplate jdbcTemplate;


	@Override
	public int insert(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	@Override
	public int update(Student student) {
		String query="update student set name=?, city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int delete(int StudentID) {
		String query = "delete from student where id=?";
		int r=this.jdbcTemplate.update(query,StudentID);
		return r;
	}
	@Override
	public Student getStudent(int studentId) {
		// single  student data
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}
	@Override
	public List<Student> getAllStudents() {
		String query = "select * from student";
	List<Student> students=	this.jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	}
	

	

}
