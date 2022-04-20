package fifagames;

public abstract class Fan implements Listener<GameEvent, Game> {
  private static Integer idCounter = 0;
  protected final Integer id;

  public Fan() {
    id = idCounter;
    idCounter++;
  }

  @Override
  public void onUpdate(GameEvent event, Game game) {
    if (event == GameEvent.ADDED) {
      System.out.println(
          "I am " + this + ". I received a notification about new game: " + game
      );
    }
  }
}
