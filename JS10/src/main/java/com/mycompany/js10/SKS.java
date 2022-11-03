/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js10;

//Created by 21343032_Muhammad Rizky Sandyra

import java.util.Scanner;

public class SKS {
    String nama, nim, semester;
    int jumlah;
    float ip;
    
    
    public void InputData(){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan Nama\t: ");
        nama = input.nextLine();
        System.out.println("Masukkan NIM\t: ");
        nim = input.nextLine();
        System.out.println("Masukkan Semester\t: ");
        semester = input.nextLine();
        System.out.println("Masukkan IP\t: ");
        ip = input.nextFloat();
    }
    
    public void TotalSKS(){
        if(ip >= 3.5){
            jumlah = 24;
        }
        else if(ip >= 3.0){
            jumlah = 22;
        }
        else if(ip >= 2.5){
            jumlah = 20;
        }
        else if(ip >= 2.0){
            jumlah = 18;
        }
        else{
            jumlah = 15;
        }
    }
    
    public void Data(){
        System.out.println("Nama saya \t\t\t: " + nama);
        System.out.println("NIM \t\t\t\t: " + nim);
        System.out.println("Semester \t\t\t: " + semester);
        System.out.println("IP Semester ini \t\t: " + ip);
        System.out.println("Anda berhak mengontrak " + jumlah + " SKS pada Semester " + semester);
    }
    
    public static void main(String[] args){
        SKS Mahasiswa = new SKS();
        
        Mahasiswa.InputData();
        Mahasiswa.TotalSKS();
        Mahasiswa.Data();
    }
}
