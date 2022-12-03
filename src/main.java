import model.group;
import model.players;
import model.team;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ArrayList<players> playerList = new ArrayList<players>();
        players p1 = new players("Karim", 12, 31, 10);
        players p2 = new players("Olivier", 10, 40, 9);
        players p3 = new players("Hugo", 10, 36, 10);
        players p4 = new players("Messi", 10, 28, 9);
        players p5 = new players("De Paul", 10, 28, 9);
        players p6 = new players("Di Maria", 10, 28, 9);
        players p7 = new players("Neymar", 10, 28, 9);
        players p8 = new players("Thiago", 10, 28, 9);
        players p9 = new players("Dani", 10, 28, 9);
        players p10 = new players("Manuel", 10, 28, 9);
        players p11 = new players("Thomas", 10, 28, 9);
        players p12 = new players("Kevin", 10, 28, 9);

        ArrayList<players> franceplayers = new ArrayList<>();
        franceplayers.add(p1);
        franceplayers.add(p2);
        franceplayers.add(p3);

        ArrayList<players> argentinaplayers = new ArrayList<>();
        argentinaplayers.add(p4);
        argentinaplayers.add(p5);
        argentinaplayers.add(p6);

        ArrayList<players> brazilplayers = new ArrayList<>();
        brazilplayers.add(p7);
        brazilplayers.add(p8);
        brazilplayers.add(p9);

        ArrayList<players> germanyplayers = new ArrayList<>();
        germanyplayers.add(p10);
        germanyplayers.add(p11);
        germanyplayers.add(p12);


        team t1= new team(franceplayers,"France","dark blue","third");
        team t2= new team(argentinaplayers,"argentina","light blue","third");
        team t3= new team(brazilplayers,"brazil","yellow","third");
        team t4= new team(germanyplayers,"germany","white","third");



    }

}