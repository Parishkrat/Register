package com.example.Register.Controller;

import com.example.Register.Entity.UserDetails;
import com.example.Register.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
@Autowired
private UserRepository repo;
    @GetMapping("/")
    public String home(){
        return "Sign Up";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UserDetails u){
        System.out.println(u);
        repo.save(u);
        return "redirect:/";
    }
}
