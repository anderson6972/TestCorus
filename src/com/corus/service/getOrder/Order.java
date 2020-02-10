/**
 * Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.corus.service.getOrder;

public class Order  implements java.io.Serializable {
    private java.lang.String order_id;

    private java.util.Calendar order_date;

    private com.corus.service.getOrder.Customer customer;

    private com.corus.service.getOrder.OrderDetail[] order_detail;

    public Order() {
    }

    public Order(
           java.lang.String order_id,
           java.util.Calendar order_date,
           com.corus.service.getOrder.Customer customer,
           com.corus.service.getOrder.OrderDetail[] order_detail) {
           this.order_id = order_id;
           this.order_date = order_date;
           this.customer = customer;
           this.order_detail = order_detail;
    }


    /**
     * Gets the order_id value for this Order.
     * 
     * @return order_id
     */
    public java.lang.String getOrder_id() {
        return order_id;
    }


    /**
     * Sets the order_id value for this Order.
     * 
     * @param order_id
     */
    public void setOrder_id(java.lang.String order_id) {
        this.order_id = order_id;
    }


    /**
     * Gets the order_date value for this Order.
     * 
     * @return order_date
     */
    public java.util.Calendar getOrder_date() {
        return order_date;
    }


    /**
     * Sets the order_date value for this Order.
     * 
     * @param order_date
     */
    public void setOrder_date(java.util.Calendar order_date) {
        this.order_date = order_date;
    }


    /**
     * Gets the customer value for this Order.
     * 
     * @return customer
     */
    public com.corus.service.getOrder.Customer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this Order.
     * 
     * @param customer
     */
    public void setCustomer(com.corus.service.getOrder.Customer customer) {
        this.customer = customer;
    }


    /**
     * Gets the order_detail value for this Order.
     * 
     * @return order_detail
     */
    public com.corus.service.getOrder.OrderDetail[] getOrder_detail() {
        return order_detail;
    }


    /**
     * Sets the order_detail value for this Order.
     * 
     * @param order_detail
     */
    public void setOrder_detail(com.corus.service.getOrder.OrderDetail[] order_detail) {
        this.order_detail = order_detail;
    }

    public com.corus.service.getOrder.OrderDetail getOrder_detail(int i) {
        return this.order_detail[i];
    }

    public void setOrder_detail(int i, com.corus.service.getOrder.OrderDetail _value) {
        this.order_detail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.order_id==null && other.getOrder_id()==null) || 
             (this.order_id!=null &&
              this.order_id.equals(other.getOrder_id()))) &&
            ((this.order_date==null && other.getOrder_date()==null) || 
             (this.order_date!=null &&
              this.order_date.equals(other.getOrder_date()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.order_detail==null && other.getOrder_detail()==null) || 
             (this.order_detail!=null &&
              java.util.Arrays.equals(this.order_detail, other.getOrder_detail())));
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
        if (getOrder_id() != null) {
            _hashCode += getOrder_id().hashCode();
        }
        if (getOrder_date() != null) {
            _hashCode += getOrder_date().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getOrder_detail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrder_detail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrder_detail(), i);
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
        new org.apache.axis.description.TypeDesc(Order.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://srvt3-27/CORUS_Pruebas.srv.orders", "order"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://srvt3-27/CORUS_Pruebas.srv.orders", "customer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://srvt3-27/CORUS_Pruebas.srv.orders", "orderDetail"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
