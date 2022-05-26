/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;
import java.util.ArrayList;
import model.baoCao;
import model.hokhau;
import model.nhankhau;
/**
 *
 * @author Thanh
 */
public class DAO {
  
    private Connection conn;
    public DAO() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thanh","root","");
            System.out.println("Ket noi thanh cong  \n");
        }catch(Exception e){
            System.out.println("Loi ket noi");
            e.printStackTrace();
        }
    }
    
    public boolean add_don(baoCao s){
        String sql = "INSERT INTO don_kien_nghi(MaNK, NgayDeDon, IDDon, PhanLoai, NoiDung, TinhTrang) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMaNguoiDeDon());
            ps.setDate(2, new Date(s.getNgayDeDon().getTime()));
            ps.setString(3,s.getIDDon());
            ps.setString(4,s.getPhanLoai());
            ps.setString(5,s.getNoiDung());
            ps.setString(6,"Dang xu li");
            ps.executeUpdate();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<baoCao> get_don(){
        ArrayList<baoCao> list = new ArrayList<>();
            String sql = "SELECT * FROM don_kien_nghi";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    baoCao s = new baoCao();
                    s.setMaNguoiDeDon(rs.getString("MaNK"));
                    s.setNgayDeDon(rs.getDate("NgayDeDon"));
                    s.setIDDon(rs.getString("IDDon"));
                    s.setPhanLoai(rs.getString("PhanLoai"));
                    s.setNoiDung(rs.getString("NoiDung"));
                    s.setTinhTrang(rs.getString("TinhTrang"));
                    list.add(s);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        
        return list;
    }
     public boolean delete_don(baoCao s){
        String sql = "DELETE FROM don_kien_nghi WHERE IDDon = ? " ;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, s.getIDDon());
            ps.executeUpdate();
            return true;
        }catch(Exception e){
                e.printStackTrace();
           }
        return false;
    }
     public boolean delete_HK(hokhau s){
        String sql = "DELETE FROM quan_li_ho_khau WHERE MaHK = ? " ;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, s.getMaHK());
            ps.executeUpdate();
            return true;
        }catch(Exception e){
                e.printStackTrace();
           }
        return false;
    }
    public boolean add_NK(nhankhau s){
        String sql = "INSERT INTO quan_li_nhan_khau(Name, Address, GioiTinh, NgaySinh, NoiSinh, QueQuan, QuocTich, DanToc, TonGiao, CMT, QHeChuHo, MaNK, MaHK, State) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getName());
            ps.setString(2,s.getAddress());
            ps.setString(3,s.getGioiTinh());
            ps.setDate(4, new Date(s.getDOB().getTime()));
            ps.setString(5,s.getNoiSinh());
            ps.setString(6,s.getQueQuan());
            ps.setString(7,s.getQuocTich());
            ps.setString(8,s.getDanToc());
            ps.setString(9,s.getTonGiao());
            ps.setString(10,s.getCMT());
            ps.setString(11,s.getQheChuHo());
            ps.setString(12,s.getMaNK());
            ps.setString(13,s.getMaHK());
            ps.setString(14,s.getState());
            ps.executeUpdate();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
     public boolean add_HK(hokhau s){
        String sql = "INSERT INTO quan_li_ho_khau(MaHK, MaNKChuHo, Address, ngayLap, HoTenChu, CMNDChu, GioiTinhChu, StateChu) VALUES (?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMaHK());
            ps.setString(2,s.getMaNKChuHo());
            ps.setString(3,s.getAddress());
            ps.setDate(4, new Date(s.getNgayLap().getTime()));
            ps.setString(5,s.getHoTenChu());
            ps.setString(6,s.getCMNDChu());
            ps.setString(7,s.getGioiTinhChu());
            ps.setString(8,"Chu ho");
            ps.executeUpdate();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<nhankhau> getListNK(){
        ArrayList<nhankhau> list = new ArrayList<>();
            String sql = "SELECT * FROM quan_li_nhan_khau";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    nhankhau s = new nhankhau();
                    s.setName(rs.getString("Name"));
                    s.setAddress(rs.getString("Address"));
                    s.setGioiTinh(rs.getString("GioiTinh"));
                    s.setDOB(rs.getDate("NgaySinh"));
                    s.setNoiSinh(rs.getString("NoiSinh"));
                    s.setQueQuan(rs.getString("QueQuan"));
                    s.setQuocTich(rs.getString("QuocTich"));
                    s.setDanToc(rs.getString("DanToc"));
                    s.setTonGiao(rs.getString("TonGiao"));
                    s.setCMT(rs.getString("CMT"));
                    s.setQheChuHo(rs.getString("QHeChuHo"));
                    s.setMaNK(rs.getString("MaNK"));
                    s.setMaHK(rs.getString("MaHK"));
                    s.setState(rs.getString("State"));
                    list.add(s);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        
        return list;
    }
    public ArrayList<hokhau> getListHK(){
        ArrayList<hokhau> list = new ArrayList<>();
            String sql = "SELECT * FROM quan_li_ho_khau";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    hokhau s = new hokhau();
                    s.setMaHK(rs.getString("MaHK"));
                    s.setMaNKChuHo(rs.getString("MaNKChuHo"));
                    s.setAddress(rs.getString("Address"));
                    s.setNgayLap(rs.getDate("ngayLap"));
                    s.setHoTenChu(rs.getString("HoTenChu"));
                    s.setCMNDChu(rs.getString("CMNDChu"));
                    s.setGioiTinhChu(rs.getString("GioiTinhChu"));
                    s.setStateChu(rs.getString("StateChu"));
                    list.add(s);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        
        return list;
    }
  
    public boolean delete_NK(nhankhau s){
        String sql = "DELETE FROM quan_li_nhan_khau WHERE MaNK = ? " ;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, s.getMaNK());
            ps.executeUpdate();
            return true;
        }catch(Exception e){
                e.printStackTrace();
           }
        return false;
    }

    public static void main(String[] args) {
        new DAO();
    }

}
