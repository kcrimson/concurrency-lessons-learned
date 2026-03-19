package concurrency;

import org.openjdk.jcstress.annotations.Actor;
import org.openjdk.jcstress.annotations.Expect;
import org.openjdk.jcstress.annotations.JCStressTest;
import org.openjdk.jcstress.annotations.Outcome;
import org.openjdk.jcstress.annotations.Outcome.Outcomes;
import org.openjdk.jcstress.annotations.State;
import org.openjdk.jcstress.infra.results.II_Result;

@JCStressTest
@Outcomes(
        {
                @Outcome(id = "1, 1", expect = Expect.ACCEPTABLE, desc = "Both writes visible"),
                @Outcome(id = "0, 0", expect = Expect.ACCEPTABLE, desc = "Neither write visible"),
                @Outcome(id = "1, 0", expect = Expect.ACCEPTABLE, desc = "Only x visible"),
                @Outcome(id = "0, 1", expect = Expect.ACCEPTABLE_INTERESTING, desc = "Only y visible - reordering!")
        }
)
@State
public class VisibilityTest {

    int x;
    int y;

    @Actor
    public void writer() {
        x = 1;
        y = 1;
    }

    @Actor
    public void reader(II_Result r) {
        r.r1 = y;
        r.r2 = x;
    }
}
