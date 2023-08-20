package uz.master.demotest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import uz.master.demotest.entity.HelperText;
import uz.master.demotest.entity.home.Comments;
import uz.master.demotest.services.CommentService;

import java.util.List;

@Controller
public class GeneralController {
    private final CommentService commentService;
    private final HelperTextService helperTextService;

    public GeneralController(CommentService commentService, HelperTextService helperTextService) {
        this.commentService = commentService;
        this.helperTextService = helperTextService;
    }

    @GetMapping(value = {"/home", "", "/index"})
    public String getIndex(Model model){
        List<Comments> comments = commentService.getCommentsByOrderNumber();
        List<HelperText> advantages = helperTextService.getAdvantages();
        model.addAttribute("comments", comments);
        model.addAttribute("advantages", advantages);
        return "index";
    }

}
