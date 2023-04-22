package com.istad.springthymleafpartone.repository;


import com.istad.springthymleafpartone.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {
 private    List<Author> authors = new ArrayList<>(){{
        add(new Author(1001,"Pao Ponareach","male", "they call me the Sevenn"));
        add(new Author(1002,"Ngan vidy","male", "The owner of Vidy Company"));
        add(new Author(1003,"Seng Thairong","male", "holaaa"));
        add(new Author(1004,"Pos Panha","female", "no bio"));
        add(new Author(1005,"Sun Jessica","female", "make the right desecion, or you make the desecion right"));
        add(new Author(1006,"Vean Sreynuon","female", "no bio"));
        add(new Author(1007,"Kit Tara","male", "the best developer of cambodia"));
        add(new Author(1008,"Sek Piseth","male", "one day became CEO"));
        add(new Author(1009,"Sak Visal","male", "best front-end of all time"));
        add(new Author(1010,"Seang Sengleaph","male", "be the villain"));
        add(new Author(1011,"sean veasna","male", "bro s'mos"));
        add(new Author(1012,"Chea Settydett","male", "holaaa"));
        add(new Author(1013,"Tep Thean","male", "pink life"));
        add(new Author(1014,"Seng Seang Leng","male", "no counter"));
        add(new Author(1015,"Vean Sreynuon","male", "no bio"));
        add(new Author(1016,"Nhoeb Chanveasna","male", "the best developer of cambodia"));
        add(new Author(1017,"Rorn Bunthong","male", "one day became CEO blockchain"));


    }} ;

 public List<Author> getAllAuthor(){
     return authors;
 }
 // create
    // update
    // delete
    // search ....
}
