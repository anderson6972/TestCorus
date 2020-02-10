package com.corus.controller;


import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.corus.service.getOrder.GetOrder_WSD_PortType;
import com.corus.service.getOrder.GetOrder_WSD_PortTypeProxy;
import com.corus.service.getOrder.Order;
import com.corus.service.getOrder.OrderDetail;
import com.corus.services.getProducts.CustomerProducts;
import com.corus.services.getProducts.GetProductByCustomer_WSD_PortType;
import com.corus.services.getProducts.GetProductByCustomer_WSD_PortTypeProxy;
import com.corus.services.getProducts.Product;
import com.corus.services.orderByCliente.GetCustomerOrders_WSD_PortType;
import com.corus.services.orderByCliente.GetCustomerOrders_WSD_PortTypeProxy;



@ViewScoped
@ManagedBean
public class CustomerLocalController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public CustomerLocalController() {		
	}
	
	private CustomerProducts customerProducts;
	private String idCustomer;
	private String idCustomerOrder;
	GetProductByCustomer_WSD_PortType servicio;//Para los Productos
	GetCustomerOrders_WSD_PortType getOrderId;//para obtener id las ordenes
	GetOrder_WSD_PortType getOrders;//para obtener las ordenes
	private List<Product> lstCompra = new ArrayList<Product>();
	private Product selected;
	private boolean dolar;
	private List<Order> lstOrder;
	
	
	
	
	@PostConstruct
	public void init() {
		servicio = new GetProductByCustomer_WSD_PortTypeProxy().getGetProductByCustomer_WSD_PortType();	
		getOrderId = new GetCustomerOrders_WSD_PortTypeProxy().getGetCustomerOrders_WSD_PortType();
		getOrders = new GetOrder_WSD_PortTypeProxy().getGetOrder_WSD_PortType();
		System.out.println("Init del customer Local COntroller");
		dolar=true;
		selected=new Product();
		idCustomer="";
		idCustomerOrder="";
	}
		

	public String getIdCustomerOrder() {
		return idCustomerOrder;
	}


	public void setIdCustomerOrder(String idCustomerOrder) {
		this.idCustomerOrder = idCustomerOrder;
	}


	public Product getSelected() {
		return selected;
	}



	public void setSelected(Product selected) {
		this.selected = selected;
	}



	public boolean isDolar() {
		return dolar;
	}



	public void setDolar(boolean dolar) {
		this.dolar = dolar;
	}



	public String getIdCustomer() {
		return idCustomer;
	}


	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}


	public CustomerProducts getCustomerProducts() {
		return customerProducts;
	}


	public void setCustomerProducts(CustomerProducts customerProducts) {
		this.customerProducts = customerProducts;
	}
	
	


	public List<Order> getLstOrder() {
		return lstOrder;
	}


	public void setLstOrder(List<Order> lstOrder) {
		this.lstOrder = lstOrder;
	}


	public void findProductByIdCliente() {
		System.out.println("Buscando productos");
		try {
			customerProducts=servicio.getProductByCustomer(idCustomer);
			for(Product entity:customerProducts.getProducts()) {
				System.out.println(entity.getProduct_id()+" "+entity.getName()+" "+entity.getProduct_description()+ " "+entity.getPrice());				
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cambio() {
		System.out.println(dolar);
	}
	
	public void add() {
		if(lstCompra.size()<5) {
			lstCompra.add(selected);
			//pauso esta tarea ya que tengo problemas para desplegar los estilos deprimefaces					
		}				
				
	}
	
	public void loadOrder() {
		try {
			String[] findOrder= getOrderId.getCustomerOrders(idCustomerOrder);
			lstOrder=new ArrayList<Order>();
			if(findOrder.length>0) {				
				for(String idOrder:findOrder){
					lstOrder.add(getOrders.getOrder(idOrder));
				}
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void detalleOrden(List<OrderDetail> lstOrderDetail) {
		System.out.println(lstOrderDetail);		
	}
	
}