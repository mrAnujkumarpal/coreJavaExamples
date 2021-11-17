package sorting.anuj;

import java.math.BigDecimal;

interface  Account{
    BigDecimal bal=new BigDecimal(0.00);
}
public class SavingAccount implements Account {

    public SavingAccount(BigDecimal initialValue) {
       // bal = initialValue;
    }

    public String toString() {
        return bal.toString();
    }

    public static void main(String[] args) {
        SavingAccount savingAccount =new SavingAccount(new BigDecimal(50.00));
        System.out.println(savingAccount);
    }

}
