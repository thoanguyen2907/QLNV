import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CongTy dsnv = new CongTy();
		dsnv.nhap();
		dsnv.tinhLuong();
		doMenu(dsnv);
		
	}

	public static void inMenu() {
		System.out.println("Vui lòng chọn: ");
		System.out.println("1. Xuất Danh Sách Nhân Viên");
		System.out.println("2. Thêm Nhân Viên");
		System.out.println("3. Xuất NV có lương cao nhất");
	}

	public static void doMenu(CongTy dsnv) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:		
				dsnv.xuat();
				break;
			case 2:
				NhanVien nv = new NhanVien();
				nv.nhap();
				dsnv.them(nv);
				break;
			case 3:
				ArrayList<NhanVien> listMax =  dsnv.nvLuongCaoNhat(); 
				for (NhanVien nv1: listMax) {
					nv1.xuat();
				}
				break;
			}
		} while (flag);
	}
}
