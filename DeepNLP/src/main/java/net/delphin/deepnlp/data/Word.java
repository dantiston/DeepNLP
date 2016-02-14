package net.delphin.deepnlp.data;


import net.delphin.deepnlp.labels.HasIndex;
import net.delphin.deepnlp.labels.HasOffsets;
import net.delphin.deepnlp.labels.HasToken;


/**
 * Word<br>
 * <br>
 * {@link TypesafeMap} abstract implementation implementing the {@link HasToken}
 * , {@link HasIndex}, {@link HasOffsets} interfaces
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public interface Word extends TypesafeMap, HasToken, HasIndex, HasOffsets {

}
