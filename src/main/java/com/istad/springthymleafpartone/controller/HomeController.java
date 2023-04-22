package com.istad.springthymleafpartone.controller;


import com.istad.springthymleafpartone.service.ArticleService;
import com.istad.springthymleafpartone.service.AuthorService;
import com.istad.springthymleafpartone.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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


    @GetMapping("/index")
    public String getAllArticle(Model model ) {
        model.addAttribute("allArticles",
                articleService.getAllArticle());
        return "index";
    }


}
