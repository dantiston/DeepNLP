package net.delphin.deepnlp.annotations;

import net.delphin.deepnlp.obj.Datum;


public interface HasOffsets extends Annotation {

	/**
	 * @return the beginning character position of this {@link Datum}, inclusive
	 */
	public int getStartPosition();


	/**
	 * @return the beginning character position of this {@link Datum}, exclusive
	 */
	public int getEndPosition();

}
