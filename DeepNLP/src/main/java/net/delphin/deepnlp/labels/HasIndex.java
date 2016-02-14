package net.delphin.deepnlp.labels;


import net.delphin.deepnlp.obj.Datum;


/**
 * HasNamedEntityType<br>
 * <br>
 * {@link Label} representing this {@link Datum} has an index
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public interface HasIndex extends Label {

	/**
	 * @return the textual index of this {@link Datum}
	 */
	public abstract int getIndex();

}
