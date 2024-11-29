package com.Product.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Product.Entity.Product;

@Repository
public class ProductDao {
	
@Autowired
 SessionFactory sf;
	public String addProduct(Product product) {
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
	
	ss.save(product);
	
	tr.commit();
	//ss.close();
		 return"Product saved successfully";
		
	}
	public String addMulProduct(List<Product> product) {
	
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		for (Product product1 : product) {
            ss.save(product1);
        }
		
		tr.commit();
		
			 return"Product saved successfully";
	}
//	
//	public void deleteProducts(List<Integer> productIds) {
//	    Session ss = sf.openSession();
//	    Transaction tr = ss.beginTransaction();
//
//	    // Use an HQL query to delete multiple products by ID
//	    String hql = "DELETE FROM Product WHERE id IN :ids";
//	    ss.createQuery(hql)
//	    
//	                     
//	      .setParameter("ids", productIds)
//	      .executeUpdate();
//
//	    tr.commit();
//	    ss.close();
//	}
//	
	
	public String deleteProduct(int productId) {
		 Session session = sf.openSession();
		    Transaction tr = session.beginTransaction();
		    
		    Product product = session.get(Product.class, productId);
		    
		    session.delete(product);
		    tr.commit();
		  return null;
	}

	public String UpdateProduct(int pro_id , String pro_name,int pro_price,int mfg, int pro_exp) {
			 Session session = sf.openSession();
			    Transaction tr = session.beginTransaction();
			    
			    Product product = session.get(Product.class, pro_id);
			   // product.setId(pro_id);
			    product.setName(pro_name);
			    product.setPrice(pro_price);
			    product.setMfg(mfg);
			    product.setExp(pro_exp);
			    
			    
			    session.update(product);
			    tr.commit();
			  return null;
	}

	
	
}

