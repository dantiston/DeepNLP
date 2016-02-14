package net.delphin.deepnlp.labels;


import java.util.List;

import net.delphin.deepnlp.data.Sentence;
import net.delphin.deepnlp.obj.Datum;


/**
 * HasToken<br>
 * <br>
 * {@link Label} representing this {@link Datum} has a {@link List} of
 * {@link Sentence} objects, usually for a {@link Document}
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public interface HasSentences extends Label {

	/**
	 * @return the {@link Sentence} objects of this {@link Datum}
	 */
	public abstract List<Sentence> getSentences();

}
