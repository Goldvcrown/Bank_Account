package bank_account;

import javax.swing.JOptionPane;

public class work {
    public void deposit(account acc) {
        while (true) {
            String num = JOptionPane.showInputDialog("How much you want to deposit");
            if (num == null) { 
                JOptionPane.showMessageDialog(null, "You canceled!");
                break;
            }
            int number = Integer.parseInt(num);
            if (number < 0) {
                JOptionPane.showMessageDialog(null, "The cash must be more than zero!");
                continue;
            } else {
                int new_bal = acc.getBalance() + number;
                acc.setBalance(new_bal);
                JOptionPane.showMessageDialog(null, "Deposited!");
                break;
            }
        }
    }

    public void withdraw(account acc) {
        while (true) {
            String num = JOptionPane.showInputDialog("How much you want to withdraw");
            if (num == null) {  
                JOptionPane.showMessageDialog(null, "You canceled!");
                break;
            }
            int number = Integer.parseInt(num);
            if (number < 0) {
                JOptionPane.showMessageDialog(null, "The cash must be more than zero!");
                continue;
            }
            if (acc.getBalance() - number - 5000 < 50000) {
                JOptionPane.showMessageDialog(null, "Your balance can't be under 50000");
                continue;
            } else {
                int new_bal = acc.getBalance() - number - 5000;
                acc.setBalance(new_bal);
                JOptionPane.showMessageDialog(null, "Withdrawn!");
                break;
            }
        }
    }

    public void askTransaction(account acc) {
        String[] options = {"Deposit", "Withdraw"};
        
        int choice = JOptionPane.showOptionDialog(
            null, 
            "Do you want to deposit or withdraw?", 
            "Choose Transaction", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            options, 
            options[0]
        );

        if (choice == 0) {
            deposit(acc);
        } else if (choice == 1) {
            withdraw(acc);
        } else {
            JOptionPane.showMessageDialog(null, "You canceled!");
        }
    }
    public void askGetfinalBal(account acc) {
    	String[] options = {"Yes", "No"};
        
        int choice = JOptionPane.showOptionDialog(
            null, 
            "Do you want to see your present balance?", 
            "See information", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            options, 
            options[0]
        );

        if (choice == 0) {
        	JOptionPane.showMessageDialog(null, "Your information is:" + "\n" + "Name: " + acc.getName() + "\n" + "Account Number: " + acc.getAcc_num()+ " \n" + "Balance: " + acc.getBalance());
        } else if (choice == 1) {
        	JOptionPane.showMessageDialog(null, "Done!");
        } else {
            JOptionPane.showMessageDialog(null, "You canceled!");
        }
    }
}
