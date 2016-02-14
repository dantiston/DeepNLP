package net.delphin.deepnlp.labels;


import net.delphin.deepnlp.data.Word;
import net.delphin.deepnlp.features.Feature;
import net.delphin.deepnlp.features.NamedEntityType;
import net.delphin.deepnlp.obj.Datum;


/**
 * HasNamedEntityType<br>
 * <br>
 * {@link Label} representing this {@link Datum} has a {@link NamedEntityType}
 * {@link Feature}, usually for a {@link Word}
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public interface HasNamedEntityType extends HasPartOfSpeech, Label {

	/**
	 * @return the {@link NamedEntityType} associated with this {@link Datum}
	 */
	public NamedEntityType getNamedEntityType();

}
