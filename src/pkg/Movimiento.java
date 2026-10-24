package pkg;

public class Movimiento 
{
	public enum Signo 
	{
        D, H //Debe ( Reintegro ), Haber ( Ingreso )
    }
	
    private Double mImporte;
    private Signo mSigno;
    private String mDetalle;

    public Movimiento(Double mImporte, Signo mSigno, String mDetalle) 
    {
        this.mImporte = mImporte;
        this.mSigno = mSigno;
        this.mDetalle = mDetalle;
    }

    public Double getImporte() 
    {
        return mImporte;
    }

    public void setImporte(Double mImporte) 
    {
        this.mImporte = mImporte;
    }

    public Signo getSigno() 
    {
        return mSigno;
    }

    public void setSigno(Signo mSigno) 
    {
        this.mSigno = mSigno;
    }

    public String getDetalle() 
    {
        return mDetalle;
    }

    public void setDetalle(String mDetalle) 
    {
        this.mDetalle = mDetalle;
    }

    @Override
    public String toString() 
    {
        return "Movimiento [" + mSigno + "] | Importe: " + mImporte + "€ | Detalle: " + mDetalle;
    }
}
