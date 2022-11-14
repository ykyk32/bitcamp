package class_;

public class MemberDTO {
	private String name, phone, adress;
	private int age;
	
	public void setData(String name, int age, String phone, String adress) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAdress() {
		return adress;
	}
}//한 사람당 정보 입력, 폐쇄적인 정보