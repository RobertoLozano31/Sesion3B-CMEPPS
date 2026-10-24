package test;

import static org.junit.jupiter.api.Assertions.*;  

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class Test0014 
{
    private Cuenta cta12345;
    private Cuenta cta67890;

    @BeforeEach
    void setUp() throws Exception 
    {
        cta12345 = new Cuenta("12345", "Titular 1", 50.0);
        cta67890 = new Cuenta("67890", "Titular 2", 0.0);
    }

    @Test
    void test12345() 
    {
        cta12345.reintegro(200); // 1. Reintegro de 200€
        cta12345.ingreso(100);   // 3. Ingreso de 100€
        cta12345.reintegro(200); // 6. Reintegro de 200€

        assertEquals(-250.0, cta12345.getSaldo(), "El saldo final debe ser -250€");
        assertEquals(3, cta12345.getmMovimientos().size(), "Debe registrar 3 movimientos válidos");
        
        cta12345.mostrarBalance();
    }

    @Test
    void test67890() 
    {
        cta67890.reintegro(350); // 2. Reintegro de 350€ (Aceptado)
        cta67890.reintegro(200); // 4. Reintegro de 200€ (Rechazado, supera el descubierto)
        cta67890.reintegro(150); // 5. Reintegro de 150€ (Aceptado)
        cta67890.ingreso(50);    // 7. Ingreso de 50€ (Aceptado)
        cta67890.reintegro(100); // 8. Reintegro de 100€ (Rechazado, supera el descubierto)

        assertEquals(-450.0, cta67890.getSaldo(), "El saldo final debe ser -450€");
        assertEquals(3, cta67890.getmMovimientos().size(), "Solo deben haberse registrado los 3 movimientos permitidos");
        
        cta67890.mostrarBalance();
    }
}