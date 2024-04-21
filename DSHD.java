package BTL;

import BTL.Khachhang;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;


public class DSHD implements Serializable {
    ArrayList<Hoadon> dshd = new ArrayList<Hoadon>();
    Scanner sc = new Scanner(System.in);

    public void nhapDSHD(ArrayList<Khachhang> dskh, ArrayList<Nhanvien> dsnv, ArrayList<Thietbi> dstb) {
        System.out.println("\nNhập số lượng hóa đơn: ");
        int sl= sc.nextInt();
        for(int i=0;i<sl;i++){
            System.out.println("\n----Thông tin hóa đơn thứ:"+(dshd.size()+1));
            Hoadon a = new Hoadon();
            if(dshd.size()==0){
                a.setMaHD(0);
            }else {
                a.setMaHD(dshd.size());
            }
            a.nhapHD(dskh,dsnv,dstb);
            dshd.add(a);
        }
    }
    public void hienDSHD(){
        System.out.println("----DANH SÁCH HÓA ĐƠN----");
        for(Hoadon hoadon:dshd){
            hoadon.hienHD();
        }
    }
    public void timkiemHD() {
        int ma ;
        sc.nextLine();
        System.out.print("\nNhập mã hóa đơn cần tìm: ");
        ma = sc.nextInt() ;
        System.out.println("\n----THÔNG TIN HÓA ĐƠN CẦN TÌM ----");
        for (Hoadon hoadon: dshd) {
            if (hoadon.getMaHD()==ma) {
                hienDSHD();
            }
            else {
                System.out.println("\nKhông có mã hóa đơn cần tìm");
            }
        }
    }
    public void tongtien() {
        float tongtien = 0;
        for(Hoadon hoadon:dshd) {
            tongtien += hoadon.getThanhTien();
        }
        System.out.printf("\n\tTổng tiền của các hóa đơn: %.1f" ,tongtien);
    }
    public void ghifile() throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("dshd.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dshd);
            oos.flush();
            oos.close();
            fos.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("\nGhi File thất bại!"+e.toString());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void docfile() throws IOException {
        try {
            FileInputStream fis = new FileInputStream("dshd.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Hoadon> ds = (ArrayList<Hoadon>) ois.readObject();
            ois.close();
            fis.close();
            dshd.clear();
            dshd=ds;
            hienDSHD();
        }
        catch (ClassNotFoundException | FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("\nĐọc File thất bại!"+e.toString());
        }
    }

}
