class Num extends Thread{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}
public class runnable_interface_with_anonyms {

	public static void main(String[] args) {
		Runnable book = () ->{
			for(int i = 1;i<=5;i++) {
				System.out.println("Mango Db");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
						
					e.printStackTrace();
				}
			}
			
			
		};
		Num num = new Num();
		
		Thread t1 = new Thread(book);
		
		//book.UpdateDB();
		//num.Print();
		t1.start();
		num.start();
		
		//System.out.println("End of the program");
	}

}