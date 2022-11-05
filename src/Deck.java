import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    static ArrayList <Card> deckArr = new ArrayList<Card>();

    String[] palos = {"♠️", "♥️", "♦️", "♣️"};
    String[] valores = {"2", "3","4","5","6","7","8","9","10","J","Q","K","A"};
    String color = "";
    public Deck(){
        crearDeck();
    }
    public void crearDeck() {

        for(int i = 0; i < 52; i++){
            if(palos[i/13] == "♠️" || palos[i/13] == "♣️" ){
                color = "negro";
            }else{
                color = "rojo";
            }
            deckArr.add(new Card(valores[i%13], palos[i/13], color));
            
        }
    }

    public void display() {
        for (int i = 0; i < deckArr.size();i++) 
	      { 		      
	          System.out.println(deckArr.get(i).toString()); 		
	      }   
    }

    public void shuffle(Boolean dis) {
        System.out.println("Mezclando cartas...");
        Collections.shuffle(deckArr);
        if(dis == true){
            display();
        }
        
    }
    public void head(){
        shuffle(false);
        System.out.println("Carta Eliminada: "+deckArr.get(0).toString()); 
        deckArr.remove(0);
        System.out.println("Numero de Cartas restantes: "+deckArr.size()); 
    }
    public void pick() {
        shuffle(false);
        int min = 0;
        int max = 51;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Carta Eliminada: "+deckArr.get(random_int).toString()); 
        deckArr.remove(random_int);        
        System.out.println("Numero de Cartas restantes: "+deckArr.size()); 
    }
    public void hand() {
        shuffle(false);
        System.out.println("Tu mano es: "); 
        for( int i = 0; i < 5; i++){
            System.out.println(deckArr.get(i).toString()); 
            deckArr.remove(i);
        }
        System.out.println("Numero de Cartas restantes: "+deckArr.size()); 
    }

}
