package Client;

import Context.Context;
import NonterminalExpression.XmlDomInterpreter;
import NonterminalExpression.XmlSaxInterpreter;

public class Client {
	public static void main(String[] args) { 
	    Context context = new Context(); 
	    context.setData("һ��xml����"); 
	    new XmlSaxInterpreter().interpret(context); 
	    new XmlDomInterpreter().interpret(context); 
	  } 

}
