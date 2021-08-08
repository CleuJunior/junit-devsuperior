package teste.entities;

import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import teste.entities.factory.AccountFactory;

public class AccountTestes {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount(){
        double amount = 200.00;
        double expectedValue = 196.00;
        Account acc = AccountFactory.creatEmptyAccount();

        acc.deposit(amount);

        Assertions.assertEquals(expectedValue, acc.getBalance());

    }

    @Test
    public void depositDoNothginWhenNegativeAmout(){
        double expectedValue = 100.00;
        Account acc = AccountFactory.createAccount(expectedValue);
        acc.deposit(-200.00);

        Assertions.assertEquals(expectedValue, acc.getBalance());

    }
}
