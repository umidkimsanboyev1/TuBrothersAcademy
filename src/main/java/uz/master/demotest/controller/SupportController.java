package uz.master.demotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import uz.master.demotest.entity.support.Support;
import uz.master.demotest.services.support.SupportService;

@Controller(value = "/support/*")
public class SupportController {
    private final SupportService supportService;

    public SupportController(SupportService supportService) {
        this.supportService = supportService;
    }

    @GetMapping(value = "/supportForm")
    public String getSupportFormPage(){
        return "/auth/support";
    }

    @PostMapping("/sendSupport")
    public String support(@ModelAttribute Support support){
        boolean done = supportService.createSupport(support);
        if(done){
            return null;
        } else return "";
    }





}
