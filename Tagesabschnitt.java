public class Tagesabschnitt {

        /**
         * Retourniere Tagesabschnitt abhängig von der Uhrzeit
         * 6-9 (exkl.) -> Früh
         * 9-12 (exkl.) -> Vormittag
         * 12-16 (exkl.) -> Nachmittag
         * 16-20 (exkl.) -> Abend
         * 20-6 (exkl.) -> Nacht
         */
        public static void main(String[] args) {
            byte hour = 11;
            String abschnitt = "";
            System.out.println("abschnitt = " + abschnitt);
            abschnitt = getDayTimeName(hour);
        }


        // public static return_type (void) name (parameter)
    public static String getDayTimeName(byte time){
                String abschnitt = "";

                if (time<6 || time>=20){
                    abschnitt = "Nacht";
                } else if (time<9) {
                    abschnitt = "Früh";
                } else if (time<12) {
                    abschnitt = "Vormittag";
                }  else {
                    abschnitt = "Abend";
                }
                return abschnitt;

            }
            }





