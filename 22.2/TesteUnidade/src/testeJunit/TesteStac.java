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
import exceptions.AccountStackException;
import javadoc.AccountStackImpl;

@DisplayName("Uma Pilha")
class TesteStac {

	CheckingAccount ismael = new CheckingAccount();
	SavingsAccount barbara = new SavingsAccount();

	AccountStackImpl pilhaContas;

	@Test
	@DisplayName("Foi inicializado com new AccountStackImpl()")
	void isInstantiatedWithNew() {
		new AccountStackImpl();
	}

	@Nested
	@DisplayName("Quando for Novo")
	class quandoNovo {

		@BeforeEach
		void criaNovaPilha() {
			pilhaContas = new AccountStackImpl();
		}

		@Test
		@DisplayName("Est� vazia")
		void isEmpty() {
			assertTrue(pilhaContas.isEmpty());
		}

		@Test
		@DisplayName("Joga a Exce��o de pilha vazia quando faz o pop")
		void JogaExcecaoPop() {
			assertThrows(AccountStackException.class, pilhaContas::pop);
		}

		@Test
		@DisplayName("Joga a Exce��o de pilha vazia quando chama o topo")
		void JogaExcecaoPeek() {
			assertThrows(ArrayIndexOutOfBoundsException.class, pilhaContas::top);
		}

		@Test
		@DisplayName("retorna quantidade de itens da pilha tem que ser igual a 0")
		void retornaQuantidade() {
			assertEquals(0, pilhaContas.numberElements());
		}

		@Nested
		@DisplayName("Ap�s fazer push()")
		class AposPush {
			@Test
			@DisplayName("Adiciona a conta e retorna ela")
			@BeforeEach
			void pushUmaConta() {
				assertEquals(barbara, pilhaContas.push(barbara));
				assertEquals(ismael, pilhaContas.push(ismael));
			}

			@Test
			@DisplayName("N�o est� mais vazia")
			void isNotEmpty() {
				assertFalse(pilhaContas.isEmpty());
			}

			@Test
			@DisplayName("retorna quando pop() se for checking account, caso n�o joga exce��o")
			void retornaElemento() {
				assertEquals(ismael, pilhaContas.pop());
				assertThrows(AccountStackException.class, pilhaContas::pop);
				assertFalse(pilhaContas.isEmpty());
			}

			@Test
			@DisplayName("retorna o elemento quando top() mas n�o fica vazia")
			void retornaElementoTop() {
				assertEquals(ismael, pilhaContas.top());
				assertFalse(pilhaContas.isEmpty());
			}

			@Test
			@DisplayName("retorna quantidade de itens da pilha tem que ser igual a 2")
			void retornaQuantidade() {
				assertEquals(2, pilhaContas.numberElements());
			}
		}
	}
}
