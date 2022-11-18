import java.util.ArrayList;

public class Match {
    private String HomeTeam;
    private String AwayTeam;
    private int HomeOdds;
    private int AwayOdds;
    private int TieOdds;
    private ArrayList<Bet> aBets;
    private int result;

    public Match(String pHome, String pAway, int pHomeOdds, int pAwayOdds, int pTieOdds){
        HomeTeam = pHome;
        AwayTeam = pAway;
        HomeOdds = pHomeOdds;
        AwayOdds =pAwayOdds;
        TieOdds = pTieOdds;
        aBets = new ArrayList<>();
    }

    public int getAwayOdds(){
        return AwayOdds;
    }


    public int getHomeOdds(){
        return HomeOdds;
    }

    public int getTieOdds(){
        return TieOdds;
    }

    public void addBet(Bet bet){
        aBets.add(bet);
    }
    public void set_result(int res){
        result = res;
        update_bets();
    }
    private void update_bets(){
        for(Bet bet : aBets){
            bet.set_result(result);
        }
    }


}
