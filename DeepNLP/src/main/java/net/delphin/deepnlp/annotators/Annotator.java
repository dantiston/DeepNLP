package net.delphin.deepnlp.annotators;


import net.delphin.deepnlp.annotations.Annotation;
import net.delphin.deepnlp.data.Document;
import net.delphin.deepnlp.pipeline.Pipeline;


/**
 * Annotator<br>
 * <br>
 * Basic processor implementation for {@link Pipeline}
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public abstract class Annotator {

	public final void annotate(Document document) {
		document.put(this.getAnnotationClass(), this.process(document));
	}


	public abstract Annotation process(Document document);


	public abstract Class<? extends Annotation> getAnnotationClass();

}
