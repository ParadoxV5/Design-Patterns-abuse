package xyz.paradoxv5.designpatternabuse.observer;
public class PrintSubject extends LinkedListSubject {
  protected String str;
  public String getStr() { return str; }
  
  public void setStr(String str) {
    this.str = str;
    notifyObservers();
  }
}