package testcase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import testcase.models.Comment;
import testcase.services.servisImpl.ComentServiceImpl;



@Controller
@RequestMapping("/comment")
public class CommentController {

    private ComentServiceImpl comentService;

    public CommentController(ComentServiceImpl comentService) {
        this.comentService = comentService;
    }

    @GetMapping()
    public String getFormComment(Model model) {
        return "form-comment";
    }

    @PostMapping()
    public String addFormComment(@RequestParam(name = "username") String username, @RequestParam(value = "user_comment") String user_comment, Model model){
        String name = username.trim();
        String description = user_comment.trim();
        if (name.equals("") || description.equals("")){
            model.addAttribute("cannot_be_empty", "the field cannot be empty!");
            return "form-comment";
        }
        Comment comment = new Comment(name, description);
        int amount = comentService.addComments(comment);
        model.addAttribute("amount", amount);
        return "form-successfully";
    }

}
