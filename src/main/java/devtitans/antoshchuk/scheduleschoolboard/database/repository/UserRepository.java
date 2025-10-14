package devtitans.antoshchuk.scheduleschoolboard.database.repository;

import devtitans.antoshchuk.scheduleschoolboard.database.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail(String email);

    boolean existsUserByEmail(String email);
}
