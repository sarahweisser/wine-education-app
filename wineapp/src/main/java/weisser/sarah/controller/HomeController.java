package weisser.sarah.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sarahweisser on 7/9/17.
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Wine is super cool!";
    }
}
