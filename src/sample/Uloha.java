package sample;

public class Uloha {

    public static void main(String[] args) {

       // vypisPismeno("skola",3);
        samohlasky("skolaeee");
    }


    public static void vypisPismeno(String s, int i){

s.length();

        System.out.println();

    }

    public static void samohlasky(String s){

        int pocet = 0;

        for (int i =0; i<s.length();i++){
            char ch = s.toLowerCase().charAt(i);

            switch (ch){
                case 'a':
                    pocet++;break;
                case 'e':
                    pocet++;break;
                case 'i':
                    pocet++;break;
                case 'o':
                    pocet++;break;
                case 'u':
                    pocet++;break;
            }


        }

        System.out.println(pocet);
    }
}
