package testeJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import account.CheckingAccount;
import account.SavingsAccount;
import exceptions.AccountQueueException;
import javadoc.AccountQueueImpl;

class TesteQueue {

	CheckingAccount ismael = new CheckingAccount();
	SavingsAccount barbara = new SavingsAccount();
	
	AccountQueueImpl fila;
	
	@Test
	@DisplayName("Fila new")
	void inicializaFila() {
		new AccountQueueImpl();
	}
	
	@Nested
	@DisplayName("Fila Nova")
	class FilaNova{
		
		@BeforeEach
		void criaFila() {
			fila = new AccountQueueImpl();
		}
		
		@Test
		@DisplayName("Fila Vazia")
		void isEmpty() {
			assertTrue(fila.isEmpty());
		}
		
		@Test
		@DisplayName("Exception Remove Vazia")
		void removeFilaVazia() {
			assertThrows(AccountQueueException.class, fila::remove);
		}
		
		@Test
		@DisplayName("Null se vazia")
		void headElement() {
			assertEquals(null, fila.headElement());
		}
		
		@Test
		@DisplayName("Quantidade de elementos da fila vazia")
		void quantidadeElementosVazia() {
			assertEquals(0, fila.getQueueSize());
		}
		
		@Nested
		@DisplayName("Após adicionar na fila")
		class Adiciona{
			
			@Test
			@DisplayName("Adiciona Conta True")
			@BeforeEach
			void adicionaConta() {
				assertTrue(fila.add(ismael));
				assertTrue(fila.add(barbara));
				assertFalse(fila.isEmpty());
			}
			
			@Test
			@DisplayName("Se a head for Saving")
			void headSaving() {
				assertEquals(ismael, fila.remove());
				assertThrows(AccountQueueException.class, fila::remove);
				
			}
			
			@Test
			@DisplayName("Head of queue")
			void headQueue() {
				assertEquals(ismael, fila.headElement());
				assertFalse(fila.isEmpty());
			}
			
			@Test
			@DisplayName("Check the queue if full")
			void checkQeue() {
				assertFalse(fila.isFull());
			}
			
			@Test
			@DisplayName("Tamanho fila com dois elementos")
			void tamanhoFila() {
				assertEquals(2, fila.getQueueSize());
			}
			
		}
		
		
	}
	

}
