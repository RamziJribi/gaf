package com.csf.gaf.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csf.gaf.domain.entity.Article;
import com.csf.gaf.repository.ArticleRepository;

//defining the business logic  
@Service 
public class ArticleService {
	@Autowired  
	ArticleRepository articleRepository;  
	
	//getting all Article record by using the method findaAll() of CrudRepository  
	public List<Article> getAllArticles()   
	{  
		List<Article> article = new ArrayList<Article>();  
		articleRepository.findAll().forEach(article1 -> article.add(article1));  
		return article;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Article getArticleById(String id)   
	{  
		return articleRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Article article)   
	{  
		articleRepository.save(article);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(String id)   
	{  
		articleRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Article article)   
	{  
		articleRepository.save(article);  
	}  
}
