##Esercizio artista da strada.

il seguente codice è stato organizzato in 3 classi:
- Sedie
- Persona
- ShowData
- Main

##Sedie
La prima classe in questione a seguirsi contiene lo stato delle sedie, tiene quindi in considerazione se tutte le sedie risultano occupate o meno.

##Persona
La seconda classe è il fulcro della struttura del programma. Questo poiché contiene all'interno i semafori di tipo a conteggio e mutex. I mutex vengono utilizzati per mettere in coda i clienti che non sono riusciti ad occupare una sedia. Attraverso il metodo del semaforo "tryAcquire" viene permesso al thread di richiedere un posto all'interno del semaforo in continuazione per un periodo prestabilito di tempo (il tempo in cui un cliente in coda si stuferà di aspettare).
Il metodo restituisce un booleano che permetterà nel caso fosse true (il thread è riuscito ad accedere al semaforo prima che il tempo della "pazienza" scadesse) di entrare e occupare una sedia; nel caso di false comparirà sulla console un messaggio che dice che un cliente si è stufato di stare in coda.

##ShowData
La terza classe viene utilizzata semplicemente per visualizzare a schermo gli elementi contenuti all'interno della classe sedie.

##Main
La quarta classe, ovvero il main, richiede all'utente varie variabili necessarie per dare i tempi di attesa, di arrivo e pazienza dei clienti. Attraverso un ciclo for vengono istanziati e avviati i thread Persona.


