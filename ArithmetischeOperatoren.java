public class ArithmetischeOperatoren {

    /**
     * Ausführung aller arithmetischer Operationen und Ausgaben
     * @param args
     */
    public static void main(String[] args) {
        int Variablea = 2;
        int Variableb = 3;

        int ergebnisaddition = Variablea + Variableb;
        int ergebnissubtraktion = Variablea - Variableb;
        int ergebnismultiplikation = Variablea * Variableb;
        double ergebnisdivision = (double) Variablea / (double) Variableb;
        int ergebnismodolo = Variablea % Variableb;

        System.out.println("additon: " +ergebnisaddition);
        System.out.println("division: " +ergebnisdivision);
        System.out.println("modolo: " +ergebnismodolo);
        System.out.println("multiplikation: " +ergebnismultiplikation);
        System.out.println("subtraktion: " +ergebnissubtraktion);
        int a = 4;
        int b = 2;



        System.out.println("a++");
        System.out.println(a++);
        System.out.println(a);

        // bei a++ wird variable erst danach um 1 erhöht

        System.out.println("++b");
        System.out.println(++b);
        System.out.println(b);






    }
}
