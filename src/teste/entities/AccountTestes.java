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

    @Test
    public void fullWithdrawShouldClearBalance(){
        double expectedValue = 0.0;
        double initialBalance = 800.0;
        Account acc = AccountFactory.createAccount(initialBalance);
        double result = acc.fullWithdra();

        Assertions.assertTrue(expectedValue == acc.getBalance());
    }

    @Test
    public void withDrawShouldDecreaseBalanceWhenSufficientBalance(){
        Account acc = AccountFactory.createAccount(800.0);
        acc.withdraw(500.0);
        Assertions.assertEquals(300.0, acc.getBalance());
    }

    @Test
    public void withDrawShouldThrowExcpetionWhenSufficientBalance(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Account acc = AccountFactory.createAccount(800.0);
            acc.withdraw(850.0);
        });
    }
}
