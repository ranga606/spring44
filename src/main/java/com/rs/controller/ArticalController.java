package com.rs.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rs.entity.Article;
import com.rs.entity.ContentType;
import com.rs.models.ResponseVo;
import com.rs.service.ArticleService;
import com.rs.utilsLocal.Util;

@Controller
public class ArticalController {
	
	@Autowired
	ArticleService articleservice;
	
	@RequestMapping("/viewall")
	protected ModelAndView getAllArticals(){
		
		List<Article> articals = articleservice.findAllArticle();
		ResponseVo response = new ResponseVo();
		response.setErrorcode(200);
		response.setResponse(articals);
		response.setMessage("Successfully Added");
		ModelAndView modelAndView = new ModelAndView("welcome");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/addorupdate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	protected void addorUpdateArtical(@RequestBody String request) {
	
		Article article = (Article)Util.getRequestBodyModelFromString(request, Article.class);
		ResponseVo response = new ResponseVo();
		response.setErrorcode(200);
		response.setResponse(article);
		response.setMessage("Successfully Added");
	}
	@RequestMapping("/add")
	protected ModelAndView helloworl()  {
		ModelAndView modelAndView = new ModelAndView("welcome");
		test();
		return modelAndView;
	}
	
	@RequestMapping("/deletearticles")
	protected void deleteArticle() {
		
	}
	
	@RequestMapping("/disablearticles")
	protected void disableArticles() {
		
	}
	
	private void test() {
		Article article = new Article();
		article.setArticle_name("tesslssl");
		article.setArticle_description("descritpp");
		article.setIs_activated(true);
		
		List<ContentType> contentarry = new ArrayList<ContentType>();
		
		ContentType content = new ContentType();
		content.setContent("dfhajdksalkadslajdldf");
		content.setArticle(article);
		contentarry.add(content);
	
		contentarry.forEach(n -> System.out.println(n.getContent_id())); 
		
		article.setContent(contentarry);
		articleservice.save(article);
	}
	
	

}
