package Parte2;

public class VentanaPrincipal extends javax.swing.JFrame {

    
    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCRadio = new javax.swing.JTextField();
        txtCArea = new javax.swing.JTextField();
        txtCPerimetro = new javax.swing.JTextField();
        btnArea = new javax.swing.JButton();
        btnPerimetro = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCuLado = new javax.swing.JTextField();
        txtCuArea = new javax.swing.JTextField();
        txtCuPerimetro = new javax.swing.JTextField();
        btnAreaCuadrado = new javax.swing.JButton();
        btnPerimetroCuadrado = new javax.swing.JButton();
        btnBorrarCuadrado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRBase = new javax.swing.JTextField();
        txtRArea = new javax.swing.JTextField();
        txtRPerimetro = new javax.swing.JTextField();
        btnAreaRectangulo = new javax.swing.JButton();
        btnPerimetroRectangulo = new javax.swing.JButton();
        btnBorrarRectangulo = new javax.swing.JButton();
        txtRAltura = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTBase = new javax.swing.JTextField();
        txtTArea = new javax.swing.JTextField();
        txtTPerimetro = new javax.swing.JTextField();
        btnAreaTriangulo = new javax.swing.JButton();
        btnPerimetroTriangulo = new javax.swing.JButton();
        btnBorrarTriangulo = new javax.swing.JButton();
        txtTAltura = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTTipo = new javax.swing.JTextField();
        btnTipoTriangulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Radio");

        jLabel2.setText("Area");

        jLabel3.setText("Perimetro");

        txtCRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCRadioActionPerformed(evt);
            }
        });

        btnArea.setText("Calcular area");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        btnPerimetro.setText("Calcular perimetro");
        btnPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Circulo");

        jLabel5.setText("Cuadrado");

        jLabel6.setText("Lado");

        jLabel7.setText("Area");

        jLabel8.setText("Perimetro");

        txtCuLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuLadoActionPerformed(evt);
            }
        });

        btnAreaCuadrado.setText("Calcular area");
        btnAreaCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaCuadradoActionPerformed(evt);
            }
        });

        btnPerimetroCuadrado.setText("Calcular perimetro");
        btnPerimetroCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroCuadradoActionPerformed(evt);
            }
        });

        btnBorrarCuadrado.setText("Borrar");
        btnBorrarCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCuadradoActionPerformed(evt);
            }
        });

        jLabel9.setText("Rectangulo");

        jLabel10.setText("Base");

        jLabel11.setText("Area");

        jLabel12.setText("Perimetro");

        txtRBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRBaseActionPerformed(evt);
            }
        });

        btnAreaRectangulo.setText("Calcular area");
        btnAreaRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaRectanguloActionPerformed(evt);
            }
        });

        btnPerimetroRectangulo.setText("Calcular perimetro");
        btnPerimetroRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroRectanguloActionPerformed(evt);
            }
        });

        btnBorrarRectangulo.setText("Borrar");
        btnBorrarRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRectanguloActionPerformed(evt);
            }
        });

        txtRAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRAlturaActionPerformed(evt);
            }
        });

        jLabel13.setText("Altura");

        jLabel14.setText("Triangulo ");

        jLabel15.setText("Base");

        jLabel16.setText("Area");

        jLabel17.setText("Perimetro");

        txtTBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTBaseActionPerformed(evt);
            }
        });

        btnAreaTriangulo.setText("Calcular area");
        btnAreaTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaTrianguloActionPerformed(evt);
            }
        });

        btnPerimetroTriangulo.setText("Calcular perimetro");
        btnPerimetroTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroTrianguloActionPerformed(evt);
            }
        });

        btnBorrarTriangulo.setText("Borrar");
        btnBorrarTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTrianguloActionPerformed(evt);
            }
        });

        txtTAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTAlturaActionPerformed(evt);
            }
        });

        jLabel18.setText("Altura");

        jLabel19.setText("Calculadora");

        btnTipoTriangulo.setText("Tipo de triangulo");
        btnTipoTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoTrianguloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtCPerimetro))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCRadio)
                                    .addComponent(txtCArea, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPerimetro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAreaCuadrado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPerimetroCuadrado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrarCuadrado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCuPerimetro))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCuLado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCuArea, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(jLabel5)
                        .addGap(119, 119, 119))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRArea, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRBase, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTBase, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTArea, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(txtTPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(356, 356, 356))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnAreaRectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPerimetroRectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrarRectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAreaTriangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPerimetroTriangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarTriangulo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTipoTriangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCuLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCuArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCuPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAreaCuadrado)
                            .addComponent(btnPerimetroCuadrado)
                            .addComponent(btnBorrarCuadrado)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnArea)
                            .addComponent(btnPerimetro)
                            .addComponent(btnBorrar))))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtRBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtRArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtRPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtTArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtTPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAreaRectangulo)
                        .addComponent(btnPerimetroRectangulo)
                        .addComponent(btnBorrarRectangulo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAreaTriangulo)
                        .addComponent(btnPerimetroTriangulo)
                        .addComponent(btnBorrarTriangulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTipoTriangulo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        // TODO add your handling code here:
        double area;
        int radio = Integer.parseInt(txtCRadio.getText());
        Círculo figura1 = new Círculo(radio);
        area = figura1.calcularArea();
        txtCArea.setText(String.valueOf(area));
        
                
        
    }//GEN-LAST:event_btnAreaActionPerformed

    private void txtCRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCRadioActionPerformed

    private void btnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroActionPerformed
        // TODO add your handling code here:
        double perimetro;
        int radio = Integer.parseInt(txtCRadio.getText());
        Círculo figura1 = new Círculo(radio);
        perimetro = figura1.calcularPerímetro();
        txtCPerimetro.setText(String.valueOf(perimetro));
    }//GEN-LAST:event_btnPerimetroActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        txtCRadio.setText("");
        txtCArea.setText("");
        txtCPerimetro.setText("");
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtCuLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuLadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuLadoActionPerformed

    private void btnAreaCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaCuadradoActionPerformed
        // TODO add your handling code here:
        double area;
        int lado = Integer.parseInt(txtCuLado.getText());
        Cuadrado figura3 = new Cuadrado(lado);
        area = figura3.calcularArea();
        txtCuArea.setText(String.valueOf(area));
    }//GEN-LAST:event_btnAreaCuadradoActionPerformed

    private void btnPerimetroCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroCuadradoActionPerformed
        // TODO add your handling code here:
        double perimetro;
        int lado = Integer.parseInt(txtCuLado.getText());
        Cuadrado figura3 = new Cuadrado(lado);
        perimetro = figura3.calcularPerímetro();
        txtCuPerimetro.setText(String.valueOf(perimetro));
    }//GEN-LAST:event_btnPerimetroCuadradoActionPerformed

    private void btnBorrarCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCuadradoActionPerformed
        // TODO add your handling code here:
        txtCuLado.setText("");
        txtCuArea.setText("");
        txtCuPerimetro.setText("");
    }//GEN-LAST:event_btnBorrarCuadradoActionPerformed

    private void txtRBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRBaseActionPerformed

    private void btnAreaRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaRectanguloActionPerformed
        // TODO add your handling code here:
        double areaRect; 
        int base = Integer.parseInt(txtRBase.getText());
        int altura = Integer.parseInt(txtRAltura.getText());
        Rectángulo figura2 = new Rectángulo(base,altura);
        areaRect = figura2.calcularArea();
        txtRArea.setText(String.valueOf(areaRect));
    }//GEN-LAST:event_btnAreaRectanguloActionPerformed

    private void btnPerimetroRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroRectanguloActionPerformed
        // TODO add your handling code here:
        double perimetroRect; 
        int base = Integer.parseInt(txtRBase.getText());
        int altura = Integer.parseInt(txtRAltura.getText());
        Rectángulo figura2 = new Rectángulo(base,altura);
        perimetroRect = figura2.calcularPerímetro();
        txtRPerimetro.setText(String.valueOf(perimetroRect));
        
    }//GEN-LAST:event_btnPerimetroRectanguloActionPerformed

    private void btnBorrarRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRectanguloActionPerformed
        // TODO add your handling code here:
        txtRBase.setText("");
        txtRAltura.setText("");
        txtRArea.setText("");
        txtRPerimetro.setText("");
    }//GEN-LAST:event_btnBorrarRectanguloActionPerformed

    private void txtRAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRAlturaActionPerformed

    private void txtTBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTBaseActionPerformed

    private void btnAreaTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaTrianguloActionPerformed
        // TODO add your handling code here:
        double areaTriang; 
        int base = Integer.parseInt(txtTBase.getText());
        int altura = Integer.parseInt(txtTAltura.getText());
        TriánguloRectángulo figura4 = new TriánguloRectángulo(base,altura);
        areaTriang = figura4.calcularArea();
        txtTArea.setText(String.valueOf(areaTriang));
    }//GEN-LAST:event_btnAreaTrianguloActionPerformed

    private void btnPerimetroTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroTrianguloActionPerformed
        // TODO add your handling code here:
        double perimetroTriang; 
        int base = Integer.parseInt(txtTBase.getText());
        int altura = Integer.parseInt(txtTAltura.getText());
        TriánguloRectángulo figura4 = new TriánguloRectángulo(base,altura);
        perimetroTriang = figura4.calcularPerímetro();
        txtTPerimetro.setText(String.valueOf(perimetroTriang));
    }//GEN-LAST:event_btnPerimetroTrianguloActionPerformed

    private void btnBorrarTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTrianguloActionPerformed
        // TODO add your handling code here:
        txtTBase.setText("");
        txtTAltura.setText("");
        txtTArea.setText("");
        txtTTipo.setText("");
        txtTPerimetro.setText("");
    }//GEN-LAST:event_btnBorrarTrianguloActionPerformed

    private void txtTAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTAlturaActionPerformed

    private void btnTipoTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoTrianguloActionPerformed
        // TODO add your handling code here:
        String tipotriang; 
        int base = Integer.parseInt(txtTBase.getText());
        int altura = Integer.parseInt(txtTAltura.getText());
        TriánguloRectángulo figura4 = new TriánguloRectángulo(base,altura);
        tipotriang = figura4.determinarTipoTriángulo();
        txtTTipo.setText(String.valueOf(tipotriang));
        
    }//GEN-LAST:event_btnTipoTrianguloActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnAreaCuadrado;
    private javax.swing.JButton btnAreaRectangulo;
    private javax.swing.JButton btnAreaTriangulo;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarCuadrado;
    private javax.swing.JButton btnBorrarRectangulo;
    private javax.swing.JButton btnBorrarTriangulo;
    private javax.swing.JButton btnPerimetro;
    private javax.swing.JButton btnPerimetroCuadrado;
    private javax.swing.JButton btnPerimetroRectangulo;
    private javax.swing.JButton btnPerimetroTriangulo;
    private javax.swing.JButton btnTipoTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCArea;
    private javax.swing.JTextField txtCPerimetro;
    private javax.swing.JTextField txtCRadio;
    private javax.swing.JTextField txtCuArea;
    private javax.swing.JTextField txtCuLado;
    private javax.swing.JTextField txtCuPerimetro;
    private javax.swing.JTextField txtRAltura;
    private javax.swing.JTextField txtRArea;
    private javax.swing.JTextField txtRBase;
    private javax.swing.JTextField txtRPerimetro;
    private javax.swing.JTextField txtTAltura;
    private javax.swing.JTextField txtTArea;
    private javax.swing.JTextField txtTBase;
    private javax.swing.JTextField txtTPerimetro;
    private javax.swing.JTextField txtTTipo;
    // End of variables declaration//GEN-END:variables
}
