package class_;

//1인분
public class MemberDTO {
	private String name;
	private int age;
	private String phone;
	private String address;
	
	public MemberDTO(String name, int age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
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
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		
		return name + "\t"+ age +"\t"+ phone + "\t"+ address;
	}
}




//DTO- Data Transfer Object 데이터를 묶어놓은 객체/VO -Value Object /Bean -아무튼 3개 다 1인분