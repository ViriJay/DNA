package opdracht1;

public class Algoritme2 {
	
	private int[] array;
	private boolean[] used;
	
	public Algoritme2(int n){
		this.array = new int[n];
		this.used = new boolean[n];
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
							
				if(!used[random]){
					array[i] = random;
					found = true;
					used[random] = true;
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
		Algoritme2 alg = new Algoritme2(10);
		alg.printArray();
	}
}
