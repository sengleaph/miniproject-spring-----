package com.istad.springthymleafpartone.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.istad.springthymleafpartone.model.Article;
import com.istad.springthymleafpartone.model.request.ArticleRequest;
import com.istad.springthymleafpartone.service.ArticleService;
import com.istad.springthymleafpartone.service.AuthorService;
import com.istad.springthymleafpartone.service.FileUploadService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Comparator;
import java.util.List;

@Controller
public class ArticleController {

    // 3
    // 1. Constructor injection
    // 2. Field injection
    // 3. Setter Injection


    ArticleService articleService;
    FileUploadService fileUploadService;

    AuthorService authorService;


    @Autowired
    ArticleController(ArticleService articleService
            , AuthorService authorService,
                      FileUploadService fileUploadService) {
        this.articleService = articleService;
        this.authorService = authorService;
        this.fileUploadService = fileUploadService;
    }


    @GetMapping("/all-articles")
    public String allPost(Model model) {
        model.addAttribute("allArticles",
                articleService.getAllArticle());
        return "all-article";
    }

    @GetMapping("/post/{postID}")
    public String getPostByID(@PathVariable int postID, Model model) {
        model.addAttribute("article", articleService.getArticleByID(postID));
        return "viewArticle";

    }

    @GetMapping("/form-add-article")
    public String getFormAdd(Model model) {
        model.addAttribute("article", new ArticleRequest());
        model.addAttribute("authors", authorService.getAllAuthors());
        return "new-article";
    }

    //    @GetMapping("/Art-store")
//    public String string (Model model ) {
//        model.addAttribute("allArticles",
//                articleService.getAllArticle());
//        return "Art-store";
//    }
    @GetMapping("/")
    public String intro(Model model) {
        model.addAttribute("allArticles", articleService.getAllArticle());
        return "index";
    }

    @GetMapping("/index")
    public String getAllArticle(Model model) {
        model.addAttribute("allArticles", articleService.getAllArticle());
        return "index";
    }

    @GetMapping("/all-user")
    public String viewAutor(Model model) {
//        model.addAttribute("article", new ArticleRequest());
        model.addAttribute("allArticles", authorService.getAllAuthors());
        return "all-author";
    }
//    @GetMapping("/Art-store")
//    String artStore(Model model){
//
//        List<String> userNames = new ArrayList<>(){{
//            add("James");
//            add("kori") ;
//            add("hipo");
//            add("Jisa");
//        }};
//        model.addAttribute("users", userNames);
//
//        return "Art-store";
//    }

    @PostMapping("/handleAddArticle")
    public String handleAddArticle(@Valid @ModelAttribute("article") ArticleRequest article, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            System.out.println("Erorr has happened!!!");
//            model.addAttribute("article", new ArticleRequest());
            model.addAttribute("authors", authorService.getAllAuthors());
            return "new-article";
        }
        Article newArticle = new Article();
        try {
            String filenames = "http://localhost:8080/images/" + fileUploadService.uploadFile(article.getFile());

            newArticle.setImgUrl(filenames);
        } catch (Exception ex) {
            newArticle.setImgUrl("https://developers.elementor.com/docs/assets/img/elementor-placeholder-image.png");
            System.out.println("Error : " + ex.getMessage());
        }

        // mapstruct vs model mapper
        newArticle.setTitle(article.getTitle());
        newArticle.setDescription(article.getDescription());
//        newArticle.setImgUrl(article.getImgUrl());

        // find the article by ID
        newArticle.setAuthor(authorService.getAllAuthors().stream().filter(e -> e.getId() == article.getAuthorId())
                .findFirst().orElse(null));

        // id , author
        // get the max article id and add the value by 1
        newArticle.setId(articleService.getAllArticle().stream().max(Comparator.comparingInt(Article::getId)).stream().toList().get(0).getId() + 1);

        articleService.addNewArticle(newArticle);
        return "redirect:/index";
    }

    @GetMapping("/articles/delete/{id}")
    public ModelAndView showDeleteArticleForm(@PathVariable("id") int id) {
        Article article = articleService.getArticleByID(id);
        ModelAndView modelAndView = new ModelAndView("delete_article");
        modelAndView.addObject("article", article);
        return modelAndView;
    }


    @GetMapping("/delete")
    public ModelAndView getAllArticles() {
//        Article articles = articleService.deleteArticle();
        ModelAndView modelAndView = new ModelAndView("articles");
        modelAndView.addObject("articles");
        return modelAndView;
    }

    @PostMapping("/articles/delete/{id}")
    public String deleteArticle(@PathVariable("id") Article id) {
        articleService.deleteArticle(id);
        return "redirect:/delete";
    }

    @GetMapping("/delete-table")
    public String delete(Model model) {
//        model.addAttribute("article", new ArticleRequest());
        model.addAttribute("delete", authorService.getAllAuthors());
        return "delete";

    }
}
