package com.lab111;

import com.lab2.Cl1;
import com.lab2.Cl2;
import com.lab2.Cl3;

/**
 * Template first class.
 * @author Alex
 *
 */
public final class TestMain {

  /**
   * Constructor.
   *
   */
  private TestMain() {
    super();
  }
  
  /**
   * Invokes at application startup.
   * @param args Parameters from command line
   */
  public static void main(final String[] args) {
    System.out.println("This is template example for main class");
    
    Cl1 class1 = new Cl1();
    Cl2 class2 = new Cl2();
    Cl3 class3 = new Cl3();
    
    class1.meth1();
    class1.meth3();
    
    class2.meth1();
    class2.meth2();
    class2.meth3();

    class3.meth3(); 

  }

}
