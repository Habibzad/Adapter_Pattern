package adapterPattern;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    public OldCoffeeMachine theMachine;

    public static void main(String[] arg) {

        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter newCoffeeMachine = new CoffeeTouchscreenAdapter(oldCoffeeMachine);
        newCoffeeMachine.chooseFirstSelection();
        newCoffeeMachine.chooseSecondSelection();
    }

    public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
        this.theMachine = newMachine;
    }

    public void chooseFirstSelection() {
        theMachine.selectA();
    }

    public void chooseSecondSelection() {
        theMachine.selectB();
    }
}