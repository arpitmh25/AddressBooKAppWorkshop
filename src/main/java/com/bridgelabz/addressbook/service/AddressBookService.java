package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBook;
import com.bridgelabz.addressbook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Mark class as a service provider
@Service
public class AddressBookService implements IAddressBookService {

    //Autowired repository class to inject its dependency
    @Autowired
    AddressBookRepository repository;


    //Created method which serve controllers api call to save record to repo
    public AddressBook saveAddress(AddressBookDTO addressBookDTO) {
        AddressBook addressBook = new AddressBook(addressBookDTO);
        repository.save(addressBook);
        return addressBook;
    }

    //Created method which serves controllers api call to retrieve all records
    public List<AddressBook> getListOfAddresses() {
        List<AddressBook> list = repository.findAll();
        return list;
    }

    //Created method which serves controllers api call to retrieve record by id
    public AddressBook getAddressbyId(Integer id) {
        AddressBook addressBook = repository.getById(id);
        return addressBook;
    }

    //Created method which serves controllers api call to update record by id
    public AddressBook updateDateById(Integer id, AddressBookDTO addressBookDTO) {
        AddressBook addressBook = new AddressBook(id, addressBookDTO);
        repository.save(addressBook);
        return addressBook;
    }

    //Created method which serves controllers api call to delete record by id
    public void deleteContact(Integer id) {
        repository.deleteById(id);
    }


}
