package com.vensai.cassandra.CassandraSpringBootDemo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vensai.cassandra.CassandraSpringBootDemo.service.ProductDetailsServiceImpl;
import com.vensai.cassandra.CassandraSpringBootDemo.vo.ProductDetails;

@RestController
public class ProductDetailsController {

	@Autowired
	private ProductDetailsServiceImpl detailsService;

	@GetMapping("/product/list")
	public List<ProductDetails> listProducts() {
		return detailsService.listAll();
	}
	
	@PostMapping("/product")
	public ProductDetails saveProduct(@RequestBody ProductDetails details) {
		detailsService.addProduct(details);
		return details;
	}
	
	@GetMapping("/product/list/{id}")
	public ProductDetails getProductDetailsById(@PathVariable("id") UUID id) {
		return detailsService.getProductDetailsById(id);
	}
	
	@PutMapping("/product/{id}")
	public ProductDetails updateProduct(@PathVariable("id") UUID id , @RequestBody ProductDetails details) {
		return detailsService.updatePrduct(id , details);
	}
	 
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable("id") UUID id) {
		detailsService.deleteProduct(id);
		return "Record Deleted Successfully";
	}

}
