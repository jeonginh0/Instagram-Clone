package jeonginho.instagram.web.controller;

import jeonginho.instagram.config.auth.PrincipalDetails;
import jeonginho.instagram.domain.user.User;
import jeonginho.instagram.service.UserService;
import jeonginho.instagram.web.dto.UserUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;

    @GetMapping("/story")
    public String story(@AuthenticationPrincipal PrincipalDetails principalDetails , Model model){
        User user = userService.getUserByEmail(principalDetails.getUser().getEmail());
        model.addAttribute("user",user);
        return "/post/story";
    }

    @GetMapping("/user/update")
    public String update(@AuthenticationPrincipal PrincipalDetails principalDetails, Model model){
        User user = userService.getUserByEmail(principalDetails.getUser().getEmail());
        model.addAttribute("user",user);
        return "user/update";
    }

    @PostMapping("/user/update/{id}")
    public String updateUser(@PathVariable("id") Long id, UserUpdateDto userUpdateDto, @AuthenticationPrincipal PrincipalDetails principalDetails){
        userService.update(userUpdateDto,principalDetails);
        return "redirect:/user/profile/{id}";
    }

    @GetMapping("/user/profile/{id}")
    public String profile(@PathVariable("id") Long id, Model model,@AuthenticationPrincipal PrincipalDetails principalDetails){
        if(principalDetails.getUser().getId() == id){
            User user = userService.getUserByEmail(principalDetails.getUser().getEmail());
            model.addAttribute("user",user);
        }
        return "user/profile";
    }

}
