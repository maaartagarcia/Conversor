import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FahrenheitTest {
    private static Conversor fahrenheit;

    @BeforeClass
    public static void inicia(){
        fahrenheit = new Fahrenheit();
    }

    @AfterClass
    public static void finaliza(){
        fahrenheit = null;
    }

    @Test
    public void conversorC2F(){
        assertEquals(113.0, fahrenheit.convertir(45),0.001);
    }
}