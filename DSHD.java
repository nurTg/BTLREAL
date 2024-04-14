import java.util.ArrayList;
import java.util.Scanner;

public class DSHD {
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
}