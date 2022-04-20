package fifagames;

public class Main {
  public static void main(String[] args) {
    Fifa fifa = new Fifa();

    fifa.addGame(new Game(
        "30-01-2022",
        "Moscow",
        "TBA",
        "XXX"
    ));

    RealMadridFan fan1 = new RealMadridFan();
    RealMadridFan fan2 = new RealMadridFan();
    RealMadridFan fan3 = new RealMadridFan();
    BarcelonaFan fan4 = new BarcelonaFan();

    fifa.eventsManager.subscribe(GameEvent.ADDED, fan1);
    fifa.eventsManager.subscribe(GameEvent.ADDED, fan4);

    fifa.addGame(new Game(
        "01-06-2025",
        "Sydney",
        "TBA",
        "YYY"
    ));

    fifa.eventsManager.subscribe(GameEvent.ADDED, fan2);
    fifa.eventsManager.subscribe(GameEvent.ADDED, fan3);

    fifa.addGame(new Game(
        "16-06-2016",
        "New York",
        "TBA",
        "NY"
    ));
  }
}
