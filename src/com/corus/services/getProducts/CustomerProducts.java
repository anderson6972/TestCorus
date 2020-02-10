/**
 * CustomerProducts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.corus.services.getProducts;

public class CustomerProducts  implements java.io.Serializable {
    private com.corus.services.getProducts.Customer customer;

    private com.corus.services.getProducts.Product[] products;

    public CustomerProducts() {
    }

    public CustomerProducts(
           com.corus.services.getProducts.Customer customer,
           com.corus.services.getProducts.Product[] products) {
           this.customer = customer;
           this.products = products;
    }


    /**
     * Gets the customer value for this CustomerProducts.
     * 
     * @return customer
     */
    public com.corus.services.getProducts.Customer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this CustomerProducts.
     * 
     * @param customer
     */
    public void setCustomer(com.corus.services.getProducts.Customer customer) {
        this.customer = customer;
    }


    /**
     * Gets the products value for this CustomerProducts.
     * 
     * @return products
     */
    public com.corus.services.getProducts.Product[] getProducts() {
        return products;
    }


    /**
     * Sets the products value for this CustomerProducts.
     * 
     * @param products
     */
    public void setProducts(com.corus.services.getProducts.Product[] products) {
        this.products = products;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerProducts)) return false;
        CustomerProducts other = (CustomerProducts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.products==null && other.getProducts()==null) || 
             (this.products!=null &&
              java.util.Arrays.equals(this.products, other.getProducts())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProducts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerProducts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://srvt3-27/CORUS_Pruebas.srv.getProducts", "customerProducts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://srvt3-27/CORUS_Pruebas.srv.getProducts", "customer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("products");
        elemField.setXmlName(new javax.xml.namespace.QName("", "products"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://srvt3-27/CORUS_Pruebas.srv.getProducts", "product"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "product"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
