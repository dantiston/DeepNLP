package net.delphin.deepnlp.data;


import net.delphin.deepnlp.obj.TypesafeMap;


public interface Document extends TypesafeMap {

	final Document EMPTY_DOCUMENT = new EmptyDocument();

	static final class EmptyDocument extends EmptyTypesafeMap implements Document {

		@Override
		public int getId() {
			return -1;
		}
	}


	/**
	 * @return an empty {@link Document} object
	 */
	public default Document emptyDocument() {
		return EMPTY_DOCUMENT;
	}


	public default String getBody() {
		return "";
	}


	public default String getTitle() {
		return "";
	}


	public int getId();

}
