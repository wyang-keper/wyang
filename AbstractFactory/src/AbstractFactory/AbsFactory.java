package AbstractFactory;
import AbstractProduct.Apple;
import AbstractProduct.Samsung;

public interface AbsFactory {
   Apple createApple();
   Samsung createSamsung();
}
