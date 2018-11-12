package com.biz.method.m01;

public class Method05 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i ++) {
			//int intKor = (int) (Math.random() * (100-50 +1)) + 50;
			int intKor = makeGrade();
			//int intEng = (int) (Math.random() * (100-50 +1)) + 50;
			int intEng = makeGrade();
			// int intSum = intKor + intEng;
			int intMath = makeGrade();
			int intSci = makeGrade();
			int intHis = makeGrade();
			int intMus = makeGrade();
					
							
			int intSum = gradeSum(intKor, intEng);
			intSum += gradeSum(intMath, intSci);
			intSum += gradeSum(intHis, intMus);
			System.out.printf("국어: %d, 영어 %d 합계=%d \n",intKor,intEng,intSum);

		}
		
		
		

	}
	public static int makeGrade() {
		int intRND = (int) (Math.random() * (100-50 +1)) + 50;
		return intRND;
	}
	
	public static int gradeSum(int intKor, int intEng) {
		return intKor + intEng;
		
	}

}
