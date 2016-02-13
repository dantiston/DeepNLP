package net.delphin.deepnlp.annotations;


import java.util.List;

import net.delphin.deepnlp.obj.Datum;
import net.delphin.deepnlp.obj.Word;


public interface HasWords extends Annotation {

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
