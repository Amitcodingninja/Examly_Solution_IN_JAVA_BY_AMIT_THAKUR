
import java.util.*;

abstract class FundTransfer {
    protected String accountNumber;
    protected Double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public FundTransfer() {
        this.accountNumber = null;
        this.balance = (double) 0;
    }

    public FundTransfer(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public boolean validate(Double transfer) {
        if (accountNumber.length() == 10 && transfer > 0 && transfer < balance) {
            return true;
        } else
            return false;
    }

    public abstract boolean transfer(Double transfer);

}

class NEFTTransfer extends FundTransfer {
    public boolean transfer(Double transfer) {
        if ((transfer + (0.05 * transfer)) < getBalance()) {
            return true;
        } else {
            return false;
        }
    }
}

class IMPSTransfer extends FundTransfer {
    public boolean transfer(Double transfer) {
        if ((transfer + (0.02 * transfer)) < getBalance()) {
            return true;
        } else {
            return false;
        }
    }
}

class RTGSTransfer extends FundTransfer {
    public boolean transfer(Double transfer) {
        if (transfer > 10000) {
            return true;
        } else {
            return false;
        }
    }
}

class Main {
    public static void main(String[] args) {
        NEFTTransfer nt = new NEFTTransfer();
        IMPSTransfer it = new IMPSTransfer();
        RTGSTransfer rt = new RTGSTransfer();
        Scanner sc = new Scanner(System.in);
        int choice;
        Double amount;
        choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            nt.setAccountNumber(sc.nextLine());
            nt.setBalance(Double.parseDouble(sc.nextLine()));
            amount = Double.parseDouble(sc.nextLine());
            boolean check = nt.validate(amount);
            if (check == false) {
                System.out.println("Account number or transfer amount seems to be wrong");
            } else {
                boolean temp = nt.transfer(amount);
                if (temp == true) {
                    System.out.println("Transfer occured successfully");
                    nt.setBalance(nt.getBalance() - (amount + (0.05 * amount)));
                    System.out.println(nt.getBalance());
                } else {
                    System.out.println("Transfer could not be made");
                }
            }

        }
        if (choice == 2) {
            it.setAccountNumber(sc.nextLine());
            it.setBalance(Double.parseDouble(sc.nextLine()));
            amount = Double.parseDouble(sc.nextLine());
            boolean check = it.validate(amount);
            if (check == false) {
                System.out.println("Account number or transfer amount seems to be wrong");
            } else {
                boolean temp = it.transfer(amount);
                if (temp == true) {
                    System.out.println("Transfer occured successfully");
                    it.setBalance(it.getBalance() - (amount + (0.02 * amount)));
                    System.out.println(it.getBalance());
                } else {
                    System.out.println("Transfer could not be made");
                }
            }
        }
        if (choice == 3) {
            rt.setAccountNumber(sc.nextLine());
            rt.setBalance(Double.parseDouble(sc.nextLine()));
            amount = Double.parseDouble(sc.nextLine());
            boolean check = rt.validate(amount);
            if (check == false) {
                System.out.println("Account number or transfer amount seems to be wrong");
            } else {
                boolean temp = rt.transfer(amount);
                if (temp == true) {
                    System.out.println("Transfer occured successfully");
                    rt.setBalance(rt.getBalance() - amount);
                    System.out.println(rt.getBalance());
                } else {
                    System.out.println("Transfer could not be made");
                }
            }
        }
    }
}
