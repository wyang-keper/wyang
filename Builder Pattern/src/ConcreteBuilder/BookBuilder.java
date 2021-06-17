package ConcreteBuilder;

import AbstractProduct.Product;
import Builder.Builder;
import ConcreteProducts.Book;

public class BookBuilder implements Builder {
	  public Product book=new Book();//��������ת�Ͷ����ʹ��
	  public void recruiting() {
	    book.setAuthor("J.K.������С˵");
	  }
	  public void writeScript() {
	    book.setWorkName("������������ħ��ʯ");
	  }
	  public void raiseFunds() {
	    book.setFunds(10000);
	  }
	  public void propagate() {
	    book.setContent("����ĵ�ħ��С˵��");
	  }
	  public void released() {
	    book.setWorkType("С˵");
	  }
	  public Product buildProduct() {
	    return book;
	  }
	}