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
public class hokhau {
    private String MaHK;
    private String MaNKChuHo;
    private String Address;
    private Date ngayLap;
    private String HoTenChu;
    private String CMNDChu;
    private String GioiTinhChu;
    private String StateChu;

    public hokhau() {
    }

    public hokhau(String MaHK, String MaNKChuHo, String Address, Date ngayLap, String HoTenChu, String CMNDChu, String GioiTinhChu, String StateChu) {
        this.MaHK = MaHK;
        this.MaNKChuHo = MaNKChuHo;
        this.Address = Address;
        this.ngayLap = ngayLap;
        this.HoTenChu = HoTenChu;
        this.CMNDChu = CMNDChu;
        this.GioiTinhChu = GioiTinhChu;
        this.StateChu = StateChu;
    }

    public String getMaHK() {
        return MaHK;
    }

    public String getMaNKChuHo() {
        return MaNKChuHo;
    }

    public String getAddress() {
        return Address;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public String getHoTenChu() {
        return HoTenChu;
    }

    public String getCMNDChu() {
        return CMNDChu;
    }

    public String getGioiTinhChu() {
        return GioiTinhChu;
    }

    public String getStateChu() {
        return StateChu;
    }

    public void setMaHK(String MaHK) {
        this.MaHK = MaHK;
    }

    public void setMaNKChuHo(String MaNKChuHo) {
        this.MaNKChuHo = MaNKChuHo;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setHoTenChu(String HoTenChu) {
        this.HoTenChu = HoTenChu;
    }

    public void setCMNDChu(String CMNDChu) {
        this.CMNDChu = CMNDChu;
    }

    public void setGioiTinhChu(String GioiTinhChu) {
        this.GioiTinhChu = GioiTinhChu;
    }

    public void setStateChu(String StateChu) {
        this.StateChu = StateChu;
    }
    
    
}
