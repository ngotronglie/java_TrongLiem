/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entily;

/**
 *
 * @author ngotr
 */
public class tiepThi extends nhanVien{
    private Double doanhSo;
    private Double hueHong;

    public tiepThi() {
    }

    public tiepThi(Double doanhSo, Double hueHong) {
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public tiepThi(String maNV, String hoTen, Double luong,Double doanhSo, Double hueHong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public Double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(Double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public Double getHueHong() {
        return hueHong;
    }

    public void setHueHong(Double hueHong) {
        this.hueHong = hueHong;
    }
    
    
    
    @Override
    public Double getThuNhap(){  
        return super.getLuong()+this.doanhSo+this.hueHong;
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("doanh so: %.0f\n",this.doanhSo);
        System.out.printf("hue hong: %.0f\n",this.hueHong);
    }
    
}




