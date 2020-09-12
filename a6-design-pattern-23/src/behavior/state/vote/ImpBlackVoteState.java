package behavior.state.vote;

public class ImpBlackVoteState implements InfVoteState {

    @Override
    public void vote(String user, String voteItem, StateManager voteManager) {
        //记录黑名单中，禁止登录系统
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }

}
