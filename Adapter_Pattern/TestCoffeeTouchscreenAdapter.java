package adapterPattern;

public class TestCoffeeTouchscreenAdapter {

    public static void main(String[] args) {
        OldCoffeeMachine machine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter coffeeTouchscreenAdapter = new CoffeeTouchscreenAdapter(machine);
        coffeeTouchscreenAdapter.chooseFirstSelection(); // Prints "Making espresso"
        coffeeTouchscreenAdapter.chooseSecondSelection(); // Prints "Making latte"
    }

}
