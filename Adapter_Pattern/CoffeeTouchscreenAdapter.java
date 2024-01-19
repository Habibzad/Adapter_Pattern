package adapterPattern;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private final OldCoffeeMachine oldCoffeeMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine machine) {
        oldCoffeeMachine = machine;
    }

    @Override
    public void chooseFirstSelection() {
        oldCoffeeMachine.makeEspresso();
    }

    @Override
    public void chooseSecondSelection() {
        oldCoffeeMachine.makeLatte();
    }
}