package com.example.demo.GenerateTool.dto;

import java.util.List;

import com.example.demo.GenerateTool.model.Product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class WareHouseDto {
	private long a95;
	private long a92;
	private long gasdo;
	private List<Product> oils; 
}
