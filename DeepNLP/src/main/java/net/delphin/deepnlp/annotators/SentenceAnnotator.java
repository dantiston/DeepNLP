package net.delphin.deepnlp.annotators;


import java.util.List;

import net.delphin.deepnlp.data.Document;
import net.delphin.deepnlp.obj.Sentence;


public interface SentenceAnnotator extends Annotator {

	public abstract List<Sentence> process(Document document);

}
