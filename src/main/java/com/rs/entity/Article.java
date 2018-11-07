package com.rs.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;





@Entity
@Table(name = "tb_article")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "article_id")
	private int article_id;
	
	@Column(name = "user_id")
	private int user_id;
	
	@Column(name = "article_name")
	private String article_name;
	
	@Column(name = "article_description")
	private String article_description;
	
	@Column(name = "is_activated")
	private boolean is_activated;
	
	@Column(name = "is_deleted")
	private boolean is_deleted;
	
	@OneToMany(mappedBy="article", cascade=CascadeType.PERSIST)
	private List<ContentType> content;
	
	public int getArticle_id() {
		return article_id;
	}
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getArticle_name() {
		return article_name;
	}
	public void setArticle_name(String article_name) {
		this.article_name = article_name;
	}
	public String getArticle_description() {
		return article_description;
	}
	public void setArticle_description(String article_description) {
		this.article_description = article_description;
	}
	public boolean isIs_activated() {
		return is_activated;
	}
	public void setIs_activated(boolean is_activated) {
		this.is_activated = is_activated;
	}
	public boolean isIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}
	public List<ContentType> getContent() {
		return content;
	}
	public void setContent(List<ContentType> content) {
		this.content = content;
	}
	
	
	
}
