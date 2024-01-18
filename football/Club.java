package football;

public class Club implements Comparable<Club> {
  private int position;
  private String club;
  private int played;
  private int won;
  private int drawn;
  private int lost;
  private int goalsFor;
  private int goalsAgainst;
  private int goalDifference;
  private int yellowCards;
  private int redCards;
  private int foulsCommitted;
  private int foulsSuffered;
  private int points;

  public Club(int position, String club, int played, int won, int drawn,
      int lost, int goalsFor, int goalsAgainst, int goalDifference,
      int yellowCards, int redCards, int foulsCommitted, int foulsSuffered,
      int points) {
    this.position = position;
    this.club = club;
    this.played = played;
    this.won = won;
    this.drawn = drawn;
    this.lost = lost;
    this.goalsFor = goalsFor;
    this.goalsAgainst = goalsAgainst;
    this.goalDifference = goalDifference;
    this.yellowCards = yellowCards;
    this.redCards = redCards;
    this.foulsCommitted = foulsCommitted;
    this.foulsSuffered = foulsSuffered;
    this.points = points;
  }

  public String toString() {
    return String.format("%-3d%-20s%10d%10d%10d%10d%10d%10d%10d%10d%10d%10d%10d%10d",
    position, club, played, won, drawn, lost, goalsFor,
    goalsAgainst, goalDifference, yellowCards, redCards,
    foulsCommitted, foulsSuffered, points);
}


  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public String getClub() {
    return club;
  }

  public void setClub(String club) {
    this.club = club;
  }

  public int getPlayed() {
    return played;
  }

  public void setPlayed(int played) {
    this.played = played;
  }

  public int getWon() {
    return won;
  }

  public void setWon(int won) {
    this.won = won;
  }

  public int getDrawn() {
    return drawn;
  }

  public void setDrawn(int drawn) {
    this.drawn = drawn;
  }

  public int getLost() {
    return lost;
  }

  public void setLost(int lost) {
    this.lost = lost;
  }

  public int getGoalsFor() {
    return goalsFor;
  }

  public void setGoalsFor(int goalsFor) {
    this.goalsFor = goalsFor;
  }

  public int getGoalsAgainst() {
    return goalsAgainst;
  }

  public void setGoalsAgainst(int goalsAgainst) {
    this.goalsAgainst = goalsAgainst;
  }

  public int getGoalDifference() {
    return goalDifference;
  }

  public void setGoalDifference(int goalDifference) {
    this.goalDifference = goalDifference;
  }

  public int getYellowCards() {
    return yellowCards;
  }

  public void setYellowCards(int yellowCards) {
    this.yellowCards = yellowCards;
  }

  public int getRedCards() {
    return redCards;
  }

  public void setRedCards(int redCards) {
    this.redCards = redCards;
  }

  public int getFoulsCommitted() {
    return foulsCommitted;
  }

  public void setFoulsCommitted(int foulsCommitted) {
    this.foulsCommitted = foulsCommitted;
  }

  public int getFoulsSuffered() {
    return foulsSuffered;
  }

  public void setFoulsSuffered(int foulsSuffered) {
    this.foulsSuffered = foulsSuffered;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }
  
  @Override
  public int compareTo(Club c) {
    return Integer.compare(goalsFor, c.goalsFor);
  }
}
