import java.util.ArrayList;
import java.util.Scanner;

public class DSNV {
    ArrayList<Nhanvien> DSNV = new ArrayList<Nhanvien>();
    public void nhapDSKNV() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.println("Nhập số lượng nhân viên có trong danh sách:");
                n = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại!");
                sc.nextLine();
            }
        }
        for (int i=0;i<n;i++){
            Nhanvien x = new Nhanvien();
            if(DSNV.size()==0){
                x.setSoNV(0);
            }else {
                x.setSoKH(DSNV.size());
            }
            System.out.println("\nNhập thông khách hàng thứ"+(DSNV.size()+1)+":");
            x.NhapNV();
            DSNV.add(x);

        }
    }
    public void hienDSNV(){
        System.out.printf("\n%-10s | %-10s | %-10s | %-10s | %-15s | %-15s | %-15s| %-10s","maNV","hoTen","soDT","diaChi","gioiTinh","chucVu","namSinh","HSL");
        for(Nhanvien nhanvien: DSNV){
            System.out.println(nhanvien.toString());
        }
    }
}
