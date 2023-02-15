package co.com.sofka.catalog.service;

import co.com.sofka.catalog.dto.CourseDTO;
import co.com.sofka.catalog.dto.StudentDTO;
import co.com.sofka.catalog.entity.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

    Student student (StudentDTO studentDTO);

    StudentDTO studentDTO(Student student);
    List<StudentDTO> getAllStudents();
    StudentDTO getByIdentificationNumber(String idNum);

    Optional<StudentDTO> findById(String studentId);

    List<StudentDTO> getByName(String s);
    StudentDTO saveStudent(StudentDTO studentDTO);
    StudentDTO editStudent(StudentDTO studentDTO);
    String deleteStudent(String studentId);
}
