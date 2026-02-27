package com.cagemini.category_product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cagemini.category_product.dao.CategoryJpaRepository;
import com.cagemini.category_product.dto.Category;

@RestController
public class CategoryController {

	@Autowired
	 CategoryJpaRepository categoryjpa;
	
	@PostMapping("/add")
	public Category addCategory(@RequestBody Category c) {
		
		return categoryjpa.save(c);
		
	}
	
	@GetMapping("/categories/{page}/{size}")
	public List<Category> getCategory(@PathVariable int page,@PathVariable int size) {
		
		Page<Category> p=categoryjpa.findAll(PageRequest
				.of(page, size,Sort.by("id").descending()));
		
		return p.getContent();
	}
	
}

