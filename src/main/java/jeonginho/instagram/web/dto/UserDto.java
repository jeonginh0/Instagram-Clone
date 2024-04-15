package jeonginho.instagram.web.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private String title;
    private String website;
    private String profileImgUrl;
}
