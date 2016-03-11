package personal;
public enum Gender {
    MALE ("Mr "),
    FEMALE("Ms ") ;

    private final String prefix;

    Gender(String gender) {
        this.prefix = gender;
    }

    @Override
    public String toString() {
        return prefix;
    }
}
