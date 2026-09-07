package model;
public class UserRequest {

    private String name;
    private String email;

    private UserRequest(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static UserRequest of(String name, String email) {
        return new UserRequest(name, email);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}