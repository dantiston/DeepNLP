package net.delphin.deepnlp.features;


/**
 * PartOfSpeech<br>
 * <br>
 * {@link Feature} representing a part of speech.
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 */
public abstract class PartOfSpeech implements Feature {

	@Override
	public final String toString() {
		return this.getName();
	}

	/**
	 * Noun<br>
	 * <br>
	 * {@link PartOfSpeech} for common nouns
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Noun extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Noun";
		}


		@Override
		public final String getAbbreviation() {
			return "nn";
		}
	}

	/**
	 * ProperNoun<br>
	 * <br>
	 * {@link PartOfSpeech} for proper nouns
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class ProperNoun extends PartOfSpeech {

		@Override
		public final String getName() {
			return "ProperNoun";
		}


		@Override
		public final String getAbbreviation() {
			return "nnp";
		}
	}

	/**
	 * Verb<br>
	 * <br>
	 * {@link PartOfSpeech} for verbs
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Verb extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Verb";
		}


		@Override
		public final String getAbbreviation() {
			return "v";
		}
	}

	/**
	 * Preposition<br>
	 * <br>
	 * {@link PartOfSpeech} for prepositions
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Preposition extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Preposition";
		}


		@Override
		public final String getAbbreviation() {
			return "p";
		}
	}

	/**
	 * Adjective<br>
	 * <br>
	 * {@link PartOfSpeech} for adjectives
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Adjective extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Adjective";
		}


		@Override
		public final String getAbbreviation() {
			return "adj";
		}
	}

	/**
	 * Adverb<br>
	 * <br>
	 * {@link PartOfSpeech} for adverbs
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Adverb extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Adverb";
		}


		@Override
		public final String getAbbreviation() {
			return "adv";
		}
	}

	/**
	 * Determiner<br>
	 * <br>
	 * {@link PartOfSpeech} for determiners
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Determiner extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Determiner";
		}


		@Override
		public final String getAbbreviation() {
			return "det";
		}
	}

	/**
	 * Number<br>
	 * <br>
	 * {@link PartOfSpeech} for numbers
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Number extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Number";
		}


		@Override
		public final String getAbbreviation() {
			return "num";
		}
	}

	/**
	 * Complementizer<br>
	 * <br>
	 * {@link PartOfSpeech} for complementizer
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Complementizer extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Complementizer";
		}


		@Override
		public final String getAbbreviation() {
			return "comp";
		}
	}

	/**
	 * Conjunction<br>
	 * <br>
	 * {@link PartOfSpeech} for conjunction
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Conjunction extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Conjunction";
		}


		@Override
		public final String getAbbreviation() {
			return "conj";
		}
	}
}
