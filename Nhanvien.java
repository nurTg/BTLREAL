import java.util.Scanner;

public class Nhanvien {

        String hoTen,soDT,diaChi,maNV,gioiTinh,chucVu;
        int namSinh;
        int soNV,HSL;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Nhanvien(int soNV) {
        this.soNV = soNV;
    }

    public int getHSL() {
        return HSL;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setHSL(int HSL) {
        this.HSL = HSL;
    }




    public String toString() {
        return String.format("\n%-10s | %-10s | %-10s | %-10s | %-15s | %-15s | %-15s| %-10s",maNV,hoTen,soDT,diaChi,gioiTinh ,chucVu,namSinh,HSL);
    }

    public Nhanvien() {
            this.hoTen = hoTen;
            this.soDT = soDT;
            this.diaChi = diaChi;
            this.maNV = maNV;
            this.gioiTinh = gioiTinh;
            this.namSinh = namSinh;
            this.soNV = soNV;
        }

        public int getSoKH() {
            return soNV;
        }

        public void setSoKH(int soNV) {
            this.soNV = soNV;
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
            return maNV;
        }

        public void setMaKH(String maNV) {
            this.maNV = maNV;
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

    public int getSoNV() {
        return soNV;
    }

    public void setSoNV(int soNV) {
        this.soNV = soNV;
    }

    public Nhanvien(String hoTen, String soDT, String diaChi, String maNV, int namSinh, String gioiTinh) {
            this.hoTen = hoTen;
            this.soDT = soDT;
            this.diaChi = diaChi;
            this.maNV = maNV;
            this.namSinh = namSinh;
            this.gioiTinh = gioiTinh;
        }

    public void NhapNV(){
            Scanner sc= new Scanner(System.in);
            while(true){
                try{
                    System.out.println("Nhập tên nhân viên: ");
                    hoTen = sc.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Bạn hãy nhập lại! ");
                    sc.nextLine();
                }
            }
            while(true){
                try{
                    System.out.println("Nhập số điện thoại nhân viên: ");
                    soDT = sc.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Bạn hãy nhập lại! ");
                    sc.nextLine();
                }
            }
            while(true){
                try{
                    System.out.println("Nhập địa chỉ nhân viên: ");
                    diaChi = sc.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Bạn hãy nhập lại! ");
                    sc.nextLine();
                }
            }
            while(true){
                try{
                    System.out.println("Nhập mã nhân viên: ");
                    maNV = sc.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Bạn hãy nhập lại! ");
                    sc.nextLine();
                }
            }
            while(true){
                try{
                    System.out.println("Nhập năm sinh nhân viên: ");
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
                    System.out.println("Nhập giới tính nhân viên: 1:Nam| 2:Nữ ");
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
        while(true){
            try{
                System.out.println("Nhập hệ chức vụ nhân viên: ");
                sc.nextLine();
                chucVu = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextLine();
            }
        }
        while(true){
            try{
                System.out.println("Nhập hệ số lương nhân viên: ");
                HSL = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại! ");
                sc.nextInt();
            }
        }
        }
    }


