import java.util.ArrayList;

public class Game {
    ArrayList<Player> aPlayers;

    public Game(){
        aPlayers = new ArrayList<>();
    }

    public void add_Player(String username, String password){

        for(Player player : aPlayers){
            if(username.equals(player.getUsername())){
                return;
            }
        }

        Player add = new Player(username,password,this);
    }

}
