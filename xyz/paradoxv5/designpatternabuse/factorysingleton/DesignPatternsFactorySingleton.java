package xyz.paradoxv5.designpatternabuse.factorysingleton;
import xyz.paradoxv5.designpatternabuse.observer.*;
import xyz.paradoxv5.designpatternabuse.command.*;
@Singleton public class DesignPatternsFactorySingleton implements DesignPatternsFactory<
  PrintSubject, PrintObserver, SetStrRunnable
> {
  // Singleton pattern
  private DesignPatternsFactorySingleton() {}
  public static final DesignPatternsFactorySingleton INSTANCE = new DesignPatternsFactorySingleton();
  
  // Factory pattern
  protected PrintSubject commandSubject;
  protected String commandStr;
  public void setCommandStr(String commandStr) { this.commandStr = commandStr; }
  public void setCommandSubject(PrintSubject commandSubject) { this.commandSubject = commandSubject; }
  
  // also part of the Factory pattern
  @Override public PrintSubject getSubject() { return new PrintSubject(); }
  @Override public PrintObserver getObserver() { return new PrintObserver(); }
  @Override public SetStrRunnable getCommand() { return new SetStrRunnable(commandSubject, commandStr); }
}