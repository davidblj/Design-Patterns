/*
  Proxy pattern

Is a placeholder to represent something else.

A simplified version of the original object. A proxy is able to accomplish the same task, but may delegate requests to the original object to achieve them.

The proxy class wraps the real subject class (it hides a reference). That is becuase the real subject:

  may contain sensitive information
  is resource intensive to instantiate (images)
  exists remotely, and so we need a local representation
  it may check some data before sending a request.

*/

public interface Interface {

  public void method1();
}

public class Proxy implements Interface {

  private RealSubject realSubject;

  /* Constructor */

  public void method1() {
    // previous logic to call method1 of "RealSubject" class
    realSubject.method1();
  }
}

public class RealSubject implements Interface {

  public void method1() {
    // logic
  }
}

public class Client {

  public void main() {

    Proxy proxy = new Proxy();
    proxy.method1();
  }
}

/*
Associations

  proxy: the one who checks if a product can be retrieve from a warehouse
  real subject: wearehouse
  method1: orderFullfilment

the idea is to make some validations before doing an insertion, becuase it can be costly. Our proxy looks for an available warehouse in an array of werhouses. if its available, then proceed with the request.

This also provides modularity (validation and pre-implementation logic, and implementation).
  - maybe we want to know whats the shortest route to deliver an order in our available warehouses. We code this type of logic in our proxy
*/
