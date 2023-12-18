package AdvanceJava.chapter1.OptionalChapter;

import java.util.Optional;

public class Person {
    private Optional<SmartPhone> smartPhone;

    public Person(Optional<SmartPhone> smartPhone) {
        this.smartPhone = smartPhone;
    }

    public Person() {

    }

    public Optional<SmartPhone> getSmartPhone() {
        return smartPhone;
    }

    public static void main(String[] args) {

        Person account = new Person(Optional.ofNullable(new SmartPhone(Optional.ofNullable(new EWallet(Optional.ofNullable(null))))));

        Person person = new Person();
        String smartPhone1 = person.getSmartPhone(account);
        System.out.println("Result : "+ smartPhone1);

        String check = person.chackString(Optional.ofNullable(null));
        System.out.println("Check :"+check);
    }

    public String getSmartPhone(Person person){
        Optional<Person> optionalPerson = Optional.ofNullable(person);
        System.out.println("check : "+ optionalPerson.get());
        Optional<String> accountNumber = optionalPerson.flatMap(Person::getSmartPhone)
                .flatMap(SmartPhone::getWallet)
                .flatMap(EWallet::getAccountNumber);
        //System.out.println("Account Number : "+accountNumber.get());
        return accountNumber.orElseThrow(() -> new RuntimeException("Account Number is not present"));
    }

    public String chackString(Optional<String> message1){
        return message1.orElseThrow(() -> new RuntimeException("not present"));
    }

    private void   doSomething( String s) {
        System.out.println("Not found");
    }
}


