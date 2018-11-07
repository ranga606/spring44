package com.rs.service;

import java.util.List;

import com.rs.entity.Article;

public interface ArticleService {


    Article findByArticle(int id);
	
    Article findByClietSSO(String sso);
	
	void save(Article article);
	
	void deleteByArticle(String sso);
	
	List<Article> findAllArticle();
	
}
