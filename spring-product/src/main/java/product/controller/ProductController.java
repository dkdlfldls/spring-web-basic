package product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import product.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	@RequestMapping("/products")
	public String getAllProducts(Model model) {
		model.addAttribute(service.getAllProduct()); //productList
		
		return "products";
	}
	
	@RequestMapping("/products/{no}")
	public String getProduct(Model model, @PathVariable("no") String no) {
		model.addAttribute(service.getProduct(no)); //product
		
		return "product";
	}
}
