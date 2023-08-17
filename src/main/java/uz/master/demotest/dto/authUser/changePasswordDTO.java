package uz.master.demotest.dto.authUser;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class changePasswordDTO {

    private String oldPassword;
    private String newPassword1;
    private String newPassword2;

}
