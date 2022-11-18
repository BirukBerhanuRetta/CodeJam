import java.util.ArrayList;

public class Player {
    private Game aGame;
    private String Username;
    private String Password;
    private int aCoins;
    private ArrayList<Player> friends;

    /**
     * @param pUsername takes in username
     * @param pPassword takes in pPassword
     * @pre neither params will be null
     */
    public Player(String pUsername, String pPassword, Game pGame) {
        assert (pUsername != null && pPassword != null);
        aCoins=500;
        Username = pUsername;
        Password = pPassword;
        friends = new ArrayList<>();
        aGame = pGame;
    }

    public void AddFriend(String username) {
        for(Player player : aGame.aPlayers){
            if(player.getUsername().equals(username)){
                friends.add(player);
            }
        }

    }

    public void CreateBetHomeTeam(Match match, int amount) {
        int odds = match.getHomeOdds();
        int value_to_win = odds * amount;
        aCoins -= amount;
        Bet bet = new Bet(value_to_win,-1,this);
        match.addBet(bet);
    }

    public void CreateBetAwayTeam(Match match, int amount) {
        int odds = match.getAwayOdds();
        int value_to_win = odds * amount;
        aCoins -= amount;
        Bet bet = new Bet(value_to_win,1,this);
        match.addBet(bet);

    }

    public void CreateBetDraw(Match match, int amount) {
        int odds = match.getTieOdds();
        int value_to_win = odds * amount;
        aCoins -= amount;
        Bet bet = new Bet(value_to_win,0,this);
        match.addBet(bet);

    }
    public String getUsername(){
        return Username;
    }
    public String getPassword(){
        return Password;
    }

    public int getCoins(){
        return aCoins;
    }
    public void addCoins(int add){
        aCoins+=add;
    }

}