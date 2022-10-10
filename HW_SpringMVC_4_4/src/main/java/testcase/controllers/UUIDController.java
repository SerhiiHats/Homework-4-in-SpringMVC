package testcase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import testcase.services.servisImpl.UUIDServiceImpl;

@Controller
@RequestMapping("/uuid-demo")
public class UUIDController {
    UUIDServiceImpl uuidService;

    public UUIDController(UUIDServiceImpl uuidService) {
        this.uuidService = uuidService;
    }

    @GetMapping
    public String getRandomUuid(Model model){
        String uuid = String.valueOf(uuidService.getRandomUuid());
        model.addAttribute("uuid", uuid);
        return "form-uuid";
    }
}
