
public class ShowData{

	Sedie s;

	ShowData(Sedie s){
		this.s=s;	
	}
	
	public void show(int size) {

			for(int i=0;i<size;i++) {
				
				System.out.print("Sedia numero "+ i+" :");
				
				if(s.getSedia(i)) {
					System.out.println("Occupata");
				}else {
					System.out.println("Libera");
				}
				
				
			}

		
		

	}
	
}
