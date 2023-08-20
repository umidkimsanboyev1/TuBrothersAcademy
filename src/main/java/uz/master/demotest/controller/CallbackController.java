package uz.master.demotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import uz.master.demotest.entity.auth.Callback;
import uz.master.demotest.services.CallbackMeService;

@Controller
public class CallbackController {
    private final CallbackMeService service;

    public CallbackController(CallbackMeService service) {
        this.service = service;
    }

    @PostMapping(value = "/callBackMe")
    public String postCallBackMe(@ModelAttribute Callback callback, Model model){
        boolean result = service.saveCallBackMe(callback);
        model.addAttribute("redirectUrl", "/home");
        model.addAttribute("successMessage", "Your mail send to our moderator! Thank your attention! ");
        return  "success";
    }

}
