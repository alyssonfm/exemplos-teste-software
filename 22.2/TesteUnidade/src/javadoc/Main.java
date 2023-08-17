package javadoc;

public class Main {
    
    public static void main(String[] args) {
	AccountStack accStack = new AccountStackImpl();
	System.out.println("Verificando se a pilha esta vazia:");
	System.out.println(accStack.isEmpty());
	System.out.println("Inserindo um elemento");
	accStack.push(null);
	System.out.println("Verificando que a pilha não esta mais vazia");
	System.out.println(accStack.isEmpty());
	accStack.pop();
    }

}
