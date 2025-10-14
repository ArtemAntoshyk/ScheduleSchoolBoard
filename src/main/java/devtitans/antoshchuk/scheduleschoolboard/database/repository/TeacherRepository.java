package devtitans.antoshchuk.scheduleschoolboard.database.repository;

import devtitans.antoshchuk.scheduleschoolboard.database.models.Student;
import devtitans.antoshchuk.scheduleschoolboard.database.models.Teacher;
import devtitans.antoshchuk.scheduleschoolboard.database.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher findTeacherByUser(User user);
}
