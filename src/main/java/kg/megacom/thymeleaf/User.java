package kg.megacom.thymeleaf;

import javax.validation.constraints.*;

public class User {
    @NotNull
    private Long id;
    @NotNull
    private String name;

    @Email
    private String email;

    @NotBlank
    @Size(min = 10, max = 200, message
            = "About Me must be between 10 and 200 characters")
    private String password;
//    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$")
//    private String password;

    @AssertTrue
    private boolean isActive;
//    private boolean isActive = true;

    public boolean isActive() {
        return isActive;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}