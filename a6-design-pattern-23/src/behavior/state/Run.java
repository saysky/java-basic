package behavior.state;

import behavior.state.vote.StateManager;

public class Run {

    public static void main(String[] args) {
        StateManager vm = new StateManager();
        for (int i = 0; i < 9; i++) {
            vm.vote("u1", "A");
        }
    }

}
