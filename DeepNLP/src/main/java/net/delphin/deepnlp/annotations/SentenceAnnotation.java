package net.delphin.deepnlp.annotations;


import java.util.List;

import net.delphin.deepnlp.data.Sentence;


/**
 * SentenceAnnotation<br>
 * <br>
 * {@link Annotation} for a {@link List} of {@link Sentence} objects
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public final class SentenceAnnotation implements Annotation {

	private final List<Sentence> sentences;


	public SentenceAnnotation(List<Sentence> sentences) {
		this.sentences = sentences;
	}


	public List<Sentence> get() {
		return this.sentences;
	}

}
