package com.csf.gaf.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csf.gaf.domain.entity.Article;
import com.csf.gaf.service.ArticleService;

@RestController
@RequestMapping("/api/article")
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	


	// get all freresDto
	@GetMapping("/")
	public List<Article> getAllarticles() {
		List<Article> findAll = articleService.getAllArticles();
		return findAll;
	}
/*
	// get frereDto by frereId
	@GetMapping("/find/{frereId}")
	public FrereDto getCousinDtoById(@PathVariable(value = "frereId") long id) {
		Frere frere = frereService.get(id);
		return frereConverter.entityToDto(frere);
	}

	// create frereDto 
			@PostMapping("/save")
			public FrereDto save(@RequestBody FrereDto frereDto)  throws Exception {
				return frereConverter.entityToDto(frereService.save(frereDto));
			}

			// update frereDto 
			@PutMapping("/save/{id}")
			public FrereDto updateFrereDto(@RequestBody FrereDto frereDto, @PathVariable("id") long id)  throws Exception {
				Frere existingfrere = frereService.get(id);
				existingfrere.setNom(frereDto.getNom());
				existingfrere.setPrenom(frereDto.getPrenom());
				existingfrere.setAtteint(frereDto.getAtteint());
				existingfrere.setPlaceFratrie(frereDto.getPlaceFratrie());
				existingfrere.setSexe(frereDto.getSexe());
				existingfrere.setDecedes(frereDto.getDecedes());
				existingfrere.setAge(frereDto.getAge());
				existingfrere.setFiche(new Fiche(frereDto.getIdFiche()));
				FrereDto f=frereConverter.entityToDto(existingfrere);
				return frereConverter.entityToDto(frereService.save(f));
			}

			// delete frere by frereId
			@DeleteMapping("delete/{frereId}")
			public String deleteFrere(@PathVariable("frereId") long id) {
				Frere existingfrere = frereService.get(id);
				frereService.delete(id);
				return existingfrere.toString() + " is deleted";
			}
*/
}