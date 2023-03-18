
package QlnhanVien;

import entily.nhanVien;
import entily.tiepThi;
import entily.truongPhong;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QlnhanVien {
    public void nhapDS(ArrayList<nhanVien> arrNV) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("moi nhap ma nhan vien: ");
            String maNV = sc.nextLine();
            System.out.print("moi nhap ten nhan vien: ");
            String tenNV = sc.nextLine();
            System.out.print("moi nhap luong nhan vien: ");
            Double luongNV = Double.parseDouble(sc.nextLine());

            System.out.println("chuc vu:( 1: truong phong / 2: tiep thi): ");
            System.out.print("chon: ");
            int cv = Integer.parseInt(sc.nextLine());

            if (cv == 1) {
                System.out.print("tien trach nhiem: ");
                Double trachNhiem = Double.parseDouble(sc.nextLine());
                nhanVien nv = new truongPhong(maNV, tenNV, luongNV, trachNhiem);
                arrNV.add(nv);
            } else if(cv == 2){
                System.out.print("tien doanh so: ");
                Double doanhSo = Double.parseDouble(sc.nextLine());
                System.out.print("tien hue hong: ");
                Double hueHong = Double.parseDouble(sc.nextLine());
                nhanVien nv = new tiepThi(maNV, tenNV, luongNV, doanhSo, hueHong);
                arrNV.add(nv);
            }else{
                System.out.println("nhap khong dung,moi nhap lai!");
            }

            System.out.println("co nhap tiep khong? (C/K): ");
        } while (!sc.nextLine().equalsIgnoreCase("k"));
    }
    //2
    //2

    public void xuatDS(ArrayList<nhanVien> arrNV) {
        for (nhanVien nv : arrNV) {
            nv.xuat();
            System.out.println("------------------");
        }
    }
//3

    public void search(ArrayList<nhanVien> arrNV) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ma nhan vien can tim: ");
        String maNV = sc.nextLine();
        boolean kt = false;
        for (nhanVien nv : arrNV) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                System.out.println("\t=> da tim thay nhan vien nay");
                kt = true;
                nv.xuat();

            }
        }
        if (!kt) {
            System.out.println("\t=> khong tim thay ma nhan vien nay");
        }
    }
//4

    public void remove(ArrayList<nhanVien> arrNV) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\t- ma nhan vien can xoa: ");
        String maNV = sc.nextLine();
        boolean kt = false;
        for (nhanVien nv : arrNV) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                arrNV.remove(nv);
                System.out.println("\t=> da xoa nhan vien nay");
                kt = true;
                break;
            }
        }
        if (!kt) {
            System.out.println("\t=> khong tim thay ma nhan vien nay");
        }
    }
//5

    public void sua(ArrayList<nhanVien> arrNV) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ma nhan vien can cap nhat: ");
        String maNV = sc.nextLine();
        boolean timThay = false;
        for (nhanVien nv : arrNV) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                timThay = true;
                System.out.println("\tcap nhat thong tin nhan vien ((Enter de bo qua)):");
                System.out.print("cap nhat ma moi: ");
                String maNV_N = sc.nextLine();
                if (!maNV_N.equalsIgnoreCase("")) {

                    nv.setMaNV(maNV_N);
                }

                System.out.print("cap nhat ten moi: ");
                String ten_N = sc.nextLine();
                if (!maNV_N.equalsIgnoreCase("")) {

                    nv.setHoTen(ten_N);
                }

                System.out.print("cap nhat luong: ");
                String luong_N = sc.nextLine();
                if (!luong_N.equalsIgnoreCase("")) {

                    nv.setLuong(Double.parseDouble(luong_N));
                }

                if (nv instanceof truongPhong) {
                    System.out.print("luong trach nhiem: ");
                    String trachNhiem_N = sc.nextLine();
                    if (!trachNhiem_N.equalsIgnoreCase("")) {

                        ((truongPhong) nv).setTrachNhiem(Double.parseDouble(trachNhiem_N));
                    }
                } else if (nv instanceof tiepThi) {
                    System.out.print("cap nhat doanh so: ");
                    String doanhSo_N = sc.nextLine();
                    if (!doanhSo_N.equalsIgnoreCase("")) {

                        ((tiepThi) nv).setDoanhSo(Double.parseDouble(doanhSo_N));
                    }
                    System.out.print("cap nhat hue hong: ");
                    String hueHong_N = sc.nextLine();
                    if (!doanhSo_N.equalsIgnoreCase("")) {

                        ((tiepThi) nv).setHueHong(Double.parseDouble(hueHong_N));
                    }
                }

            }
        }
        if (!timThay) {
            System.out.println("\t=> khong tim thay nhan vien co ma nay");
        }

    }
//6

    public void MinMax(ArrayList<nhanVien> arrNV) {
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap khoang luong nho nhat: ");
        Double min = Double.parseDouble(sc.nextLine());
        System.out.print("moi nhap khoang luong lon nhat: ");
        Double max = Double.parseDouble(sc.nextLine());

        boolean tt = false;
        for (nhanVien nv : arrNV) {
            if (nv.getLuong() >= min && nv.getLuong() <= max) {
                tt = true;
                System.out.println("-------------------");
                nv.xuat();
            }
        }
        if (!tt) {
            System.out.println("khong tim thay nhan vien cos du dk nay");
        }
    }

    //7
    public void SXhoTen(ArrayList<nhanVien> arrNV) {
        Collections.sort(arrNV, (arg0, arg1) -> arg0.getHoTen().compareTo(arg1.getHoTen()));

        for (int i = 0; i < arrNV.size(); i++) {
            System.out.println("-----------------");
            arrNV.get(i).xuat();
        }
    }
//8
    public void SXthuNhap(ArrayList<nhanVien> arrNV) {
        Collections.sort(arrNV, (arg0, arg1) -> arg0.getThuNhap().compareTo(arg1.getThuNhap()));
        for (int i = 0; i < arrNV.size(); i++) {
            System.out.println("-----------------");
            arrNV.get(i).xuat();
        }
    }
//9
    public void _5thuNhap(ArrayList<nhanVien> arrNV) {
        Collections.sort(arrNV, (arg0, arg1) -> arg1.getThuNhap().compareTo(arg0.getThuNhap()));

        for (int i = 0; i < arrNV.size(); i++) {
            System.out.println("-----------------");
            arrNV.get(i).xuat();
        }
    }
}
