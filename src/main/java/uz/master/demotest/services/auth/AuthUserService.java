package uz.master.demotest.services.auth;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uz.master.demotest.dto.authUser.changePasswordDTO;
import uz.master.demotest.entity.auth.AuthUser;
import uz.master.demotest.repositories.AuthUserRepository;
import uz.master.demotest.utils.SessionUser;

@Service
public class AuthUserService {

    private final AuthUserRepository authUserRepository;
    private final PasswordEncoder passwordEncoder;
    private final SessionUser sessionUser;

    public AuthUserService(AuthUserRepository authUserRepository, PasswordEncoder passwordEncoder, SessionUser sessionUser) {
        this.authUserRepository = authUserRepository;
        this.passwordEncoder = passwordEncoder;
        this.sessionUser = sessionUser;
    }


    public AuthUser getSessionUser() {
        return authUserRepository.findById(sessionUser.getId()).get();
    }

    public boolean changeAuthUserPassword(changePasswordDTO changePasswordDTO) {
        if(!validPassword(changePasswordDTO)){
            return false;
        } else {
            AuthUser sessionUser1 = getSessionUser();
            sessionUser1.setPassword(passwordEncoder.encode(changePasswordDTO.getNewPassword2()));
            authUserRepository.save(sessionUser1);
        }
        return true;
    }

    private boolean validPassword(changePasswordDTO changePasswordDTO) {
        AuthUser sessionUser1 = getSessionUser();
        if(!passwordEncoder.matches(sessionUser1.getPassword(), changePasswordDTO.getOldPassword())){
             return false;
        }
        if(changePasswordDTO.getNewPassword1().length() < 8 || !changePasswordDTO.getNewPassword1().equals(changePasswordDTO.getNewPassword2())){
            return false;
        }
        return true;
    }

    public String changeAuthUserData(AuthUserDTO dto) {
        AuthUser sessionUser1 = getSessionUser();
        if(authUserRepository.existsAuthUserByUsername(dto.getUsername())){
            return "Sorry! this " + dto.getUsername() + " username already taken! please Choose other!";
        }
        if(authUserRepository.existsAuthUserByEmail(dto.getEmail())){
            return "Sorry! this " + dto.getEmail() + " email already registered! please Choose other!";
        }

        sessionUser1.setUsername(dto.getUsername());
        sessionUser1.setEmail(dto.getEmail());

        return "correct";
    }
}
