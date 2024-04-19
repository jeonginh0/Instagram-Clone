package jeonginho.instagram.web.dto;

import jeonginho.instagram.domain.user.User;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserLoginDto {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;
    private String password;
    private String phone;
    private String username;

    public User toEntity() {
        return User.builder()
                .email(email)
                .password(password)
                .phone(phone)
                .username(username)
                .build();
    }

}

