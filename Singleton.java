/*

  Singleton pattern:

used to have a single instance from an object. This is desired if i want to have one single state, and no multiple instances

lazy creation: this object is only created when need it
disadvantage: Threads trying to access to the same shared single object

*/

public class Singleton {

  private static Singleton uniqueInstance = null;

  // private constructor
  private Singleton(){}

  public static getInstance() {
    if(uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }

    return uniqueInstance;
  }
}
