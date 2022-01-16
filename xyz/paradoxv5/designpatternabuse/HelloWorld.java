package xyz.paradoxv5.designpatternabuse;
import xyz.paradoxv5.designpatternabuse.factorysingleton.DesignPatternsFactorySingleton;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@xyz.paradoxv5.designpatternabuse.factorysingleton.Singleton
public class HelloWorld implements Runnable {
  public static final String STR = "hello, world!";
  
  // again Singleton pattern
  private HelloWorld() {}
  public static final HelloWorld INSTANCE = new HelloWorld();
  
  @Override public void run() {
    xyz.paradoxv5.designpatternabuse.observer.PrintSubject subject =
      DesignPatternsFactorySingleton.INSTANCE.getSubject();
    subject.attach(DesignPatternsFactorySingleton.INSTANCE.getObserver());
  
    DesignPatternsFactorySingleton.INSTANCE.setCommandSubject(subject);
    DesignPatternsFactorySingleton.INSTANCE.setCommandStr(STR);
  
    DesignPatternsFactorySingleton.INSTANCE.getCommand().run();
  }
  public static void main(String[] __) { INSTANCE.run(); }
  
  public static final class Test {
    @org.junit.jupiter.api.Test public void testMain() {
      final ByteArrayOutputStream customOut = new ByteArrayOutputStream();
      final PrintStream systemOut = System.out;
      System.setOut(new PrintStream(customOut));
      
      HelloWorld.main(null);
      org.junit.jupiter.api.Assertions.assertEquals(
        STR + System.lineSeparator(),
        customOut.toString()
      );
      
      System.setOut(systemOut);
    }
  }
}