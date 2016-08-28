/**
 * 
 */
package spelling;

import java.util.List;

/**
 * @author anand
 *
 */
public interface AutoComplete {
	public List<String> predictCompletions(String prefix, int numCompletions);
}
