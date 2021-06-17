package ConcreteBuilder;
import AbstractProduct.Product;
import Builder.Builder;
import ConcreteProducts.Movie;

public class MovieBuilder implements Builder {
  public Product movie=new Movie();//��������ת�Ͷ����ʹ��
  /*
   �������Ǵ����Ķ���ֻ������Ϊ��������ô�Ϳ���ʹ�ø�����߽ӿ�����������
  �����Ͳ����ڴ�����ʱ��Ͳ����漰����������������˽�����ԡ�
  ��������ڴ�����ʱ�򣬹�����Щ���ԡ���ô��ֱ��ʹ������new������
  Movie movie=new Movie();
   */
  public void recruiting() {
    movie.setAuthor("ղķ˹����÷¡");
  }
  public void writeScript() {
    movie.setWorkName("������");
  }
  public void raiseFunds() {
    movie.setFunds(200000);
  }
  public void propagate() {
    movie.setContent("�ײ�3D�ƻþ�����");
  }
  public void released() {
    movie.setWorkType("3D��Ӱ");
  }
  public Product buildProduct() {
    return movie;
  }
}