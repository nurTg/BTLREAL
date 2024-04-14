import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DSKH {
    ArrayList<Khachhang> DSKH = new ArrayList<Khachhang>();
    public void nhapDSKH() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.println("Nhập số lượng khách hàng có trong danh sách:");
                n = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại!");
                sc.nextLine();
            }
        }
        for (int i=0;i<n;i++){
            Khachhang e = new Khachhang();
            if(DSKH.size()==0){
                e.setSoKH(0);
            }else {
                e.setSoKH(DSKH.size());
            }
            System.out.println("\nNhập thông khách hàng thứ"+(DSKH.size()+1)+":");
            e.NhapKH();
            DSKH.add(e);
        }
    }
    public void hienDSKH(){
        System.out.printf("\n%-15s | %-15s | %-15s | %-10s | %-10s | %-10s","hoTen","soDT","diaChi","maKH","namSinh","gioiTinh");
        for(Khachhang khachhang: DSKH){
            System.out.println(khachhang.toString());
        }
    }
}
