package mission;

class Sum {
	
	private int odd = 0;
	private int even = 0;
	private int total = 0;
	
	public int getOdd() {
		return odd;
	}

	public void setOdd(int odd) {
		this.odd = odd;
	}

	public int getEven() {
		return even;
	}

	public void setEven(int even) {
		this.even = even;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public static Sum Calculate(int maxCount) {
		
		Sum s = new Sum();
		int num = 0;
		
		for(int i=0; i<maxCount; i++) {
			num = i + 1;
			if(num % 2 == 0) {
				// 짝수
				s.even += num;
			} else {
				// 홀수
				s.odd += num;
			}
			
			s.total += num;
		}
		
		return s;

	}

}

public class SumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum s = Sum.Calculate(1000);
		
		System.out.println("even = " + s.getEven());
		System.out.println("odd = " + s.getOdd());
		System.out.println("total = " + s.getTotal());

	}

}
