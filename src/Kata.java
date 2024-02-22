public class Kata {
    public static String alphabetWar(String cadena) {
        int poderIzquierdo = 0;
        int poderDerecho = 0;

        for (char c : cadena.toCharArray()) {
            switch (c) {
                case 'w':
                    poderIzquierdo += 4;
                    break;
                case 'p':
                    poderIzquierdo += 3;
                    break;
                case 's':
                    poderIzquierdo += 1;
                    break;
                case 'm':
                    poderDerecho += 4;
                    break;
                case 'q':
                    poderDerecho += 3;
                    break;
                case 'z':
                    poderDerecho += 1;
                    break;
            }
        }

        if (poderIzquierdo > poderDerecho) {
            return "¡Gana el lado izquierdo!";
        } else if (poderIzquierdo < poderDerecho) {
            return "¡Gana el lado derecho!";
        } else {
            return "¡Luchemos de nuevo!";
        }
    }

    public static void main(String[] args) {
        System.out.println(alphabetWar("z")); //=> ¡Gana el lado derecho!
        System.out.println(alphabetWar("zdqmwpbs")); //=> ¡Luchemos de nuevo!
        System.out.println(alphabetWar("zzzzs")); //=> ¡Gana el lado derecho!
        System.out.println(alphabetWar("wwwwwwz")); //=> ¡Gana el lado izquierdo!
    }
}