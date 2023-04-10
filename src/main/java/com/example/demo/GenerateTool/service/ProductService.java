package com.example.demo.GenerateTool.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.GenerateTool.dto.ProductDTO;
import com.example.demo.GenerateTool.model.Product;
import com.example.demo.GenerateTool.repository.ProductReponsitory;

@Service
public class ProductService {
	@Autowired
	private ProductReponsitory oilReponsitory;
	
	@Autowired
	private ModelMapper modelMapper;
	public ProductDTO insertOilDTO(ProductDTO oilDto) {
		Product oil = modelMapper.map(oilDto, Product.class);
		List<Product> checkExistOil = oilReponsitory.findByName(oilDto.getName());
		if(!checkExistOil.isEmpty()) {
			return null;
		};
		oilReponsitory.save(oil);
		return oilDto;
	}
}
