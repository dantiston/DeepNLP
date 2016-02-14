package net.delphin.deepnlp.data;


import net.delphin.deepnlp.labels.HasSentences;


/**
 * Document<br>
 * <br>
 * {@link TypesafeMap} abstract implementation implementing the
 * {@link HasSentences} interface
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public interface Document extends TypesafeMap {

	public abstract String getBody();


	public abstract String getTitle();


	public abstract int getId();

}
