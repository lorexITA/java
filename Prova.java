public class Prova {
	
	public static void Main(String[] args) {
		
		int[] array = new int[10];
		
		for(int i=0; i<10; i++) {
			
			array[i] = (int) (Math.random()*100);
			System.out.println("Nella casella numero "+i+" si trova il numero "+array[i]);
			
		}
		
	}

}
