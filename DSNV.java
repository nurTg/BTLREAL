package BTL;

import java.util.ArrayList;
import java.util.Collections;
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
        for (int i = 0; i < n; i++) {
            Nhanvien x = new Nhanvien();
            if (DSNV.size() == 0) {
                x.setSoNV(0);
            } else {
                x.setSoKH(DSNV.size());
            }
            System.out.println("\nNhập thông nhân viên thứ" + (DSNV.size() + 1) + ":");
            x.NhapNV();
            DSNV.add(x);

        }
    }

    public void hienDSNV() {
        System.out.printf("\n%-10s | %-10s | %-10s | %-10s | %-15s | %-15s | %-15s | %-10s | %-10s", "maNV", "hoTen", "soDT", "diaChi", "gioiTinh", "chucVu", "namSinh", "HSL", "tinhluong");
        for (Nhanvien nhanvien : DSNV) {
            System.out.println(nhanvien.toString());
        }
    }

    public void sxDSNVtheoten() {
        System.out.println("Danh sách khi sắp xếp theo tên nhân viên: ");
        Collections.sort(DSNV);
        hienDSNV();
    }

    public void lietkenvcoluongtren2000000() {
        Boolean cokhong = false;
        for (Nhanvien nhanvien : DSNV) {
            if (nhanvien.tinhLuong() > 2000000) {

                if (!cokhong) {
                    System.out.println("Danh sách nhân viên có lương trên 2000000: ");
                    System.out.printf("\n%-10s | %-10s | %-10s | %-10s | %-15s | %-15s | %-15s | %-10s | %-10s", "maNV", "hoTen", "soDT", "diaChi", "gioiTinh", "chucVu", "namSinh", "HSL", "tinhluong");
                }

                System.out.println(nhanvien.toString());
                cokhong = true;
            }
        }

        if (!cokhong) {
            System.out.println("Không có nhân viên có lương trên 2000000!");
        }
    }

    public void xoaNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên cần xóa: ");
        String ma = sc.nextLine();
        Boolean kiemtra = false;
        for (Nhanvien nhanvien : DSNV) {
            if (nhanvien.getMaNV().equals(ma)) {
                DSNV.remove(nhanvien);
                kiemtra = true;
                break;
            }
        }
    }
}
