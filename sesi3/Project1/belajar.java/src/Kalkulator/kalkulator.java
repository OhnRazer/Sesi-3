package Kalkulator;

public class kalkulator {
    public static void main(String[] args){
        Data isi = new Data();
        isi.setX(100);
        isi.setY(50);
       
        System.out.println("Kalkulator Mini : \n\n");
        System.out.println("100 + 50 = "+ (isi.getX() + isi.getY()));
        System.out.println("100 - 50 = "+ (isi.getX() - isi.getY()));
        System.out.println("100 * 50 = "+ (isi.getX() * isi.getY()));
        System.out.println("100 / 50 = "+ (isi.getX() / isi.getY()));
     }
    
}
