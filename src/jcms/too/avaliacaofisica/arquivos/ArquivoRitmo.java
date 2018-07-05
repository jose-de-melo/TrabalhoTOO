package jcms.too.avaliacaofisica.arquivos;

import java.io.IOException;

import jcms.too.avaliacaofisica.modelo.Ritmo;
import jcms.too.avaliacaofisica.utilitarios.Constantes;
import br.mos.arquivo.aleatorio.BinaryFile;

/**
 * Fornece opera��es para um arquivo bin�rio usando os servi�os de um arquivo com acesso aleat�rio.
 * O tipo de dado do registro do arquivo � {@link RegistroRitmo}.
 * 
 * @author Jos� do Carmo de Melo Silva
 * @since 0.1
 */
public class ArquivoRitmo extends BinaryFile{

	private static final int TAMANHO_REGISTRO_ARQUIVO = 74;
	
	/**
	 * L� um objeto de um {@link ArquivoRitmo}.
	 * @return o objeto {@link RegistroRitmo} lido.
	 * @throws IOException se houver algum erro de E/S.
	 * 
	 */
	@Override
	public RegistroRitmo readObject() throws IOException {
		int registro = randomAccessFile.readInt();
		RegistroRitmo ritmo = new RegistroRitmo(new Ritmo(readString(Constantes.TAMANHO_STRING_RITMO_COMPLETO)), registro);
		
		return ritmo;
	}

	/**
	 * Retorna o tamanho, em bytes, do registro composto por vari�veis membro do objeto.
	 * 
	 * @return um int com o tamanho, em bytes, do registro.
	 */
	@Override
	public int recordSize() {
		return TAMANHO_REGISTRO_ARQUIVO;
	}

	/**
	 * Escreve um objeto {@link RegistroRitmo} como um registro do arquivo.
	 * 
	 * @param obj - um Object que ser� armazenado no arquivo.
	 * @throws IOException se ocorrer algum erro de E/S.
	 * @throws ClassCastException se o objeto passado como par�metro n�o for um {@link RegistroRitmo}
	 */
	@Override
	public void writeObject(Object obj) throws IOException, ClassCastException {
		RegistroRitmo registro;
		
		if(obj instanceof RegistroRitmo)
			registro = (RegistroRitmo) obj;
		else
			throw new ClassCastException();
		
		randomAccessFile.writeInt(registro.getNumeroRegistro());
		randomAccessFile.writeChars(setStringLength(registro.getRitmo().toString(), Constantes.TAMANHO_STRING_RITMO_COMPLETO));
	}

}
