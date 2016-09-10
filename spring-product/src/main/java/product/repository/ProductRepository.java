package product.repository;

import java.util.List;

import product.entity.Product;

public interface ProductRepository {
	public List<Product> getAllProduct();
	public Product getProduct(String no);
}
