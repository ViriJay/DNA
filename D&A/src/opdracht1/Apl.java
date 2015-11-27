package opdracht1;

public class Apl {
	
	public static void main(String[] args){
		
		int avg = 0;
		
		for(int i = 0; i < 10; i++){
			long begin = System.currentTimeMillis();
			Algoritme3 alg = new Algoritme3(5000000);
			long eind = System.currentTimeMillis();
			avg += (eind - begin);
			System.out.println("#" + i + " " + (eind - begin));
		}
		
		System.out.println("Gemiddelde tijd: " + (avg/10));
	}

}
