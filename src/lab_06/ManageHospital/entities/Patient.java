package lab_06.ManageHospital.entities;

import java.util.Date;

public class Patient extends Person{
    private int medRecordId;
    private String admissionDate;

    public Patient(String name, int age, int medRecordId, String admissionDate) {
        super(name, age);
        this.medRecordId = medRecordId;
        this.admissionDate = admissionDate;
    }

    public int getMedRecordId() {
        return medRecordId;
    }

    public void setMedRecordId(int medRecordId) {
        this.medRecordId = medRecordId;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionString(String admissionDate) {
        this.admissionDate = admissionDate;
    }
}
