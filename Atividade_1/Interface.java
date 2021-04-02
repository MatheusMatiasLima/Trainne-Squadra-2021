package Atividade_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface {
    private JFrame janela;
    protected JButton carregarArquivo;
    protected JButton salvarArquivo;
    protected JButton mostrarCozinhas;
    protected JButton escreverArq;
    private JLabel rotuloCima;
    protected JButton sair;
    private Restaurante meuRestaurante;

    public Interface() {
        meuRestaurante = new Restaurante();
        janela = new JFrame("Restaurantes da Squadra");
        rotuloCima = new JLabel("Bem vindo!");
        carregarArquivo = new JButton("Carregar aquivo");
        salvarArquivo = new JButton("Salvar arquivo");
        escreverArq = new JButton("Escrever aquivos pre programados");
        mostrarCozinhas = new JButton("Mostrar Cozinhas");
        sair = new JButton("Sair");

        //Essa linha é se caso o usuario clicar no botao X da janela o programa realmente finalizar
        //sem isso apenas a janela seria fechada e o programa continuaria rodando
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Utilizando classes internas anonimas para ser ouvinte de cada botao
        carregarArquivo.addActionListener (
            new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) {

                    try {
                        //limpar o que tinha antes (poderia salvar em outro arquivo mas prefiro assim)
                        meuRestaurante = null;
                        meuRestaurante = Manipuladora.lerArquivoBinario("binario");
                        JOptionPane.showMessageDialog(janela, "Arquivo carregado!");
                    }
                    catch (Exception erro) {
                        System.out.println(erro);
                        JOptionPane.showMessageDialog(janela, "Erro: " + erro);
                    }

                    
                }
            }
        );

        salvarArquivo.addActionListener (
            new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Manipuladora.gerarArquivoBinario(meuRestaurante, "binario");
                        JOptionPane.showMessageDialog(janela, "Arquivo salvo!");
                    }
                    catch (Exception erro) {
                        System.out.println(erro);
                        JOptionPane.showMessageDialog(janela, "Erro: " + erro);
                    }

                    
                }
            }
        );

        escreverArq.addActionListener (
            new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        meuRestaurante.gerarDadosAleatorios();
                        JOptionPane.showMessageDialog(janela, "Dados adicionados!");
                    }
                    catch (Exception erro) {
                        JOptionPane.showMessageDialog(janela, "Erro: " + erro);
                    }
                }
            }
        );

        mostrarCozinhas.addActionListener (
            new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //criando a janela (um frame pode ter varios paineis)
                    JFrame frame = new JFrame("Cozinhas");
                    frame.setSize(400,500);
                    //Painel que vai o texto
                    JPanel painel = new JPanel();
                    //campo de texto
                    JLabel label = new JLabel();
                    //O codigo html para adicionar no campo de texto
                    String s = meuRestaurante.gerarStringHTML(); //"<html></html>"
                    //Adicionando no campo de texto
                    label.setText(s);
                    //adicionando o texto no painel
                    painel.add(label);
                    //Colocando scroll no painel
                    JScrollPane janelaComScroll = new JScrollPane(painel);
                    //Adicionando o painel com scroll no frame
                    frame.add(janelaComScroll);
                    frame.setVisible(true);
                }
            }
        );

        sair.addActionListener (
            new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            }
        );

        mostrarInterface();
    }

    private void mostrarInterface() {
        janela.setSize(490,300);
        janela.setLayout(new BorderLayout());

        JPanel norte = new JPanel();
        norte.setLayout(new FlowLayout());
        norte.add(rotuloCima);
        janela.add(norte, BorderLayout.NORTH);

        JPanel centro = new JPanel();
        //duas linhas e duas colunas
        centro.setLayout(new GridLayout(2,2));
        centro.add(escreverArq);
        centro.add(salvarArquivo);
        centro.add(carregarArquivo);
        centro.add(mostrarCozinhas);
        janela.add(centro, BorderLayout.CENTER);
   
        JPanel sul = new JPanel();
        sul.setLayout(new FlowLayout());
        sul.add(sair);
        janela.add(sul, BorderLayout.SOUTH);
    }

    public void exibir () {
        janela.setVisible(true);
    }
}