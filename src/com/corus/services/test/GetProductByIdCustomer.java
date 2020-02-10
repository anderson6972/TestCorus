package com.corus.services.test;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import com.corus.services.getProducts.CustomerProducts;
import com.corus.services.getProducts.GetProductByCustomer_WSD_PortType;
import com.corus.services.getProducts.GetProductByCustomer_WSD_PortTypeProxy;
import com.corus.services.getProducts.Product;

public class GetProductByIdCustomer {

	@Test
	public void test() {
		GetProductByCustomer_WSD_PortType service = new GetProductByCustomer_WSD_PortTypeProxy().getGetProductByCustomer_WSD_PortType();
		try {
			CustomerProducts customerProducts = service.getProductByCustomer("123");
			
			for(Product entity:customerProducts.getProducts()) {
				System.out.println(entity.getProduct_id()+" "+entity.getName()+" "+entity.getProduct_description()+" "+entity.getPrice());				
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
