package ConcreteBuilder;

import AbstractProduct.Product;
import Builder.Builder;
import ConcreteProducts.Book;

public class BookBuilder implements Builder {
	  public Product book=new Book();//这里是上转型对象的使用
	  public void recruiting() {
	    book.setAuthor("J.K.罗琳著小说");
	  }
	  public void writeScript() {
	    book.setWorkName("哈利·波特与魔法石");
	  }
	  public void raiseFunds() {
	    book.setFunds(10000);
	  }
	  public void propagate() {
	    book.setContent("最畅销的的魔幻小说！");
	  }
	  public void released() {
	    book.setWorkType("小说");
	  }
	  public Product buildProduct() {
	    return book;
	  }
	}