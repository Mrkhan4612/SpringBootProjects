package com.mrkhan.PhoneBookWebApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrkhan.PhoneBookWebApp.entity.Contact;
import com.mrkhan.PhoneBookWebApp.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	public ContactRepository contactRepo;
	
	@Override
	public boolean SaveContact(Contact contact) {
		Contact savedObj = contactRepo.save(contact);
		return savedObj.getContactId()!= null;
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return contactRepo.findAll(); 
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = contactRepo.findById(contactId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean updateContact(Contact contact) {
		
		try {
			contactRepo.save(contact);
			return true;
			} catch (Exception e) {
			e.printStackTrace();
			return false;
			}
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		try {
			//TODO:Need to change
			contactRepo.deleteById(contactId);
			return true;
			} catch (Exception e) {
			e.printStackTrace();
			return false;
			}	}
	
}