/*
  Decorator pattern

  We use the decorator pattern to attach dinamycaly a set behaviours.
  With this pattern we dont have to define classes like one would normally do to achieve this feature

  we use aggregation to combine behaviours at runtime
      C -> B -> A (C augments B, B augments A)

  - The decorator pattern allows objects to dynamically add behaviours to others.
  - The decorator pattern reduce the number of classes needed to offer a combination of behaviours

The decorator pattern is a substitute of pure inheritance
pholymorfism is achieved by a single interface

To summerize:

Each decorator object in the stack is aggregated in a one-to-one relationship with the object below it in the stack.
And, by combining aggregation and polymorphism, we can recursively invoke the same behavior down the stack and
have the behavior execute upwards from the concrete component object
*/


// If class 2 implements interface 1, and class 3 inherits class 2, then class 3 is of the same type "interface 1"
public Interface InterfaceComponent {
  // common behaviours that our decorators will share
  public void method1();
}

public void ConcreteClass implements InterfaceComponent {

  // this is our base building block
  public void method1() {};
}

public abstract class Decorator implements InterfaceComponent {

  // instatiating this object only one time to stack decorators on top of each other
  InterfaceComponent object;

  // object linking of the stack
  public Decorator(InterfaceComponent object) {
    this.object = object;
  }

  public void method1() {
    object.method1();
  }
}

public class AugmentA extends Decorator {

  public AugmentA (InterfaceComponent decoratedObject) {
    // decorator stacking
    super(decoratedObject);
  }

  public void featureA() {}

  // If your method overrides one of its superclass's methods, you can invoke the overridden method through the use of the keyword super
  public method1() {

    // this is a recursive call that bubbles up until it reaches our concrete class
    super.method1();

    // and this is the augmentation, the class which we were extending will be invoked with an additonal behaviour: feature
    this.featureA();
  }
}

public class AugmentB extends Decorator {
  // similar implementation of Augment A
}

public static void main(String args[]) {
  InterfaceComponent object = new ConcreteClass();
  // order is vital
  object = new AugmentA(object);
  object = new AugmentB(object);
  object.method1;
}

/* Associations

  interfaceComponent: webpage
  ConcreteClass: basic webpage
  AugmentA, AugmentB:

*/
