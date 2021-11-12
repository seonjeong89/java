package chapter15;

public class MemberVO {
	String memId;
	String memName;
	String memReg;
	String memBir;
	String memZip;
	String memAdd;
	String memHomeTel;
	String memComTel;
	String memHp;
	String memMail;
	String memJob;
	String memLike;
	String memMemorial;
	String memMemorialday; 
	String memMileage;
	String memDelete;
	
	public MemberVO(String memId, String memName, String memMail) {
		this.memId = memId;
		this.memName = memName;
		this.memMail = memMail;
	}

	public MemberVO(String memId, String memName, String memReg, String memBir, String memZip, String memAdd,
			String memHomeTel, String memComTel, String memHp, String memMail, String memJob, String memLike,
			String memMemorial, String memMemorialday, String memMileage, String memDelete) {
		this.memId = memId;
		this.memName = memName;
		this.memReg = memReg;
		this.memBir = memBir;
		this.memZip = memZip;
		this.memAdd = memAdd;
		this.memHomeTel = memHomeTel;
		this.memComTel = memComTel;
		this.memHp = memHp;
		this.memMail = memMail;
		this.memJob = memJob;
		this.memLike = memLike;
		this.memMemorial = memMemorial;
		this.memMemorialday = memMemorialday;
		this.memMileage = memMileage;
		this.memDelete = memDelete;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemReg() {
		return memReg;
	}

	public void setMemReg(String memReg) {
		this.memReg = memReg;
	}

	public String getMemBir() {
		return memBir;
	}

	public void setMemBir(String memBir) {
		this.memBir = memBir;
	}

	public String getMemZip() {
		return memZip;
	}

	public void setMemZip(String memZip) {
		this.memZip = memZip;
	}

	public String getMemAdd() {
		return memAdd;
	}

	public void setMemAdd(String memAdd) {
		this.memAdd = memAdd;
	}

	public String getMemHomeTel() {
		return memHomeTel;
	}

	public void setMemHomeTel(String memHomeTel) {
		this.memHomeTel = memHomeTel;
	}

	public String getMemComTel() {
		return memComTel;
	}

	public void setMemComTel(String memComTel) {
		this.memComTel = memComTel;
	}

	public String getMemHp() {
		return memHp;
	}

	public void setMemHp(String memHp) {
		this.memHp = memHp;
	}

	public String getMemMail() {
		return memMail;
	}

	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}

	public String getMemJob() {
		return memJob;
	}

	public void setMemJob(String memJob) {
		this.memJob = memJob;
	}

	public String getMemLike() {
		return memLike;
	}

	public void setMemLike(String memLike) {
		this.memLike = memLike;
	}

	public String getMemMemorial() {
		return memMemorial;
	}

	public void setMemMemorial(String memMemorial) {
		this.memMemorial = memMemorial;
	}

	public String getMemMemorialday() {
		return memMemorialday;
	}

	public void setMemMemorialday(String memMemorialday) {
		this.memMemorialday = memMemorialday;
	}

	public String getMemMileage() {
		return memMileage;
	}

	public void setMemMileage(String memMileage) {
		this.memMileage = memMileage;
	}

	public String getMemDelete() {
		return memDelete;
	}

	public void setMemDelete(String memDelete) {
		this.memDelete = memDelete;
	}

	@Override
	public String toString() {
		return "MemberVO [memId=" + memId + ", memName=" + memName + ", memReg=" + memReg + ", memBir=" + memBir
				+ ", memZip=" + memZip + ", memAdd=" + memAdd + ", memHomeTel=" + memHomeTel + ", memComTel="
				+ memComTel + ", memHp=" + memHp + ", memMail=" + memMail + ", memJob=" + memJob + ", memLike="
				+ memLike + ", memMemorial=" + memMemorial + ", memMemorialday=" + memMemorialday + ", memMileage="
				+ memMileage + ", memDelete=" + memDelete + "]";
	}
	
}
