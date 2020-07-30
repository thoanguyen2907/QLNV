import java.util.ArrayList;

public class DSNVNhanVien {
	//1. attribute
	protected ArrayList <NhanVien> listNV; 
	//2. get set
	
	public ArrayList<NhanVien> getListSV() {
		return listNV;
	}

	public void setListSV(ArrayList<NhanVien> listSV) {
		this.listNV = listSV;
	}
	//3. constructor 
	public DSNVNhanVien() {
		// TODO Auto-generated constructor stub
		this.listNV  = new ArrayList<NhanVien>();
	}
	
	//4. input output 
	public void nhap() {
		for (NhanVien nv: this.listNV) {
			nv.nhap();
		}
	}
	public void xuat() {
		for (NhanVien nv: this.listNV) {
			nv.xuat();
		}
	}
	public void them(NhanVien nv) {
		this.listNV.add(nv);
	}
 	//5. business method 
	public void tinhLuong() {
		for (NhanVien nv: this.listNV) {
			nv.tinhLuong();
		}
	}
	public ArrayList<NhanVien> nvLuongCaoNhat(){
		ArrayList<NhanVien> listMax = new ArrayList<NhanVien>();
		NhanVien nvMax = this.listNV.get(0);
		int index = 0; 
		for (int i =0; i< this.listNV.size(); i++) {
			NhanVien nvCurrent = this.listNV.get(i); 
			if (nvMax.getLuong() < nvCurrent.getLuong()) {
				nvMax = nvCurrent; 
				index = i; 
			}
		}
		listMax.add(nvMax);
		for (int i = index + 1; i< this.listNV.size(); i++) {
			NhanVien nvCurrent = this.listNV.get(i); 
			if (nvMax.getLuong() ==  nvCurrent.getLuong()) {
				listMax.add(nvCurrent);
			}
		}
		return listMax;
	}
}
