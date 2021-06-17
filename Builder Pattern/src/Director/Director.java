package Director;

import AbstractProduct.Product;
import Builder.Builder;

public class Director {
	  public Product bulidProduct(Builder builder){
	    builder.raiseFunds();//筹集资金
	    builder.recruiting();//招募人员
	    builder.propagate();//宣传
	    builder.released();//发行，上映
	    return builder.buildProduct();
	  }
	}