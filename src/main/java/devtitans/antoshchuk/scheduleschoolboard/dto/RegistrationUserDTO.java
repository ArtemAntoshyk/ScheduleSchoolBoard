package devtitans.antoshchuk.scheduleschoolboard.dto;

import devtitans.antoshchuk.scheduleschoolboard.database.models.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationUserDTO {
    private String fullName;
    private String email;
    private String password;
    private String userType;
    private String phoneNumber;
}
