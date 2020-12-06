package saulotdr;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class ApplicationTest {

    public void testMain() {
        assertThat(1).isEqualTo(1);
    }
}
