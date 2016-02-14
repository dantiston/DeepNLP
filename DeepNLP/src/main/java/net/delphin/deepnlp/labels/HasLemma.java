package net.delphin.deepnlp.labels;


import net.delphin.deepnlp.data.Word;
import net.delphin.deepnlp.obj.Datum;


/**
 * HasNamedEntityType<br>
 * <br>
 * {@link Label} representing this {@link Datum} has a lemma, usually for a
 * {@link Word}
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public interface HasLemma extends HasToken, Label {

	/**
	 * @return the lemma of this {@link Word} object
	 */
	public abstract String getLemma();

}
