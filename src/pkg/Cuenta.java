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

    public String getNumero() 
    {
        return mNumero;
    }

    public void setNumero(String mNumero) 
    {
        this.mNumero = mNumero;
    }

    public String getTitular() 
    {
        return mTitular;
    }

    public void setTitular(String mTitular) 
    {
        this.mTitular = mTitular;
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
        return mMovimientos;
    }

    public void ingreso(double i) 
    {
        this.saldo += i;
        this.mMovimientos.add(new Movimiento(i, Movimiento.Signo.H, "Ingreso en cuenta"));
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
            this.mMovimientos.add(new Movimiento(i, Movimiento.Signo.D, "Reintegro de cuenta"));
        }
    }
    
    public void mostrarBalance() 
    {
        System.out.println("\nMOVIMIENTOS DE LA CUENTA " + mNumero);
        System.out.println("----------------------------------");
        
        for (Movimiento m : mMovimientos) 
        {
            System.out.println(m);
        }
        
        System.out.println("Saldo final: " + saldo + "€\n");
    }
}