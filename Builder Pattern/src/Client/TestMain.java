package Client;

import AbstractProduct.Product;
import ConcreteBuilder.BookBuilder;
import ConcreteBuilder.MovieBuilder;
import Director.Director;

public class TestMain {
	  /**
	   * @param args
	   */
	  public static void main(String[] args) {
	    Director director=new Director();//ָ���߽�ɫ
	    //һ����Ӱ�Ĳ���
	    MovieBuilder movieBuilder=new MovieBuilder();
	    Product movie=director.bulidProduct(movieBuilder);
	    System.out.println(movie.printString());
	    // һ��С˵�Ĳ���
	    BookBuilder bookBuilder=new BookBuilder();
	    Product book=director.bulidProduct(bookBuilder);
	    System.out.println(book.printString());
	  }
	}