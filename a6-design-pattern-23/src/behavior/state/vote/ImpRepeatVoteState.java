package behavior.state.vote;

public class ImpRepeatVoteState implements InfVoteState {

    @Override
    public void vote(String user, String voteItem, StateManager voteManager) {
        //重复投票，暂时不做处理
        System.out.println("请不要重复投票");
    }

}
