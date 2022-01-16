package xyz.paradoxv5.designpatternabuse.observer;
import java.util.LinkedList;

public class LinkedListSubject implements Subject {
  protected final LinkedList<Observer> list = new LinkedList<>();
  @Override public java.util.Iterator<Observer> iterator() {
    return list.iterator();
  }
  
  @Override public void attach(Observer observer) {
    list.add(observer);
  }
  @Override public void detach(Observer observer) {
    list.remove(observer);
  }
}