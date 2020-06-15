package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {
 private String f;
private String c;

	/**
	 * le point d'entrée de cette application, dont le commentaire est à
	 * compléter
	 * 
	 * @param args
	 *            ...
	 */
public FahrenheitCelsius(String c , String f ){
      this.c=c;
      this.f=f;
   
    }
    	public static void main(String[] args) {
    	   
		// pour tous les paramètres de la ligne de commande
		for(int i= 0 ; i<= args.length;i++){
		    String f = args[i];
		    int fahrenheit=Integer.parseInt(f);
		    float celsius = fahrenheitEnCelsius(fahrenheit);
		    
		System.out.println(fahrenheit+ "\u00B0F -> " + celsius+ "\u00B0C"); // ligne,
																				// format
																				// imposés
		}	
		}
	
	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius**/
	/// public String input(){//
	    //String f = this.f;
	     //String c = this.c;//}
	 //public void convertir(){
	     //int f = Integer.ParseInt(String f);
	    // int c = Float.ParseFloat(String c);
	  //}
	
	public static float fahrenheitEnCelsius(int f) {
	    float resultat;
	    resultat=(float)(((f - 32)*5.0)/9.0);
	    resultat=(float)(((int)(resultat*10.0))/10.0);// on met(float) devant pour affirmer que la resultat est decimal en plus on met 5.0 et 9.0 car la division entre 2 entiers est un entier donc c pour affirmer que la devision peut doner un resultat decimal
	    
	 
	    
		return resultat;} // à compléter en remplaçant ce return 0.F par la fonction
					// de conversion
	}
	


