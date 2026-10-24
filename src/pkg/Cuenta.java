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
		this.saldo = saldo;
	}

	public void ingreso(double i)
	{
		this.saldo += i;
	}

	public void reintegro(double i)
	{
		if (this.saldo - i < -500)
		{
			System.out.println("Error. Se supera el limite de descubierto de 500 euros.");
		}

		else
		{
			this.saldo = this.saldo - i;
		}
	}
}