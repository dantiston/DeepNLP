package net.delphin.deepnlp.obj;


import net.delphin.deepnlp.annotations.HasIndex;
import net.delphin.deepnlp.annotations.HasOffsets;
import net.delphin.deepnlp.annotations.HasToken;


public interface Word extends TypesafeMap, HasToken, HasIndex, HasOffsets {

}
