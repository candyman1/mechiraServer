package com.moishi.Dao;

import com.moishi.Entity.Student;

        import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(String id);

    void removeStudentById(String id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
