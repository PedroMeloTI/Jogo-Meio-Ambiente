package com.Views;

import com.Model.modeloJogo;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public final class Jogo extends javax.swing.JFrame {

    String selecionada;
    modeloJogo modelo = new modeloJogo();
    int aux = 0;

    public Jogo() {
        initComponents();
        horaEntrada();
        btnZerar.setEnabled(false);
        btnGerar.setEnabled(false);
        DesabilitarBotoes();
    }

    public void testarVitorias() {
        if (aux == 10) {
            if (modelo.getPontos() >= 5) {
                JOptionPane.showMessageDialog(null, "Você venceu!!!", "Meus parabéns", 1);
            } else if (modelo.getPontos() == 4) {
                JOptionPane.showMessageDialog(null, "Essa foi por pouco, tente novamente!!!", "Quase",1);
            } else {
                JOptionPane.showMessageDialog(null, "Você perdeu, tente novamente!!!", "Não deu desta vez",1);
            }
            aux = 0;
            modelo.setPontos(0);
            SetarPontos();
            setarJogadas();
            lblFeitas.setText("");
            lblRestantes.setText("");
            lblPontos.setText("");
            btnGerar.setEnabled(false);
            btnIniciar.setEnabled(true);
            btnZerar.setEnabled(false);
            lblResultado.setIcon(null);
            lblResultado.setText("");
        }
    }

    public final void horaEntrada() {
        Locale locale = new Locale("pt", "BR");
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'", locale);
        String a = formatador.format(calendar.getTime());
        lblHora.setText("Hora Entrada: " + a.substring(22, 30));
    }

    public void HabilitarBotoes() {
        btnAmarelo.setEnabled(true);
        btnAzul.setEnabled(true);
        btnBranco.setEnabled(true);
        btnCinza.setEnabled(true);
        btnVerde.setEnabled(true);
        btnVermelho.setEnabled(true);
    }

    public void DesabilitarBotoes() {
        btnAmarelo.setEnabled(false);
        btnAzul.setEnabled(false);
        btnBranco.setEnabled(false);
        btnCinza.setEnabled(false);
        btnVerde.setEnabled(false);
        btnVermelho.setEnabled(false);
    }

    public void setarJogadas() {
        modelo.setJogadasRestantes(10);
        modelo.setJogadasFeitas(0);
        lblRestantes.setText("10");
        lblFeitas.setText("0");
    }

    public void rodadas() {
        modelo.setJogadasFeitas(modelo.getJogadasFeitas() + 1);
        modelo.setJogadasRestantes(modelo.getJogadasRestantes() - 1);
        lblRestantes.setText(String.valueOf(modelo.getJogadasRestantes()));
        lblFeitas.setText(String.valueOf(modelo.getJogadasFeitas()));
    }

    public void SetarPontos() {
        lblPontos.setText(String.valueOf(modelo.getPontos()));
    }

    public void perdas() {
        lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/triste.png")));
        lblResultado.setText("Ops, você errou ...");
    }

    public void acertos() {
        lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/vitoria.png")));
        lblResultado.setText("Você acertou, continue assim ...");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GerarPalavra = new javax.swing.JPanel();
        btnAzul = new javax.swing.JButton();
        btnAmarelo = new javax.swing.JButton();
        btnVerde = new javax.swing.JButton();
        btnVermelho = new javax.swing.JButton();
        btnBranco = new javax.swing.JButton();
        btnCinza = new javax.swing.JButton();
        btnGerar = new javax.swing.JButton();
        lblSelecionada = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblRestantes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFeitas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblPontos = new javax.swing.JLabel();
        btnZerar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        lblHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GerarPalavra.setBorder(javax.swing.BorderFactory.createTitledBorder("Partida"));

        btnAzul.setBackground(new java.awt.Color(21, 30, 226));
        btnAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/trash.png"))); // NOI18N
        btnAzul.setPreferredSize(new java.awt.Dimension(100, 80));
        btnAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzulActionPerformed(evt);
            }
        });

        btnAmarelo.setBackground(new java.awt.Color(229, 223, 25));
        btnAmarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/trash.png"))); // NOI18N
        btnAmarelo.setPreferredSize(new java.awt.Dimension(100, 80));
        btnAmarelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmareloActionPerformed(evt);
            }
        });

        btnVerde.setBackground(new java.awt.Color(19, 157, 19));
        btnVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/trash.png"))); // NOI18N
        btnVerde.setPreferredSize(new java.awt.Dimension(100, 80));
        btnVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerdeActionPerformed(evt);
            }
        });

        btnVermelho.setBackground(java.awt.Color.red);
        btnVermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/trash.png"))); // NOI18N
        btnVermelho.setPreferredSize(new java.awt.Dimension(100, 80));
        btnVermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVermelhoActionPerformed(evt);
            }
        });

        btnBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/trash.png"))); // NOI18N
        btnBranco.setPreferredSize(new java.awt.Dimension(100, 80));
        btnBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrancoActionPerformed(evt);
            }
        });

        btnCinza.setBackground(java.awt.SystemColor.controlShadow);
        btnCinza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/trash.png"))); // NOI18N
        btnCinza.setPreferredSize(new java.awt.Dimension(100, 80));
        btnCinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCinzaActionPerformed(evt);
            }
        });

        btnGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/GERAR.png"))); // NOI18N
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GerarPalavraLayout = new javax.swing.GroupLayout(GerarPalavra);
        GerarPalavra.setLayout(GerarPalavraLayout);
        GerarPalavraLayout.setHorizontalGroup(
            GerarPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GerarPalavraLayout.createSequentialGroup()
                .addGroup(GerarPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GerarPalavraLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GerarPalavraLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(GerarPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GerarPalavraLayout.createSequentialGroup()
                                .addGroup(GerarPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(GerarPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnVermelho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(GerarPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCinza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        GerarPalavraLayout.setVerticalGroup(
            GerarPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GerarPalavraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSelecionada, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GerarPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCinza, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GerarPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Jogadas"));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Restantes");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("Feitas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRestantes, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(lblFeitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblFeitas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Pontos")));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel3.setText("Objetivo: 5 pontos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblPontos, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3))
        );

        btnZerar.setText("Zerar");
        btnZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZerarActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/home.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GerarPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnZerar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnInicio))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(124, 124, 124))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnZerar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(GerarPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        String[] opcoes = {
            "caixa de sapato", "sulfite", "livro", "caderno", "revista", "papelão", "jornal", "documentos",
            "cartolina", "agenda", "folders", "flyers", "cartazes", "panfletos", "folhetos",
            "telha transparente", "sacolinhas", "boneco de brinquedo", "oculos de proteção", "ziplock",
            "mangueiras", "balde", "embalagens", "Tupperware", "tampa de tupperware", "copo descartavel",
            "copo que ao cair quebra", "vasilhame de vidro", "ampolas", "garrafa térmica", "janela de vidro", "bolinhas de gude",
            "latas vazias", "chave de fenda", "colher", "garfo", "lâminas", "carcaça do carro", "bolinha de ferro", "aço",
            "esquadrias", "fio de cobre", "para choques",
            "seringas", "agulhas usada", "luvas ambulatoriais", "orgãos", "fetos", "fezes", "sangue hemoderivados",
            "band-aid", "gazes esterizada", "esparadrapos", "ataduras", "algodão hidrófilo", "curativos",
            "espelhos", "cristais", "lampadas", "vidro temperado", "cerâmica", "porcelana", "acrílico", "fita crepe",
            "fotografia", "fraldas descartaveis", "esponja de aço", "rolha de vinho", "inseticida", "espuma", "papel lâminado"
        };
        aux++;
        selecionada = opcoes[new Random().nextInt(opcoes.length)];
        lblSelecionada.setText(selecionada);
        HabilitarBotoes();
        btnGerar.setEnabled(false);
        lblResultado.setText("");
        lblResultado.setIcon(null);

    }//GEN-LAST:event_btnGerarActionPerformed

    private void btnBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrancoActionPerformed
        switch (selecionada) {
            case "seringas":
            case "agulhas usada":
            case "luvas ambulatoriais":
            case "orgãos":
            case "fetos":
            case "fezes":
            case "sangue hemoderivados":
            case "band-aid":
            case "gazes esterizada":
            case "esparadrapos":
            case "ataduras":
            case "algodão hidrófilo":
            case "curativos":
                acertos();
                modelo.setPontos(modelo.getPontos() + 1);
                break;
            default:
                perdas();
        }
        DesabilitarBotoes();
        SetarPontos();
        lblSelecionada.setText("");
        btnGerar.setEnabled(true);
        rodadas();
        testarVitorias();
    }//GEN-LAST:event_btnBrancoActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        dispose();
        BemVindo b = new BemVindo();
        b.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzulActionPerformed
        switch (selecionada) {
            case "caixa de sapato":
            case "sulfite":
            case "livro":
            case "caderno":
            case "revista":
            case "papelão":
            case "jornal":
            case "documentos":
            case "cartolina":
            case "agenda":
            case "folders":
            case "flyers":
            case "cartazes":
            case "panfletos":
            case "folhetos":
                acertos();
                modelo.setPontos(modelo.getPontos() + 1);
                break;
            default:
                perdas();
        }
        DesabilitarBotoes();
        SetarPontos();
        lblSelecionada.setText("");
        btnGerar.setEnabled(true);
        rodadas();
        testarVitorias();
    }//GEN-LAST:event_btnAzulActionPerformed

    private void btnVermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVermelhoActionPerformed
        switch (selecionada) {
            case "telha transparente":
            case "sacolinhas":
            case "boneco de brinquedo":
            case "oculos de proteção":
            case "ziplock":
            case "mangueiras":
            case "balde":
            case "embalagens":
            case "Tupperware":
            case "tampa de tupperware":
            case "copo descartavel":
            case "garrafa térmica":
                acertos();
                modelo.setPontos(modelo.getPontos() + 1);
                break;
            default:
                perdas();
        }
        DesabilitarBotoes();
        SetarPontos();
        lblSelecionada.setText("");
        btnGerar.setEnabled(true);
        rodadas();
        testarVitorias();
    }//GEN-LAST:event_btnVermelhoActionPerformed

    private void btnVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerdeActionPerformed
        switch (selecionada) {
            case "copo que ao cair quebra":
            case "vasilhame de vidro":
            case "ampolas":
            case "garrafa térmica":
            case "janela de vidro":
            case "bolinhas de gude":
                acertos();
                modelo.setPontos(modelo.getPontos() + 1);
                break;
            default:
                perdas();
        }
        DesabilitarBotoes();
        SetarPontos();
        lblSelecionada.setText("");
        btnGerar.setEnabled(true);
        rodadas();
        testarVitorias();
    }//GEN-LAST:event_btnVerdeActionPerformed

    private void btnAmareloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmareloActionPerformed
        switch (selecionada) {
            case "latas vazias":
            case "chave de fenda":
            case "colheres":
            case "garfo":
            case "lâminas":
            case "para choques":
            case "bolinha de ferro":
            case "aço":
            case "esquadrias":
            case "fio de cobre":
            case "carcaça do carro":
                acertos();
                modelo.setPontos(modelo.getPontos() + 1);
                break;
            default:
                perdas();
        }
        DesabilitarBotoes();
        SetarPontos();
        lblSelecionada.setText("");
        btnGerar.setEnabled(true);
        rodadas();
        testarVitorias();

    }//GEN-LAST:event_btnAmareloActionPerformed

    private void btnCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCinzaActionPerformed
        switch (selecionada) {
            case "espelhos":
            case "cristais":
            case "lampadas":
            case "vidro temperado":
            case "cerâmica":
            case "porcelana":
            case "acrílico":
            case "fita crepe":
            case "fotografia":
            case "fraldas descartaveis":
            case "esponja de aço":
            case "rolha de vinho":
            case "inseticida":
            case "espuma":
            case "papel lâminado":
                acertos();
                modelo.setPontos(modelo.getPontos() + 1);
                break;
            default:
                perdas();
        }
        DesabilitarBotoes();
        SetarPontos();
        lblSelecionada.setText("");
        btnGerar.setEnabled(true);
        rodadas();
        testarVitorias();
    }//GEN-LAST:event_btnCinzaActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        btnIniciar.setEnabled(false);
        btnZerar.setEnabled(true);
        btnGerar.setEnabled(true);
        SetarPontos();
        setarJogadas();

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZerarActionPerformed
        btnIniciar.setEnabled(true);
        btnZerar.setEnabled(false);
        btnGerar.setEnabled(false);
        DesabilitarBotoes();
        setarJogadas();
        aux = 0;
        modelo.setPontos(0);
        SetarPontos();
        lblSelecionada.setText("");
        lblResultado.setText("");
        lblResultado.setIcon(null);
    }//GEN-LAST:event_btnZerarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);      // TODO add your handling code here:
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GerarPalavra;
    private javax.swing.JButton btnAmarelo;
    private javax.swing.JButton btnAzul;
    private javax.swing.JButton btnBranco;
    private javax.swing.JButton btnCinza;
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVerde;
    private javax.swing.JButton btnVermelho;
    private javax.swing.JButton btnZerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFeitas;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblPontos;
    private javax.swing.JLabel lblRestantes;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSelecionada;
    // End of variables declaration//GEN-END:variables
}
