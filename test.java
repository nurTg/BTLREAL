package BTL;

import BTL.DSHD;
import BTL.DSKH;
import BTL.DSNV;
import BTL.DSTB;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void menu() {
        System.out.println("\nMENU------------");
        System.out.println("1. Nhập danh sách khách hàng");
        System.out.println("2. Hiện danh sách khách hàng");
        System.out.println("3. Nhập danh sách nhân viên");
        System.out.println("4. Hiện danh sách nhân viên");
        System.out.println("5. Nhập danh sách thiết bị");
        System.out.println("6. Hiện danh sách thiết bị");
        System.out.println("7. Nhập danh sách hóa đơn");
        System.out.println("8. Hiện danh sách hóa đơn");
        System.out.println("9. Sắp xếp danh sách khách hàng theo tên");
        System.out.println("10. Xóa khách hàng theo tên");
        System.out.println("11. Sắp xếp nhân viên theo tên");
        System.out.println("12. Liệt kê nhân viên có lương trên 2000000");
        System.out.println("13. Xóa nhân viên theo tên");
        System.out.println("14. Tìm kiếm hóa đơn theo mã hóa đơn");
        System.out.println("15. Tính tổng tiền các hóa đơn");
        System.out.println("16. Ghi file");
        System.out.println("17. Đọc file");
        System.out.println("0. Thoát");
    }

    public static void main(String[] args) throws IOException {
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
                case 9:
                    dskh.sxDSKHtheoten();
                    break;
                case 10:
                    dskh.xoaKH();
                    break;
                case 11:
                    dsnv.sxDSNVtheoten();
                    break;
                case 12:
                    dsnv.lietkenvcoluongtren2000000();
                    break;
                case 13:
                    dsnv.xoaNV();
                    break;
                case 14:
                    dshd.timkiemHD();
                    break;
                case 15:
                    dshd.tongtien();
                    break;
                case 16:
                    dshd.ghifile();
                    break;
                case 17:
                    dshd.docfile();
                    break;
            }

        } while (lc != 0);
    }
}
