package fifagames;

import java.util.ArrayList;
import java.util.List;

public class Fifa {
  public final FifaManager eventsManager;
  private final List<Game> games;

  public Fifa() {
    this.eventsManager = new FifaManager();
    this.games = new ArrayList<>();
  }

  public void addGame(Game game) {
    games.add(game);
    System.out.println("FIFA: new game added (" + game + ")");
    eventsManager.notify(GameEvent.ADDED, game);
  }
}
