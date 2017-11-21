import java.util.ArrayList;

class Staff {
    String name;
    double salary;

    void adjustSalary(int percent) {
        salary *= (1 + percent / 100);
    }
}

class Admin extends Staff {
    @Override
    void adjustSalary(int percent) {
        salary *= (1 + 1.5 * percent / 100);
    }
}

class Academic extends Staff {
    @Override
    void adjustSalary(int percent) {
        salary *= (1 + 2 * percent / 100);
    }
}

public class Payroll {
    ArrayList<Staff> staff = new ArrayList<>();

    void adjustSalary(int byPercent) {
        for (Staff s: staff) {
            s.adjustSalary(byPercent);
        }
    }

    public static void main(String[] args) {
        Payroll myPayroll = new Payroll();
        myPayroll.adjustSalary(10);
    }
}