package devtitans.antoshchuk.scheduleschoolboard.service.util.mapper;

import devtitans.antoshchuk.scheduleschoolboard.database.models.User;
import devtitans.antoshchuk.scheduleschoolboard.database.models.UserType;
import devtitans.antoshchuk.scheduleschoolboard.dto.RegistrationUserDTO;

public class UserMapper implements Mapper{

    @Override
    public Object mapDtoToModel(Object dto, Class<?> dtoClass) {
        if(dtoClass == RegistrationUserDTO.class){
            return mapRegistrationDTOToUserModel(dto);
        }
        return null;
    }

    @Override
    public Object mapModelToDto(Object model, Class<?> dtoClass) {
        if(dtoClass == RegistrationUserDTO.class){
            return mapRegistrationModelToDto(model);
        }
        return null;
    }

    private RegistrationUserDTO mapRegistrationModelToDto(Object userModel) {
        User user = (User) userModel;
        RegistrationUserDTO userDTO = new RegistrationUserDTO();
        userDTO.setFullName(user.getFullName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        userDTO.setUserType(user.getUserType().getValue());
        return userDTO;
    }

    private User mapRegistrationDTOToUserModel(Object dto) {
        RegistrationUserDTO userDTO = (RegistrationUserDTO) dto;
        User user = new User();
        user.setFullName(userDTO.getFullName());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setUserType(UserType.fromValue(userDTO.getUserType()));
        return user;
    }

}
