package jeonginho.instagram.web.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private String title;
    private String website;
    private String profileImgUrl;

    public String getProfileImgUrl() {
        return profileImgUrl;
    }

    public String getWebsite() {
        return website;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }
}
