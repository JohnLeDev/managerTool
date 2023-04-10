package com.example.demo.GenerateTool.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WareHouse {
	@Id
	private  long id; 
	private long gasA95 ;
	private long gasA92 ;
	private long gasDO;
	private List<Product> oil  ;  
}
