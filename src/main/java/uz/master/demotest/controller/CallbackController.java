package uz.master.demotest.controller;

import org.springframework.stereotype.Controller;
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

    @PostMapping(value = "callBackMe")
    public String postCallBackMe(@ModelAttribute Callback callback){
        boolean result = service.saveCallBackMe(callback);
        return  "";
    }

}
