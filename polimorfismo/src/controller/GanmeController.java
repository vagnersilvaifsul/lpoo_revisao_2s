package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GanmeController {
    public static void main(String[] args) {
        Aviao a1 = new Aviao();
        Aviao a2 = new Aviao(5, 5);
        Navio n1 = new Navio();
        Tanque t1 = new Tanque();
        Submarino sub1 = new Submarino();

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(a1);
        personagens.add(n1);
        personagens.add(t1);
        personagens.add(sub1);
        personagens.forEach(p -> {
            p.desenhar();
            p.mover(8,8);
            if(p instanceof Aviao){
                ((Aviao) p).mover(2,2, 2);
            } else if (p instanceof Tanque) {
                p.mover(4,4);
            }

            System.out.println(p);
        });
    }
}
