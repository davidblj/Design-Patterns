/*
  Template pattern - [Behavioural pattern]

  Is useful when you need to abstract a method from 2 classes that have
  something in common.

  This template is like a blueprint, where a set of steps are identical.
  Some steps may be exactly the same, and some of them, may be
  vary depending on the type of object
*/

public abstract class superclass {

  // subclasses wont be able to modify this method
  public final templateMethod() {
    sharedMethod1();
    specificMethod1();
    sharedMethod2();
    specificMethod2()
    sharedMethod3();
    specificMethod3()
  }

  // shared methods wont be accessible to subclasses
  private void sharedMethod1() { }
  private void sharedMethod2() { }
  private void sharedMethod3() { }

  // subclasses might need to implement these set of specific methods
  protected abstract specificMethod1() { }
  protected abstract specificMethod2() { }
  protected abstract specificMethod3() { }
}
/*
  template.png is self explanatory
*/
