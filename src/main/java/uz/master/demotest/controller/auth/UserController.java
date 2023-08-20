package uz.master.demotest.controller.auth;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.master.demotest.dto.authUser.changePasswordDTO;
import uz.master.demotest.entity.auth.AuthUser;
import uz.master.demotest.services.auth.AuthUserDTO;
import uz.master.demotest.services.auth.AuthUserService;
import uz.master.demotest.utils.SessionUser;

@Controller
@RequestMapping(value = "/auth/*")
public class UserController {

    private final AuthUserService service;

    public UserController(AuthUserService service) {
        this.service = service;
    }

    @GetMapping(value = "/profile")
    public String getProfilePage(Model model){
        AuthUser session = service.getSessionUser();
        model.addAttribute("user", session);
        return "/auth/profile";
    }

    @PostMapping(value = "/changePassword")
    public String changePasswordAuthUser(Model model, @ModelAttribute changePasswordDTO changePasswordDTO){
        boolean result = service.changeAuthUserPassword(changePasswordDTO);
        if(!result){
            model.addAttribute("error", "Old password wrong!" +
                    " or new passwords are different or there are few letters. " +
                    "Password must be at least 8 characters long. " +
                    "Please check it!");
            return "/error/error";
        }
        return "redirect:/auth/profile";
    }


    @PostMapping(value = "/changeMyData")
    public String changeMyData(Model model, @ModelAttribute AuthUserDTO dto){
        String result = service.changeAuthUserData(dto);
        if(!result.equals("correct")){
            model.addAttribute("error", result);
            return "/error/error";
        }
        return "redirect:/auth/profile";
    }
}
