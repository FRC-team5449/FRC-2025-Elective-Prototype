package lab1;

public class Scoreboard {
  private String team1Name;
  private String team2Name;

  private int team1Score = 0;
  private int team2Score = 0;

  private static int matches = 0;

  private boolean isTeam1Active = true;

  public Scoreboard(String team1Name, String team2Name) {
    this.team1Name = team1Name;
    this.team2Name = team2Name;
  }

  public int getMatches() {
    return matches;
  }

  public void recordPlay(int scores) {
    matches++;
    if(scores == 0) {
      isTeam1Active = !isTeam1Active;
    }

    if(isTeam1Active) {
      team1Score += scores;
    }
    else {
      team2Score += scores;
    }
  }

  public String getScore() {
    String currentActiveTeam = isTeam1Active ? team1Name : team2Name;
    return String.valueOf(team1Score) + "-" + String.valueOf(team2Score) + "-" + currentActiveTeam;
  }

}