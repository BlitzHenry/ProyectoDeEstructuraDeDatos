
import javax.swing.JOptionPane;

public class Farmacia extends javax.swing.JFrame {
    
    private NodoCola inicio;
    private NodoCola fin;
    private NodoListaSimple cabeza;
    private NodoListaDoble inicioLED;

    public Farmacia() {
        initComponents();
        setTitle("INICIO");
        setSize(805,650);
        setResizable(false);
        setLocationRelativeTo(null);
        llenarCombo();
        this.inicio=null;
        this.fin=null;
        this.cabeza=null;
    }
    
    public boolean vaciaC(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean vaciaL(){
        if(cabeza==null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean vaciaLED(){
        if(inicioLED==null){
            return true;
        }else{
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Farmacia");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Medicamentos:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Ficha:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Ver Cola");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Ver Lista Entrega Medicamentos");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Ver Lista Entrega Medicamentos Doble");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Inicio().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int seguir=0;
            if(seguir==0){
            llenarCola();
            seguir=JOptionPane.showConfirmDialog(null, "Desea agregar otro paciente?");
            limpiar();
            }     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarCola();
        colaaLista();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mostrarLista();
        listaSimpleaDoble();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mostrarListaDoble();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Farmacia().setVisible(true);
            }
        });
    }
    
    public void llenarCombo(){
        int numFicha[]=new int[10];
        int num=1;
        for(int i=0;i<numFicha.length;i++){
            numFicha[i]=num;
            jComboBox1.addItem(String.valueOf(numFicha[i]));     
            num++;
        }
    }
    
    public void limpiar(){
        jComboBox1.setSelectedItem(0);
        jTextField1.setText("");
        jTextArea1.setText("");
    }
    
    public void llenarCola(){
        FarmaciaDato farm=new FarmaciaDato();
        farm.setFicha(Integer.parseInt(jComboBox1.getSelectedItem().toString()));
        farm.setNombre(jTextField1.getText());
        farm.setMedic(jTextArea1.getText());
        NodoCola n=new NodoCola();
        n.setElemento(farm);
        if(vaciaC()){
            inicio=n;
            fin=n;
        }else{
            fin.setSiguienteCola(n);
            fin=n;
        }
    }
    
    public void mostrarCola(){
        String s="";
        if(vaciaC()==false){
            NodoCola aux=inicio;
            while(aux!=null){
                s=s+" "+aux.getElemento().getFicha()+" | "+aux.getElemento().getNombre()+" | "+aux.getElemento().getMedic()+" -> ";
                aux=aux.getSiguienteCola();
            }
            JOptionPane.showMessageDialog(null, "Cola de espera en farmacia:\n\n"+s);
        }else{
            JOptionPane.showMessageDialog(null, "Cola vacia!");
        }
    }
    
    public void colaaLista(){
        NodoCola aux=inicio;
        while(aux!=null){
            llenarLista(aux.getElemento());
            aux=aux.getSiguienteCola();
        }
    }
    
    public void llenarLista(FarmaciaDato farm){
        NodoListaSimple n=new NodoListaSimple(); 
        n.setElemento(farm); 
        if(vaciaL()){
            cabeza=n;
        }else if(farm.getFicha()<cabeza.getElemento().getFicha()){ 
                n.setSiguiente(cabeza);
                cabeza=n;
        }else if(cabeza.getSiguiente()==null){ 
                cabeza.setSiguiente(n);
        }else{
            NodoListaSimple aux=cabeza; 
            while((aux.getSiguiente()!=null)&&(aux.getSiguiente().getElemento().getFicha()<farm.getFicha())){
                aux=aux.getSiguiente();
            } 
            n.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(n);
        }               
    }
    
    public void listaSimpleaDoble(){
        NodoListaSimple aux=cabeza;
        while(aux!=null){
            llenarListaDoble(aux.getElemento());
            aux=aux.getSiguiente();
        }
    }
    
    public void llenarListaDoble(FarmaciaDato farm){
        NodoListaDoble n=new NodoListaDoble();
        n.setElemento(farm);
        if(vaciaLED()){
            inicioLED=n;
        }else if(farm.getFicha()<inicioLED.getElemento().getFicha()){
            n.setSiguiente(inicioLED);
            inicioLED.setAnterior(n);
            inicioLED=n;
        }else if(inicioLED.getSiguiente()==null){
            inicioLED.setSiguiente(n);
            n.setAnterior(inicioLED);
        }else{
            NodoListaDoble aux=inicioLED;
            while((aux.getSiguiente()!=null)&&(aux.getSiguiente().getElemento().getFicha()<farm.getFicha())){
                aux=aux.getSiguiente();
            }
            n.setSiguiente(aux.getSiguiente());
            n.setAnterior(aux.getAnterior());
            aux.setSiguiente(n);
            n.setAnterior(aux);
        }
    }
    
    public void mostrarLista(){
        String s="";
        if(vaciaL()==false){
            NodoListaSimple aux=cabeza;
            while(aux!=null){
                s=s+aux.getElemento().getFicha()+"-"+aux.getElemento().getNombre()+"-"+aux.getElemento().getMedic()+" --> ";
                aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene:\n"+s);
        }else{
            JOptionPane.showMessageDialog(null, "Lista vacía!");
        }
    }
    
    public void mostrarListaDoble(){
        String s="";
        if(vaciaLED()==false){
            NodoListaDoble aux=inicioLED;
            while(aux!=null){
                s=s+aux.getElemento().getFicha()+"="+aux.getElemento().getNombre()+"="+aux.getElemento().getMedic()+" ==> ";
                aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista enlazada doble contiene:\n"+s);
        }else{
            JOptionPane.showMessageDialog(null, "Lista enlazada doble vacia!");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
