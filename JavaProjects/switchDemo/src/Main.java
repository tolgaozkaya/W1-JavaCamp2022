public class Main {
    public static void main(String[] args) {

        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println(" Mukemmel : Geçtiniz ");
                break;
            case 'B':
                System.out.println(" Çok Guzel : Geçtiniz ");
                break;
            case 'C':
                System.out.println(" Iyi : Geçtiniz ");
                break;
            case 'D':
                System.out.println(" Fena Degil : Geçtiniz ");
                break;
            case 'F':
                System.out.println(" Maalesef Kaldınız ");
                break;
            default:
                System.out.println(" Geçersiz not girdiniz ");
        }
    }
}
