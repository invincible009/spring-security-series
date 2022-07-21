package com.shimadove.springsecurityseries.api;

import com.shimadove.springsecurityseries.dtos.UserDTO;
import com.shimadove.springsecurityseries.dtos.UserRegistrationResponseDTO;
import com.shimadove.springsecurityseries.exception.UserAlreadyExistException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/sdl/home")
public class HomeController {

//    private final UserService userService;

    public HomeController() {

    }

    @GetMapping("/")
    public String homePage(){
        return "home";
    }

    @GetMapping("/registration")
    public String showRegistrationForm(WebRequest request, Model model) {
        UserDTO userDto = new UserDTO();
        model.addAttribute("user", userDto);
        return "/user/registration";
    }

    @GetMapping("/login")
    public String showLoginForm(WebRequest request, Model model) {
        UserDTO userDto = new UserDTO();
        model.addAttribute("user", userDto);
        return "/user/login";
    }

}
