package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
        public String login(@RequestParam(name="loginName", required=true, defaultValue="World") String name, Model model) {
            model.addAttribute("name", name);
            if(!"user".equals(name)){
                return "login"; 
            }; 
            return "greeting";
        }

}
