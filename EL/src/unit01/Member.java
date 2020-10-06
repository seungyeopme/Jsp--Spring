package unit01;

public class Member {
	private String name;
	private String id;
	
	//기본생성자
	public Member(){
		
	}
	//생성자
	public Member(String name, String id) {
		this.name=name;
		this.id=id;
	}
	//문자열로 리턴받는 함수
	public String toString() {
		return name+","+id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
