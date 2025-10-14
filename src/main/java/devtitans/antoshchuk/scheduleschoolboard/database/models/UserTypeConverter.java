package devtitans.antoshchuk.scheduleschoolboard.database.models;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class UserTypeConverter implements AttributeConverter<UserType, String> {
    @Override
    public String convertToDatabaseColumn(UserType attribute) {
        return attribute == null ? null : attribute.getValue();
    }

    @Override
    public UserType convertToEntityAttribute(String dbData) {
        return UserType.fromValue(dbData);
    }
}

