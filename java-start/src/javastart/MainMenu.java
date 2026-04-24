//객체 배열과 switch문을 이용한 메뉴 선택 프로그램
//<조건>
//1. Menu 클래스를 작성하시오.
//2. Menu 클래스에는 다음을 포함하시오.
//1) 문자열 변수 order
//2) 생성자-매개변수 order 1개
//3) 메뉴 이름을 출력하는 메서드 printMenu()
//
//3. MainMenu 클래스(main 메서드) 에서 다음을 작성하시오.
//1) Menu 객체 배열 menuArr를 선언하고 크기는 3으로 한다.
//2) 배열에 다음 데이터를 저장하시오.
//                   1->"Coffee", 2->"Tea", 3->"Juice"
//3) Scanner를 이용하여 메뉴 번호를 입력받도록 하시오.
//4) 무한루프 반복문을 사용하여 계속 입력받도록 하시오.
//5) 입력값이 0이면 "프로그램 종료"를 출력하고 반복문을 종료하시오.
//6) switch문을 사용하여 다음과 같이 처리하시오.
//1 입력 → 배열의 첫 번째 객체의 printMenu() 호출
//2 입력 → 배열의 두 번째 객체의 printMenu() 호출
//3 입력 → 배열의 세 번째 객체의 printMenu() 호출
//1~3 이외의 값이 입력되면 "없는 메뉴입니다."를 출력하시오.
package javastart;

import java.util.Scanner;

//설계클래스
class Menu {
	String order;// 멤버변수(필드)

	Menu(String order) {  
    this.order = order; //생성자 실행
 }

	// 메서드
	void printMenu() {
		System.out.println("김재훈 카페 메뉴는: " + order);
	}
}

//실행 메서드
public class MainMenu {
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 객체 배열 생성 및 초기화

    // 첫번째 방법(배열 생성 후 배열 객체에 하나씩 저장)
    Menu[] menuArr = new Menu[3]; // Menu 객체를 3개 저장할 수 있는 배열을 만듬
    menuArr[0] = new Menu("Coffee"); // 생성자 호출
    menuArr[1] = new Menu("Tea");
    menuArr[2] = new Menu("Juice");

//       두번째 방법(한번에 초기화)
//       Menu[] menuArr = {
//          new Menu("Coffee"),
//          new Menu("Tea"),
//          new Menu("Juice")
//      };      

//        세번째 방법 (배열 생성-> 메뉴이름배열(데이터)->for문으로 자동 저장)
//        Menu[] menuArr = new Menu[3];
//        String[] names = {"Coffee", "Tea", "Juice"};
//        for(int i = 0; i < menuArr.length; i++) {
//           menuArr[i] = new Menu(names[i]);
//        }

    
    while(true)        {
       System.out.print("메뉴 번호 입력 (0 입력 시 종료): ");
       int num = sc.nextInt();

       if (num==0) {
          System.out.println("프로그램 종료");
          break;
     }

       switch (num) {
       case 1:
    	   menuArr[0].printMenu();
          break;
       case 2:
    	   menuArr[1].printMenu();
          break;
       case 3:
    	   menuArr[2].printMenu();

          break;
       default:
          System.out.println("없는 메뉴입니다.");
       }
    }

    sc.close();
 }
}