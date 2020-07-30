import java.util.ArrayList;

public class CongTy {
	protected DSNVNhanVien dsCongTy;
	
	public DSNVNhanVien getDsCongTy() {
		return dsCongTy;
	}

	public void setDsCongTy(DSNVNhanVien dsCongTy) {
		this.dsCongTy = dsCongTy;
	}

	public CongTy() {
		this.dsCongTy = new DSNVNhanVien(); 
	}
	
	public void nhap() {
		NhanVien nv = new NhanVien(1,"Thoa", "29-07-95", "punke",2.5f, 3000); 
		this.dsCongTy.them(nv);
		
		nv = new NhanVien(2,"Trúc", "14-03-97", "kushihankatu",3.5f, 3000); 
		this.dsCongTy.them(nv);
		
		nv = new NhanVien(3,"Tâm", "22-05-2002", "Helsinginste",4.5f, 3000); 
		this.dsCongTy.them(nv);
		
		nv = new NhanVien(4,"Phúc", "27-05-2008", "Antopellon",5.5f, 3000); 
		this.dsCongTy.them(nv);
		
		nv = new NhanVien(5,"Huy", "27-08-2014", "Fellmani",5.5f, 3000); 
		this.dsCongTy.them(nv);
		
		nv = new NhanVien(6,"Phát", "16-02-1994", "Orange Town",6.6f, 3000); 
		this.dsCongTy.them(nv);
		
		nv = new NhanVien(7,"Lộc", "03-07-1991", "Washington DC",6.6f, 3000); 
		this.dsCongTy.them(nv);
	}
	public void xuat() {
		this.dsCongTy.xuat();
	}
	public void tinhLuong() {
		this.dsCongTy.tinhLuong();
	}
	public void them(NhanVien nv) {
		this.dsCongTy.them(nv);
	}
	public ArrayList<NhanVien> nvLuongCaoNhat(){
		return this.dsCongTy.nvLuongCaoNhat(); 
	}
}
