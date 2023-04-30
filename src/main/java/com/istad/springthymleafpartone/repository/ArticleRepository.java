package com.istad.springthymleafpartone.repository;

import com.istad.springthymleafpartone.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepository {
    private List<Article> articleList = new ArrayList<>(){{

        add(new Article(1001,"Seang SengLeaph", "sengleaphseang@gmail.com","https://i.pinimg.com/236x/62/53/82/625382251af9bacd2e38ba9f6d85d021.jpg",new AuthorRepository().getAllAuthor().get(0)));
        add(new Article(1002,"Zenn Zer", "sengleaphseang@gmail.com","https://i.pinimg.com/564x/a9/ea/1f/a9ea1fffef4804b9dfabeb05120dec35.jpg",new AuthorRepository().getAllAuthor().get(0)));
        add(new Article(1003,"Si Fu", "sengleaphseang@gmail.com","https://i.pinimg.com/736x/51/b0/c0/51b0c0541220000e046b62be8f574fae.jpg",new AuthorRepository().getAllAuthor().get(0)));
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
//    public void deleteStudent(Article article){
//        articleList.add(Article.)
//    }


    public ArticleRepository() {
        this.articleList = articleList;
    }
}
