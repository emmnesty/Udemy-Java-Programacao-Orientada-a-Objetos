package secao9;

public class Account {

	
	//Minhas variaveis PRIVATES que s� poder�o ser acessadas na pr�pria classe
	private int number;
	private String holder;
	private double balance;
	
	
	// Sobrecarga no meu constutor Account com 2 parametros
	// que executa no momento da instancia��o do objeto	(encapsulado)
	public Account(int number, String holder) {
		this.number = number;	// this � uma refer�ncia ao pr�prio objeto
		this.holder = holder;	// Passando o pr�prio objeto como argumento na chamada de um m�todo ou construtor
		
	}
	
	// Sobrecarga no meu constutor Account com 3 parametros
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); 
	}
	
	// Como o objeto n�o deve expor nenhum atributo utilizo os m�todos Get e Set
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

	// M�todo estatico dep�sito
	public void deposit(double amount) {
		balance += amount;
	}
	// M�todo estatico saque
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	// Retornar a representa��o de string do objeto.
	// toString retorna a string formatada
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
}