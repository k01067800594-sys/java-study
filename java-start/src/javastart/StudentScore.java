package javastart;

import java.util.Scanner;

class StudentP {
	String name;
	int score;

	StudentP(String name, int score) {
		this.name = name;
		this.score = score;
	}// StudentP
}// class

public class StudentScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력:");
		int cnt = sc.nextInt();
		sc.nextLine();
		// 학생수만큼 배열 생성
		StudentP[] stu = new StudentP[cnt];
		// 반복문을 통해서 배열 요소 객채 생성
		// 값을 키보드로부터 입력받음
		for (int i = 0; i < stu.length; i++) {
			System.out.println((i + 1) + "번째 학생 입력:");
			String name = sc.nextLine();
			System.out.println((i + 1) + "번째 학생 점수 입력:");
			int score = sc.nextInt();
			sc.nextLine();
			stu[i] = new StudentP(name, score);
		} // for
			// 이름 검색
		while (true) {
			System.out.println("이름 검색:");
			String sname = sc.nextLine();

			if (sname.equals("그만"))
				break;
			boolean k = false;
			for (int j = 0; j < stu.length; j++) {
				if (stu[j].name.equals(sname)) {
					System.out.println(sname + "의 점수:" + stu[j].score);
					k = true;
					break;	//for문 탈출
					//break는 가장 가까운 반복문을 탈출(1번)
				} // if
			} // for
			if (!k) { // boolean은 기본이 true->false이면 !(not)
				System.out.println("없는 이름입니다.");
			} // if
		} // while
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}// main
}// class
