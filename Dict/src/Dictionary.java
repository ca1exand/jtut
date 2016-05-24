import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Dictionary {
	
	Map<String,String> dict = new HashMap<String,String>();
	
	public void add(String d, String e){
		dict.put(d, e);
	}
	
	public String d2e(String d){
		return dict.get(d);
	}
	
	public String e2d(String e){
		for(Entry<String, String> entry : dict.entrySet()) {
			if(entry.getValue().equals(e)){
				return entry.getKey();
			}
		}
		return null;
	}
	
	public void print() {
		for (Entry<String, String> entry : dict.entrySet()) {
			System.out.println(entry.getKey() + "\t \t" + entry.getValue());		
		}
	}

}
