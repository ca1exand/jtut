public class App {
	
	public static void main(String[] args) {
		
		Dictionary dict = new Dictionary();
		dict.add("laufen", "run");
		dict.add("uhr", "watch");
		dict.add("vogel", "bird");
		dict.add("gelb", "yellow");
		
		//dict.print();
		//System.out.println();
		
		System.out.println(dict.e2d("bird"));
		System.out.println(dict.d2e("laufen"));
		
	
	}

}
