
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        NHLStatistics.searchByPlayer("Sydney Crosby");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
