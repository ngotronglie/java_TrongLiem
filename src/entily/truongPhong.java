
package entily;

public class truongPhong extends nhanVien{
    private Double trachNhiem;

    public truongPhong() {
    }

    public truongPhong( String maNV, String hoTen, Double luong,Double trachNhiem) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
    

    
    
    @Override
    public Double getThuNhap(){
        return super.getLuong()+this.trachNhiem;
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("trach nhiem: "+this.trachNhiem);
    }

    public void setTrachNhiem(Double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public Double getTrachNhiem() {
        return trachNhiem;
    }
}
