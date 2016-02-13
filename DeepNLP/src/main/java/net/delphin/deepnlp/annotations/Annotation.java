package net.delphin.deepnlp.annotations;


import net.delphin.deepnlp.obj.Datum;


public interface Annotation {

	/**
	 * @return the {@link Datum} object this {@link Annotation} annotates
	 */
	public abstract Datum getDatum();

}
