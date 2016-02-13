package net.delphin.deepnlp.data;


import net.delphin.deepnlp.labels.HasIndex;
import net.delphin.deepnlp.labels.HasOffsets;
import net.delphin.deepnlp.labels.HasToken;
import net.delphin.deepnlp.obj.TypesafeMap;


public interface Word extends TypesafeMap, HasToken, HasIndex, HasOffsets {

}
