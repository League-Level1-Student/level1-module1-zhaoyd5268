package _07_duck;

public class DuckRunner {
	public static void main(String[] args) {
		int numfriend = 5;
		String favfood = "donuts";
		Duck duck = new Duck(favfood, numfriend);
		duck.quack();
		duck.waddle();
	}
}
