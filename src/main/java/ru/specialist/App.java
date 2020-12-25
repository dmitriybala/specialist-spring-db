package ru.specialist;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.specialist.dao.CourseDAO;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
        CourseDAO courseDao = context.getBean(CourseDAO.class);
		courseDao.findByName("pHp").forEach(System.out::println);
        context.close();
    }
}
