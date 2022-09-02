package Behavioral.Memento;

public class Game {

    private String location;

    public void setLocation(String location) {
        this.location = location;
        System.out.println("Set location to " + location + " from originator");
    }

    public Memento saveCheckpoint() {
        System.out.println("Saving state from originator");
        return new Memento(location);
    }

    public void restoreStateMemento(Memento memento){
        location = memento.getSavedState();
        System.out.println("Restoring state to " + location + " from memento");
    }

    public static class Memento {
        private final String savedState;

        public Memento(String savedState) {
            this.savedState = savedState;
        }

        private String getSavedState() {
            return savedState;
        }
    }


}
