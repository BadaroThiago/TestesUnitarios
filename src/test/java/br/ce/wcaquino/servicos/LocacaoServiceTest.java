package br.ce.wcaquino.servicos;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.servicos.LocacaoService;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {

	@Test
	public void testUnitarioLocacaoService() {
		//Cenário
		LocacaoService service = new LocacaoService();
		Usuario usuarioTeste = new Usuario("Thiago");
		Filme filmeTeste = new Filme("Titanic", 5, 1.0);
		
		//Ação
		Locacao locacaoTeste;
		locacaoTeste = service.alugarFilme(usuarioTeste, filmeTeste);

		//Verificação
		Assert.assertTrue(locacaoTeste.getValor() == 1.0);
		Assert.assertTrue(DataUtils.isMesmaData(locacaoTeste.getDataLocacao(), new Date()));
		Assert.assertTrue(DataUtils.isMesmaData(locacaoTeste.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));

		 	
		
	}
	
}
