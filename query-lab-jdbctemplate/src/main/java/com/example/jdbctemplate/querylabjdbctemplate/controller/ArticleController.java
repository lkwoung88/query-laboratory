package com.example.jdbctemplate.querylabjdbctemplate.controller;

import com.example.jdbctemplate.querylabjdbctemplate.entity.ArticleContents;
import com.example.jdbctemplate.querylabjdbctemplate.service.ArticleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping("/update")
    public String updateArticle(@RequestParam("userNo") int userNo, @RequestParam("content") String content) {
        return articleService.updateArticle(userNo, content);
    }

    @GetMapping
    public List<ArticleContents> getArticle() {
        return articleService.getArticle();
    }
}
