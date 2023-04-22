package com.istad.springthymleafpartone.repository;

import com.istad.springthymleafpartone.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepository {
    private List<Article> articleList = new ArrayList<>(){{

        add(new Article(1001,"Seang SengLeaph", "be the villain","https://i.pinimg.com/236x/62/53/82/625382251af9bacd2e38ba9f6d85d021.jpg",new AuthorRepository().getAllAuthor().get(0)));

    }} ;


    public List<Article> getAllArticle(){
        return articleList;
    }

    public Article getArticleByID(int id ){
        return articleList.stream().filter(e-> e.getId()==id).findFirst()
                .orElse(null);
    }

    public void addNewArticle(Article article){
        articleList.add(article);
    }


}
