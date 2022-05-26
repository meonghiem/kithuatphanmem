/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.nhankhau;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


/**
 *
 * @author PC
 */
public class ctr {
    private int port;
    private String host;
    private DAO dao;
    private ServerSocket myServer;
    private ArrayList<Socket> list;

    public ctr() {
        port=8888;
        host= "localhost";
        dao= new DAO();
        list= new ArrayList<>();
        openSocket();
        while(true){
            try {
                Socket s = myServer.accept();
                list.add(s); 
      
            } catch (Exception e) {
                e.printStackTrace();
            }
   
        }
    }
    
    public void sendResult(String res){
        try {
            ObjectOutputStream oos= new ObjectOutputStream(list.get(list.size()-1).getOutputStream());
            oos.writeObject(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public void openSocket(){
        try {
            myServer = new ServerSocket(port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    
}
