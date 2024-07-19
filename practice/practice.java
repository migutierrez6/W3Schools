package practice;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean hasHighIncome = true;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

		System.out.println("isElegible = " + isEligible );
		
		System.out.println(!hasCriminalRecord);
	}
	


}
