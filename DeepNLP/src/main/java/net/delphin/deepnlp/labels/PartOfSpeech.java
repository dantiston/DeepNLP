package net.delphin.deepnlp.labels;


public interface PartOfSpeech extends Label {

	public String getName();

	public static final class Noun implements PartOfSpeech {

		@Override
		public final String getName() {
			return "Noun";
		}


		@Override
		public final String toString() {
			return this.getName();
		}
	}

	public static final class Verb implements PartOfSpeech {

		@Override
		public final String getName() {
			return "Verb";
		}


		@Override
		public final String toString() {
			return this.getName();
		}
	}

	public static final class Preposition implements PartOfSpeech {

		@Override
		public final String getName() {
			return "Preposition";
		}


		@Override
		public final String toString() {
			return this.getName();
		}
	}

	public static final class Conjunction implements PartOfSpeech {

		@Override
		public final String getName() {
			return "Conjunction";
		}


		@Override
		public final String toString() {
			return this.getName();
		}
	}

	public static final class Adverb implements PartOfSpeech {

		@Override
		public final String getName() {
			return "Adverb";
		}


		@Override
		public final String toString() {
			return this.getName();
		}
	}

}
