package com.istad.springthymleafpartone.repository;


import com.istad.springthymleafpartone.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {
 private    List<Author> authors = new ArrayList<>(){{
        add(new Author(1001,"Teacher Chhaya","male", "Full Stack Developer in Cambodia","https://avatars.githubusercontent.com/u/52463584?v=4"));
        add(new Author(1002,"Teacher Raksmey","female", "Back-end is good, front-end is best","https://z-p3-scontent.fpnh5-2.fna.fbcdn.net/v/t1.6435-9/94132053_2615136765441131_3936020631211999232_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=174925&_nc_eui2=AeGuFvy5VLZ3t73yZZ2rzfiw2OcCnZfspMDY5wKdl-ykwMKas7W4s4thCZmPk3WOGP0tnqeS05ziwzmquSSAq34k&_nc_ohc=8rmBv-yUKSUAX_l6C7A&_nc_ht=z-p3-scontent.fpnh5-2.fna&oh=00_AfAjESGC7NYrgV2BTHfoyV-HCrg25yFxp2OTUZ5cOdGCjQ&oe=64739403"));
        add(new Author(1003,"Teacher Tara","male", "the more you learn, the more you bet","https://z-p3-scontent.fpnh5-2.fna.fbcdn.net/v/t39.30808-6/286039955_3273163536267677_6885815304971618004_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeHqaID9Rsxdw__wEgJz1Ix-v0V49XVz8FS_RXj1dXPwVG4KaCFkNIw6J6NH4JMaEODrPiDtxbKgu1-VXQMGWQym&_nc_ohc=zzNspxRYGfIAX-D4cNP&_nc_zt=23&_nc_ht=z-p3-scontent.fpnh5-2.fna&oh=00_AfCi3paJf4lOHtJFEJQz3viKcrNQOufC5LHFEV3nk9xMvQ&oe=64517D58"));
        add(new Author(1004,"Teacher Sokkea","male", "be security for best","https://z-p3-scontent.fpnh5-3.fna.fbcdn.net/v/t39.30808-6/296010165_744161580165526_786119506447804604_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeErbZ-X-yiPXLoEeXOnedSatRGaAKIC-pu1EZoAogL6m1xQrh-UCD-ZHBEQ2AtOqxeiByQCFFNkr-Vg1Y6uPlqg&_nc_ohc=G5miastpNvoAX8YspLs&_nc_zt=23&_nc_ht=z-p3-scontent.fpnh5-3.fna&oh=00_AfDf_eduOjEsK3B9-gF1xY6PBoKVeJAkLC9lbc7TsGqg8w&oe=64519FB5"));
        add(new Author(1005,"Teacher keo","male", "best dev ops dev and boros s'mos s'ne","https://avatars.githubusercontent.com/u/102707262?v=4"));
    }} ;

 public List<Author> getAllAuthor(){
     return authors;
 }
 // create
    // update
    // delete
    // search ....
}
