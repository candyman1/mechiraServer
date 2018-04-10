package com.moishi.Dao;

import com.moishi.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao {


    @Override
    public Collection<Student> getAllStudents()
        {
            return new ArrayList<Student>()
            {{
                add( new Student("moishi", "Moshe", "Rosenberg", "My House",
                        "Lakewood", "NJ", "555-5555", "1", "", "", "", "",
                        "", "", "", "1", "", "", "", "",
                        "", "", "1", "", "1", "", "",
                        "", "", "", "", "", "",
                        "", "", "", "", "", "",
                        "", "", "", "", "", "", "", "",
                        "", "", "", "", "", "",
                        "", "", "", "", "", "", "",
                        "", "", "", "", "", "", "", "",
                        "", "", "", "", "", "", "", "",
                        "", "", "", "", "", ""))

                ;}
            };
        }

    @Override
    public Student getStudentById(String id) {
        return null;
    }

    @Override
    public void removeStudentById(String id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDb(Student student) {

    }
}
