package BTL;

import BTL.Khachhang;

import java.util.ArrayList;
import java.util.Scanner;

public class Hoadon {
    String ngayLap;
    int maHD;
    int soLuong;
    float thanhTien;
    Khachhang KH= new Khachhang();
    Nhanvien NV = new Nhanvien();
    Thietbi TB = new Thietbi();
    Scanner sc= new Scanner(System.in);

    public Hoadon() {
        this.ngayLap = ngayLap;
        this.maHD = maHD;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Hoadon(String ngayLap, int maHD, int soLuong, float thanhTien) {
        this.ngayLap = ngayLap;
        this.maHD = maHD;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }
    public void nhapHD(ArrayList<Khachhang>dskh, ArrayList<Nhanvien>dsnv, ArrayList<Thietbi>dstb){
        while(true){
            try{
                System.out.println("Nhập ngày lập hóa đơn: ");
                ngayLap = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextLine();
            }
        }
        while(true){
            try{
                System.out.println("Nhập mã hóa đơn ");
                maHD = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextInt();
            }
        }while(true){
            try{
                System.out.println("Nhập số lượng thiết bị: ");
                soLuong = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextLine();
            }
        }
        while(true){
                sc.nextLine();
                System.out.println("Nhập mã nhân viên lập hóa đơn: ");
                String maNV = sc.nextLine();
                boolean kiemtra = false;
                for(Nhanvien nhanvien: dsnv){
                    if(nhanvien.getMaNV().equals(maNV)){
                        NV=nhanvien;
                        kiemtra=true;
                        break;
                    }
                }
                if(kiemtra=true) {
                    break;
                }
            System.out.println("Mã nhân viên không hợp lệ. Nhập lại");
        }
        while(true){

            System.out.println("Nhập mã khách hàng mua hàng: ");
            String maKH = sc.nextLine();
            boolean kiemtra = false;
            for(Khachhang khachhang: dskh){
                if(khachhang.getMaKH().equals(maKH)){
                    KH=khachhang;
                    kiemtra=true;
                    break;
                }
            }
            if(kiemtra=true) {
                break;
            }
            System.out.println("Mã khách hàng không hợp lệ. Nhập lại");
        }
        while(true){

            System.out.println("Nhập số thiết bị: ");
            int soTB = sc.nextInt();
            boolean kiemtra = false;
            for(Thietbi thietbi:dstb){
                if(thietbi.getSoTB()==soTB){
                    TB=thietbi;
                    kiemtra=true;
                    break;
                }
            }
            if(kiemtra=true) {
                break;
            }
            System.out.println("Số phòng không hợp lệ. Nhập lại");
        }
        thanhTien= TB.getGiaBan()*soLuong;
    }
    public void hienHD(){
        System.out.printf("\nMã hóa đơn:%s",maHD);
        System.out.printf("\nNgày lập:%s",ngayLap);
        System.out.printf("\nSố lượng thiết bị:%s",soLuong);
        System.out.println("\nNhân viên lập hóa đơn:"+NV.getHoTen());
        System.out.println("Khách hàng mua thiết bị:"+KH.getHoTen());
        System.out.println("Thông tin thiết bị: ");
        System.out.printf("\n %-20s| %-20s| %-20s|%-20s|%-10s","maLoai","ten","namSX","giaBan","thanhtien");
        System.out.printf(TB.toString()+thanhTien);
    }
}
