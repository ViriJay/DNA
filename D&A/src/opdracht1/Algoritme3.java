package opdracht1;

public class Algoritme3 {
private int[] array;
	
	public Algoritme3(int n){
		this.array = new int[n];
		this.fillArray();
	}
	
	public void fillArray(){
		
		for(int i = 0; i < array.length; i++){
			array[i] = i;
			swap(i, RandomIntGenerator.randInt(0,i+1));
		}
	}
	
	public void swap(int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public void printArray(){
		for(int i : array){
			System.out.print(i + ", ");
		}
	}
	
	public static void main(String[] args){
		Algoritme3 alg = new Algoritme3(10);
		alg.printArray();
	}

}
