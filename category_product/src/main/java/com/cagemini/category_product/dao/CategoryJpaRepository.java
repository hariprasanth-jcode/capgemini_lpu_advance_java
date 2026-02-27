package com.cagemini.category_product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cagemini.category_product.dto.Category;


public interface CategoryJpaRepository extends JpaRepository<Category, Integer>{

}
