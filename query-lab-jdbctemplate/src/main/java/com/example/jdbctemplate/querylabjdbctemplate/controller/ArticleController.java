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

    // TODO 글을 수정할때는 사용자가 쓴 글, 혹은 사용자가 속한 그룹장, 그리고 전체 시스템 관리자만 글을 수정할 수 있다.
    @PostMapping("/update")
    public String updateArticle(@RequestParam("userNo") int userNo, @RequestParam("content") String content) {
        return articleService.updateArticle(userNo, content);
    }

    @GetMapping
    public List<ArticleContents> getArticle() {
        return articleService.getArticle();
    }
}
