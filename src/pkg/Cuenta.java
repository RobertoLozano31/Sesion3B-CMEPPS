package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta 
{
    private String mNumero;
    private String mTitular;
    private double saldo;
    private List<Movimiento> mMovimientos;

    public Cuenta(String mNumero, String mTitular, double saldoInicial) 
    {
        this.mNumero = mNumero;
        this.mTitular = mTitular;
        this.saldo = saldoInicial;
        this.mMovimientos = new ArrayList<>();
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }

    public List<Movimiento> getmMovimientos() 
    {
    	mMovimientos.add(new Movimiento());
    	mMovimientos.add(new Movimiento());
    	mMovimientos.add(new Movimiento());
    	
    	return mMovimientos;
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
            this.saldo -= i;
        }
    }
    
    public void mostrarBalance() 
    {
    
    }
}