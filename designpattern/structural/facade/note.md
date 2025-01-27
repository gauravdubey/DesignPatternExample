# Facade Design Pattern
The Facade Design Pattern is a structural design pattern that provides a simplified interface to a complex subsystem. It hides the complexities of the subsystem and exposes a unified, easy-to-use interface to the client.

## Key Concepts
1. Facade: A class that provides a high-level interface to the subsystem.
2. Subsystem: A group of classes, methods, or components with complex interactions.
3. Client: Uses the facade instead of directly interacting with the subsystem.

## Advantages
- Simplifies the interface for the client.
- Promotes loose coupling by hiding the details of the subsystem.
- Reduces the learning curve for using a complex subsystem.

**Example in Java**<br/>
Imagine a Home Theater System with multiple components: a DVD player, an amplifier, a projector, and lights. Instead of the client managing each component individually, the Facade Pattern provides a single HomeTheaterFacade class to control the entire system.


**Step 1: Define Subsystem Components** <br/>
These classes represent individual components of the home theater system.

**DVD Player:**
``` java
class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON.");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void off() {
        System.out.println("DVD Player is OFF.");
    }
}


```
** Amplifier: **<br/>
``` java
class Amplifier {
    public void on() {
        System.out.println("Amplifier is ON.");
    }

    public void setVolume(int level) {
        System.out.println("Amplifier volume set to " + level);
    }

    public void off() {
        System.out.println("Amplifier is OFF.");
    }
}

```
**Projector:** </br>
``` java
class Projector {
    public void on() {
        System.out.println("Projector is ON.");
    }

    public void wideScreenMode() {
        System.out.println("Projector set to wide-screen mode.");
    }

    public void off() {
        System.out.println("Projector is OFF.");
    }
}

```
** Lights: **<br/>
``` java
class Lights {
    public void dim(int level) {
        System.out.println("Lights dimmed to " + level + "%.");
    }
}

```

**Step 2: Create the Facade** <br/>
The HomeTheaterFacade class provides a simplified interface to control the subsystems.
``` java
class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Amplifier amplifier;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Amplifier amplifier, Projector projector, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(30);
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        lights.dim(100);
    }
}

```
**Step 3: Use the Facade in the Client** <br/>
``` java
public class HomeTheaterTest {
    public static void main(String[] args) {
        // Subsystem components
        DVDPlayer dvdPlayer = new DVDPlayer();
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        Lights lights = new Lights();

        // Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, amplifier, projector, lights);

        // Client operations
        homeTheater.watchMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
    }
}

```
** Output ** <br/>
``` java

Get ready to watch a movie...
Lights dimmed to 30%.
Projector is ON.
Projector set to wide-screen mode.
Amplifier is ON.
Amplifier volume set to 5.
DVD Player is ON.
Playing movie: Inception

Shutting down the home theater...
DVD Player is OFF.
Amplifier is OFF.
Projector is OFF.
Lights dimmed to 100%.

```
## Key Takeaways
1. The Facade (HomeTheaterFacade) simplifies the client's interaction with the subsystem by providing methods like watchMovie() and endMovie().
2. The client doesn't need to know about the details of the individual components (DVDPlayer, Amplifier, etc.).
3. This pattern is ideal for reducing the complexity of interacting with multiple classes, making it easier to use and maintain the system.
