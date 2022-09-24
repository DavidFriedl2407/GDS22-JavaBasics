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

        // für durchdividieren variable *1,0 möglich

    }
}
