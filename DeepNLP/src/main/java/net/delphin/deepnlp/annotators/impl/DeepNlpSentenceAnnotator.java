package net.delphin.deepnlp.annotators.impl;


import net.delphin.deepnlp.annotators.SentenceAnnotator;
import net.delphin.deepnlp.data.Document;


public class DeepNlpSentenceAnnotator implements SentenceAnnotator {

	@Override
	public void annotate(Document document) {
		document.put(SentenceAnnotation.class, this.process(document));
	}

}
