package com.bridgelabz.workshop;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AddressBookSystemTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void createContactaddingshouldAnswerWithTrue() {
		Contact contact = new Contact("Neeta", "Mourya", "Dayalband", "Bsp", "CG", 495001,826906879,
				"neeta.mourya@bridgelabz.com");
		AddressBookSystem addressBookSystem = new AddressBookSystem();
		addressBookSystem.createContact(contact);
		List<Contact> contact1 = new ArrayList<Contact>();
		contact1 = addressBookSystem.getContactList();
		Assert.assertTrue(contact1.contains(contact));

	}

	@Test
	public void createContactaddingshouldAnswerWithFalse() {
		Contact contact = new Contact("Neeta", "Mourya", "Dayalband", "Bsp", "CG", 495001,826906879,
				"neeta.mourya@bridgelabz.com");
		AddressBookSystem addressBookSystem = new AddressBookSystem();
		addressBookSystem.createContact(contact);
		List<Contact> contact1 = new ArrayList<Contact>();
		contact1 = addressBookSystem.getContactList();
		Assert.assertTrue(contact1.contains(contact));
	}

}
