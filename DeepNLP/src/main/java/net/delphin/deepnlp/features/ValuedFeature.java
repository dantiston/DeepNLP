package net.delphin.deepnlp.features;


import java.util.Optional;


public interface ValuedFeature extends Feature {

	public abstract Optional<Integer> getIntegerValue();


	public abstract Optional<Double> getDoubleValue();


	public abstract Optional<String> getStringValue();

}
