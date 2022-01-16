package xyz.paradoxv5.designpatternabuse.factorysingleton;
import xyz.paradoxv5.designpatternabuse.observer.*;

public interface DesignPatternsFactory<S extends Subject, O extends Observer, R extends Runnable> {
  S getSubject();
  O getObserver();
  R getCommand();
}