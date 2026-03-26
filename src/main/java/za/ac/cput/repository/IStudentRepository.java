package za.ac.cput.repository;

import za.ac.cput.domain.Student;

import java.util.List;
/**Student name: Samukelo Ndlela
 * Student number: 231116144
 * Group: 3H
 * IStudentRepository.java
 * Date: 25 March 2026
 * **/

public interface IStudentRepository extends IRepository<Student, Integer>{

    public Student findByStudentNumber(String studentNumber);

    public List<Student> findByFaculty(String faculty);

    public List<Student> findByYearOfStudy(int yearOfStudy);

    public List<Student> findByDepartment(String department);
}
