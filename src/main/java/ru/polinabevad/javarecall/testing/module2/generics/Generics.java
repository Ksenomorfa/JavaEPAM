package ru.polinabevad.javarecall.testing.module2.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        //List <? extends Doctor> list1 = new ArrayList<MedicalStaff>();
        List <? extends Doctor> list2 = new ArrayList<Doctor>();
        List<? extends Doctor> list3 = new ArrayList<HeadDoctor>();

        Doctor doctor = list2.get(0);
        Doctor doctor2 = list3.get(0);

        //List<? super Doctor> list7 = new ArrayList<HeadDoctor>();
        List<? super Doctor> list6 = new ArrayList<>();
        List<? super Doctor> list5 = new ArrayList<MedicalStaff>();
        List<? super Doctor> list4= new ArrayList<Object>();

        //list5.add(new Object());
        //list5.add(new MedicalStaff());
        list5.add(new Doctor());
        list5.add(new HeadDoctor());
        //list5.get(0);
        Object object = list5.get(0);
        //MedicalStaff medicalStaff = list5.get(0);
        //Doctor doctor = list5.get(0);
        //HeadDoctor headDoctor = list5.get(0);

    }
}

class MedicalStaff {}
class Doctor extends MedicalStaff{}
class HeadDoctor extends  Doctor{}
class Nurse extends MedicalStaff{};

