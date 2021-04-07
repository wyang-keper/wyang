package DIP;

public class DependenceInversion {

	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
		person.receive(new WeiXin());
	}
}

interface IReceiver{
	public String getInfo();
}

class Email implements IReceiver{
	public String getInfo() {
		return "邮件回复Hello,world";
	}
}

class WeiXin implements IReceiver{
	public String getInfo() {
		return "微信回复Hello,world";
	}
}

class Person{
	public void receive(IReceiver receiver) {
		System.out.println(receiver.getInfo());
	}
}