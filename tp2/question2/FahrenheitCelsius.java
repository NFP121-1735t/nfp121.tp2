package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
         for(int i = 0 ; i<=args.length;i++){
          String re= args[i];   
          try{
              int fahrenheit=Integer.parseInt(re);
              float celsius= fahrenheitEnCelsius(fahrenheit);
              System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
        
      
            }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
    } 
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
          float resultat;
	    resultat=(float)(((f - 32)*5.0)/9.0);
	    resultat=(float)(((int)(resultat*10.0))/10.0);// on met(float) devant pour affirmer que la resultat est decimal en plus on met 5.0 et 9.0 car la division entre 2 entiers est un entier donc c pour affirmer que la devision peut doner un resultat decimal
	    
	 
	    
		return resultat;
       // ...
         // � compl�ter  en rempla�ant la valeur retourn�e par la fonction de conversion
       // ...
     }
    }


