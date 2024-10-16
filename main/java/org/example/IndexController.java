package main.java.org.example;

import main.annotation.LoginRequired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/sourceA")
    public String sourceA(){
        return "你正在访问sourceA资源";
    }

    @GetMapping("/sourceB")
    @LoginRequired
    public String sourceB(){
        return "你正在访问sourceB资源";
    }

}
