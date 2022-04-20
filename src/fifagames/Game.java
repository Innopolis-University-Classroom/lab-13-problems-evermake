package fifagames;

public class Game {
  String date;
  String place;
  String schedule;
  String ticket;

  public Game(String date, String place, String schedule, String ticket) {
    this.date = date;
    this.place = place;
    this.schedule = schedule;
    this.ticket = ticket;
  }

  @Override
  public String toString() {
    return "Game{" +
        "date='" + date + '\'' +
        ", place='" + place + '\'' +
        ", schedule='" + schedule + '\'' +
        ", ticket='" + ticket + '\'' +
        '}';
  }
}

