import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReaumurTest {
    private static Conversor reaumur;

    @BeforeClass
    public static void inicia(){
        reaumur = new Reaumur();
    }

    @AfterClass
    public static void finaliza(){
        reaumur = null;
    }

    @Test
    public void conversorC2R(){
        assertEquals(192.8, reaumur.convertir(241),0.001);
    }
}