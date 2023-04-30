package com.istad.springthymleafpartone.model.request;

import com.istad.springthymleafpartone.model.Author;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleRequest {

    private int id;
    @NotEmpty(message = "Title cannot be empty!")
    private String title;
    @NotEmpty(message = "Gmail cannot be empty!")
    private String description;
    private MultipartFile file;
    //    @Pattern(regexp = "^[0-9]*$", message = "Author ID can only be number")
    private int authorId;
    private int[] categoryId;
    private String imgURL;

}

