package net.delphin.deepnlp.annotators.impl;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.delphin.deepnlp.annotations.Annotation;
import net.delphin.deepnlp.annotations.SentenceAnnotation;
import net.delphin.deepnlp.annotators.SentenceAnnotator;
import net.delphin.deepnlp.data.Document;
import net.delphin.deepnlp.data.Sentence;


/**
 * DeepNlpSentenceAnnotator<br>
 * <br>
 * Basic {@link SentenceAnnotator} implementation.
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public class DeepNlpSentenceAnnotator extends SentenceAnnotator {

	/**
	 * @see http://www.englishleap.com/other-resources/abbreviations TODO: need
	 *      to load this from a resource file
	 */
	private static final Set<String> ABBREVIATIONS = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList("a.m.", "abbr.", "adj.", "adv.", "al.", "assn.", "ave.", "ca.", "dept.", "dr.",
			"e.g.", "est.", "etc.", "fig.", "fl.", "gen.", "hon.", "hrs.", "i.e.", "inc.", "jr.", "mr.", "mrs.", "ms.", "mt.", "no.", "obj.", "oz.", "p.m.", "p.s.", "pl.", "poss.", "prep.", "prof.",
			"pron.", "pseud.", "r.i.p.", "rev.", "sq.", "sr.", "st.", "syn.", "trans.", "v.", "vb.", "vs.")));


	@Override
	public final Annotation process(Document document) {
		String data = document.getBody();
		List<Sentence> result = Collections.emptyList();
		return new SentenceAnnotation(result);
	}


	private static final boolean isAbbreviation(String token) {
		return ABBREVIATIONS.contains(token);
	}

}
