package net.delphin.deepnlp.labels;


import net.delphin.deepnlp.data.Word;
import net.delphin.deepnlp.obj.Datum;


/**
 * HasToken<br>
 * <br>
 * {@link Label} representing this {@link Datum} has a {@link String} token,
 * usually for a {@link Word}
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public interface HasToken extends Label {

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


	/**
	 * @return the {@link Word} object this {@link Label} annotates
	 */
	public abstract Word getWord();

}
