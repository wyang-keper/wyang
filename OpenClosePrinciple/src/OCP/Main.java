package OCP;
public class Main {

	public static void main(String[] args) {
		Button button = new Button();
		button.buttonShape(new Rectangle());
		button.buttonShape(new Circle());
		button.buttonShape(new Triangle());
		button.buttonShape(new OtherGraphic());
    }
}






