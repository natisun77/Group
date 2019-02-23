package firsthomework;
//1.1
public class Match {
    public Match() {
    }

    public int makeBet(int scoreTeam1, int scoreTeam2, int betTeam1, int betTeam2) {
        int result;
        result = (scoreTeam1 == betTeam1 && scoreTeam2 == betTeam2) ? (2) : (((scoreTeam1 > scoreTeam2 && betTeam1 > betTeam2) ||
                (scoreTeam1 < scoreTeam2 && betTeam1 < betTeam2)) ? (1) : (0));
        return result;
    }

    public static void main(String[] arg) {
        Match myMatch = new Match();
        System.out.println(myMatch.makeBet(1, 2, 5, 4));

    }
}
