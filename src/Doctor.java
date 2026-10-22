public class Doctor extends Staff {
    Doctor(String id, String department, int hours) {
        super(id, department, hours);
    }

    void patientCare() {
        System.out.println("Doctor diagnoses and prescribes treatment.");
    }
}

