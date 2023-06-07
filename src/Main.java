import java.util.concurrent.Semaphore;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		/**
		 * Variabili 
		 * 
		 */
		int id=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserire il numero di sedie: ");
		int sedie=scanner.nextInt();
		
		System.out.println("Inserire il numero di persone: ");
		int persone=scanner.nextInt();
		
		
		System.out.println("tempo massimo di arrivo cliente: ");
		int randMax = scanner.nextInt();
		
		System.out.println("Tempo massimo della durata del lavoro di un artista:");
		int randMaxAr=scanner.nextInt();
		
		System.out.println("Il tempo in cui un cliente aspetterà in coda prima di andarsene: ");
		int tpazienza=scanner.nextInt();
		/**
		 * Istanza per conservare i dati
		 */
		Sedie dati = new Sedie(sedie);
		
		/**
		 * Classe utilizzata per visualizzare i dati conteneti all'interno di sedie
		 */
		ShowData sd= new ShowData(dati);
		
		/**
		 * Semaforo a conteggio 
		 */
		Semaphore smf = new Semaphore(sedie);
		
		/**
		 * Vettore di persone che proveranno ad accedere al thread
		 */
		Persona p[] = new Persona[persone];
			
		
		for(int i=0;i<persone;i++) {
			System.out.println();
			
			
			/**
			 * Viene istanziata una classe persona del vettore
			 */
			p[i]= new Persona(dati,smf,id,randMaxAr,tpazienza);
			id++;
			
			/**
			 * Viene avviato il thread della classe appena istanziata
			 */
			p[i].start();
			
			
			/**
			 * Tempo di arrivo random di un cliente
			 */
			int rand= (int) (Math.random()*	randMax);
			System.out.println("Nuovo cliente");
			
			try {
				Thread.sleep(rand);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			/**
			 * Visualizzazione a schermo dello stato attuale dei dati
			 */
			sd.show(sedie);		
		}
		
		
	}

}
