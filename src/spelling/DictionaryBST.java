package spelling;

import java.util.TreeSet;

/**
 * @author anand
 *
 */
public class DictionaryBST implements Dictionary 
{
   private TreeSet<String> dict;
   private int size;
    // TODO: Implement the dictionary interface using a TreeSet.  
 	// You'll need a constructor here
	public DictionaryBST(){
		dict=new TreeSet<>();
	}
    
    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	if(!isWord(word)){
    		dict.add(word.toLowerCase());
    		size++;
    		return true;
    	}
        return false;
    }


    /** Return the number of words in the dictionary */
    public int size()
    {
    	// TODO: Implement this¬˚∆ method
        return size;
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
    	s=s.toLowerCase();
    	if(dict.contains(s)){
    		return true;
    	}
        return false;
    }

}
