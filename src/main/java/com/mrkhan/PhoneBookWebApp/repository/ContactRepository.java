package com.mrkhan.PhoneBookWebApp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrkhan.PhoneBookWebApp.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable> {

}
