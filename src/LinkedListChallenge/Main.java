package LinkedListChallenge;

import java.awt.desktop.AboutEvent;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // creating linked list of towns:
        LinkedList<Town> itinerary = new LinkedList<Town>();
        // adding towns:
        itinerary.add(new Town("Sydney",0));
        itinerary.add(new Town("Adelaide",1374));
        itinerary.add(new Town("Alice Springs",2771));
        itinerary.add(new Town("Brisbane",917));
        itinerary.add(new Town("Darwin",3972));
        itinerary.add(new Town("Melbourne",877));
        itinerary.add(new Town("Perth",3923));

        // sorting linked list by distance:
        itinerary.sort(new Comparator<Town>() {
            @Override
            public int compare(Town o1, Town o2) {
                return o1.getDistance() - o2.getDistance();
            }
        });

        // Interactive program:
        boolean loop = true;
        Scanner scan = new Scanner(System.in);
        String choice;
        // initialising iterator:
        var iterator = itinerary.listIterator();
        while(loop){
            System.out.println("Available actions: (select word or letter");
            System.out.println("(F)orward");
            System.out.println("(B)ackward");
            System.out.println("(L)ist Places");
            System.out.println("(M)enu");
            System.out.println("(Q)uit");

            choice = scan.nextLine();

            switch(choice){
                case "F":
                    if (iterator.hasNext()){
                        System.out.println("Moved forward from " + iterator.next());
                    }
                    else {
                        System.out.println("You're already at the furthest point!");
                    }
                    break;
                case "B":
                    if (iterator.hasPrevious()){
                        System.out.println("Moved backward from " + iterator.previous());
                    }
                    else{
                        System.out.println("You're already at Sydney!");
                    }
                    break;
                case "L":
                    System.out.println("Places List: ");
                    for (Town town : itinerary){
                        System.out.println(" - " + town);
                    }
                    break;
                case "Q":
                    loop = false;
                    break;
            }
        }
    }
}
