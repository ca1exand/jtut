package textanalysis;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

public class App {
	
	public static void main(String[] args) throws IOException {
		
		// Ü 1
		DocAnalysis da = new DocAnalysis();
		TreeSet<String> tokens = new TreeSet<String>(da.textToList(new File("documents/Hashfunktion.txt")));
		//da.printSet(tokens);
		System.out.println("Zahl der Token ist " + tokens.size() + ".");
		
		// Ü 2
		TreeSet<String> clean = da.removeStopWords(tokens, new File("Stopwords.txt"));
		//da.printSet(clean);
		System.out.println("Zahl der Token ohne Stopwords ist " + clean.size() + ".");
		
	}
	
}
