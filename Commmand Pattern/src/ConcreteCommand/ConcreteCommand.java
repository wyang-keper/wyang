package ConcreteCommand;



import Command.Command;
import Receive.Receiver;

public  class ConcreteCommand extends Command { 
    private Receiver receiver; 
    public ConcreteCommand(Receiver receiver){ 
      this.receiver = receiver; 
    } 
    public void execute() { 
    	this.receiver.doSomething(); 
    } 
  } 