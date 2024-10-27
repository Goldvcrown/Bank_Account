package bank_account;

import javax.swing.JOptionPane;

public class bank_acc {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name:");
        String acc_number = JOptionPane.showInputDialog("And your account number is:");

        int acc_num = Integer.parseInt(acc_number);
        int balance;

        while (true) {
            String ibal = JOptionPane.showInputDialog("And your balance is:");
            balance = Integer.parseInt(ibal);
            if (balance < 50000) {
                JOptionPane.showMessageDialog(null, "Your balance is under 50000, try again!");
            } else {
                break;
            }
        }

        account acc = new account(name, acc_num, balance);

        work tran = new work();
        tran.askTransaction(acc);
        work see = new work();
        see.askGetfinalBal(acc);
    }
}
