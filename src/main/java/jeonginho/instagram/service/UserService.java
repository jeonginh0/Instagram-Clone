package jeonginho.instagram.service;

import jeonginho.instagram.config.auth.PrincipalDetails;
import jeonginho.instagram.domain.user.User;
import jeonginho.instagram.domain.user.UserRepository;
import jeonginho.instagram.web.dto.UserUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void update(UserUpdateDto userUpdateDto, @AuthenticationPrincipal PrincipalDetails principalDetails){
        User user = userRepository.findByEmail(principalDetails.getUser().getEmail());
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.update(
                encoder.encode(userUpdateDto.getPassword()),
                userUpdateDto.getPhone(),
                userUpdateDto.getName(),
                userUpdateDto.getTitle(),
                userUpdateDto.getWebsite(),
                userUpdateDto.getProfileImgUrl()
        );
    }

    public User getUserByEmail(String email){
        User user = userRepository.findByEmail(email);
        return user;
    }

}
