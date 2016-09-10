package product.service;

import java.util.List;

import product.entity.Product;

public interface ProductService {
	public List<Product> getAllProduct();
	public Product getProduct(String no);
}
