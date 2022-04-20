package fifagames;

public interface Listener<E, C> {
  void onUpdate(E event, C context);
}
