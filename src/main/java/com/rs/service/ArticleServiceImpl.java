package com.rs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rs.dao.ArticleDao;
import com.rs.entity.Article;

@Service("articleService")
@Transactional
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	ArticleDao articleDao;
	
	@Override
	public Article findByArticle(int id) {
		// TODO Auto-generated method stub
		return articleDao.findByArticle(id);
	}

	@Override
	public Article findByClietSSO(String sso) {
		// TODO Auto-generated method stub
		return articleDao.findByClietSSO(sso);
	}

	@Override
	public void save(Article article) {
		// TODO Auto-generated method stub
		articleDao.save(article);
	}

	@Override
	public void deleteByArticle(String sso) {
		// TODO Auto-generated method stub
		articleDao.deleteByArticle(sso);
	}

	@Override
	public List<Article> findAllArticle() {
		// TODO Auto-generated method stub
		return articleDao.findAllArticle();
	}

}
