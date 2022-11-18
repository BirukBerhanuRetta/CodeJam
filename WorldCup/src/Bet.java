public class Bet {
    private int aAmoutToWin;
    private int aTeam;
    private int result;
    private Player aPlayer;

    public Bet(int pAmountToWin, int pTeam, Player pPlayer){
        aAmoutToWin =pAmountToWin;
        aTeam = pTeam;
        aPlayer = pPlayer;
    }

    public void set_result(int pResult){
        result = pResult;
        updatePlayer();
    }

    private void updatePlayer(){
        if(result == aTeam){
            aPlayer.addCoins(aAmoutToWin);
        }
    }

}
