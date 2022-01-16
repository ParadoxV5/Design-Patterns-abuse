package xyz.paradoxv5.designpatternabuse.observer;
public interface Subject extends Iterable<Observer> {
  void attach(Observer observer);
  @SuppressWarnings("unused") void detach(Observer observer);
  
  default void notifyObservers() {
    forEach(observer -> observer.onUpdate(this));
  }
}