package lab_06.ManageHospital.entities;

public class Doctor extends Person{
    private String medSpecialty;
    private double workingHours;

    public Doctor(String medSpecialty, double workingHours) {
        this.medSpecialty = medSpecialty;
        this.workingHours = workingHours;
    }

    public Doctor(String name, int age, String medSpecialty, double workingHours) {
        super(name, age);
        this.medSpecialty = medSpecialty;
        this.workingHours = workingHours;
    }

    public String getMedSpecialty() {
        return medSpecialty;
    }

    public void setMedSpecialty(String medSpecialty) {
        this.medSpecialty = medSpecialty;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
}
