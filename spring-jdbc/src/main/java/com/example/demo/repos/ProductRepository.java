package com.example.demo.repos;

import java.sql.SQLException;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

import com.example.demo.ifaces.CrudRepository;

@Repository

public class ProductRepository implements CrudRepository<Product> {
	
	private JdbcTemplate template;
	
	@Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int add(Product t) {
		// TODO Auto-generated method stub
		
		String sql = "insert into prawin_product values(?,?,?)";
		
		return template.update(sql,t.getProductId(),t.getProductName(),t.getPrice());
		
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		
		String sql = "select * from prawin_product";
		
		return template.query(sql,BeanPropertyRowMapper.newInstance(Product.class));
	
	}

	@Override
	public Product findById(int id) {
		
		try {
			
		String sql = "select * from prawin_product where product_id = ?";
		
		return template.queryForObject(sql,BeanPropertyRowMapper.newInstance(Product.class),id);
		
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
			return null;
		}
		
		
	}

	@Override
	public int update(Product t) {
		
		String sql = "update prawin_product set product_name =? where product_id =?";
		
		return template.update(sql, new Object[] {t.getProductName(),t.getProductId()});
				
	}

	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		
		String sql = "delete from prawin_product where product_id = ?";
		
		return template.update(sql,id);
	}
	
	

}
