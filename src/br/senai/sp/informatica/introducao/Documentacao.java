package br.senai.sp.informatica.introducao;


import javax.swing.JOptionPane;

/**
 * Essa classe visa ilustrar o uso e comentarios comuns 
 * de documentacao.
 * 
 * Para gerar a documentacao deve-se utilizar o comando
 *
 * javadoc Documentacao.java -d [dir doc]
 *
 * @author Jose Antonio da Silva
 * @version 
 */

public class Documentacao {
  /**
   * Armazena um texto qualquer
   * @see java.lang.String
   */
  private String texto;

  /**
   * Construtor padrao da classe. Ele atribui o conteudo
   * de seu parametro Texto ao atributo Texto da classe.
   * @param texto O texto a ser atribuido ao atributo Texto
   */
  public Documentacao(String texto) {
    this.texto = texto;
  }

  /**
   * Esse metodo inverte o conteudo do do atributo Texto.
   * @return Um objeto <code>String</code> com o conteúdo
   * invertido do atributo Texto.
   */		
  public String inverso() {
    String st = "";
	for (int i = 0; i < texto.length(); i++)
		st = texto.charAt(i) + st;
    return st;
  }

  /**
   * Método responsável pela inicializa&ccedil;&atilde;o do programa.
   * Cria a instância da classe Documentacao e a usa para
   * exibir o inverso da palavra ROMA em uma caixa de diálogo.
   * @param args recebe par&acirc;metros da linha de comando (não é utilizado)
   * @see javax.swing.JOptionPane
   */
  
}
