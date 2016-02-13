package net.delphin.deepnlp.labels;


import net.delphin.deepnlp.data.Datum;


/**
 * HasOffsets<br>
 * <br>
 * {@link Label} representing this {@link Datum} has offsets
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public interface HasOffsets extends Label {

	/**
	 * @return the beginning character position of this {@link Datum}, inclusive
	 */
	public int getStartPosition();


	/**
	 * @return the beginning character position of this {@link Datum}, exclusive
	 */
	public int getEndPosition();

}
