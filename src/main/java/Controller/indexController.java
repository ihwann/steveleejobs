package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping(value = "/")
    public String indexStart() {
        System.out.println("index 시작");
        return "index";
    }
}