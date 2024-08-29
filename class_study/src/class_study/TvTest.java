package class_study;

class TV{
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void chnnelDown() {
		--channel;
	}
}
public class TvTest {
	public static void main(String[] args) {
		TV t;
		t= new TV();
		t.channel = 10;
		t.chnnelDown();
		t.channelUp();
		t.channelUp();
		
		System.out.println("현재 채널은 " + t.channel + " 입니다.");	
	}
}
