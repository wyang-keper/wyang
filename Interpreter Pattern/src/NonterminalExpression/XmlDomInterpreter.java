package NonterminalExpression;

import AbstractExpression.Interpreter;
import Context.Context;

public class XmlDomInterpreter implements Interpreter { 
	  
	  @Override
	  public void interpret(Context context) { 
	    System.out.println("xml dom Interpreter:" + context.getData()); 
	  } 
	  
	} 