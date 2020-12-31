/**
 * MathService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.exemple;

public interface MathService extends javax.xml.rpc.Service {
    public java.lang.String getMathAddress();

    public ws.exemple.Math getMath() throws javax.xml.rpc.ServiceException;

    public ws.exemple.Math getMath(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
