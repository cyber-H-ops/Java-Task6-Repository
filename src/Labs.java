public class Labs extends Staff {
    Labs(String id, String department, int hours) {
        super(id, department, hours);
    }

    void patientCare() {
        System.out.println("Lab technician runs tests and reports results.");
    }
}