package net.delphin.deepnlp.pipeline;


import java.util.Collection;

import net.delphin.deepnlp.annotators.Annotator;
import net.delphin.deepnlp.data.Document;


/**
 * Pipeline<br>
 * <br>
 * Container for DeepNLP {@link Annotator} objects, allowing for setup of
 * {@link Annotator} order and execution of {@link Annotator} code on
 * {@link Document} objects.
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public interface Pipeline {

	public void add(Annotator annotation);


	public void addAll(Collection<Annotator> annotations);


	public void get(Annotator annotation);


	public void contains(Annotator annotation);


	public void annotate(Document document);

}
