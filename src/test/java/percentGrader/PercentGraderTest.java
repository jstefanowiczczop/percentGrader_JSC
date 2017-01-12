package percentGrader;

import org.assertj.core.api.Assertions;
import org.junit.Test;


/**
 * Created by Jola on 2016-12-11.
 */
public class PercentGraderTest {

    @Test
    public void precent98() {

        PercentGrader p = new PercentGrader();
        Assertions.assertThat(p.checkX(98)).isEqualTo(6);
    }

    @Test
    public void precent83() {

        PercentGrader p = new PercentGrader();
        Assertions.assertThat(p.checkX(83)).isEqualTo(4);
    }

    @Test
    public void precent70() {

        PercentGrader p = new PercentGrader();
        Assertions.assertThat(p.checkX(70)).isEqualTo(3);
    }

    @Test
    public void precent50() {

        PercentGrader p = new PercentGrader();
        Assertions.assertThat(p.checkX(50)).isEqualTo(2);

    }

    @Test
    public void precent20() {

        PercentGrader p = new PercentGrader();
        Assertions.assertThat(p.checkX(20)).isEqualTo(1);
    }

@Test
    public void precent95() {

        PercentGrader p = new PercentGrader();
    Assertions.assertThat(p.checkX(93)).isEqualTo(5);

    }
}
