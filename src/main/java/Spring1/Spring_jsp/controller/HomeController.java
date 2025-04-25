package Spring1.Spring_jsp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
    	System.out.println("this is home page");
        //model.addAttribute("message", "Welcome to Spring Boot with JSP!");
        return "home";
    }
}