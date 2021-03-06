package experi.entity;

public class Doctor {

	private String doctor_id;
	private String doctor_name;
	private String password;
	private String doc_mobile;
	private String doc_phone;
	private String doc_QQ;
	
	private boolean work_Mon;
	private boolean work_Tue;
	private boolean work_Wed;
	private boolean work_Thu;
	private boolean work_Fri;
	private boolean work_Sat;
	private boolean work_Sun;
	
	public Doctor() {
		super();
	}
	public Doctor(String doctor_id, String doctor_name, String doc_mobile, String password, 
			boolean work_Mon, boolean work_Tue, boolean work_Wed, boolean work_Thu, boolean work_Fri, boolean work_Sat, boolean work_Sun) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.doc_mobile = doc_mobile;
		this.password = password;
		
		this.work_Mon = work_Mon;
		this.work_Tue = work_Tue;
		this.work_Wed = work_Wed;
		this.work_Thu = work_Thu;
		this.work_Fri = work_Fri;
		this.work_Sat = work_Sat;
		this.work_Sun = work_Sun;
	}
	public Doctor(String doctor_id, String doctor_name, String doc_mobile, String password,
			boolean work_Mon, boolean work_Tue, boolean work_Wed, boolean work_Thu, boolean work_Fri, boolean work_Sat, boolean work_Sun,
			String doc_phone, String doc_QQ) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.doc_mobile = doc_mobile;
		this.password = password;
		this.work_Mon = work_Mon;
		this.work_Tue = work_Tue;
		this.work_Wed = work_Wed;
		this.work_Thu = work_Thu;
		this.work_Fri = work_Fri;
		this.work_Sat = work_Sat;
		this.work_Sun = work_Sun;
		this.doc_phone = doc_phone;
		this.doc_QQ = doc_QQ;
	}
	
	public String getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDoctor_mobile() {
		return doc_mobile;
	}
	public void setMobile(String doc_mobile) {
		this.doc_mobile = doc_mobile;
	}
	
	public String workOnMon() {
		if (work_Mon) {
			return "Monday ";
		}
		else {
			return "";
		}
	}
	public boolean getWorkOnMon() {
		return work_Mon;
	}
	public void setWorkOnMon(boolean work_Mon) {
		this.work_Mon = work_Mon;
	}
	public String workOnTue() {
		if (work_Tue) {
			return "Tuesday ";
		}
		else {
			return "";
		}
	}
	public boolean getWorkOnTue() {
		return work_Tue;
	}
	public void setWorkOnTue(boolean work_Tue) {
		this.work_Tue = work_Tue;
	}
	public String workOnWed() {
		if (work_Wed) {
			return "Wednesday ";
		}
		else {
			return "";
		}
	}
	public boolean getWorkOnWed() {
		return work_Wed;
	}
	public void setWorkOnWed(boolean work_Wed) {
		this.work_Wed = work_Wed;
	}
	public String workOnThu() {
		if (work_Thu) {
			return "Thursday ";
		}
		else {
			return "";
		}
	}
	public boolean getWorkOnThu() {
		return work_Thu;
	}
	public void setWorkOnThu(boolean work_Thu) {
		this.work_Thu = work_Thu;
	}
	public String workOnFri() {
		if (work_Fri) {
			return "Friday ";
		}
		else {
			return "";
		}
	}
	public boolean getWorkOnFri() {
		return work_Fri;
	}
	public void setWorkOnFri(boolean work_Fri) {
		this.work_Fri = work_Fri;
	}
	public String workOnSat() {
		if (work_Sat) {
			return "Saturday ";
		}
		else {
			return "";
		}
	}
	public boolean getWorkOnSat() {
		return work_Sat;
	}
	public void setWorkOnSat(boolean work_Sat) {
		this.work_Sat = work_Sat;
	}
	public String workOnSun() {
		if (work_Sun) {
			return "Sunday ";
		}
		else {
			return "";
		}
	}
	public boolean getWorkOnSun() {
		return work_Sun;
	}
	public void setWorkOnSun(boolean work_Sun) {
		this.work_Sun = work_Sun;
	}
	
	public String getWorkTime() {
		return (workOnMon() + workOnTue() + workOnWed() + workOnThu() + workOnFri() + workOnSat() + workOnSun());
	}
	
	public String getDoc_phone() {
		return doc_phone;
	}
	public void setDoc_phone(String doc_phone) {
		this.doc_phone = doc_phone;
	}
	public String getDoc_QQ() {
		return doc_QQ;
	}
	public void setDoc_QQ(String doc_QQ) {
		this.doc_QQ = doc_QQ;
	}
}
