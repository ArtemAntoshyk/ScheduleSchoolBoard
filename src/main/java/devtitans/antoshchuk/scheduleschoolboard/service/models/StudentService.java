package devtitans.antoshchuk.scheduleschoolboard.service.models;

import devtitans.antoshchuk.scheduleschoolboard.database.models.Student;
import devtitans.antoshchuk.scheduleschoolboard.database.models.User;
import devtitans.antoshchuk.scheduleschoolboard.database.models.UserType;
import devtitans.antoshchuk.scheduleschoolboard.database.repository.StudentRepository;
import devtitans.antoshchuk.scheduleschoolboard.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void createStudent(Student student) {
        studentRepository.save(student);
    }
}
