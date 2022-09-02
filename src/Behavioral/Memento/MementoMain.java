package Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class MementoMain {

    public static void main(String[] args) {
        List<Game.Memento> savedStates = new ArrayList<>();

        Game game = new Game();
        game.setLocation("Beirut");
        game.setLocation("New York");
        savedStates.add(game.saveCheckpoint());
        game.setLocation("Berlin");
        savedStates.add(game.saveCheckpoint());
        game.setLocation("Amsterdam");

        game.restoreStateMemento(savedStates.get(0));
        game.restoreStateMemento(savedStates.get(1));
    }
}
