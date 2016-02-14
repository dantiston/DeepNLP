package net.delphin.deepnlp.labels;


import java.util.List;

import net.delphin.deepnlp.data.Word;
import net.delphin.deepnlp.obj.Datum;


/**
 * HasWords<br>
 * <br>
 * {@link Label} representing this {@link Datum} has a {@link List} of
 * {@link Word} objects, usually for a {@link Sentence}
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public interface HasWords extends Label {

	/**
	 * @return the underlying {@link Word} objects of this {@link Datum}
	 */
	public abstract List<Word> getWords();


	/**
	 * @return the number of {@link Word} objects associated with this
	 *         {@link Datum}
	 */
	public default int numWords() {
		return this.getWords().size();
	}


	/**
	 * @return true if and only if this {@link Datum} has words
	 */
	public default boolean hasWords() {
		return !this.getWords().isEmpty();
	}

}
