package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddOperationTest {

    @Test
    public void testCalculer() {
        Operation op = new AddOperation();
        assertEquals(5.0, op.calculer(2.0, 3.0), 0.001);
    }
}
