package AdvanceJava.chapter1.OptionalChapter;

import java.util.Optional;

public class EWallet {
    private Optional<String> accountNumber;

    public void setAccountNumber(Optional<String> accountNumber) {
        this.accountNumber = accountNumber;
    }

    public EWallet(Optional<String> accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Optional<String> getAccountNumber() {
        return accountNumber;
    }
}
