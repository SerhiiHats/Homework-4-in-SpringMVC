package testcase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import testcase.models.Comment;
import testcase.services.servisImpl.ComentServiceImpl;

import java.util.List;


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

//    @GetMapping(path = "/all-comment")
//    public String getFormAllComment(Model model){
//        List<Comment> listComments = comentService.getAllComments();
//        for (Comment listComment : listComments) {
//            System.out.println(listComment);
//        }
//        model.addAttribute("listComments", listComments);
//        return "form-all-comment";
//    }

    @GetMapping(path = "/all-comment")
    public ModelAndView getFormAllComment(ModelAndView model){
        List<Comment> list = comentService.getAllComments();
        model.addObject("listComments", list);
        model.setViewName("form-all-comment");
        return model;
    }

}
