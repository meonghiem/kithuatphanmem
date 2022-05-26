/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Thanh
 */
public class nhankhau implements Serializable {
     private String maNK;
    private String name;
    private String address;
    private String CMT;
    private Date DOB; // date of birth
    private String maHK; // số sổ hộ khẩu
    private String gioiTinh;
    private String noiSinh;
    private String danToc;
    private String quocTich;
    private String queQuan;
    private String qheChuHo;
    private String state; // tạm trú or tạm vắng
    private String tonGiao;
    
    public nhankhau(){
        
    }

    public nhankhau(String maNK, String name, String address, String CMT, Date DOB, String maHK, String gioiTinh, String noiSinh, String danToc, String quocTich, String queQuan, String qheChuHo, String state, String tonGiao) {
        this.maNK = maNK;
        this.name = name;
        this.address = address;
        this.CMT = CMT;
        this.DOB = DOB;
        this.maHK = maHK;
        this.gioiTinh = gioiTinh;
        this.noiSinh = noiSinh;
        this.danToc = danToc;
        this.quocTich = quocTich;
        this.queQuan = queQuan;
        this.qheChuHo = qheChuHo;
        this.state = state;
        this.tonGiao = tonGiao;
    }



    public void setMaNK(String maNK) {
        this.maNK = maNK;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setMaHK(String maHK) {
        this.maHK = maHK;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setQheChuHo(String qheChuHo) {
        this.qheChuHo = qheChuHo;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

    public String getMaNK() {
        return maNK;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCMT() {
        return CMT;
    }

    public Date getDOB() {
        return DOB;
    }

    public String getMaHK() {
        return maHK;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public String getDanToc() {
        return danToc;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getQheChuHo() {
        return qheChuHo;
    }

    public String getState() {
        return state;
    }

    public String getTonGiao() {
        return tonGiao;
    }


    
    
    
}
