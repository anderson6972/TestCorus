package com.corus.controller;


import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.corus.services.Customer;
import com.corus.services.GetCustomers_WSD_PortType;
import com.corus.services.GetCustomers_WSD_PortTypeProxy;
import com.corus.services.getProducts.CustomerProducts;
import com.corus.services.getProducts.GetProductByCustomer_WSD_PortType;
import com.corus.services.getProducts.GetProductByCustomer_WSD_PortTypeProxy;



@ViewScoped
@ManagedBean
public class CustomerController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Customer> lstSelected=new ArrayList<Customer>();
	private Customer selected;
	GetCustomers_WSD_PortType service ;
	GetProductByCustomer_WSD_PortType products;
	private List<CustomerProducts> customerProducts;		
	
	public CustomerController() {	
	}



	@PostConstruct
	public void init() {
		selected=new Customer();
		service = new GetCustomers_WSD_PortTypeProxy().getGetCustomers_WSD_PortType();
		products = new GetProductByCustomer_WSD_PortTypeProxy().getGetProductByCustomer_WSD_PortType();	
		try {
			lstSelected= Arrays.asList(service.getCustomers()) ;	
			if(lstSelected.size()>0) {
				customerProducts=new ArrayList<CustomerProducts>();
				for(Customer entity:lstSelected) {
					customerProducts.add(products.getProductByCustomer(entity.getCustomer_id()));
				}
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Pase por el init ");
	}
	
	
	public List<CustomerProducts> getCustomerProducts() {
		return customerProducts;
	}

	public void setCustomerProducts(List<CustomerProducts> customerProducts) {
		this.customerProducts = customerProducts;
	}



	public List<Customer> getLstSelected() {	
					
		return lstSelected;
	}
	public void setLstSelected(List<Customer> lstSelected) {
		this.lstSelected = lstSelected;
	}



	public Customer getSelected() {
		return selected;
	}


	public void setSelected(Customer selected) {
		this.selected = selected;
	}
	
	

}