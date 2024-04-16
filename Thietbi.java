package BTL;

import java.util.Scanner;

public class Thietbi {
    String maLoai;
    String ten;
    int namSX;
    int giaBan;
    int soTB;

    public Thietbi() {
        this.maLoai = maLoai;
        this.ten = ten;
        this.namSX = namSX;
        this.giaBan = giaBan;
        this.soTB= soTB;
    }

    public int getSoTB() {
        return soTB;
    }

    public void setSoTB(int soTB) {
        this.soTB = soTB;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public Thietbi(String maLoai, String ten, int namSX, int giaBan, int soTB) {
        this.maLoai = maLoai;
        this.ten = ten;
        this.namSX = namSX;
        this.giaBan = giaBan;
        this.soTB= soTB;
    }

    @Override
    public String toString() {
        return String.format("\n %-20s| %-20s| %-20s|%-20s",maLoai,ten,namSX,giaBan);
    }
    public void NhapTB(){
        Scanner sc= new Scanner(System.in);
        while(true){
            try{
                System.out.println("Nhập tên thiết bị máy tính : ");
                ten = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextLine();
            }
        }
        while(true){
            try{
                System.out.println("Nhập mã thiết bị máy tính : ");
                maLoai = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextLine();
            }
        }
        while(true){
            try{
                System.out.println("Nhập năm sản xuất thiết bị : ");
                namSX = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextInt();
            }
        }
        while(true){
            try{
                System.out.println("Nhập giá bán thiết bị: ");
                giaBan = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextInt();
            }
        }
        }
}
