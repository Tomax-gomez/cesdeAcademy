package com.academico.cesde.Domain;

public class Teacher extends UserAcademy {
    private String speciality;




    public Teacher(){
        super();
    }

    public Teacher(int idUser, String userName, String lastName, String email, String phone, String password, String speciality) {
        super(idUser, userName, lastName, email, phone, password);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
