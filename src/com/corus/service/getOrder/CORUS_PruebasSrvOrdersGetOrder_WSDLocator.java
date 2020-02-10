/**
 * CORUS_PruebasSrvOrdersGetOrder_WSDLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.corus.service.getOrder;

public class CORUS_PruebasSrvOrdersGetOrder_WSDLocator extends org.apache.axis.client.Service implements com.corus.service.getOrder.CORUS_PruebasSrvOrdersGetOrder_WSD {

    public CORUS_PruebasSrvOrdersGetOrder_WSDLocator() {
    }


    public CORUS_PruebasSrvOrdersGetOrder_WSDLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CORUS_PruebasSrvOrdersGetOrder_WSDLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CORUS_Pruebas_srv_orders_getOrder_WSD_Port
    private java.lang.String CORUS_Pruebas_srv_orders_getOrder_WSD_Port_address = "http://190.146.13.180:5555/ws/CORUS_Pruebas.srv.orders:getOrder_WSD/CORUS_Pruebas_srv_orders_getOrder_WSD_Port";

    public java.lang.String getCORUS_Pruebas_srv_orders_getOrder_WSD_PortAddress() {
        return CORUS_Pruebas_srv_orders_getOrder_WSD_Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CORUS_Pruebas_srv_orders_getOrder_WSD_PortWSDDServiceName = "CORUS_Pruebas_srv_orders_getOrder_WSD_Port";

    public java.lang.String getCORUS_Pruebas_srv_orders_getOrder_WSD_PortWSDDServiceName() {
        return CORUS_Pruebas_srv_orders_getOrder_WSD_PortWSDDServiceName;
    }

    public void setCORUS_Pruebas_srv_orders_getOrder_WSD_PortWSDDServiceName(java.lang.String name) {
        CORUS_Pruebas_srv_orders_getOrder_WSD_PortWSDDServiceName = name;
    }

    public com.corus.service.getOrder.GetOrder_WSD_PortType getCORUS_Pruebas_srv_orders_getOrder_WSD_Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CORUS_Pruebas_srv_orders_getOrder_WSD_Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCORUS_Pruebas_srv_orders_getOrder_WSD_Port(endpoint);
    }

    public com.corus.service.getOrder.GetOrder_WSD_PortType getCORUS_Pruebas_srv_orders_getOrder_WSD_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.corus.service.getOrder.CORUS_Pruebas_srv_orders_getOrder_WSD_BinderStub _stub = new com.corus.service.getOrder.CORUS_Pruebas_srv_orders_getOrder_WSD_BinderStub(portAddress, this);
            _stub.setPortName(getCORUS_Pruebas_srv_orders_getOrder_WSD_PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCORUS_Pruebas_srv_orders_getOrder_WSD_PortEndpointAddress(java.lang.String address) {
        CORUS_Pruebas_srv_orders_getOrder_WSD_Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.corus.service.getOrder.GetOrder_WSD_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.corus.service.getOrder.CORUS_Pruebas_srv_orders_getOrder_WSD_BinderStub _stub = new com.corus.service.getOrder.CORUS_Pruebas_srv_orders_getOrder_WSD_BinderStub(new java.net.URL(CORUS_Pruebas_srv_orders_getOrder_WSD_Port_address), this);
                _stub.setPortName(getCORUS_Pruebas_srv_orders_getOrder_WSD_PortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CORUS_Pruebas_srv_orders_getOrder_WSD_Port".equals(inputPortName)) {
            return getCORUS_Pruebas_srv_orders_getOrder_WSD_Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://srvt3-27/CORUS_Pruebas.srv.orders", "CORUS_Pruebas.srv.orders.getOrder_WSD");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://srvt3-27/CORUS_Pruebas.srv.orders", "CORUS_Pruebas_srv_orders_getOrder_WSD_Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CORUS_Pruebas_srv_orders_getOrder_WSD_Port".equals(portName)) {
            setCORUS_Pruebas_srv_orders_getOrder_WSD_PortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
