package net.delphin.deepnlp.annotators;


import net.delphin.deepnlp.data.Document;
import net.delphin.deepnlp.obj.TypesafeMap;


public interface Annotator extends TypesafeMap.Key {

	public abstract void annotate(Document document);

}
