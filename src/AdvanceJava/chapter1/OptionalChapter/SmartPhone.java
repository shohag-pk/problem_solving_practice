package AdvanceJava.chapter1.OptionalChapter;

import java.util.Optional;

public class SmartPhone {
    private Optional<EWallet> wallet;

    public SmartPhone(Optional<EWallet> wallet) {
        this.wallet = wallet;
    }

    public void setWallet(Optional<EWallet> wallet) {
        this.wallet = wallet;
    }

    public Optional<EWallet> getWallet() {
        return wallet;
    }
}
