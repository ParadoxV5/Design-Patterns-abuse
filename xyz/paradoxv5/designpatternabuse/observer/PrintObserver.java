package xyz.paradoxv5.designpatternabuse.observer;
public class PrintObserver implements Observer {
  @Override public void onUpdate(Subject subject) {
    if(subject instanceof PrintSubject printSubject)
    System.out.println(printSubject.getStr());
  }
}