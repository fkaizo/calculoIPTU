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

        Imovel residencial = new Residencial(new BigDecimal(180000.0d));

        BigDecimal valorCalculado = CalculoIPTU.calculateFromImovel(residencial);

        Assert.assertTrue(areEquals(valorCalculado, 1164.55d));

    }

    private boolean areEquals(BigDecimal generated, double base){
        return (generated.setScale(2,BigDecimal.ROUND_HALF_EVEN).compareTo((new BigDecimal(base)).setScale(2,BigDecimal.ROUND_HALF_EVEN)) == 0);
    }
}
