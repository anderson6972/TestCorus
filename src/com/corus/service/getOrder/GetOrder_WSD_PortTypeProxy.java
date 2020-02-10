package com.corus.service.getOrder;

public class GetOrder_WSD_PortTypeProxy implements com.corus.service.getOrder.GetOrder_WSD_PortType {
  private String _endpoint = null;
  private com.corus.service.getOrder.GetOrder_WSD_PortType getOrder_WSD_PortType = null;
  
  public GetOrder_WSD_PortTypeProxy() {
    _initGetOrder_WSD_PortTypeProxy();
  }
  
  public GetOrder_WSD_PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetOrder_WSD_PortTypeProxy();
  }
  
  private void _initGetOrder_WSD_PortTypeProxy() {
    try {
      getOrder_WSD_PortType = (new com.corus.service.getOrder.CORUS_PruebasSrvOrdersGetOrder_WSDLocator()).getCORUS_Pruebas_srv_orders_getOrder_WSD_Port();
      if (getOrder_WSD_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getOrder_WSD_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getOrder_WSD_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getOrder_WSD_PortType != null)
      ((javax.xml.rpc.Stub)getOrder_WSD_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.corus.service.getOrder.GetOrder_WSD_PortType getGetOrder_WSD_PortType() {
    if (getOrder_WSD_PortType == null)
      _initGetOrder_WSD_PortTypeProxy();
    return getOrder_WSD_PortType;
  }
  
  public com.corus.service.getOrder.Order getOrder(java.lang.String orderId) throws java.rmi.RemoteException{
    if (getOrder_WSD_PortType == null)
      _initGetOrder_WSD_PortTypeProxy();
    return getOrder_WSD_PortType.getOrder(orderId);
  }
  
  
}