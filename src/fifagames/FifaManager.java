package fifagames;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FifaManager {
  private final Map<GameEvent, Set<Listener<GameEvent, Game>>> listenersMap;

  public FifaManager() {
    this.listenersMap = new HashMap<>();
    for (GameEvent event : GameEvent.values()) {
      listenersMap.put(event, new HashSet<>());
    }
  }

  public void subscribe(GameEvent event, Listener<GameEvent, Game> listener) {
    listenersMap.get(event).add(listener);
  }

  public void notify(GameEvent event, Game game) {
    for (Listener<GameEvent, Game> listener : listenersMap.get(event)) {
      listener.onUpdate(event, game);
    }
  }
}
