public class Pharmacist extends Staff {
    Pharmacist(String id, String department, int hours) {
        super(id, department, hours);
    }

    void patientCare() {
        System.out.println("Pharmacist dispenses medicine.");
    }
}