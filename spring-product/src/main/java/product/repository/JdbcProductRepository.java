package product.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import product.entity.Product;

@Repository
public class JdbcProductRepository implements ProductRepository {

	private JdbcTemplate template;
	
	@Autowired
	public JdbcProductRepository(DataSource dataSource) {
		template = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Product> getAllProduct() {
		String sql = "SELECT * FROM product";
		return template.query(sql, (rs,no)->{
			return new Product(rs.getString("no")
					,rs.getString("name")
					,rs.getInt("no")
					,rs.getString("vender"));
		});
	}

	@Override
	public Product getProduct(String no) {
		String sql = "SELECT * FROM product WHERE no=?";
		return template.queryForObject(sql, (rs, num)->{
			return new Product(rs.getString("no")
					,rs.getString("name")
					,rs.getInt("no")
					,rs.getString("vender"));
		}, no);
	}

}
