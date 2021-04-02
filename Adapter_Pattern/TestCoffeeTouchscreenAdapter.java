public class TestCoffeeTouchscreenAdapter {

    public static void main(String[] args) {
        OldCoffeeMachine machine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter coffeeTouchscreenAdapter = new CoffeeTouchscreenAdapter(machine);
        coffeeTouchscreenAdapter.chooseFirstSelection(); // Prints "Making coffee A"
        coffeeTouchscreenAdapter.chooseSecondSelection(); // Prints "Making coffee B"
    }

}
