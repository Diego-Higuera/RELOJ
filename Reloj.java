import java.util.*;
public class Reloj {
    public static void main(String[]args){
        Date r = new Date();
        System.out.format("Hoy es %tA, dia %td de %tB. Son las %tr", r,r,r,r);
    }
}
