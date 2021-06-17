package AbstractProduct;

public abstract class Product {
  public String author;//作者
  public int funds=0;//耗资
  public String workName;//作品名称
  public String workType;//作品类型
  public String content;//其他信息
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public int getFunds() {
    return funds;
  }
  public void setFunds(int funds) {
    this.funds = funds;
  }
  public String getWorkName() {
    return workName;
  }
  public void setWorkName(String workName) {
    this.workName = workName;
  }
  public String getWorkType() {
    return workType;
  }
  public void setWorkType(String workType) {
    this.workType = workType;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public String printString() {
    return "Product [author=" + author + ", funds=" + funds + ", workName="
        + workName + ", workType=" + workType + ", content=" + content
        + "]";
  }
}