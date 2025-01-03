package chapter02;

// 캡슐화: 인스턴스 필드와 메소드를 하나로 묶어서 필드에 대한 조작을 메서드를 통해서만 하도록 하는 것
// 정보 은닉과 데이터 보호, 데이터 무결성을 보장할 수 있음

// Entity: 데이터베이스의 레코드를 관리하는 객체
// (생성자와 Getter만 유지)
// DTO(Data Transfer Object): 데이터 전송을 위한 객체
// 불변성: 생성자와 Getter만 유지 / 가변성: 생성자와 Getter, Setter 모두 유지
// VO(Value Object): 값을 표현하는 객체
// (생성자와 Getter만 유지, Object 클래스의 equals() 메소드를 오버라이딩 해서 사용)

class Player{
	private String name;
	private String team;
	private String birth;
	private int number;

	Player(String name, String team, String birth, int number) {
		super();
		this.name = name;
		this.team = team;
		this.birth = birth;
		this.number = number < 0 ? 0 : number;
	}

//	getter 메소드: private 필드의 값을 반환하 메소드
//	setter 메소드: private 필드의 값을 변경하는 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getBirth() {
		return birth;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number < 0 ? 0 : number;	
	}
}

class King{
	private String ho;
	private String name;
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public King(String ho, String name) {
		super();
		this.ho = ho;
		this.name = name;
	}
}

public class G_Encapsulation {
	public static void main(String[] args) {
		Player player1 = new Player("이성계", "조선", "1335-11-04", 1);	
		System.out.println(player1.getName());
	}
}