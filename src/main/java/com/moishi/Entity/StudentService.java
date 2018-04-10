package com.moishi.Entity;

import java.util.Collection;

        import com.moishi.Dao.FakeStudentDaoImp;
        import com.moishi.Dao.FakeStudentDaoImpl;
        import com.moishi.Dao.MongoStudentDaoImpl;
        import com.moishi.Dao.StudentDao;
import com.moishi.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Qualifier;
        import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired

    @Qualifier("fakeData")
    private StudentDao studentDao;
    public StudentService() {
    }


    public Collection<Student> getAllStudents(){
        return this.studentDao.getAllStudents();
    }
    public  Student getStudentById(String id){
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(String id) {
        this.studentDao.removeStudentById(id);
    }
    public void updateStudent(Student student){

        this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudentToDb(student);
    }
}
