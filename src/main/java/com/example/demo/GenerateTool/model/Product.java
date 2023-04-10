package com.example.demo.GenerateTool.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
	@Id
	private long id;
	private double price ;
	private String name ;
	private String code ;
	private int tax ; 
	private double quatity;
}
