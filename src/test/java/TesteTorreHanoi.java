import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteTorreHanoi {


    @Test
    @DisplayName("Teste com nenhum")
    public void teste0() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        assertEquals(problema.resolverTorreHanoi(0), 0);
    }

    @Test
    @DisplayName("Teste com 1 disco")
    public void teste1Disco() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        assertEquals(problema.resolverTorreHanoi(1), 1);
    }

    @Test
    @DisplayName("Teste com 2 discos")
    public void teste2Discos() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        assertEquals(problema.resolverTorreHanoi(2), 3);
    }

    @Test
    @DisplayName("Teste com 3 discos")
    public void teste3Discos() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        assertEquals(problema.resolverTorreHanoi(3), 7);
    }

    @Test
    @DisplayName("Teste com 4 discos")
    public void teste4Discos() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        assertEquals(problema.resolverTorreHanoi(4), 15);
    }

    @Test
    @DisplayName("Teste com 5 discos")
    public void teste5Discos() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        assertEquals(problema.resolverTorreHanoi(5), 31);
    }

    @Test
    @DisplayName("Teste com 6 discos")
    public void teste6Discos() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        assertEquals(problema.resolverTorreHanoi(6), 63);
    }

    @Test
    @DisplayName("Teste com 15 discos")
    public void teste15Discos() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        assertEquals(problema.resolverTorreHanoi(15), 32767);
    }

    @Test
    @DisplayName("Teste com 30 discos")
    public void testeMuitosDiscos() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        assertEquals(problema.resolverTorreHanoi(30), 1073741823);
    }

    @Test
    @DisplayName("Teste com 3 discos - errado")
    public void teste3Falso() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        assertNotEquals(problema.resolverTorreHanoi(3), 3);
    }

    @Test
    @DisplayName("Teste com 8 discos - errado")
    public void teste8Falso() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        assertNotEquals(problema.resolverTorreHanoi(8), 256);
    }

    @Test
    @DisplayName("Teste com -1")
    public void testeNegativo1() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        try {
            problema.resolverTorreHanoi(-1);
            fail();
        }
        catch (Exception NumNegException) {
            System.out.println(NumNegException.toString());
            assertTrue(true);
        }
    }

    @Test
    @DisplayName("Teste com -5")
    public void testeNegativo5() throws NumNegException {
        TorreHanoi problema = new TorreHanoi();
        try {
            problema.resolverTorreHanoi(-5);
            fail();
        }
        catch (Exception NumNegException) {
            System.out.println(NumNegException.toString());
            assertTrue(true);
        }
    }

}