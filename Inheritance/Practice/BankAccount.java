// You are using Java

import java.util.*;

class Account {
    protected String accName;
    protected String accNo;
    protected String bankName;

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    protected void display() {
        System.out.println(this.accName);
        System.out.println(this.accNo);
        System.out.println(this.bankName);
    }
}

class CurrentAccount extends Account {
    private String tinNumber;

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;

    }

    public CurrentAccount() {
        this.tinNumber = null;

    }

    public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
        this.tinNumber = tinNumber;

    }

    public void display() {
        System.out.println(this.accName);
        System.out.println(this.accNo);
        System.out.println(this.bankName);
        System.out.println(tinNumber);
    }
}

class SavingsAccount extends Account {
    private String orgName;

    public SavingsAccount() {
        this.accName = null;
        this.accNo = null;
        this.bankName = null;
        this.orgName = null;
    }

    public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
        this.orgName = orgName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;

    }

    public void display() {
        System.out.println(this.accName);
        System.out.println(this.accNo);
        System.out.println(this.bankName);
        System.out.println(orgName);
    }
}

class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();
        if (n == 1) {
            s.setAccName(sc.next());
            s.setAccNo(sc.next());
            s.setBankName(sc.next());
            s.setOrgName(sc.next());
            SavingsAccount s1 = new SavingsAccount(s.getAccName(), s.getAccNo(), s.bankName, s.getOrgName());
            s1.display();
        }
        if (n == 2) {
            c.setAccName(sc.next());
            c.setAccNo(sc.next());
            c.setBankName(sc.next());
            c.setTinNumber(sc.next());
            CurrentAccount c1 = new CurrentAccount(c.accName, c.accNo, c.bankName, c.getTinNumber());
            c1.display();
        }
    }
}