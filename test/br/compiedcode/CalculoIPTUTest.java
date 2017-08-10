package br.compiedcode;

import br.com.piedcode.CalculoIPTU;
import br.com.piedcode.imovel.Imovel;
import br.com.piedcode.imovel.Residencial;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by rodolfo on 10/08/2017.
 */
public class CalculoIPTUTest {

    @Test
    public void TestResidencial01(){

        Imovel residencial = new Residencial(new BigDecimal(90000.0d));

        BigDecimal valorCalculado = CalculoIPTU.calculateFromImovel(residencial);

        Assert.assertTrue(valorCalculado.compareTo(new BigDecimal(123.0d)) == 0);

    }
}
