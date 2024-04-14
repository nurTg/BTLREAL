import java.util.ArrayList;
import java.util.Scanner;

public class DSTB {
    ArrayList<Thietbi> DSTB = new ArrayList<Thietbi>();
    public void nhapDSTB() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.println("Nhập số lượng thiết bị có trong danh sách:");
                n = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại!");
                sc.nextLine();
            }
        }
        for (int i=0;i<n;i++){
            Thietbi s = new Thietbi();
            if(DSTB.size()==0){
                s.setSoTB(0);
            }else {
                s.setSoTB(DSTB.size());
            }
            System.out.println("\nNhập thông tin thiết bị thứ"+(DSTB.size()+1)+":");
            s.NhapTB();
            DSTB.add(s);
        }
    }
    public void hienDSTB(){
        System.out.printf("\n %-20s| %-20s| %-20s|%-20s","maLoai","ten","namSX","giaBan");
        for(Thietbi thietbi: DSTB){
            System.out.println(thietbi.toString());
        }
    }

}
