package ConcreteProducts;
import AbstractProduct.Product;

public class Movie extends Product{
  private String actor;//����
  private String director;//����
  public String getActor() {
    return actor;
  }
  public void setActor(String actor) {
    this.actor = actor;
  }
  public String getDirector() {
    return director;
  }
  public void setDirector(String director) {
    this.director = director;
  }
}
