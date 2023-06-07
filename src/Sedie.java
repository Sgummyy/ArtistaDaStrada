
public class Sedie {
	
	boolean sedie[];
	
	Sedie(int size){
		
		sedie= new boolean[size];
		for(int i=0;i<size;i++) {
			sedie[i]=false;
		}
	}
	
	
	boolean getSedia(int index){
		return sedie[index];
	}
	
	
	void PrendiSedia() {

		
		for(int i=0;i<sedie.length;i++) {
			
			if(sedie[i]==false) {
				
				sedie[i]=true;
				
				return;
	
			}
			
		}

		
	}
	
	void RilasciaSedia() {
		
		for(int i=0;i<sedie.length;i++) {
			
			if(sedie[i]==true) {
				sedie[i]=false;
				return;
			}
			
		}
		

		
	}
	
	
	
}
