package com.istad.springthymleafpartone.controller;


import com.istad.springthymleafpartone.model.request.ArticleRequest;
import com.istad.springthymleafpartone.service.ArticleService;
import com.istad.springthymleafpartone.service.AuthorService;
import com.istad.springthymleafpartone.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

// RestController vs Controller

@Controller
public class HomeController {
    ArticleService articleService;
    FileUploadService fileUploadService;

    AuthorService authorService;


    @Autowired
    HomeController(ArticleService articleService
            , AuthorService authorService,
                   FileUploadService fileUploadService) {
        this.articleService = articleService;
        this.authorService = authorService;
        this.fileUploadService = fileUploadService;
    }


//    @GetMapping("/index")
//    public ModelAndView getHomePage(){
//        ModelAndView obj = new ModelAndView();
//        obj.setViewName("index");
//        return obj;
//    }
//    @GetMapping("/registration")
//    public String registerForm() {
//        return "register-form";
//    }

//    @GetMapping("/form-add-article")
//    public String getFormAdd(Model model) {
//        model.addAttribute("article", new ArticleRequest());
//        model.addAttribute("authors", authorService.getAllAuthors());
//        return "new-article";
//    }

}
