package product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import product.entity.Product;
import product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return repository.getAllProduct();
	}

	@Override
	public Product getProduct(String no) {
		// TODO Auto-generated method stub
		return repository.getProduct(no);
	}

}
