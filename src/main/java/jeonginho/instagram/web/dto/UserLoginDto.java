package jeonginho.instagram.web.dto;

import jeonginho.instagram.domain.user.User;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UserLoginDto {

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

