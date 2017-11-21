class Report {
    public void print() {
        System.out.println("This is a report.");
    }
}

class SipReport extends Report {
    public void print() {
        System.out.println("This is a SIP report.");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Report report1 = new Report();
        Report report2 = new SipReport();
        SipReport report3 = new SipReport();

        report1.print();
        report2.print();
        report3.print();
    }
}