package spelling;

import java.util.LinkedList;

/**
 * A class that implements the Dictionary interface using a LinkedList
 *
 */
public class DictionaryLL implements Dictionary 
{

	private LinkedList<String> dict;
	private int size;
    // TODO: Add a constructor
//    publ 
	public DictionaryLL(){
		dict=new LinkedList<>();
	}

    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	if(!isWord(word)){
    		word=word.toLowerCase();
            dict.add(word);   
            size++;
            return true;
    	}
        return false;
    }


    /** Return the number of words in the dictionary */
    public int size()
    {
       return size;
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
    	s=s.toLowerCase();
        for(String z:dict){
            if(s.equals(z)){
            	return true;
            }
        }
        return false;
    }

    
}
