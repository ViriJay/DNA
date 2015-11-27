package opdracht1;

public class Algoritme1 {
	
	private int[] array;
	
	public Algoritme1(int n){
		this.array = new int[n];
		this.fillArray();
	}
	
	public void fillArray(){
		
//		for(int i = 0; i < array.length; i++){
//			array[i] = -1;			
//		}
		
		for(int i = 0; i < array.length; i++){
			boolean found = false;
			while(!found){
				int random = RandomIntGenerator.randInt(0, array.length);
				boolean exists = false;
				for(int j = 0; j < i ; j++){
					if(array[j] == random){
						exists = true;
					}
				}
				
				if(!exists){
					array[i] = random;
					found = true;
				}
			}
		}
	}
	
	public void printArray(){
		for(int i : array){
			System.out.print(i + ", ");
		}
	}
	
	public static void main(String[] args){
		Algoritme1 alg = new Algoritme1(10);
		alg.printArray();
	}

}
