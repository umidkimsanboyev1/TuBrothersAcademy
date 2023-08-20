package uz.master.demotest.validator.auth;


import uz.master.demotest.repositories.AuthUserRepository;

public class AuthValidation {
    private final AuthUserRepository authUserRepository;

    public AuthValidation(AuthUserRepository authUserRepository) {
        this.authUserRepository = authUserRepository;
    }


}
