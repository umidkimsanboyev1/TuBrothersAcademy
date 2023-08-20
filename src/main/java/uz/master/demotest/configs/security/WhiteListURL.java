package uz.master.demotest.configs.security;

public class WhiteListURL {

    public static final String[] WHITE_LIST = {
            "/auth/login",
            "/auth/signUp",
            "/auth/forgot",
            "/auth/reset/**",
            "/index", "/", "/home",
            "/callBackMe"


    };
    public static final String[] WHITE_LIST_RESOURCES = {
            "/css/**", "/fonts/**", "/js/**","/sass", "/img/**", "/css/vendors.css"
    };
}
