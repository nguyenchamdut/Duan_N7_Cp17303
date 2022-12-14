package com.example.duan_n7_cp17303.DTO;

public class Khachhang {

    int id_khachhang;
    String username;
    String hoten;
    String email;
    String dienthoai;
    String diachi;

    public Khachhang() {
    }

    public Khachhang(int id_khachhang, String username, String hoten, String email, String dienthoai, String diachi) {
        this.id_khachhang = id_khachhang;
        this.username = username;
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

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
