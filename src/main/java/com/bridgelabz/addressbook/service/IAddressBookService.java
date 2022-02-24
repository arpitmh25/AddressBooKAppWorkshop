package com.bridgelabz.addressbook.service;


import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBook;

import java.util.List;

//Created IAddressBookService interface to achieve abstraction
public interface IAddressBookService {

    public AddressBook saveAddress(AddressBookDTO addressBookDTO);

    public List<AddressBook> getListOfAddresses();

    public AddressBook getAddressbyId(Integer id);

    public AddressBook updateDateById(Integer id, AddressBookDTO addressBookDTO);

    public void deleteContact(Integer id);

}
