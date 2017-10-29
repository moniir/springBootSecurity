package com.example.controller.admin;

import com.example.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aminu on 10/27/2017.
 */
@Controller
@Secured( {"ROLE_ADMIN"} )
public class AdminPostController {

    private PostService postService;

    @Autowired
    public AdminPostController(PostService postService){
        this.postService = postService;
    }

    @RequestMapping("/admin/posts")
    public String list(Model model){
        model.addAttribute("posts", postService.list());
        return "admin/post/list";
    }
    @RequestMapping("/admin/post/{id}")
    public String view(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.get(id));
        return "admin/post/view";
    }

}
