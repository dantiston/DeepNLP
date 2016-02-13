package net.delphin.deepnlp.annotations;


import java.util.List;

import net.delphin.deepnlp.obj.Datum;
import net.delphin.deepnlp.obj.Sentence;


public interface HasSentences extends Annotation {

	/**
	 * @return the {@link Sentence} objects of this {@link Datum}
	 */
	public abstract List<Sentence> getSentences();

}
