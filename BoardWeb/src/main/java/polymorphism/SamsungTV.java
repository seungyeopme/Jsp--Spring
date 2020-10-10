package polymorphism;

public class SamsungTV implements TV{
	
	//private SonySpeaker speaker;
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성됨");
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성됨");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성됨");
		this.speaker = speaker;
		this.price = price;
	}
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다. (가격 : " + price + ")");
	}
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
	/*
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}*/
	/*
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}
	*/
	/*
	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
	*/
	/*
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리..");
	}
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리...");
	}
	*/
	/*
	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}
	*/
	/*
	public void volumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("SamsungTV---소리 내린다.");
	}
	*/
}