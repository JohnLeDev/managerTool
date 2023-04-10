package com.example.demo.GenerateTool.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.GenerateTool.model.Product;
@Repository 
public interface ProductReponsitory extends CrudRepository< Product , Long> {
	List<Product> findByName(String name) ;
}
