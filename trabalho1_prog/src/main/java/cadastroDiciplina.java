
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cliente
 */
public class cadastroDiciplina extends javax.swing.JFrame {
    ArrayList<Tecnico> infoTec=new ArrayList();
    ArrayList<Aluno> infoAluno=new ArrayList();
    ArrayList<Funcionario> infoFunci=new ArrayList();
    ArrayList<Professor> infoPro=new ArrayList();
    ArrayList<Curso> infoCurso = new ArrayList();
    ArrayList<Diciplinas> infoDic = new ArrayList();
    /**
     * Creates new form cadastroDiciplina
     */
    public cadastroDiciplina() {
        initComponents();
    }

    public cadastroDiciplina(ArrayList<Aluno> infAlu, ArrayList<Tecnico> infTecn,
    ArrayList<Funcionario> infFuncio, ArrayList<Professor> infProf,
    ArrayList<Curso> infCursos, ArrayList<Diciplinas> infDici) {
        
        initComponents();
        infoAluno=infAlu;
        infoTec=infTecn;
        infoFunci=infFuncio;
        infoPro=infProf;
        infoCurso=infCursos;
        infoDic=infDici;
        mostraescolha();
        mostraCursos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        carga = new javax.swing.JTextField();
        lista = new javax.swing.JComboBox<>();
        cadastra = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cursos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Carga Horária:");

        jLabel4.setText("Docente responsável:");

        lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um docente" }));
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        cadastra.setText("Registrar");
        cadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel5.setText("Curso:");

        cursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um curso" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigo)
                    .addComponent(nome)
                    .addComponent(carga)
                    .addComponent(lista, 0, 446, Short.MAX_VALUE)
                    .addComponent(cursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastra)
                    .addComponent(voltar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraActionPerformed
        // TODO add your handling code here:
        if(lista.getSelectedItem().equals("opte por um professor") || cursos.getSelectedItem().equals("opte por um curso")){
            JOptionPane.showMessageDialog(null, "opte por um professor ou por um curso");
        }else{
            Diciplinas dic=new Diciplinas();
            dic.setCargaHoraria(Integer.valueOf(carga.getText()));
            dic.setCodigo(Integer.valueOf(codigo.getText()));
            dic.setNome(nome.getText());
            dic.setProfessor(pega((String) lista.getSelectedItem()));
            dic.setCurso(pegaCurso((String) cursos.getSelectedItem()));
            infoDic.add(dic);
            JOptionPane.showMessageDialog(null, "resgistrado");
            tgeral prin=new tgeral(infoAluno,infoTec,infoFunci,infoPro,infoCurso,infoDic);
            prin.setLocationRelativeTo(null);
            prin.setVisible(true); 
            dispose();
        }
    }//GEN-LAST:event_cadastraActionPerformed

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        tgeral prin=new tgeral(infoAluno,infoTec,infoFunci,infoPro,infoCurso,infoDic);
        prin.setLocationRelativeTo(null);
        prin.setVisible(true); 
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroDiciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new cadastroDiciplina().setVisible(true);
        });
    }
    public void mostraescolha(){
        if(0<infoPro.size()){
            for(int i=0;i<infoPro.size();i++){
                lista.addItem(infoPro.get(i).getNome());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "registros de prfessores inexistentes");
        }
        }
    public void mostraCursos(){
        if(0<infoCurso.size()){
            for(int i=0;i<infoCurso.size();i++){
                cursos.addItem(infoCurso.get(i).getNome());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "registros de cursos inexistentes");
        }
        }
    public Professor pega(String nome){
        for(int i=0;i<infoPro.size();i++){
            if(nome.equals(infoPro.get(i).getNome())){
                return infoPro.get(i);
            }
        }
        return null;
    }
    public Curso pegaCurso(String nome){
        for(int i=0;i<infoCurso.size();i++){
            if(nome.equals(infoCurso.get(i).getNome())){
                return infoCurso.get(i);
            }
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastra;
    private javax.swing.JTextField carga;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox<String> cursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> lista;
    private javax.swing.JTextField nome;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
