package textanalysis;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DocAnalysis {
	
	public List<String> textToList(File file) throws IOException {

		List<String> list = SimpleTokenizer.getTokens(file, Encoding.UTF_8);

		return list;

	}

	public TreeSet<String> listToSet(File text) throws IOException {

		TreeSet<String> set = new TreeSet<String>();

		List<String> list = SimpleTokenizer.getTokens(text, Encoding.UTF_8);

		for (String word : list) { set.add(word); }

		return set;
		
	}

	public TreeSet<String> removeStopWords(TreeSet<String> tokens, File filter) throws IOException {

		List<String> filterList = SimpleTokenizer.getTokens(filter, Encoding.UTF_8);
		
		//for (String word : filterList) tokens.remove(word);
		tokens.removeAll(filterList);
		
		return tokens;
		
	}
	
	public void printSet(Set<String> set){
		
		for( String s : set) {
			System.out.println(s);
		}
		
	}

}
