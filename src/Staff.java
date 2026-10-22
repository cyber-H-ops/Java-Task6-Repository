public abstract class Staff {
    String id;
    String department;
    int hours;

    Staff(String id, String department, int hours) {
        this.id = id;
        this.department = department;
        this.hours = hours;
    }
}