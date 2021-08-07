package teste.entities;

import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTestes {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount(){
        double amount = 200.00;
        double expectedValue = 196.00;
        Account acc = new Account(1L, 0.0);

        acc.deposit(amount);

        Assertions.assertEquals(189.00, acc.getBalance());

    }
}
