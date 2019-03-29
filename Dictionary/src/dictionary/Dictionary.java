
package dictionary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author salma
 */
public class Dictionary {
    
    private TreeMap <Character,TreeSet<String>> dictionary;

    public Dictionary() {
        dictionary=new TreeMap<>();
    }
    
    public void createDictionary ()
    {
        String letters="abcdefghijklmnopqrstuvwxyz";
        char[]lettersArray=letters.toCharArray();
        List <String> words = new ArrayList <>();
        TreeSet<String> specificWords=new TreeSet<>();
        words.add("apple");
        words.add("mouse");
        words.add("door");      
        words.add("bow");
        words.add("fault");
        words.add("bored");
        words.add("cat");
        words.add("ear");
        words.add("great");
        words.add("hand");
        words.add("sun");
        words.add("score");
        words.add("yellow");
        words.add("young");
        words.add("animal");
        words.add("ice");
        words.add("land");
        words.add("nose");
        words.add("orange");
        words.add("pattern");
        words.add("quiet");
        words.add("sand");
        words.add("zoo");
        words.add("kitchen");
        
        
        for (int i=0;i<lettersArray.length;i++)
        {
        Character letter=lettersArray[i];
        for(int j=0;j<words.size();j++)
        {
            if(letter.equals(words.get(j).charAt(0)))
                specificWords.add(words.get(j));       
        }
        dictionary.put(letter, specificWords);
        specificWords=new TreeSet<>();
        }   
    }
    public void printDictionary()
    {
    dictionary.forEach((k, v) ->
          System.out.println("key="+ k + ", value="+ v));
    }
    public void SearchDictionary(Character key)
    {
    if(dictionary.containsKey(key))
    {
        TreeSet<String> result=dictionary.get(key);
        Iterator <String> itr=result.iterator();
        while(itr.hasNext())
        {
        System.out.println(itr.next());
        }
      
    }
    }

    
}
