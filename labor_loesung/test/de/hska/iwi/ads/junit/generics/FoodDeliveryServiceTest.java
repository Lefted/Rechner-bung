package de.hska.iwi.ads.junit.generics;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.generics.Address;
import de.hska.iwi.ads.generics.Box;
import de.hska.iwi.ads.generics.Pizza;
import de.hska.iwi.ads.solution.generics.Cardbox;
import de.hska.iwi.ads.solution.generics.FoodDeliveryService;

class FoodDeliveryServiceTest {

	@Test
	void testDelivery() {
		// arrange
		Cardbox<Pizza> box = new Cardbox<>(1, new Pizza("Margherita"));
		Cardbox<Pizza> box2 = new Cardbox<>(1, new Pizza("Tonno"));
		Cardbox<Pizza> box3 = new Cardbox<>(1, new Pizza("Hawaii"));
		Cardbox<Pizza> box4 = new Cardbox<>(1, new Pizza("Arizona"));
		Cardbox<Pizza> box5 = new Cardbox<>(1, new Pizza("BBQ-Drehspieß"));
		Cardbox<Pizza> box6 = new Cardbox<>(1, new Pizza("Chichu"));

		Address address = new Address("Bühler Seite 6");
		Address address2 = new Address("Burgunderweg 22");

		FoodDeliveryService<Pizza> service = new FoodDeliveryService<>();
		service.addBox(box, address);
		service.addBox(box2, address);
		service.addBox(box3, address);
		service.addBox(box4, address2);
		service.addBox(box5, address2);
		service.addBox(box6, address2);

		// act
		Set<Box<Pizza>> deliveredBoxes = service.deliver(address);

		// assert
		assertFalse(service.getFoodBoxes().keySet().contains(box) //
				|| service.getFoodBoxes().keySet().contains(box2) //
				|| service.getFoodBoxes().keySet().contains(box3));

		assertTrue(deliveredBoxes.contains(box) //
				&& deliveredBoxes.contains(box2) //
				&& deliveredBoxes.contains(box3));
	}
}
