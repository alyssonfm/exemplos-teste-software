package javadoc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import account.Account;
import account.CheckingAccount;

public class TestStackAndQueue {

    AccountStack Pilha;
    AccountQueue Fila;

    @Before
    public void setUp() {
	Pilha = new AccountStackImpl();
	Fila = new AccountQueueImpl();
    }

    /////// Queue

    @Test
    public void testQueueAdd() {
	Fila.add(new CheckingAccount());
	assertEquals(Fila.getQueueSize(), 1);
    }

    @Test
    public void testQueueRemove() {
	Account a = new CheckingAccount();
	Fila.add(a);
	Fila.add(a);
	Fila.add(a);

	assertEquals(a, Fila.remove());
	assertEquals(2, Fila.getQueueSize());

	assertEquals(a, Fila.remove());
	assertEquals(1, Fila.getQueueSize());

	assertEquals(a, Fila.remove());
	assertTrue(Fila.isEmpty());
	assertEquals(0, Fila.getQueueSize());
    }

    @Test
    public void testQueueHeadElement() {
	Fila.add(new CheckingAccount());
	assertEquals(Fila.getQueueSize(), 1);
    }

    @Test
    public void testQueueEmpty() {
	assertTrue(Fila.isEmpty());
	assertEquals(Fila.getQueueSize(), 0);
    }

    @Test
    public void testQueueFull() {
	assertFalse(Fila.isFull());
    }

    @Test
    public void testQueueGetQueueSize() {
	assertEquals(0, Fila.getQueueSize());
	Fila.add(new CheckingAccount());
	assertEquals(1, Fila.getQueueSize());
	Fila.add(new CheckingAccount());
	assertEquals(2, Fila.getQueueSize());
	Fila.add(new CheckingAccount());
	assertEquals(3, Fila.getQueueSize());
    }

//// Stack

    @Test
    public void testStackPush() {
	Pilha.push(new CheckingAccount());
	assertEquals(Pilha.numberElements(), 1);
    }

    @Test
    public void testStackPop() {
	Account a = new CheckingAccount(); 
	Pilha.push(a);
	assertEquals(Pilha.pop(), a);
    }

    @Test
    public void testStackIsEmpty() {
	assertTrue(Pilha.isEmpty());
	assertEquals(Pilha.numberElements(), 0);
    }

    @Test
    public void top() {
	Pilha.push(new CheckingAccount());
	Pilha.push(new CheckingAccount());
	Pilha.push(new CheckingAccount());
	assertEquals(Pilha.numberElements(), 3);
    }

    @Test
    public void testStackIsNumberElements() {
	assertTrue(Pilha.numberElements() == 0);
    }

////

    @After
    public void tearDown() {
	Pilha = null;
	Fila = null;
    }

}