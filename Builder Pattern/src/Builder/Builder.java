package Builder;

import AbstractProduct.Product;

public interface Builder {
	  void recruiting();//��Ա��ļ
	  void writeScript();//д�籾����
	  void raiseFunds();//�Ｏ�ʽ�
	  void propagate();//����
	  void released();//���棬���У���ӳ
	  Product buildProduct();
	}
