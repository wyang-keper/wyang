package ConcreteProducts;
import AbstractProduct.Product;

public class Book extends Product {
  private int price=0;
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
}
