import java.util.Stack;

public class prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Stack<Integer> stack = new Stack<Integer>();

	    stack.push(null);
	    //number of primes to display
	    final int NUMBER_OF_PRIMES = 50;
	    //number of primes to display per line
	    final int NUMBER_OF_PRIMES_PER_LINE = 10;
	    //count number of primes
	    int count = 0;
	    int number = 2;

	    System.out.println("The first 50 primes are \n");

	    while(count < NUMBER_OF_PRIMES){
	        boolean isPrime = true;

	    for(int divisor = 2; divisor <= number/2; divisor++){
	        if(number % divisor == 0){
	            isPrime = false;
	            break;
	        }
	    }
	    if(isPrime){
	        count++;

	        if(count % NUMBER_OF_PRIMES_PER_LINE ==0){
	            System.out.println(number);

	        }
	        else
	            System.out.print(number + " ");

	    }
	    number++;
	    }
	}
}