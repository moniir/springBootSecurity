package com.example.controller;

import com.example.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Monir on 10/28/2017.
 */
@Controller
public class HomeController {
    private PostService postService;

    public HomeController(PostService postService){
        this.postService = postService;
    }

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("post", postService.getLatestPost());
        return "index";
    }
}
