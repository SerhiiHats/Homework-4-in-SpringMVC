package testcase.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import testcase.services.servisImpl.UUIDServiceImpl;

import java.util.UUID;

@RestController
@RequestMapping("/uuid")
public class UUIDRestController {

private UUIDServiceImpl uuidService;

    public UUIDRestController(UUIDServiceImpl uuidService) {
        this.uuidService = uuidService;
    }

    @GetMapping
    public @ResponseBody UUID getRandomUuid(){
        return uuidService.getRandomUuid();
    }
}
