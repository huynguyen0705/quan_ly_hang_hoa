public class HangHoa {
    private String MaHang;
    private String TenHang;
    private int SoLuongTonKho;
    public String getMaHang(){
        return MaHang;
    }
    public void setMaHang(String inputMaHang){
        MaHang = inputMaHang;
    }
    public String getTenHang(){
        return TenHang;
    }
    public void setTenHang(String inputTenHang){
        TenHang = inputTenHang;
    }
    public int getSoLuongTonKho(){
        return SoLuongTonKho;
    }
    public void setSoLuongTonKho(int inputSoLuongTonKho){
        SoLuongTonKho = inputSoLuongTonKho;
    }
    public HangHoa(){

    }
    public HangHoa(String maHang, String tenHang, int soLuongTonKho ){
        MaHang = maHang;
        TenHang = tenHang;
        SoLuongTonKho = soLuongTonKho;
    }
    public void HienThi(){
        System.out.println("Ma hang: " + MaHang + "Ten hang: " + TenHang + "So luong ton kho " + SoLuongTonKho);
    }
}
