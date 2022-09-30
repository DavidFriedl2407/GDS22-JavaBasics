public class Calculator {
    public static void main(String[] args) {
        int zahl1;
        int zahl2;
        zahl2 = 160;
        zahl1 = 1640;

        int ergebnisAdditon = zahl2+zahl1;
        String namedesRechners;
        namedesRechners = "David";
        System.out.println("Mein Name ist: "+namedesRechners+" " +ergebnisAdditon);

        int ergebnis2 = zahl1 + zahl2;
        //STRG + ALT + v = variable erzeugen

        // soutv setzt variabel dazu
        System.out.println("ergebnis2 = " + ergebnis2);

        int resultadd = (addition(4,6));
        System.out.println(resultadd);
        int resultsub = (subtraktion(4,6));
        System.out.println(resultsub);
        int resultmul = (multiplikation(4,6));
        System.out.println(resultmul);



        double resultdiv = (division(4,0));

        System.out.println(resultdiv);
        int resultrest = (restwert(4,6));
        System.out.println(resultrest);



    }
    public static int addition (int a, int b){
        int resultadd =a+b;
        return resultadd;}

        public static int subtraktion (int a, int b){
            int resultsub =a-b;
            return resultsub;}

            public static int multiplikation (int a, int b){
                int resultmul =a*b;
                return resultmul;}


                public static double division (int a, double b){
        if (b==0)
            System.out.println("Durch 0 kann nicht dividiert werden");
                    return 0;
                    //double resultdiv = a/b;
                   // return resultdiv;


    }


                    public static int restwert (int a, int b){
                        int resultrest =a%b;
                        return resultrest;
    }

    public static int add(int input1, int input2){
        int result = input1 + input2;
        return result;

    }


}
