package devtitans.antoshchuk.scheduleschoolboard.service.models;

import devtitans.antoshchuk.scheduleschoolboard.database.models.User;
import devtitans.antoshchuk.scheduleschoolboard.database.models.UserType;
import devtitans.antoshchuk.scheduleschoolboard.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean checkExistsUserByEmail(String email) {
        return userRepository.existsUserByEmail(email);
    }

    public User getUserByEmail(String email) {
        if(checkExistsUserByEmail(email)) {
            return userRepository.findUserByEmail(email);
        }
        throw new RuntimeException("User not found");
    }

    public UserType getUserTypeByEmail(String email) {
        User user = getUserByEmail(email);
        return user.getUserType();
    }

    public void createUser(User newUser){
        userRepository.save(newUser);
    }


}
