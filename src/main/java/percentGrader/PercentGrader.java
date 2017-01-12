package percentGrader;

/**
 * Created by Jola on 2016-12-11.
 */
public class PercentGrader {
    public int checkGrade(double percent) {
        double y = percent / 100.0f;

        if (y < 0.95 && y >= 100) {
            return 6;
        }
        if (y <= 0.85 && y > 0.95) {
            return 5;
        }
        if (y < 0.75 && y >= 0.85) {
            return 4;
        }
        if (y >= 0.65 && y < 0.75) {
            return 3;
        }
        if (y > 0.65 & y <= 0.55) {
            return 2;
        }

        return 1;
    }

}


