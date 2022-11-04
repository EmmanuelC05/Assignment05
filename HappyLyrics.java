
package happylyrics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class HappyLyrics {

  
    public static void main(String[] args)throws Exception {

		Path path = Paths.get(System.getProperty("user.dir"))
				.resolve("happy.txt");
		
		BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
		
		Set<String> wordsOfArticle = new HashSet<>();
		
		String line = reader.readLine();
		int totalLines = 0;
		int totalWords = 0;
		
		while(line != null) {
			System.out.println("Processing line: " + line);
			
			// if there is actual content in the line...
			if(!line.trim().equals("")) {
				String [] words = line.split(" ");
				totalWords += words.length;
				
				for(String word : words) {
					String cleanedUpWord = word.toLowerCase() 
							.replace(",", "") 
							.replace(":", "") 
							.replace(".", "")
							.replace("\"", "");
					
					wordsOfArticle.add(cleanedUpWord);
    }                         
    }
                        line = reader.readLine();      
                }
                System.out.println(wordsOfArticle.size());
    }
}
                
