package tudelft.pizzapasta;

public class PizzaPasta {
	public String pizzaOrPasta(int x, int y) {
		return (x >= 5 && x < 20 && y <= 89) ?
				"pizza" :
				"pasta";
	}
}
