package Task3;

import java.util.HashSet;
import java.util.Set;

public class Text {

    public void getUniqueWords (String text){
        String [] words = text.split("[-!~.,()\\s]+");
        Set<String> uniqueWords = new HashSet<String>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        System.out.println(uniqueWords);
    }
}