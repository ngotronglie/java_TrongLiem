/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entily;

/**
 *
 * @author ngotr
 */
public class nhanVien {
    private String maNV;
    private String hoTen;
    private Double luong;

    public nhanVien() {
    }

    public nhanVien(String maNV, String hoTen, Double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    
    
    public Double getThuNhap(){
        return this.luong;
    } 

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }
    
    public Double getThueThuNhap(){
        if(this.getThuNhap()< 9000000){
            return 0.0;
        }else if(this.getThuNhap()< 15000000){
            return this.getThuNhap() * 0.1;
        }else{
            return this.getThuNhap() * 0.12;
        }
    }
    public void xuat(){
        System.out.println("ma nhan vien: "+this.maNV);
        System.out.println("ten nhan vien: "+this.hoTen);
        System.out.printf("thu nhap: %.0f\n",this.getThuNhap());
        System.out.printf("thue thu nhap: %.0f\n",this.getThueThuNhap());
        System.out.printf("luong nhan vien: %.0f\n",this.luong);
    }
}
