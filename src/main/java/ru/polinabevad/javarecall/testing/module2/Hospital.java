package ru.polinabevad.javarecall.testing.module2;

public class Hospital {
    public static void main(String[] args) {
        MedicalStaff med = new Doctor();
        Doctor doctor = new Doctor();

        med.info();
        med.prescrMedical();
        med.staticMedical();

        doctor.info();
        doctor.prescrMedical();
        doctor.createMedical();
        doctor.staticMedical();

    }
}
