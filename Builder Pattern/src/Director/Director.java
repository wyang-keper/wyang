package Director;

import AbstractProduct.Product;
import Builder.Builder;

public class Director {
	  public Product bulidProduct(Builder builder){
	    builder.raiseFunds();//�Ｏ�ʽ�
	    builder.recruiting();//��ļ��Ա
	    builder.propagate();//����
	    builder.released();//���У���ӳ
	    return builder.buildProduct();
	  }
	}