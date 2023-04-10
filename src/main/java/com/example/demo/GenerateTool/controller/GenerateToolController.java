package com.example.demo.GenerateTool.controller;

import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.GenerateTool.dto.ProductDTO;
import com.example.demo.GenerateTool.dto.WareHouseDto;
import com.example.demo.GenerateTool.service.ProductService;

@RestController
@RequestMapping("warehouse")
public class GenerateToolController {
	
	@Autowired
	private ProductService oilService;
	
	@PutMapping
	public ResponseEntity<String> insertWarehouse(@RequestBody WareHouseDto body) {
		
		return new ResponseEntity<String>("",HttpStatus.OK);
	}
	
	@GetMapping("all")
	public String getWarehouse() {
		return "String";
	}
	
	@GetMapping("{id}")
	public String getWarehouseAgency(@RequestParam String id) {
		return id;
	}
	
	@GetMapping("")
	public ResponseEntity<String> insert(@RequestBody ProductDTO oilDto) {
		ProductDTO oildto =  oilService.insertOilDTO(oilDto);
		if(oildto == null) {
			return new ResponseEntity<String>("Oil is existed",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("",HttpStatus.OK);
	}
	
	@GetMapping("product")
	public ResponseEntity<String> insertOil(@RequestBody ProductDTO oilDto) {
		ProductDTO oildto =  oilService.insertOilDTO(oilDto);
		if(oildto == null) {
			return new ResponseEntity<String>("Oil is existed",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("",HttpStatus.OK);
	}
}
