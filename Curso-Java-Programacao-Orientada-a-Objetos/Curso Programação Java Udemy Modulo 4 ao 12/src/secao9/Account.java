package secao9;

public class Account {

	
	//Minhas variaveis PRIVATES que só poderão ser acessadas na própria classe
	private int number;
	private String holder;
	private double balance;
	
	
	// Sobrecarga no meu constutor Account com 2 parametros
	// que executa no momento da instanciação do objeto	(encapsulado)
	public Account(int number, String holder) {
		this.number = number;	// this é uma referência ao próprio objeto
		this.holder = holder;	// Passando o próprio objeto como argumento na chamada de um método ou construtor
		
	}
	
	// Sobrecarga no meu constutor Account com 3 parametros
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); 
	}
	
	// Como o objeto não deve expor nenhum atributo utilizo os métodos Get e Set
		public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	// Método estatico depósito
	public void deposit(double amount) {
		balance += amount;
	}
	// Método estatico saque
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	// Retornar a representação de string do objeto.
	// toString retorna a string formatada
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
}