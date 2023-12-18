package AdvanceJava.chapter1;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    List<Contact> findContacts(List<Contact> contactList , FilterCriteria criteria){
        List<Contact> filterContactList = new ArrayList<>();

        for (Contact contact: contactList){
            if (criteria.match(contact)){
                filterContactList.add(contact);
            }
        }

        return filterContactList;
    }
}
