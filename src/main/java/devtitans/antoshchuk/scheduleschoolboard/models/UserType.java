package devtitans.antoshchuk.scheduleschoolboard.models;

public enum UserType {
    STUDENT("student"),
    TEACHER("teacher"),
    ADMIN("admin");

    private final String value;

    UserType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static UserType fromValue(String value) {
        if (value == null) return null;
        String normalized = value.trim().toLowerCase();
        for (UserType type : values()) {
            if (type.value.equals(normalized)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown user_type: " + value);
    }
}

