package assignment.week8.user_database;

public enum Gender {
    NONE(""),
    MALE("Male"),
    FEMALE("Female");

    private final String name;
    Gender(String name) {
        this.name = name;
    }

    public static Gender of(String gender) {
        if (MALE.name.equals(gender)) {
            return MALE;
        }
        if (FEMALE.name.equals(gender)) {
            return FEMALE;
        }
        return NONE;
    }
}
