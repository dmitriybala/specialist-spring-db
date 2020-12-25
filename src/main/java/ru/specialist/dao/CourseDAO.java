package ru.specialist.dao;

import java.util.List;

public interface CourseDAO {
	Course findById(int id);
	List<Course> findAll();
	
	List<Course> findByName(String name);
	void insert(Course course);
	void update(Course course);
	void delete(int id);

}
