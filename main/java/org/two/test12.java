package main.java.org.two;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test12 {


    @RequestMapping("my")
    @ResponseBody
    public String test5(@RequestParam("a") String aac )
    {
        return aac;
    }
}
