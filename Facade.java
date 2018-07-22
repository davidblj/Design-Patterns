/*
  Facade pattern

  its a main entry point to a set services. Like a customer seeking to buy food; he
  sees a restaurant (the facade), and he buys food, but do not know how the food is
  prepared

  It's a wrapper of services
*/

public interface interface {

  // common functionalities among unrelated classes
  public void method1();
  public void method2();
  public void method3();
}

// rememeber that is not a necesity to implement all classes, but one must declare them
public class Handler1 implements interface {...}
public class Handler2 implements interface {...}
public class Handler3 implements interface {...}

public class Facade {
  private objects;  // objects are private, becuase we need to hide their complexity and behaviour. They are our 'handlers' object instantations
  public methods;   // our methods are entry points to our handlers
}

// look at how we are hiding and implementing an interface
public class client {
  // this class uses the facade class methods. we are delegating tasks to a proper object
}

/* associations

interface:  IAccount
  method1, 2, 3:  deposit, withdraw, transfer, getAccountNumber

Handlers 1, 2, 3: Saving account, Checking account, Investment account

*/
