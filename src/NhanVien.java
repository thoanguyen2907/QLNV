import java.util.Scanner;

/*
 * Mục đích:tạo lớp nhân Viên để quản lý 
 * 
 * */
public class NhanVien {
//1. attributes 
	protected int maNhanVien; 
	protected String hoTen; 
	protected String ngaySinh; 
	protected String diaChi; 
	protected float luong; 
	protected float heSoLuong;
	protected float luongCoBan;
//2. get & set 
	
public int getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public float getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public float getLuong() {
		return luong;
	}

	//3. constructor 
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

	public NhanVien(int maNhanVien, String hoTen, String ngaySinh, String diaChi) {
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	
	public NhanVien(int maNhanVien, String hoTen, String ngaySinh, String diaChi,
			float heSoLuong,float luongCoBan ) {
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.heSoLuong = heSoLuong; 
		this.luongCoBan = luongCoBan; 
	}
	
//4. input output 
	public void nhap() {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Vui lòng nhập mã Nhân Viên: ");
		this.maNhanVien = Integer.parseInt(scan.nextLine()); 
		
		System.out.println("Vui lòng nhập họ tên  Nhân Viên: ");
		this.hoTen  = scan.nextLine(); 
		
		System.out.println("Vui lòng nhập ngày sinh Nhân Viên: ");
		this.ngaySinh  =  scan.nextLine(); 
		
		System.out.println("Vui lòng nhập địa chỉ Nhân Viên: ");
		this.diaChi  = scan.nextLine();
	
		System.out.println("Vui lòng nhập hệ số lương Nhân Viên: ");
		this.heSoLuong  = Float.parseFloat(scan.nextLine());
		
		System.out.println("Vui lòng nhập lương cơ bản Nhân Viên: ");
		this.luongCoBan  = Float.parseFloat(scan.nextLine()); 
	}
	public void xuat() {
		System.out.println("Mã nhân Viên: " + this.maNhanVien +
				"\t Họ tên: " + this.hoTen + 
				"\t Ngày Sinh: " + this.ngaySinh + 
				" \t Địa Chỉ: " + this.diaChi + 
				" \t Lương: " + this.luong);
	}
//5. business method 
	public void tinhLuong() {
	this.luong = this.heSoLuong * this.luongCoBan; 	 
	}
}
