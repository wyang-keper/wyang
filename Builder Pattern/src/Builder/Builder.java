package Builder;

import AbstractProduct.Product;

public interface Builder {
	  void recruiting();//人员招募
	  void writeScript();//写剧本，书
	  void raiseFunds();//筹集资金
	  void propagate();//宣传
	  void released();//出版，发行，上映
	  Product buildProduct();
	}
