public class Card {
    private String valor, palo, color;
    public Card(String cValor, String cPalo, String cColor ){
        valor = cValor;
        palo = cPalo;
        color = cColor;
    }
    public String toString() {        
        return valor+" "+palo+"  "+color;
    }
}
