/*
  Factory pattern

  used to delegate the object creation task to a different class. This object
  has the same behaviour across all types

  Software is easier to modify. There is no need to modify the client, but only the
  factory. This is called generalization, becuase we dont need to name a concrete class

*/


public class ObjectFactory {

  public Object createObject(String objectType) {

    Object object = null;

    // class instantation
    if(objectType == "type_1") {
      object = new  type_1_object();
    } else if (objectType == "type_1") {
      object = new  type_2_object();
    }

    return object;
  }
}


public class client {

  private ObjectFactory factory;

  public client(ObjectFactory factory) {
    this.factory = factory;
  }

  public Object requireObject(String objectType) {

    Object object;
    object = factory.createObject(objectType);

    // object preparation or modifiers
    // for this to happen we need a class, and a subclass. Similar to the factory
    // method pattern
    object.method1();
    object.method2();
    object.method3();
  }
}


/*

The factory method pattern

defines an interface to create an object. A subclass defines which class to instantiate

With this new approach, one can define different type of clients with their own
factory methods

Java difintion of abstract classes and interfaces
  https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html

Abstract classes are similar to interfaces. You cannot instantiate them, and they may contain a mix of methods declared with or without an implementation. However, with abstract classes, you can declare fields that are not static and final, and define public, protected, and private concrete methods. With interfaces, all fields are automatically public, static, and final, and all methods that you declare or define (as default methods) are public. In addition, you can extend only one class, whether or not it is abstract, whereas you can implement any number of interfaces.

Which should you use, abstract classes or interfaces?

  Consider using abstract classes if any of these statements apply to your situation:

    You want to share code among several closely related classes.
    You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
    You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong

  Consider using interfaces if any of these statements apply to your situation:

    You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
    You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
    You want to take advantage of multiple inheritance of type.
*/


public abstract class Factory {            // abstract class: we cant instantiate this class. (this is a super class)

  public Object requireObject(String objectType) {

    Object object;
    object =  createObject(objectType);   // this is the factoryMethod

    // object preparation or modifiers.
    object.method1();
    object.method2();
    object.method3();
  }

  abstract Object createObject(String type);    // whoevers extends this class must define this method.
}

public CustomFactory extends Factory {     // we inherit requireObject class (this is a sub class)

  public createObject(String type) {            // or factoryMethod

    // class instantation
    // we define which kind of objects to instantiate (type_1_object, ....)
    // meaning that they must implement the same interface. This custom factory will only
    // instantiate objects of the same type. This is more organized.

    // if we have another interface, we define another custom factory
    if(objectType == "type_1") {
      return object = new  type_1_object();
    } else if (objectType == "type_1") {
      return object = new  type_2_object();
    }
    ... // more types
    else return null
  }
}


/* associations
  Factory ~ knife store
  CustomFactory ~ budget knife store

  Object ~knife

  method1, ... ~ sharpen knife, ...
*/

// Diagram:  http://www.dofactory.com/images/diagrams/net/factory.gif
