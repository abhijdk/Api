package security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import security.pojo.UserRegistation;
import security.service.SignUpService;

import java.security.Principal;

@Controller
public class SecurityController {
    @Autowired
    private SignUpService signUpService;






    @RequestMapping("/home")
//    @ResponseBody
    public String home(Principal principal, Model model){
        model.addAttribute("userName",principal.getName());
        return "home";
    }

    @RequestMapping("/admin")
//    @ResponseBody
    public String admin(Principal principal, Model model){

        model.addAttribute("userName",principal.getName());
        return "home";
    }

    @RequestMapping("/signUpForm")
    public String signUpForm(){
        return "signUpForm";
    }

    @PostMapping("/processSignup")
//    @ResponseBody
    public String processSignup(@ModelAttribute UserRegistation userRegistation){
        signUpService.signUp(userRegistation);
        return "redirect:/";
    }
}
