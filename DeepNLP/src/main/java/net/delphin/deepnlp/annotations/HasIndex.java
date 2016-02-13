package net.delphin.deepnlp.annotations;

import net.delphin.deepnlp.obj.Datum;


public interface HasIndex extends Annotation {

	/**
	 * @return the textual index of this {@link Datum} in the {@link Document}
	 */
	public abstract int getIndex();

}
