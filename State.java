/*

  State pattern - [Behavioural pattern]

  An object can choose its correct behaviour based on its current state (e.g. i can't dance while im sitting).
  When its state change, its behaviour can be altered

  When should you use it ?

  When you need to change the behaviour of an object based of its state in runtime. Take a look at an specific example. A
  bending machine.png.

  Use this pattern to simplify classes with long conditionals that depend on the object state

*/

public class Context {

  private State state1;
  private State state2;

  private State currentState;

  public Context() {
      state1 = new State1();
      state2 = new State2();

      // set initial state based on some logic
      currentState = state1;
  }

  public void method1() {
    this.currentState.method1(this);
  }

  public void method2() {
    this.currentState.method2(this);
  }

  // state getters and setters
  public void setState(State state) {
    currentState = state;
  }

  public State getState1() {
    return state1;
  }
}

public interface State {
  void method1() {};
  void method2() {};
}

public class State1 implements State {
  public void method1(Context context) {
    // do something specific on this logic
    // and set a new state if necessary
    context.setState(context.getState1());
  }
}

public class State2 implements State {
  public void method2(Context context) {
    // do something specific on this logic
    // and set a new state if necessary
  }
}
