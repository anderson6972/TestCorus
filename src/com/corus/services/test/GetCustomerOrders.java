package com.corus.services.test;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import com.corus.services.orderByCliente.GetCustomerOrders_WSD_PortType;
import com.corus.services.orderByCliente.GetCustomerOrders_WSD_PortTypeProxy;

public class GetCustomerOrders {

	@Test
	public void test() {
		GetCustomerOrders_WSD_PortType service = new GetCustomerOrders_WSD_PortTypeProxy().getGetCustomerOrders_WSD_PortType();
		
		try {
			String[] order=service.getCustomerOrders("2020");
			for(String ord:order) {
				System.out.println(ord);
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
