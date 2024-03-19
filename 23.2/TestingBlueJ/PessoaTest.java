

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste PessoaTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class PessoaTest
{
    private Pessoa p;

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp(){
        p = new Pessoa("Alysson", 33, 1.76f, 75.0f);
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
        p = null;
    }
    
    @Test
    public void testConst(){
        assertNotNull(p.getNome());
    }

    @Test
    public void testIdade()
    {
        assertEquals(33, p.getIdade());
    }
}

