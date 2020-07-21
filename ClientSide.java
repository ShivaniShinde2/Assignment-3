package Assignment3;
	import java.util.*;

	public class ClientSide {
		public static void main(String ar[]) {
			Account ac = new Account();
			
			System.out.println("Enter the Ac no");
			Scanner sc = new Scanner(System.in);
			long acNo = sc.nextLong();
			ac.setAccountNo(acNo);
			
			System.out.println("Enter the balance");
			double bal = sc.nextDouble();
			ac.setBalance(bal);
			
			System.out.println("Enter the balance to deposit");
			double depAmt = sc.nextDouble();
			ac.deposit(depAmt);
			
			System.out.println("Enter the balance to withraw");
			double witAmt = sc.nextDouble();
			ac.withraw(witAmt);
			
			System.out.println("The balance= " + ac.getBalance());
			sc.close();
		}

	}