package percentGrader;

import org.assertj.core.api.Assertions;
import org.junit.Test;


/**
 * Created by Jola on 2016-12-11.
 */
public class PercentGraderTest {

    @Test
    public void percent98() {
        PercentGrader p = new PercentGrader();
        Assertions.assertThat(p.checkGrade(98)).isEqualTo(6);
    }

    @Test
    public void percent83() {
        PercentGrader p = new PercentGrader();
        Assertions.assertThat(p.checkGrade(83)).isEqualTo(4);
    }

    @Test
    public void percent70() {
        PercentGrader p = new PercentGrader();
        Assertions.assertThat(p.checkGrade(70)).isEqualTo(3);
    }

    @Test
    public void percent50() {
        PercentGrader p = new PercentGrader();
        Assertions.assertThat(p.checkGrade(50)).isEqualTo(2);

    }

    @Test
    public void percent20() {
        PercentGrader p = new PercentGrader();
        Assertions.assertThat(p.checkGrade(20)).isEqualTo(1);
    }

    @Test
    public void percent95() {
        PercentGrader p = new PercentGrader();
        Assertions.assertThat(p.checkGrade(93)).isEqualTo(5);
    }
}
