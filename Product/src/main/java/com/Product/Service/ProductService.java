package com.Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Dao.ProductDao;
import com.Product.Entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao pd;

	public String addProduct(Product product) {

		pd.addProduct(product);
		return "";

	}

	public String addMulProduct(List<Product> product) {

		pd.addMulProduct(product);
		return "";
	}

//	public void deleteProducts(List<Integer> productIds) {
//	    pd.deleteProducts(productIds);
//	}

	
	public String deleteProduct(int productId) {
		
		return pd.deleteProduct(productId);
	}

	public String updateProduct(int pro_id , String pro_name,int pro_price, int mfg,int pro_exp) {
		return pd.UpdateProduct( pro_id ,  pro_name, pro_price, mfg,  pro_exp);
		
	}

	
	}

	


