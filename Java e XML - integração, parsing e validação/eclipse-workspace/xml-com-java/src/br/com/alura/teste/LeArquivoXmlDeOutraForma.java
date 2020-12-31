package br.com.alura.teste;

import java.io.FileInputStream;
import java.io.InputStream;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class LeArquivoXmlDeOutraForma {

	public static void main(String[] args) throws Exception {
		XMLReader leitor = XMLReaderFactory.createXMLReader();
		LeitorXml logica = new LeitorXml();
		leitor.setContentHandler(logica);
		InputStream inputStream = new FileInputStream("src/vendas.xml");
		InputSource inputSource = new InputSource(inputStream);
		leitor.parse(inputSource);
		
		System.out.println(logica.produtos);
	}
	
}
