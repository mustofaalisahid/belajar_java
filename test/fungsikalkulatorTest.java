/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import struktural.fungsiKalkulator;

/**
 *
 * @author ASUS
 */
public class fungsikalkulatorTest {
    fungsiKalkulator f = new fungsiKalkulator();
    
    public fungsikalkulatorTest() {
    }
    
    @Test
    public void kali(){
        int expecteds = 30, actuals = f.kali(5, 6);
        assertEquals(expecteds, actuals);
        assertEquals(21, f.kali(7, 3));
        assertEquals(24, f.kali(-4, -6));
        assertEquals(-21, f.kali(7, -3));
        assertEquals(-21, f.kali(-7, 3));
    }
}
