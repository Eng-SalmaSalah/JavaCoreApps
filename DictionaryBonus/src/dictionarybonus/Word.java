
package dictionarybonus;

import java.util.List;


public class Word {
    private String word;
    private List<String> wordMeanings;

    public Word(String word , List<String>meanings) {
        this.word=word;
        this.wordMeanings=meanings;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setWordMeanings(List<String> wordMeanings) {
        this.wordMeanings = wordMeanings;
    }

    public String getWord() {
        return word;
    }

    public List<String> getWordMeanings() {
        return wordMeanings;
    }
    
    public void Print ()
    {
        System.out.println(this.word + ":");
        for(int i=0;i<this.wordMeanings.size();i++)
            System.out.println((i+1)+") "+this.wordMeanings.get(i));
    }
       
}
