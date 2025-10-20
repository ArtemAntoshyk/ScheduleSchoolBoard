package devtitans.antoshchuk.scheduleschoolboard.service;

import devtitans.antoshchuk.scheduleschoolboard.database.models.User;
import devtitans.antoshchuk.scheduleschoolboard.dto.RegistrationUserDTO;
import devtitans.antoshchuk.scheduleschoolboard.service.models.UserService;
import devtitans.antoshchuk.scheduleschoolboard.service.util.mapper.UserMapper;
import devtitans.antoshchuk.scheduleschoolboard.service.util.validator.UserValidator;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private UserMapper userMapper;
    private UserService userService;

    public void registerUser(RegistrationUserDTO registrationUserDTO) {
        User user = (User) userMapper.mapDtoToModel(registrationUserDTO, RegistrationUserDTO.class);
        validatePassword(registrationUserDTO.getPassword());
        if (userService.checkExistsUserByEmail(user.getEmail())) {
            throw new RuntimeException("User already exists");
        }
        userService.createUser(user);
    }

    private void validatePassword(String password){
        if(!UserValidator.passwordValidation(password)){
            throw new RuntimeException("Invalid password");
        }
    }


}
