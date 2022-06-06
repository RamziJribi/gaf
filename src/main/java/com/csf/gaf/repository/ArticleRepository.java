/**
 * Spring Data JPA repositories. */
package com.csf.gaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csf.gaf.domain.entity.Article;
 
//repository that extends CrudRepository  
//extends => heritage
@Repository
public interface ArticleRepository extends JpaRepository<Article, String>  
{  
}  
