package net.delphin.deepnlp.annotations;


import net.delphin.deepnlp.labels.NamedEntityType;
import net.delphin.deepnlp.obj.Datum;


public interface HasNamedEntityType extends HasPartOfSpeech, Annotation {

	/**
	 * @return the {@link NamedEntityType} associated with this {@link Datum}
	 */
	public NamedEntityType getNamedEntityType();

}
