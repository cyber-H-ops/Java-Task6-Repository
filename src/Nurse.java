public class Nurse extends Staff {
    Nurse(String id, String department, int hours) {
        super(id, department, hours);
    }

    void patientCare() {
        System.out.println("Nurse monitors patients and gives care.");
    }
}