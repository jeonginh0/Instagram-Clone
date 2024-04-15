package jeonginho.instagram.web.dto;

import jeonginho.instagram.domain.user.User;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UserProfileDto {
    private boolean loginUser;
    private boolean follow;
    private User user;
}
