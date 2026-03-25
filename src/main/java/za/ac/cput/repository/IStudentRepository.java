package za.ac.cput.repository;

import za.ac.cput.domain.Student;

import java.util.List;

public interface IStudentRepository extends IRepository<Student, Integer>{

    public Student findByStudentNumber(String studentNumber);

    public List<Student> findByFaculty(String faculty);

    public List<Student> findByYearOfStudy(int yearOfStudy);

    public List<Student> findByDepartment(String department);
}
