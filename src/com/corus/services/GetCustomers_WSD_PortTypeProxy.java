package com.corus.services;

public class GetCustomers_WSD_PortTypeProxy implements com.corus.services.GetCustomers_WSD_PortType {
  private String _endpoint = null;
  private com.corus.services.GetCustomers_WSD_PortType getCustomers_WSD_PortType = null;
  
  public GetCustomers_WSD_PortTypeProxy() {
    _initGetCustomers_WSD_PortTypeProxy();
  }
  
  public GetCustomers_WSD_PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetCustomers_WSD_PortTypeProxy();
  }
  
  private void _initGetCustomers_WSD_PortTypeProxy() {
    try {
      getCustomers_WSD_PortType = (new com.corus.services.CORUS_PruebasSrvGetCustomersGetCustomers_WSDLocator()).getCORUS_Pruebas_srv_getCustomers_getCustomers_WSD_Port();
      if (getCustomers_WSD_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getCustomers_WSD_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getCustomers_WSD_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getCustomers_WSD_PortType != null)
      ((javax.xml.rpc.Stub)getCustomers_WSD_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.corus.services.GetCustomers_WSD_PortType getGetCustomers_WSD_PortType() {
    if (getCustomers_WSD_PortType == null)
      _initGetCustomers_WSD_PortTypeProxy();
    return getCustomers_WSD_PortType;
  }
  
  public com.corus.services.Customer[] getCustomers() throws java.rmi.RemoteException{
    if (getCustomers_WSD_PortType == null)
      _initGetCustomers_WSD_PortTypeProxy();
    return getCustomers_WSD_PortType.getCustomers();
  }
  
  
}