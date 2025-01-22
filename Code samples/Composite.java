/*
  Composite pattern or recursive composition

They follow two goals
  - Compose nested structures of objects
  - deal with classes for these objects uniformly

  composite lets you build a tree-like structure of objects that can be treated as a single uniform object
  type

Use this pattern whenever you have "composites that contain components, each of which could be a composite".

examples:
  Menus that contain menu items, each of which could be a menu.
  Directories that contain files, each of which could be a directory.
  Containers that contain Elements, each of which could be a Container.

taken from: https://sourcemaking.com/design_patterns/composite

*/

public interface interfaceComponent {

  public void method1;
  public void method2;
  public void method3;
}


public class Composite implements interfaceComponent{

  // this class could contain other composite objects. And those objects, could contain more objects
  private ArrayList<interfaceComponent> components;

  public void method1(){}
  public void method2(){}
  public void method3(){}

  public void addObject(interfaceComponent component){}
  public void getObject(String id){
    // compare the id to each leaf on this level, if its not found (as its not a property)
    // then use the component "getObject", triggering a recursion on it until that object is
    // found
  }
}


public class Leaf implements interfaceComponent{

  public id;

  public void method1(){}
  public void method2(){}
  public void method3(){}
}


public class Program {

  public static void main(String args[]) {

    Composite compositeLevel1 = new compositeLevel1();
    Composite compositeLevel2 = new compositeLevel2();

    compositeLeve1.addObject(compositeLevel2);

    Leaf leaf1 = new leaf();
    Leaf leaf2 = new leaf();

    compositeLevel2.addObject(leaf1);
    compositeLevel2.addObject(leaf2);

    // with this configuration, we can traverse through them, up from level 1, to our
    // leaf.
  }
}

/* Associations

interfaceComponent: they could be - a building, a floor, or a room

composite: a building, a floor
leaf: a room
*/
