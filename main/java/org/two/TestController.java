package main.java.org.two;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @GetMapping(value = "/test")
    public ResultVo test(){
        ResultVo resultVo = ResultVo.faild("code-0001");

        return resultVo;
    }

}

