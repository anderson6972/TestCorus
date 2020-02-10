package com.corus.services.test;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import com.corus.services.Customer;
import com.corus.services.GetCustomers_WSD_PortType;
import com.corus.services.GetCustomers_WSD_PortTypeProxy;

public class GetCustomers {

	@Test
	public void test() {
		GetCustomers_WSD_PortType service = new GetCustomers_WSD_PortTypeProxy().getGetCustomers_WSD_PortType();
		Customer[] lstCustomer;
		try {
			lstCustomer = service.getCustomers();
			for(Customer entity:lstCustomer) {				
				System.out.println(entity.getCustomer_id()+" "+entity.getName()+" "+entity.getEmail());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
