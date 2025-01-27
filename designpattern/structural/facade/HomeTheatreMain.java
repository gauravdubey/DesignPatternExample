package com.gaurav.designpattern.structural.facade;

public class HomeTheatreMain {

    public static void main(String[] args) {
        System.out.println("\n Facade Design Pattern :");
        System.out.println();
    // Sub system Components
        DVDClass dvdPlayer = new DVDClass();
        Amplifier amplifier = new Amplifier();
        Lights lights = new Lights();
        Projector projector = new Projector();

        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(dvdPlayer,amplifier,lights,projector);
        homeTheatreFacade.watchMovie("Avengers");
        System.out.println();
        homeTheatreFacade.enMovie();
    }
}
