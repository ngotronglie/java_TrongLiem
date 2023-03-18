package menu;

import QlnhanVien.QlnhanVien;
import entily.nhanVien;
import entily.tiepThi;
import entily.truongPhong;
import java.util.ArrayList;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        ArrayList<nhanVien> arrNV = new ArrayList<>();
        QlnhanVien qlLopHoc = new QlnhanVien();
        Scanner scanner = new Scanner(System.in);
        int chucNang;
        do {
            System.out.println("=========================");
            System.out.println("1. nhap thong tin nhan vien");
            System.out.println("2. xuat thong tin nhan vien");
            System.out.println("3. tim va hien thi nhan vien theo ma nhap vao tu ban phim");
            System.out.println("4. xoa nhan vien theo ma");
            System.out.println("5.cap nhat thong tin nhan vien theo ma");
            System.out.println("6. tim nhan vien theo khoang luong nhap vao tu ban phim");
            System.out.println("7. sap xep nhan vien theo ho ten");
            System.out.println("8. sap xep nhan vien theo thu nhap");
            System.out.println("9.xuat 5 nhan vien co muc thu nhap cao nhat");
            System.out.println("0.thoat");
            System.out.println("--------------------------");
            System.out.print("moi chuc nang: ");
            chucNang = Integer.valueOf(scanner.nextLine());
            System.out.println("=========================");
            switch (chucNang) {
                case 1:
                    System.out.println("1. nhap thong tin nhan vien");
                    System.out.println("");
                    qlLopHoc.nhapDS(arrNV);
                    break;
                case 2:
                    System.out.println("2. xuat thong tin nhan vien");
                    System.out.println("");
                    
                    break;
                case 3:
                    System.out.println("3. tim va hien thi nhan vien theo ma nhap vao tu ban phim");
                    System.out.println("");
                    qlLopHoc.search(arrNV);
                    break;
                case 4:
                    System.out.println("4. xoa nhan vien theo ma");
                    System.out.println("");
                    qlLopHoc.remove(arrNV);
                    break;
                case 5:
                    System.out.println("5.cap nhat thong tin nhan vien theo ma");
                    System.out.println("");
                    qlLopHoc.sua(arrNV);
                    break;
                case 6:
                    System.out.println("6. tim nhan vien theo khoang luong nhap vao tu ban phim");
                    System.out.println("");
                    qlLopHoc.MinMax(arrNV);

                    break;
                case 7:
                    System.out.println("7. sap xep nhan vien theo ho ten");
                    System.out.println("");
                    qlLopHoc.SXhoTen(arrNV);
                    break;
                case 8:
                    System.out.println("8. sap xep nhan vien theo thu nhap");
                    System.out.println("");
                    qlLopHoc.SXthuNhap(arrNV);
                    break;
                case 9:
                    System.out.println("9.xuat 5 nhan vien co muc thu nhap cao nhat");
                    System.out.println("");
                    qlLopHoc._5thuNhap(arrNV);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\t=> chuc nang khong ton tai! moi nhap lai!!");
            }
        } while (chucNang != 0);
    }
//1

    

}
