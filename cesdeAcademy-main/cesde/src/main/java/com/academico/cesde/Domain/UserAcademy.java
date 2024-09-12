package com.academico.cesde.Domain;

public class UserAcademy {
    private int IdUser;
    private String UserName;
    private String LastName;
    private String email;
    private String phone;
    private String password;

    public UserAcademy(){

    }

    public UserAcademy(int idUser, String userName, String lastName, String email, String phone, String password) {
        this.IdUser = idUser;
        this.UserName = userName;
        this.LastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
