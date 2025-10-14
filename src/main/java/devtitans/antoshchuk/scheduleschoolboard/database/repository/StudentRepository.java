package devtitans.antoshchuk.scheduleschoolboard.database.repository;

import devtitans.antoshchuk.scheduleschoolboard.database.models.Student;
import devtitans.antoshchuk.scheduleschoolboard.database.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findStudentByUser(User user);

}
