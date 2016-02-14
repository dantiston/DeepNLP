package net.delphin.deepnlp.obj;

import net.delphin.deepnlp.data.TypesafeMap;


public class DatumTest extends TypesafeMapTest {

	@Override
	TypesafeMap newInstance() {
		return new Datum();
	}

}
