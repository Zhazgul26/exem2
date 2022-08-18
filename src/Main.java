import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Sheep sheep1 = new Sheep(15,  2,"male","Nike" ) ;
       Sheep sheep2 = new Sheep(26,7,"male","Ben " ) ;
       Sheep sheep3 = new Sheep(15,2,"male","Jak" ) ;
       Cow cow1 = new Cow(45,4, "female", "Ella");
        Cow cow2= new Cow(35,20, "female", "Diana");
        Cow cow3 = new Cow(45,4, "female", "Emma");
        Cow cow4 = new Cow(43,2, "female", "Anna");
        Cow cow5 = new Cow(45,4, "female", "Elsa");
       Horse horse1 = new Horse(80,3,"male","v","black");
        Horse horse2 = new Horse(90,3,"male","Dun","black");
        Sheep[]sheeps = {sheep3,sheep1,sheep2};
        Cow[]cows = {cow1,cow2,cow3,cow4,cow5};
        Horse[] horses = {horse1,horse2};

        Sheep[] sheep = {sheep3,sheep1,sheep2};
        Cow [] cow = {cow1,cow2,cow3,cow4,cow5};
        Horse[] horse = {horse1,horse2};
        Farm farm1 = new Farm("afsf", cows, sheeps, horses, "Jak");
        Farm farm2 = new Farm("skal",cow,sheep,horse,"Max");

       }

    }


