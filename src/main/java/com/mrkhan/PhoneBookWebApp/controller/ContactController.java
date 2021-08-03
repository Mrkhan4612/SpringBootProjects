package com.mrkhan.PhoneBookWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mrkhan.PhoneBookWebApp.entity.Contact;
import com.mrkhan.PhoneBookWebApp.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/loadForm")
	public String loadForm(Model model)
	{
		model.addAttribute("contact", new Contact());
		
		return "index";
	}
	
	@PostMapping("/saveContact")
	public String handleSaveContactBtn(Contact contact,Model model) {
		
		boolean isSave=contactService.SaveContact(contact);
		if(isSave) {
			model.addAttribute("succMsg", "Contact saved successfully!"); 
		}else {
			model.addAttribute("errMsg", "Failed to save contact!");
		}
		
		return "index";
	}

}
