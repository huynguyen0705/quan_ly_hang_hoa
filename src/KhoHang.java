public class KhoHang {
    public HangHoa[] danhsachhanghoa;
    public int soluonghanghoa;
    public KhoHang(){
        soluonghanghoa = 0;
        danhsachhanghoa = new HangHoa[5];
    }

    public void Them(HangHoa hangHoa) {
        if (hangHoa == null){
            return;
        }

        for (int i = 0; i < danhsachhanghoa.length; i++){
            if (danhsachhanghoa[i] == null){
                danhsachhanghoa[i] = hangHoa;
                break;
            }
        }
        System.out.println("them mat hang " + hangHoa.getMaHang() + "thanh cong");
        soluonghanghoa++;
        if (soluonghanghoa == 5){
            System.out.println("so luong hang hoa trong kho da dat gioi han la 5");
            return;
        }
        if (hangHoa.getSoLuongTonKho() > 10){
            System.out.println("so luong ton kho toi da la 10");
            return;
        }
    }

    public void Xoa(String maHang){
        for (int i = 0; i < danhsachhanghoa.length; i++){
            if (danhsachhanghoa[i] != null && danhsachhanghoa[i].getMaHang().equals(maHang)){
                danhsachhanghoa[i] = null;
                break;
            }
            System.out.println("xoa mat hang thanh cong");
            soluonghanghoa--;
        }
    }

    public void Nhaphang(String maHang, int soLuong){
        for (int i = 0; i < danhsachhanghoa.length; i++) {
            if (danhsachhanghoa[i] != null) {
                if (danhsachhanghoa[i].getMaHang().equals(maHang)) {
                    danhsachhanghoa[i].setSoLuongTonKho(danhsachhanghoa[i].getSoLuongTonKho() + soLuong);
                    break;
                }
            }
        }
        System.out.println("nhap hang thanh cong");
    }

    public void Xuathang(String maHang, int soLuong){
        for (int i = 0; i < danhsachhanghoa.length; i++) {
            if (danhsachhanghoa[i] != null) {
                if (danhsachhanghoa[i].getMaHang().equals(maHang)) {
                    danhsachhanghoa[i].setSoLuongTonKho(danhsachhanghoa[i].getSoLuongTonKho() - soLuong);
                    break;
                }
            }
        }
        System.out.println("Xuat hang thanh cong");
    }

    public void Thongkelonhon0(){
        for (int i = 0; i < danhsachhanghoa.length; i++){
            if (danhsachhanghoa[i] != null && danhsachhanghoa[i].getSoLuongTonKho() > 0){
                    danhsachhanghoa[i].HienThi();
            }
        }
    }

    public void Thongkebang0(){
        for (int i = 0; i < danhsachhanghoa.length; i++){
            if (danhsachhanghoa[i] != null && danhsachhanghoa[i].getSoLuongTonKho() == 0){
                danhsachhanghoa[i].HienThi();
            }
        }
    }

    public void Timkiem(String maHang) {
        for (int i = 0; i < danhsachhanghoa.length; i ++){
            if (danhsachhanghoa[i] != null && danhsachhanghoa[i].getMaHang().equals(maHang)){
                danhsachhanghoa[i].HienThi();
                break;
            }
        }
    }
}
