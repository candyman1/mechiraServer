package com.moishi.Dao;

import com.moishi.Entity.Student;

import java.util.Collection;

public interface FakeStudentDaoImp extends StudentDao {
    @Override
    Collection<Student> getAllStudents();

    @Override
    Student getStudentById(String id);

    @Override
    void removeStudentById(String id);

    @Override
    void updateStudent(Student student);

    @Override
    void insertStudentToDb(Student student);
}
