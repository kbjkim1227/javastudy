package gugudan;

public class Static_ex {
	public static void main(String[] args) { 

        Number number1 = new Number(); //첫번째 number 

        Number number2 = new Number(); //두번쨰 number 


        number1.num++; //클래스 필드 num을 1증가시킴(static) 

        number1.num2++; //인스턴스 필드 num을 1증가시킴 

        
        //두번째 number의 클래스 필드 출력 (static) //출력값 1 

        System.out.println(number2.num); 

       //두번째 number의 인스턴스 필드 출력 //출력값 0 

       System.out.println(number2.num2);

     } 

}

