/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarybonus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author salma
 */
public class DictionaryBonus {

    private TreeMap <Character,ArrayList<Word>> dictionary;

    public DictionaryBonus() {
        dictionary=new TreeMap<>();
    }
    
    public void createDictionary(){
        
        List<Word> wordsCollection=new ArrayList<>();
        String word;
        List <String> meanings =new ArrayList<>();
        word="giant";
        meanings.add("a legendary humanlike being of great stature and strength");
        meanings.add("a living being of great size");
        meanings.add("something unusually large or powerful");
        Word word1=new Word(word,meanings);
        wordsCollection.add(word1);
        meanings=new ArrayList<>();
        
        word="appreciate";
        meanings.add("recognize the full worth of");
        meanings.add("understand (a situation) fully; grasp the full implications of.");
        meanings.add("to recognize how good someone or something is and to value him, her, or it");
        Word word2=new Word(word,meanings);
        wordsCollection.add(word2);
        meanings=new ArrayList<>();
        
        word="coward";
        meanings.add("a person who is lacking in the courage to do or endure dangerous or unpleasant things.");
        meanings.add("excessively afraid of danger or pain");
        meanings.add("person who is not brave and is too eager to avoid danger, difficulty, or pain");
        Word word3=new Word(word,meanings);
        wordsCollection.add(word3);
        meanings=new ArrayList<>();
        
        word="achieve";
        meanings.add("successfully bring about or reach (a desired objective or result) by effort, skill, or courage");
        meanings.add("to bring to a successful end");
        meanings.add("to successfully complete something");
        Word word4=new Word(word,meanings);
        wordsCollection.add(word4);
        meanings=new ArrayList<>();
        
        word="terrify";
        meanings.add("cause to feel extreme fear");
        meanings.add("very frightening");
        meanings.add("makes you full of terror, or a panicked fear.");
        Word word5=new Word(word,meanings);
        wordsCollection.add(word5);
        meanings=new ArrayList<>();
        
        word="create";
        meanings.add("bring (something) into existence");
        meanings.add("to make or produce(something)");
        meanings.add("make a fuss or complain");
        Word word6=new Word(word,meanings);
        wordsCollection.add(word6);
        meanings=new ArrayList<>();
        
        word="esteem";
        meanings.add("respect and admiration");
        meanings.add("the regard in which one is held especially");
        meanings.add("consider or deem");
        Word word7 =new Word(word,meanings);
        wordsCollection.add(word7);
        meanings=new ArrayList<>();
        
        word="mandatory";
        meanings.add("required by law or mandate; compulsory.");
        meanings.add("must be done");
        meanings.add("people have to do it, because it is a rule ");
        Word word8 =new Word(word,meanings);
        wordsCollection.add(word8);
   
        
        String letters="abcdefghijklmnopqrstuvwxyz";
        char[]lettersArray=letters.toCharArray();
        ArrayList <Word> specificWords=new ArrayList<>();
        for (int i=0;i<lettersArray.length;i++)
        {
        Character letter=lettersArray[i];
        for(int j=0;j<wordsCollection.size();j++)
        {
            if(letter.equals(wordsCollection.get(j).getWord().charAt(0)))
                specificWords.add(wordsCollection.get(j));       
        }
        dictionary.put(letter, specificWords);
        specificWords=new ArrayList<>();
        }
    }
    public void printDictionary()
    {
    dictionary.forEach((k, v) ->{
          System.out.println("key= "+ k +":");
          for(int i=0;i<v.size();i++)
              v.get(i).Print();
    });
    }
    public void searchDictionary(Character key)
    {
        if(dictionary.containsKey(key))
    {
        ArrayList<Word> result=dictionary.get(key);
        Iterator <Word> itr=result.iterator();
        while(itr.hasNext())
        {
        itr.next().Print();
        }
      
    }
    }
}
