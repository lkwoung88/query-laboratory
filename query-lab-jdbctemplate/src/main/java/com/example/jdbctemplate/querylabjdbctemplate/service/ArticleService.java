package com.example.jdbctemplate.querylabjdbctemplate.service;

import com.example.jdbctemplate.querylabjdbctemplate.entity.ArticleContents;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArticleService {

    private final JdbcTemplate jdbcTemplate;

    public String updateArticle(int userNo, String content) {
        try {
            final String updateArticle = "";
            return "success";
        } catch (Exception e) {
            return "fail";
        }
    }

    public List<ArticleContents> getArticle() {
        try {
            final String selectArticle =
                    "SELECT article.content AS content " +
                    "FROM t_article AS article";

            List<ArticleContents> list = jdbcTemplate.query(selectArticle, new BeanPropertyRowMapper<>(ArticleContents.class));

            return list;
        } catch (Exception e) {
            return null;
        }
    }
}
