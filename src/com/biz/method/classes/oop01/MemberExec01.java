package com.biz.method.classes.oop01;

/*
 * 지금 내가 있는 곳은 classes.oop01 패키지 인데
 * classes.vo 패키지에있는 MemberVO 클래스를
 * 사용하고 싶다. 라는선언
 * Ctrl + Shift + 0 : 자동 import
 */
import com.biz.method.classes.vo.MemberVO;

public class MemberExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO member = new MemberVO();
		member.strId = "001";
		member.strName = "홍길동";
		member.setStrTel("001-001-001");
		member.setIntAge(-1);

	}

}
