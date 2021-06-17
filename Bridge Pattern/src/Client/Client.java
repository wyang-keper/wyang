package Client;

import Abstraction.AbstractMessage;
import Concretelmplementor.MessageEmail;
import Concretelmplementor.MessageSMS;
import Implementor.MessageImplementor;
import RefinedAbstraction.CommonMessage;
import RefinedAbstraction.UrgencyMessage;

public class Client {
	public static void main(String[] args) {
        //���������ʵ�ֶ���
        MessageImplementor impl = new MessageSMS();
        //������ͨ��Ϣ����
        AbstractMessage message = new  CommonMessage(impl);
        message.sendMessage("�Ӱ���������","����");

        //��ʵ�ַ�ʽ�л����ʼ����ٴη���
        impl = new MessageEmail();
        //�����Ӽ���Ϣ����
        message = new UrgencyMessage(impl);
        message.sendMessage("�Ӱ���������","����");
    }

}
