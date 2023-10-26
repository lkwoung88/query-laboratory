package com.example.jdbctemplate.querylabjdbctemplate.service;

import com.example.jdbctemplate.querylabjdbctemplate.entity.ArticleContents;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@PropertySource("classpath:sqlMapper/query.xml")
public class ArticleService {

    @Value("${article.selectArticleList}")
    private String selectAllArticle;
    private final JdbcTemplate jdbcTemplate;


    public String updateArticle(int userNo, String content) {
        try {
            // 글을 수정할때는 사용자가 쓴 글, 혹은 사용자가 속한 그룹장, 그리고 전체 시스템 관리자만 글을 수정할 수 있다.
            
            return "success";
        } catch (Exception e) {
            return "fail";
        }
    }

    public List<ArticleContents> getArticle() {
        try {
            List<ArticleContents> list = jdbcTemplate.query(selectAllArticle, new BeanPropertyRowMapper<>(ArticleContents.class));
            return list;
        } catch (Exception e) {
            return null;
        }
    }


}
