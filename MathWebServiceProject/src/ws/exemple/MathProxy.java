package ws.exemple;

public class MathProxy implements ws.exemple.Math {
  private String _endpoint = null;
  private ws.exemple.Math math = null;
  
  public MathProxy() {
    _initMathProxy();
  }
  
  public MathProxy(String endpoint) {
    _endpoint = endpoint;
    _initMathProxy();
  }
  
  private void _initMathProxy() {
    try {
      math = (new ws.exemple.MathServiceLocator()).getMath();
      if (math != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)math)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)math)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (math != null)
      ((javax.xml.rpc.Stub)math)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.exemple.Math getMath() {
    if (math == null)
      _initMathProxy();
    return math;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (math == null)
      _initMathProxy();
    return math.add(i, j);
  }
  
  
}