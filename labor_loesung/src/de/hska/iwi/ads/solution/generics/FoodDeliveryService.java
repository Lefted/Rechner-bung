package de.hska.iwi.ads.solution.generics;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import de.hska.iwi.ads.generics.AbstractDeliveryService;
import de.hska.iwi.ads.generics.Address;
import de.hska.iwi.ads.generics.Box;

public class FoodDeliveryService<T> extends AbstractDeliveryService<T> {

	@Override
	public Map<Box<T>, Address> getFoodBoxes() {
		return stackOfFoodBoxes;
	}

	@Override
	public Set<Box<T>> deliver(Address address) {
		List<Entry<Box<T>, Address>> toDeliver = stackOfFoodBoxes //
				.entrySet() //
				.stream() //
				.filter(e -> e.getValue() == address) //
				.toList();
		stackOfFoodBoxes.entrySet().removeIf(toDeliver::contains);
		return toDeliver.stream().map(Entry::getKey).collect(Collectors.toSet());
	}
}
