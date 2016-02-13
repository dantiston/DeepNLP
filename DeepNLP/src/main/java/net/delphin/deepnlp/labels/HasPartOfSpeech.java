package net.delphin.deepnlp.labels;


import net.delphin.deepnlp.data.Datum;
import net.delphin.deepnlp.data.Word;
import net.delphin.deepnlp.features.Feature;
import net.delphin.deepnlp.features.PartOfSpeech;


/**
 * HasPartOfSpeech<br>
 * <br>
 * {@link Label} representing this {@link Datum} has a {@link PartOfSpeech}
 * {@link Feature}, usually for a {@link Word}
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public interface HasPartOfSpeech extends HasToken {

	/**
	 * @return the {@link PartOfSpeech} object of this {@link Datum}
	 */
	public abstract PartOfSpeech getPartOfSpeech();

}
