package aula_3;


public class Exemplo_4 {

	public static void main(String[] args) {
		double num01=2, num02=1, total;
		String op="0";
		
		if(op.equals("+")) {
			total = num01 + num02;
			System.out.println("Total:"+total);
		}else if(op.equals("-")) {
			total = num01-num02;
			System.out.println("Total:"+total);
		}else if(op.equals("*")) {
			total = num01*num02;
			System.out.println("Total"+total);
		}else if(op.equals("/")) {
			total = num01/num02;
			System.out.println("Total:"+total);
		}else if(op.equals("Raiz")) {
			total = Math.sqrt(num01);
			System.out.println("Total:"+total);
		}

	}

}
