package com.Product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Product.Entity.Product;
import com.Product.Service.ProductService;

@RestController

public class ProductController {
	@Autowired
	 ProductService ps;
	
	@PostMapping("/AddProduct")
	public String addProduct (@RequestBody Product product) {
		
		
		ps.addProduct(product);
		return"";
	}
	
	@PostMapping("/AddProducts")
	public String addMulProduct (@RequestBody List<Product> product) {
		
		
		ps.addMulProduct(product);
		return"";
	}
//	@DeleteMapping("/deleteProducts")
//	public String deleteProducts(@RequestBody List<Integer> productIds) {
//	    ps.deleteProducts(productIds);
//	    return "Products deleted successfully!";
//	}
	
	@DeleteMapping("/DeleteProduct")
	public String deleteProduct (@RequestParam int productId) {
		
		
	return	ps.deleteProduct(productId);
	}
	
	@PutMapping("/UpdateProduct")
	public String updateProduct (@RequestParam int pro_id , String pro_name,int pro_price, int mfg, int pro_exp) {
		
		
	return	ps.updateProduct(pro_id , pro_name, pro_price,mfg,  pro_exp);
	}
}
	
	

