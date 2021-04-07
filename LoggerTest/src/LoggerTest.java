import java.io.IOException;
import java.util.logging.*;

public class LoggerTest {

    public static void main(String args[]) {
        final Logger myLogger = Logger.getLogger("mylooger");
        Handler handler = new ConsoleHandler();//����һ���Ѽ�¼���͵�����̨����־������
        handler.setLevel(Level.FINE);//������־����������

        FileHandler fileHandler = null;//����һ������־���͵��ļ�����־������
        try {
            fileHandler = new FileHandler();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //��Ӵ�����
        myLogger.addHandler(fileHandler);
        myLogger.addHandler(handler);

        myLogger.setLevel(Level.FINEST);//������־��¼������
        //Ϊ��־��¼����Ӳ�ͬ����ļ�¼
        myLogger.info("INFO");
        myLogger.warning("WARNING");
        myLogger.fine("FINE");
        myLogger.finest("FINEST");

        //��ȡ���÷��������ȷ����Ϣ
        myLogger.logp(Level.INFO, "LoggerTest", "main", "method record");

    }

}