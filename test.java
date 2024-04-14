import java.util.Scanner;

public class test {
    public static void menu() {
        System.out.println("MENU------------");
        System.out.println("1. Nhập danh sách khách hàng");
        System.out.println("2. Hiện danh sách khách hàng");
        System.out.println("3. Nhập danh sách nhân viên");
        System.out.println("4. Hiện danh sách nhân viên");
        System.out.println("5. Nhập danh sách thiết bị");
        System.out.println("6. Hiện danh sách thiết bị");
        System.out.println("7. Nhập danh sách hóa đơn");
        System.out.println("8. Hiện danh sách hóa đơn");
        System.out.println("0. Thoát");
    }

    public static void main(String[] args) {
        DSKH dskh = new DSKH();
        DSNV dsnv = new DSNV();
        DSTB dstb = new DSTB();
        DSHD dshd = new DSHD();
        Scanner sc = new Scanner(System.in);
        int lc = 0;
        do {
            menu();
            while (true) {
                try {
                    System.out.println("Vui lòng nhập chức năng");
                    lc = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Vui lòng nhập lại");
                    sc.nextLine();
                }
            }
            switch (lc) {
                case 1:
                    dskh.nhapDSKH();
                    break;
                case 2:
                    dskh.hienDSKH();
                    break;
                case 3:
                    dsnv.nhapDSKNV();
                    break;
                case 4:
                    dsnv.hienDSNV();
                    break;
                case 5:
                    dstb.nhapDSTB();
                    break;
                case 6:
                    dstb.hienDSTB();
                    break;
                case 7:
                    dshd.nhapDSHD(dskh.DSKH,dsnv.DSNV,dstb.DSTB);
                    break;
                case 8:
                    dshd.hienDSHD();
                    break;
            }

        } while (lc != 0);
    }
}
