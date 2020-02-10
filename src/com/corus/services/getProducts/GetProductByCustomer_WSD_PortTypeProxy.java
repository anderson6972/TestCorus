package com.corus.services.getProducts;

public class GetProductByCustomer_WSD_PortTypeProxy implements com.corus.services.getProducts.GetProductByCustomer_WSD_PortType {
  private String _endpoint = null;
  private com.corus.services.getProducts.GetProductByCustomer_WSD_PortType getProductByCustomer_WSD_PortType = null;
  
  public GetProductByCustomer_WSD_PortTypeProxy() {
    _initGetProductByCustomer_WSD_PortTypeProxy();
  }
  
  public GetProductByCustomer_WSD_PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetProductByCustomer_WSD_PortTypeProxy();
  }
  
  private void _initGetProductByCustomer_WSD_PortTypeProxy() {
    try {
      getProductByCustomer_WSD_PortType = (new com.corus.services.getProducts.CORUS_PruebasSrvGetProductsGetProductByCustomer_WSDLocator()).getCORUS_Pruebas_srv_getProducts_getProductByCustomer_WSD_Port();
      if (getProductByCustomer_WSD_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getProductByCustomer_WSD_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getProductByCustomer_WSD_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getProductByCustomer_WSD_PortType != null)
      ((javax.xml.rpc.Stub)getProductByCustomer_WSD_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.corus.services.getProducts.GetProductByCustomer_WSD_PortType getGetProductByCustomer_WSD_PortType() {
    if (getProductByCustomer_WSD_PortType == null)
      _initGetProductByCustomer_WSD_PortTypeProxy();
    return getProductByCustomer_WSD_PortType;
  }
  
  public com.corus.services.getProducts.CustomerProducts getProductByCustomer(java.lang.String customerId) throws java.rmi.RemoteException{
    if (getProductByCustomer_WSD_PortType == null)
      _initGetProductByCustomer_WSD_PortTypeProxy();
    return getProductByCustomer_WSD_PortType.getProductByCustomer(customerId);
  }
  
  
}