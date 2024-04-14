import java.util.Scanner;

public class Khachhang {
    String hoTen,soDT,diaChi,maKH,gioiTinh;
    int namSinh;
    int soKH;



    public Khachhang() {
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.maKH = maKH;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.soKH = soKH;
    }

    public int getSoKH() {
        return soKH;
    }

    public void setSoKH(int soKH) {
        this.soKH = soKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Khachhang(String hoTen, String soDT, String diaChi, String maKH, int namSinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.maKH = maKH;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return String.format("\n%-15s | %-15s | %-15s | %-10s | %-10s | %-10s",hoTen,soDT,diaChi,maKH,namSinh,gioiTinh);
    }
    public void NhapKH(){
        Scanner sc= new Scanner(System.in);
        while(true){
            try{
                System.out.println("Nhập tên khách hàng: ");
                hoTen = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextLine();
            }
        }
        while(true){
            try{
                System.out.println("Nhập số điện thoại khách hàng: ");
                soDT = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextLine();
            }
        }
        while(true){
            try{
                System.out.println("Nhập địa chỉ khách hàng: ");
                diaChi = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextLine();
            }
        }
        while(true){
            try{
                System.out.println("Nhập mã khách hàng: ");
                maKH = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextLine();
            }
        }
        while(true){
            try{
                System.out.println("Nhập năm sinh khách hàng: ");
                namSinh = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextInt();
            }
        }
        while(true){
            try{
                int chon =0;
                System.out.println("Nhập giới tính khách hàng: 1:Nam| 2:Nữ ");
                chon = sc.nextInt();
                if(chon == 1){
                    gioiTinh = "Nam";
                }else
                    gioiTinh="Nu";
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextInt();
            }
        }
    }
}
