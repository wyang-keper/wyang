package NonterminalExpression;

import AbstractExpression.Interpreter;
import Context.Context;

public class XmlSaxInterpreter implements Interpreter { 
	  
	  @Override
	  public void interpret(Context context) { 
	    System.out.println("xml sax Interpreter:" + context.getData()); 
	  } 
	  
	} 