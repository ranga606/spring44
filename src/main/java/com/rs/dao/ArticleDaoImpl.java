package com.rs.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.rs.entity.Article;

@Repository("articleDao")
public class ArticleDaoImpl extends AbstractDao<Integer, Article> implements ArticleDao{

	@Override
	public Article findByArticle(int id) {
		// TODO Auto-generated method stub
		Article article = getByPrimaryKey(id);
		return article;
	}

	@Override
	public Article findByClietSSO(String sso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Article article) {
		persistsave(article);
		
	}

	@Override
	public void deleteByArticle(String id) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("client_ssoId", id));
		Article article = (Article)crit.uniqueResult();
		delete(article);
		
	}

	@Override
	public List<Article> findAllArticle() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("article_name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Article> client = (List<Article>) criteria.list();
		return client;
	}

}
