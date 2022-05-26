/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author PC
 */
public class baoCao {
    private String MaNguoiDeDon;
    private Date NgayDeDon;
    private String IDDon;
    private String PhanLoai;
    private String NoiDung;
    private String TinhTrang;
    public baoCao() {
    }

    public baoCao(String MaNguoiDeDon, Date NgayDeDon, String IDDon, String PhanLoai, String NoiDung) {
        this.MaNguoiDeDon = MaNguoiDeDon;
        this.NgayDeDon = NgayDeDon;
        this.IDDon = IDDon;
        this.PhanLoai = PhanLoai;
        this.NoiDung = NoiDung;
    }

    public String getMaNguoiDeDon() {
        return MaNguoiDeDon;
    }

    public Date getNgayDeDon() {
        return NgayDeDon;
    }

    public String getIDDon() {
        return IDDon;
    }

    public String getPhanLoai() {
        return PhanLoai;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }
    
    
    public void setMaNguoiDeDon(String MaNguoiDeDon) {
        this.MaNguoiDeDon = MaNguoiDeDon;
    }

    public void setNgayDeDon(Date NgayDeDon) {
        this.NgayDeDon = NgayDeDon;
    }

    public void setIDDon(String IDDon) {
        this.IDDon = IDDon;
    }

    public void setPhanLoai(String PhanLoai) {
        this.PhanLoai = PhanLoai;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    
}
