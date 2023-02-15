package co.com.sofka.catalog.service;

import co.com.sofka.catalog.dto.CourseDTO;
import co.com.sofka.catalog.entity.Course;

import java.util.List;
import java.util.Optional;

public interface ICourseService {

    Course course(CourseDTO courseDTO);

    CourseDTO courseDTO(Course course);
    List<CourseDTO> getAllCourses();
    List<CourseDTO> getByName(String name);
    List<CourseDTO> getByCoach(String c);
    List<CourseDTO> getByLevel(Integer level);

    Optional<CourseDTO> findById(String courseId);

    CourseDTO saveCourse(CourseDTO courseDTO);
    CourseDTO editCourse(CourseDTO courseDTO);
    String deleteCourse(String courseId);

}
