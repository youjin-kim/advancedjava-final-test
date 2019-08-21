package prob1;

import java.util.Scanner;

public class Gugudan2 {
static int resultNumber = 0;
static final int COUNT_ANSWER_NUMBER = 9;
	
	public static void main( String[] args ) {
		int l = randomize( 1, 9 );
		int r = randomize( 1, 9 );
		int cnt = 0, end = 3;
		
		resultNumber = l * r;

		int[] answerNumbers = randomizeAnswers();
		int loc = randomize( 0, 8 );
		answerNumbers[ loc ] = resultNumber;
		
		System.out.println(">> " + end + "번의 기회가 주어집니다! 화이팅:-)");
		System.out.println();
		System.out.println( l + " x " + r + " = ?" );
		
		int length = answerNumbers.length;
		for( int i = 0; i < length; i++ ) {
			if( i % 3 == 0 ) {
				System.out.print( "\n" );
			} else {
				System.out.print( "\t" );
			}
			
			System.out.print( answerNumbers[ i ] );
		}

		System.out.print( "\n\n" );
		System.out.print( "answer:" );

		Scanner s = new Scanner( System.in );
		 
		
		while(cnt < end) {
			int userNum = s.nextInt();
			
			if (userNum == resultNumber) {
				System.out.print( "축하합니다! 정답입니다(-;" );
				break;
			}
			
			else if (cnt == end-1) {
				System.out.println();
				System.out.println(">>정답은 " + resultNumber + " 입니다! 다음 기회에....:-(");
				break;
			}
			
			else {
				System.out.print( "오답이에요 ㅠ.ㅜ" );
				System.out.print( "\n" );
				System.out.print( "answer:" );
			}
			cnt++;
		}
		
	
	}

	private static int randomize( int lNum, int rNum ) {
        int random = (int) ( Math.random() * rNum ) + lNum;
        return random;
	}
	
	private static int[] randomizeAnswers() {

		//final int COUNT_ANSWER_NUMBER = 9;
		final int MAX_ANSWER_NUMBER = 81;
		
		int[] boardNumbers = new int[ COUNT_ANSWER_NUMBER ];
		int occupied = 0;
		
		while( occupied < COUNT_ANSWER_NUMBER ) {
			
	        int random = ( int )( Math.random() * MAX_ANSWER_NUMBER ) + 1;
	        
	        boolean evaluted = false;
	        for( int i = 0; i < occupied; i++ ) {
	        	if( occupied > COUNT_ANSWER_NUMBER ) {
	        		evaluted = true;
	        		break;
	        	}
	        }
	        
	        if( !evaluted ) {
	        	boardNumbers[ occupied++ ] = random;
	        }
		}
		
        return boardNumbers;
	}	

}
