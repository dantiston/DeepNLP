package net.delphin.deepnlp.annotators;


import net.delphin.deepnlp.annotations.Annotation;
import net.delphin.deepnlp.annotations.SentenceAnnotation;


public abstract class SentenceAnnotator extends Annotator {

	@Override
	public final Class<? extends Annotation> getAnnotationClass() {
		return SentenceAnnotation.class;
	}

}
