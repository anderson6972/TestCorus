package com.corus.services.orderByCliente;

public class GetCustomerOrders_WSD_PortTypeProxy implements com.corus.services.orderByCliente.GetCustomerOrders_WSD_PortType {
  private String _endpoint = null;
  private com.corus.services.orderByCliente.GetCustomerOrders_WSD_PortType getCustomerOrders_WSD_PortType = null;
  
  public GetCustomerOrders_WSD_PortTypeProxy() {
    _initGetCustomerOrders_WSD_PortTypeProxy();
  }
  
  public GetCustomerOrders_WSD_PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetCustomerOrders_WSD_PortTypeProxy();
  }
  
  private void _initGetCustomerOrders_WSD_PortTypeProxy() {
    try {
      getCustomerOrders_WSD_PortType = (new com.corus.services.orderByCliente.CORUS_PruebasSrvOrdersGetCustomerOrders_WSDLocator()).getCORUS_Pruebas_srv_orders_getCustomerOrders_WSD_Port();
      if (getCustomerOrders_WSD_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getCustomerOrders_WSD_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getCustomerOrders_WSD_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getCustomerOrders_WSD_PortType != null)
      ((javax.xml.rpc.Stub)getCustomerOrders_WSD_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.corus.services.orderByCliente.GetCustomerOrders_WSD_PortType getGetCustomerOrders_WSD_PortType() {
    if (getCustomerOrders_WSD_PortType == null)
      _initGetCustomerOrders_WSD_PortTypeProxy();
    return getCustomerOrders_WSD_PortType;
  }
  
  public java.lang.String[] getCustomerOrders(java.lang.String customer_id) throws java.rmi.RemoteException{
    if (getCustomerOrders_WSD_PortType == null)
      _initGetCustomerOrders_WSD_PortTypeProxy();
    return getCustomerOrders_WSD_PortType.getCustomerOrders(customer_id);
  }
  
  
}