package net.delphin.deepnlp.annotations;


import net.delphin.deepnlp.labels.PartOfSpeech;
import net.delphin.deepnlp.obj.Datum;


public interface HasPartOfSpeech extends Annotation {

	/**
	 * @return the {@link PartOfSpeech} object of this {@link Datum}
	 */
	public abstract PartOfSpeech getPartOfSpeech();

}
