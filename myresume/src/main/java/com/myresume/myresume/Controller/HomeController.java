package com.myresume.myresume.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @GetMapping("/profile")
    public String profilePage(Model model) {
        return "pages/profilePage";
    }

    @GetMapping("/lifestyle")
    public String lifestylePage(Model model) {
        return "pages/lifestylePage";
    }

    @GetMapping("/gallery")
    public String galleryPage(Model model) {
        return "pages/galleryPage";
    }
    
    @GetMapping("/contact")
    public String contactPage(Model model) {
        return "pages/contactPage";
    }
}