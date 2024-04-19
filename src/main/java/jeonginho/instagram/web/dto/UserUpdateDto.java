package jeonginho.instagram.web.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserUpdateDto {

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

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public long getId() {
        return id;
    }

    private long id;
    private String password;
    private String phone;
    private String name;
    private String title;
    private String website;
    private String profileImgUrl;
}
