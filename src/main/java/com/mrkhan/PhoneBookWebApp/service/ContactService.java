package com.mrkhan.PhoneBookWebApp.service;

import java.util.List;

import com.mrkhan.PhoneBookWebApp.entity.Contact;

public interface ContactService {

	public boolean SaveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer contactId);
	
	public boolean updateContact(Contact contact);
	
	public boolean deleteContactById(Integer contactId);
	
	
}