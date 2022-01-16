package xyz.paradoxv5.designpatternabuse.command;
import xyz.paradoxv5.designpatternabuse.observer.PrintSubject;

public class SetStrRunnable implements Runnable {
  protected final PrintSubject subject;
  protected final String str;
  
  public SetStrRunnable(PrintSubject subject, String str) {
    java.util.Objects.requireNonNull(this.subject = subject);
    this.str = str;
  }
  
  @Override public void run() {
    subject.setStr(str);
  }
}