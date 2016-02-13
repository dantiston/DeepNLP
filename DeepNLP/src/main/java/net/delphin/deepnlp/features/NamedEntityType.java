package net.delphin.deepnlp.features;


/**
 * NamedEntityType<br>
 * <br>
 * {@link Feature} for Named Entities based on the English Resource Grammar's
 * entities.
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 * @see <a href="http://www.delph-in.net/erg/">http://www.delph-in.net/erg/</a>
 */
public abstract class NamedEntityType implements Feature {

	@Override
	public final String toString() {
		return this.getName();
	}

	public static final class Person extends NamedEntityType {

		@Override
		public final String getName() {
			return "Person";
		}


		@Override
		public final String getAbbreviation() {
			return "pers";
		}
	}

	public static final class Organization extends NamedEntityType {

		@Override
		public final String getName() {
			return "Organization";
		}


		@Override
		public final String getAbbreviation() {
			return "orgs";
		}
	}

	public static final class Date extends NamedEntityType {

		@Override
		public final String getName() {
			return "Date";
		}


		@Override
		public final String getAbbreviation() {
			return "date";
		}
	}

	public static final class Time extends NamedEntityType {

		@Override
		public final String getName() {
			return "Time";
		}


		@Override
		public final String getAbbreviation() {
			return "time";
		}
	}

}
