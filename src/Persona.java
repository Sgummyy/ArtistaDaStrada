import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
public class Persona extends Thread {
	
	Sedie s;
	Semaphore sf;
	int id;
	int randMax;
	int tpazienza;
	Persona(Sedie s, Semaphore sf,int id,int tempoMax,int tp){
		this.s=s;
		this.sf=sf;
		this.id=id;
		randMax=tempoMax;
		tpazienza=tp;
	}
	
	
	public void run() {
		int rand=0;
		boolean acquiredWithTimeout = true;

		try {
			acquiredWithTimeout =sf.tryAcquire(tpazienza, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
			

		
		if(acquiredWithTimeout) {
			
			
			s.PrendiSedia();
		
			rand = (int) (Math.random()*randMax);
		
		
			try {
			
				//Tempo di lavoro
				Thread.sleep(rand);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				s.RilasciaSedia();
				sf.release();	
		}else {
			
			System.out.println("<<Il cliente "+id+" ha abbandonato la coda>>");
		}
	}
	
}
