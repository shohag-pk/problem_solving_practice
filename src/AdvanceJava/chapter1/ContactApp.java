package AdvanceJava.chapter1;

import java.util.List;

public class ContactApp {
    public static void main(String[] args) {
        List<Contact> contactListDummy = List.of(new Contact("Shohag","shohag@gmail.com",24, Contact.Gender.MALE),
                new Contact("Shohag","shohag@gmail.com",24, Contact.Gender.MALE),
                new Contact("Touhid","Touhid@gmail.com",29, Contact.Gender.MALE),
                new Contact("Mahfuz","Mahfuz@gmail.com",29, Contact.Gender.MALE),
                new Contact("Masud","Masud@gmail.com",28, Contact.Gender.MALE),
                new Contact("Nora","Nora@gmail.com",30, Contact.Gender.FEMALE),
                new Contact("Puja","Puja@gmail.com",25, Contact.Gender.FEMALE),
                new Contact("Kat","Kat@gmail.com",30, Contact.Gender.FEMALE)
                );

        ContactService contactService = new ContactService();
        List<Contact> contacts = contactService.findContacts(contactListDummy, new FilterCriteria() {
            @Override
            public boolean match(Contact contact) {
                return contact.getAge() > 24 && contact.getGender().equals(Contact.Gender.MALE);
            }
        });

        List<Contact> contacts1 = contactService.findContacts(contactListDummy, (Contact contact) -> {
            return contact.getAge() > 24 && contact.getGender().equals(Contact.Gender.MALE);
        });

        System.out.println(contacts1);

        System.out.println(contacts);
    }
}
