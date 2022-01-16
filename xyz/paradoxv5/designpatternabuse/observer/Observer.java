package xyz.paradoxv5.designpatternabuse.observer;
@FunctionalInterface public interface Observer {
  void onUpdate(Subject subject);
}