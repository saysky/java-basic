package behavior.state.vote;

public class ImpNormalVoteState implements InfVoteState {

    @Override
    public void vote(String user, String voteItem, StateManager voteManager) {
        //正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }

}
