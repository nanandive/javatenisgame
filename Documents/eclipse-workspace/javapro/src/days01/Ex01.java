package days01;

/**
 * @author kenik
 * @date  2023. 1. 26. - 오후 3:56:51
 * @subject   (4)변수와 상수
 * @content   변수 선언 형식
 *                      상수 선언 형식 :  final 키워드 사용
 *                      (5) 리터럴
 *                      자료형 : 문자열 (String), 정수(int)
 *                      대입연산자  =                          name = "홍길동"
 *                      식별자 명명 규칙
 *                      등등
 *                      (6) 선언 형식
 *                           클래스, 함수, 변수, 상수 선언
 *                      (7) 키워드와 식별자 
 *                      (8) 식별자 명명하는 규칙.     
 */
public class Ex01 {

	public static void main(String[] args) {
		// 4:10 수업 시작~
		final String name;		 
		name = "이창익";
		System.out.println(   name );
		
		//name = "홍길동";
		//System.out.println(   name );
		
		/*
		String name;
		// 변수명   =  이름문자열 할당(대입)  대입연산자
		name = "이창익";
		System.out.println(   name );
		
		name = "홍길동";
		System.out.println(   name );
		*/
		//  멤버 연산자           .      .
		//  명령 종결 연산자    ; 세미콜론

	} // main

} // class

/*
 * 1.  시작 개체 = 클래스 + main(){}
 * 2. 클래스 선언 형식
 *     [접근지정자] [기타제어자] class 클래스명 {
 *     }
 *     - 클래스명은 반드시 첫 문자는 대문자로 시작한다. 
 *        ( 자바에서 첫 번째 문자가 대문자라 == 클래스 )
 *     - 클래스명 == 자바파일명   
 *        만약에 클래스명을 수정하고 싶을 때는 ~
 *         
 * 3. 함수(메서드) 선언 형식
 *     [접근지정자] [기타제어자] 리턴자료형 함수명( [매개변수...]){
 *        //
 *        //
 *        [return 리턴값;]
 *        return [리턴값];
 *     }
 *  4. [키워드]와 [식별자]
 *      ㄱ. 키워드( keyword )     : 의미가 부여되어져 있는  예약어
 *      ㄴ. 식별자( identifier )   : 개발자가 부여한 이름
 *                     변수명, 클래스명, 패키지명, 매개변수명....
 *   
 *  p 26         
 *    [ 식별자(변수,클래스명, 패키지명 등등)를 명명하는 규칙 ] 
 *    - 반드시 숫자가 아닌 문자로 시작해야 된다. ( 한글도 가능 )  
 *    - 공백을 포함할 수 없다.      
 *        예)   days_01,      Ex_01
 *    - 대소문자 구분한다.       name          Name        NAME
 *    - 특수 기호는 $와  _ 만 허용한다.     
 *    - 예약어를 식별자로 사용할 수 없다. 
 *    - 소문자로 시작하고 새로운 단어가 결합되면 첫 글자를 대문자로 변경한다.
 *    
 *   5. 변수와 상수
 *      1) 변수( variable ) :   저장공간, 변하는 수
 *         [  4바이트 ]
 *              나이                25         초기화
 *                                     20
 *                                     30
 *           [자료형 ? ]                          
 *           [ 자바 변수를 선언 형식 ]
 *           자료형 변수이름;  
 *           // (가정) 이름을 저장할 변수 선언
 *           // 홍길동
 *           // 자바는 한 문자   '홍'   'A'
 *           // 자바는 문자열 == 문자의 나열     "이창익"    
 *           // 자바에서 문자열을 나타내는 자료형 ? String ( 암기 )
 *           
 *           // (가정) 나이를 저장할 변수 선언  25살 33살  정수
 *           // 자바에서 정수를 나타내는 대표적인 자료형 ? int
 *           int     age;     // 4바이트 + 정수
 *           String        name;
 *                                     
 *      2) 상수( constant ) : 저장공간, 고정된 수
 *       [  4바이트 ]
 *              나이                25         초기화
 *                                      X
 *        const 상수 X
 *        final 예약어
 *    3) 리터럴( literal)                                        p25
 *        3.14
 *        'A'
 *        true , false
 *     
 *      5:10 수업시작~  
 * */










