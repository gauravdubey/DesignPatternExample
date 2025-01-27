package com.gaurav.designpattern.structural.facade;

public class HomeTheatreFacade {

    private  DVDClass dvdPlayer;
    private  Amplifier amplifier;
    private  Lights lights;
    private  Projector projector;

    public HomeTheatreFacade(DVDClass dvdPlayer, Amplifier amplifier, Lights lights, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.lights = lights;
        this.projector = projector;
    }

    public void watchMovie(String movie){
        System.out.println("Get Ready to watch movie : "+movie);
        lights.dim(30);
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void enMovie(){
        System.out.println("Shutting down the movie");
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        lights.dim(100);
    }
}
