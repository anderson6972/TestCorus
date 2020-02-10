package com.corus.services.test;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import com.corus.service.getOrder.GetOrder_WSD_PortType;
import com.corus.service.getOrder.GetOrder_WSD_PortTypeProxy;
import com.corus.service.getOrder.Order;
import com.corus.service.getOrder.OrderDetail;

public class GetOrder_ByIdOrder {

	@Test
	public void test() {
		GetOrder_WSD_PortType service = new GetOrder_WSD_PortTypeProxy().getGetOrder_WSD_PortType();
		try {
			Order order=service.getOrder("2020");
			System.out.println("Orden Nº "+order.getOrder_id()+" Fecha: "+order.getOrder_date()+" Id Cliente: "+order.getCustomer().getCustomer_id()+" Nombre Cliente:"+order.getCustomer().getName());
			for(OrderDetail entity:order.getOrder_detail()) {
				System.out.println("Nombre Producto: "+entity.getProduct().getName()+" Id Producto: "+entity.getProduct().getProduct_id()+" Descripcion: "+entity.getProduct().getProduct_description());				
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
