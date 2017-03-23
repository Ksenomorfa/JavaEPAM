package ru.polinabevad.javarecall.epam.module2;


public class Doctor extends MedicalStaff {
        public static void staticMedical() {
            System.out.println("staticDoctor");
        }

        public void createMedical() {
            System.out.println("createMedical");
        }
        public void info() {
            System.out.println("Doctor");
        }
}
