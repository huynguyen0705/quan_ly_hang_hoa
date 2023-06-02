import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KhoHang khoHang = new KhoHang();
        Scanner scanner = new Scanner(System.in);
        boolean chay = true;
        while (chay){
            System.out.println("Quan Ly Hang Hoa");
            System.out.println("1. Them 1 mat hang moi");
            System.out.println("2. Xoa 1 mat hang");
            System.out.println("3. Nhap Hang");
            System.out.println("4. Xuat Hang");
            System.out.println("5. Thong Ke");
            System.out.println("6. Thoat");

            System.out.print("Vui lòng nhập lựa chọn: ");
            int chon = scanner.nextInt();

            if (chon < 1 || chon > 6){
                System.out.println("ban chon sai moi chon lai");
            }

            switch (chon){
                case 1:
                    HangHoa hangHoa = new HangHoa();
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Moi ban nhap ma hang: ");
                    hangHoa.setMaHang(scanner1.next());
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Moi ban nhap ten hang: ");
                    hangHoa.setTenHang(scanner2.next());
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Moi ban nhap so luong hang: ");
                    hangHoa.setSoLuongTonKho(scanner3.nextInt());
                    khoHang.Them(hangHoa);
                    break;

                case 2:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Nhap ma hang can xoa: ");
                    String maHangXoa = scanner4.next();
                    khoHang.Xoa(maHangXoa);
                    break;

                case 3:
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("Nhap ma hang: ");
                    String maHangNhap = scanner5.next();
                    Scanner scanner6 = new Scanner(System.in);
                    System.out.println("Nhap so luong hang: ");
                    int soLuongNhap = scanner6.nextInt();
                    khoHang.Nhaphang(maHangNhap, soLuongNhap);
                    break;

                case 4:
                    Scanner scanner7 = new Scanner(System.in);
                    System.out.println("Nhap ma hang xuat: ");
                    String maHangXuat = scanner7.next();
                    Scanner scanner8 = new Scanner(System.in);
                    System.out.println("Nhap so luong hang xuat: ");
                    int soLuongXuat = scanner8.nextInt();
                    khoHang.Nhaphang(maHangXuat, soLuongXuat);
                    break;

                case 5:
                    System.out.println("1. Thong ke so luong hang ton kho lon hon 0");
                    System.out.println("2. Thong ke so luong hang ton kho bang 0");
                    System.out.println("3. Tim kiem");

                    int chon2 = scanner.nextInt();
                    if (chon2 <1 || chon2 >3){
                        System.out.println("chon khong hop le");
                        continue;
                    }
                    switch (chon2){
                        case 1:
                            System.out.println("Thong ke ton kho > 0: ");
                            khoHang.Thongkelonhon0();
                            break;

                        case 2:
                            System.out.println("Thong ke ton kho = 0: ");
                            khoHang.Thongkebang0();
                            break;

                        case 3:
                            System.out.println("Nhap ma hang: ");
                            String maHangTimKiem = scanner.next();
                            khoHang.Timkiem(maHangTimKiem);
                            break;
                    }
                break;
                case 6:
                    chay = false;
                    continue;
            }
        }
    }
}