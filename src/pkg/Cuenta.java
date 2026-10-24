package pkg;

public class Cuenta
{
	private double saldo;
	
	public Cuenta(double saldo)
	{
		super();
		this.saldo = saldo;
	}

	public double getSaldo()
	{
		return this.saldo;
	}
	
	public void setSaldo(double saldo)
	{
		
	}
	
	public void ingreso(double i)
	{	
		this.saldo = 45;
	}
	
	public void reintegro(double i)
	{
		this.saldo = 5;
	}
}