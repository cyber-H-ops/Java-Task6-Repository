public abstract class Staff {
    String id;
    String department;
    int hours;

    Staff(String id, String department, int hours) {
        this.id = id;
        this.department = department;
        this.hours = hours;
    }

    void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Hours: " + hours);
    }
    
    abstract void patientCare();
}