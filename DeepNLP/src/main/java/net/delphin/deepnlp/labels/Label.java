package net.delphin.deepnlp.labels;


import net.delphin.deepnlp.data.Datum;


public interface Label {

	/**
	 * @return the {@link Datum} object this {@link Label} annotates
	 */
	public abstract Datum getDatum();

}
