package devtitans.antoshchuk.scheduleschoolboard.service.models;

import devtitans.antoshchuk.scheduleschoolboard.database.models.Teacher;
import devtitans.antoshchuk.scheduleschoolboard.database.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private TeacherRepository teacherRepository;
    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void createTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }
}
