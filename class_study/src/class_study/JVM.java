package class_study;

public class JVM {
	static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음.");
		secondMethod();
		System.out.println("firstMethod()이 종료되었음.");
	}
	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음.");
		System.out.println("secondMethod() 호출");
		System.out.println("secondMethod()이 시작되었음.");
	}
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args)이 종료되었음.");
	}
}

//JVM 메모리 구조
//JVM은 시스템으로부터 프로그램을 수행하는데 필요한 메모리를 할당받고,
//JVM은 이 메모리를 용도에 따라 여러 영역으로 나누어 관리

//https://steady-developer-hyemin.tistory.com/84 