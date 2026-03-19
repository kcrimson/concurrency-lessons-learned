package concurrency;

import org.openjdk.jcstress.annotations.*;
import org.openjdk.jcstress.annotations.Outcome.Outcomes;
import org.openjdk.jcstress.infra.results.II_Result;

@JCStressTest
@Outcomes(
        {
                @Outcome(id = "1, 1", expect = Expect.ACCEPTABLE, desc = "Both writes visible"),
                @Outcome(id = "0, 0", expect = Expect.ACCEPTABLE, desc = "Neither write visible"),
                @Outcome(id = "1, 0", expect = Expect.ACCEPTABLE, desc = "Only y visible"),
                @Outcome(id = "0, 1", expect = Expect.ACCEPTABLE_INTERESTING, desc = "Only x visible")
        }
)
@State
public class VolatileTest {

    int x;
    volatile int y;

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
