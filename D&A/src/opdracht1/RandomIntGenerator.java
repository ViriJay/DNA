package opdracht1;

public class RandomIntGenerator {
	
	public static int randInt(int i, int j){
		
		return (int) ((Math.random() * j) + i);
	}

}
