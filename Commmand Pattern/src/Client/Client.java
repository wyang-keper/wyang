package Client;

import Command.Command;
import ConcreteCommand.ConcreteCommand;
import Invoker.Invoker;
import Receive.Receiver;

public class Client {
	public static void main(String[] args){ 
	      Receiver receiver = new Receiver(); 
	      Command command = new ConcreteCommand(receiver); 
	      //�ͻ���ֱ��ִ�о������ʽ���˷�ʽ����ͼ����� 
	      command.execute(); 
	    
	      //�ͻ���ͨ����������ִ������ 
	      Invoker invoker = new Invoker(); 
	      invoker.setCommand(command); 
	      invoker.action(); 
	    } 

}
