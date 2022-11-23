package com.example.duan_n7_cp17303.DTO;

public class Khachhang {

    int id_khachhang;
    String username;
    String pass;
    String hoten;
    String email;
    int dienthoai;
    String diachi;

    public Khachhang() {
    }

    public Khachhang(int id_khachhang, String username, String pass, String hoten, String email, int dienthoai, String diachi) {
        this.id_khachhang = id_khachhang;
        this.username = username;
        this.pass = pass;
        this.hoten = hoten;
        this.email = email;
        this.dienthoai = dienthoai;
        this.diachi = diachi;
    }

    public int getId_khachhang() {
        return id_khachhang;
    }

    public void setId_khachhang(int id_khachhang) {
        this.id_khachhang = id_khachhang;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(int dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
