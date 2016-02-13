package net.delphin.deepnlp.annotations;


import net.delphin.deepnlp.obj.Datum;


public interface HasToken extends Annotation {

	/**
	 * @return the underlying textual {@link String} of the {@link Datum}
	 */
	public abstract String getToken();


	/**
	 * @return the textual length of the underlying token
	 */
	public default int length() {
		return this.getToken().length();
	}

}
