import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {
    static String usuario;
    //variaveis busca produto
      static int codbuscaproduto,idtipopro;
      static String descricao;
      static String unidade;
      
      //Variaveis NF-e
      static String  txtSerie,txtNf,txtDataemissao,txtDatasaida,txtHoraSaida,XNome,XFantasia,IE,IEST,IM,CNAE,CRT,CNPJ,
              XLgr,Nro,Cpl,Bairro,CMun,XMun,UF,CEP,fone,
              razaoCliente,IECliente,emailCliente,
              CNPJCli,LogrCli,NroCli,BairroCli,codMunCli,MunCli,UFCli,CEPCli,foneCli,
              nItem,codProd,descPro,NCM,CFOP,UnidMed,Qtde,vlrUnit,vlrProd,UnidTrib,QtdeTrib,vlrUnitTrib,
              RazaoTransp,IETransp,LogrTransp,UFTransp,CidadeTransp,CNPJTransp,Placa,UFPlaca,
              NFat,VlrOrig,VlrLiq,pesoBruto,
              nDup,dataVenc,VlrDup,textolegal;
              
      
      


 
    public frmPrincipal() {
        initComponents();
      //  iduser.setText(usuario);
         DBCon.connectDB();
         QueryFornecedor.execQuery();
         QueryRecebimento.execQuery();
 
        // QueryProduto.execQuery();
         QueryGruPro.execQuery();
         QuerySubGru.execQuery();
         QueryTipoPro.execQuery();
         QueryOP.execQuery();
         QueryIteOP.execQuery();
         QueryCliente.execQuery();
         QueryTransp.execQuery();
         QueryUsuario.execQuery();
         QueryUserAt.execQuery();
        // QueryVendas.execQuery();
         //QueryVendasItem.execQuery();
         QueryEstabelecimento.execQuery();
         
         //QueryPedidoItem.execQuery();
        // System.out.println(QueryPedido.getParameters().toString());
        instrucaoTipoPessoa.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QueryPedido = new lib.jdb.jdbquery.JDBQuery();
        DBCon = new lib.jdb.connection.JDBConnection();
        QueryFornecedor = new lib.jdb.jdbquery.JDBQuery();
        jDBLookUpField1 = new lib.jdb.control.jdblookupfield.JDBLookUpField();
        QueryPedidoItem = new lib.jdb.jdbquery.JDBQuery();
        QueryRecebimento = new lib.jdb.jdbquery.JDBQuery();
        QueryProduto = new lib.jdb.jdbquery.JDBQuery();
        QueryGruPro = new lib.jdb.jdbquery.JDBQuery();
        QueryBuscaForn = new lib.jdb.jdbquery.JDBQuery();
        QuerySubGru = new lib.jdb.jdbquery.JDBQuery();
        QueryTipoPro = new lib.jdb.jdbquery.JDBQuery();
        QueryOP = new lib.jdb.jdbquery.JDBQuery();
        QueryIteOP = new lib.jdb.jdbquery.JDBQuery();
        QueryCliente = new lib.jdb.jdbquery.JDBQuery();
        QueryTransp = new lib.jdb.jdbquery.JDBQuery();
        QueryUsuario = new lib.jdb.jdbquery.JDBQuery();
        QueryUserAt = new lib.jdb.jdbquery.JDBQuery();
        QueryVendas = new lib.jdb.jdbquery.JDBQuery();
        QueryVendasItem = new lib.jdb.jdbquery.JDBQuery();
        QueryEstabelecimento = new lib.jdb.jdbquery.JDBQuery();
        QueryVeItem = new lib.jdb.jdbquery.JDBQuery();
        QuerySomaItensPed = new lib.jdb.jdbquery.JDBQuery();
        QueryRecebimentoItem = new lib.jdb.jdbquery.JDBQuery();
        QueryPedRec = new lib.jdb.jdbquery.JDBQuery();
        QueryItePedRec = new lib.jdb.jdbquery.JDBQuery();
        QueryQtdItem = new lib.jdb.jdbquery.JDBQuery();
        QueryAltEst = new lib.jdb.jdbquery.JDBQuery();
        QueryBuscaCli = new lib.jdb.jdbquery.JDBQuery();
        QueryNFE = new lib.jdb.jdbquery.JDBQuery();
        jToolBar1 = new javax.swing.JToolBar();
        jDBImageBlob1 = new lib.jdb.control.jdbimageblob.JDBImageBlob();
        btnCompras = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnProducao = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        PaneCompras = new javax.swing.JTabbedPane();
        frmFornecedor = new javax.swing.JPanel();
        btnCancelCad1 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        btnDeleteCad1 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        btnNewCad1 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonSave1 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jLabel15 = new javax.swing.JLabel();
        txtIdFornecedor = new lib.jdb.control.jdbtextfield.JDBTextField();
        txt_id_user_cad = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtRazaoCad = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField17 = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtCpfCad = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtInsEstCad = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField21 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField22 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField25 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField26 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField28 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField29 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField30 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount2 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount3 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount5 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount6 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount7 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount8 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount9 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount10 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount11 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount14 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount15 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount16 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount17 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount18 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount19 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount20 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount21 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jButton11 = new javax.swing.JButton();
        jDBComboBox1 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        cboxTipoPessoa = new lib.jdb.control.jdbcombobox.JDBComboBox();
        jDBComboBox3 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        btnProxCad1 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        btnAntCad1 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBTextField14 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel103 = new javax.swing.JLabel();
        jDBTextField16 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel104 = new javax.swing.JLabel();
        instrucaoTipoPessoa = new javax.swing.JLabel();
        txtCnpjForn = new lib.jdb.control.jdbtextfield.JDBTextField();
        frmPedido = new javax.swing.JPanel();
        id_pedido = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtidforn = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField5 = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtnomefor = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcnpjfor = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel12 = new javax.swing.JLabel();
        paneItensPed = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableiteped = new lib.jdb.control.jdbtable.JDBTable();
        btnnovoitem = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        btnproximoitem = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        btnanterioritem = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        btnexcluiitem = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        btncancelitem = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        btnsaveitens = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        btnatualizaitem = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();
        btnbuscapro = new javax.swing.JButton();
        btnexcluirped = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        btnnovoped = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        btnsalvaped = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        btncancelaped = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jButton8 = new javax.swing.JButton();
        jDBTextField4 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount1 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        txtsituacao = new javax.swing.JTextField();
        txtdataemi = new com.toedter.calendar.JDateChooser();
        btnBuscaPedido = new javax.swing.JButton();
        txtValorFrete = new javax.swing.JTextField();
        txtValorIpi = new javax.swing.JTextField();
        txtValorIcms = new javax.swing.JTextField();
        txtValorTotal = new javax.swing.JTextField();
        id_pedidoN = new lib.jdb.control.jdbtextfield.JDBTextField();
        frmRecebimento = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        txtVlrMerc = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField31 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField32 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField33 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField34 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField35 = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtdatarec = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtdatacad = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField38 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField40 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount13 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount22 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount23 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount24 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount25 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount26 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount27 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount28 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount29 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount30 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount31 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount32 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField39 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount33 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDBTable2 = new lib.jdb.control.jdbtable.JDBTable();
        btnsalvaitem = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        btnverificaitem = new javax.swing.JButton();
        btnnovorec = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        btncancelrec = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        btnsalvarrec = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        btnexcluirrec = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        idforrec = new lib.jdb.control.jdbtextfield.JDBTextField();
        idpedrec = new lib.jdb.control.jdbtextfield.JDBTextField();
        idforrecN = new lib.jdb.control.jdbtextfield.JDBTextField();
        idpedrecN = new lib.jdb.control.jdbtextfield.JDBTextField();
        frmRelComp = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        PaneEstoque = new javax.swing.JTabbedPane();
        frmGrupoPro = new javax.swing.JPanel();
        jDBTextField50 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField55 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField56 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField57 = new lib.jdb.control.jdbtextfield.JDBTextField();
        btcancelagru = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        btexcluigru = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        btprimeirogru = new lib.jdb.control.jdbbuttonfirst.JDBButtonFirst();
        btultimogru = new lib.jdb.control.jdbbuttonlast.JDBButtonLast();
        btnovogru = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        btanteriorgru = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        btproximogru = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        btsalvagru = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        btatualizagru = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();
        jDBLabelCount48 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount49 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount50 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount51 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jLabel18 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        frmSubGrupoPro = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jDBTextField11 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField15 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount12 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount52 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount53 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLookUpComboBox1 = new lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox();
        btsalvasub = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        btnovosub = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        btcancelasub = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        btatualizasub = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();
        btexcluisub = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        btprimeirosub = new lib.jdb.control.jdbbuttonfirst.JDBButtonFirst();
        btanteriorsub = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        btproximosub = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        btultimosub = new lib.jdb.control.jdbbuttonlast.JDBButtonLast();
        jButton16 = new javax.swing.JButton();
        frmTipoPro = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jDBTextField58 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField59 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField60 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btcancelatipo = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        btnovotipo = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        btsalvatipo = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        btexcluitipo = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        btatualizatipo = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();
        btprimeirotipo = new lib.jdb.control.jdbbuttonfirst.JDBButtonFirst();
        btanteriortipo = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        btproximotipo = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        btultimotipo = new lib.jdb.control.jdbbuttonlast.JDBButtonLast();
        jButton17 = new javax.swing.JButton();
        frmProdutos = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jDBTextField41 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField42 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField43 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField44 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField45 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField46 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField47 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField48 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField49 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField51 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount34 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount35 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount36 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount37 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount38 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount39 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount40 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount41 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount42 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount43 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount44 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount45 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField54 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount46 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount47 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextArea1 = new lib.jdb.control.jdbtextarea.JDBTextArea();
        jButton12 = new javax.swing.JButton();
        btnovopro = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        btcancelapro = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        btsalvapro = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        btexcluipro = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBLookUpComboBox2 = new lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox();
        jDBLookUpComboBox3 = new lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox();
        jDBTextField129 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel79 = new javax.swing.JLabel();
        btanteriorpro = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        btproximopro = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBTextField1 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel93 = new javax.swing.JLabel();
        PaneProducao = new javax.swing.JTabbedPane();
        frmProducao = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtidop = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField52 = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtanoop = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField61 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField63 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField64 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField65 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField66 = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtiduser = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        novoiteop = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        canceliteop = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        salvaiteop = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        excluiiteop = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jScrollPane3 = new javax.swing.JScrollPane();
        jDBTable3 = new lib.jdb.control.jdbtable.JDBTable();
        finalizaiteop = new javax.swing.JButton();
        btnbuscaproduto = new javax.swing.JButton();
        jDBTextArea2 = new lib.jdb.control.jdbtextarea.JDBTextArea();
        novoop = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        cancelop = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        salvaop = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        excluiop = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        sairop = new javax.swing.JButton();
        jDBComboBox2 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        BtnEncerraOp = new javax.swing.JButton();
        txtidopN = new lib.jdb.control.jdbtextfield.JDBTextField();
        PaneVendas = new javax.swing.JTabbedPane();
        Clientes = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jDBLabelCount4 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField69 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount54 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBComboBox4 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        jDBLabelCount55 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBComboBox5 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        jDBTextField70 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount56 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount57 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField71 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount58 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField72 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount59 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField73 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField74 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount60 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField75 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount61 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField76 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount62 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField77 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount63 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField78 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount64 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField79 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount65 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBComboBox6 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        jDBLabelCount66 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField80 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount67 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField81 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount68 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount69 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField82 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBButtonCancel12 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonSave11 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonDelete12 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBButtonNew13 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBTextField128 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel78 = new javax.swing.JLabel();
        jDBTextField12 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel101 = new javax.swing.JLabel();
        jDBTextField13 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel102 = new javax.swing.JLabel();
        jDBButtonNext1 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonPrevious1 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        Transportadora = new javax.swing.JPanel();
        jDBLabelCount70 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField83 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBComboBox7 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        jDBLabelCount71 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBComboBox8 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        jDBLabelCount72 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField84 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount73 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount74 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField85 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount75 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField86 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount76 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField87 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField88 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount77 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField89 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount78 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField90 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount79 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField91 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount80 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField92 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount81 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBButtonNew14 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonCancel13 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonDelete13 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBTextField93 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount82 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBComboBox9 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        jDBLabelCount83 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField94 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount84 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField95 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount85 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField96 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount86 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBButtonSave12 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jLabel36 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jDBTextField18 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField19 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jDBButtonNext2 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonPrevious2 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        Vendas = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtidpedido = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtdatapedido = new lib.jdb.control.jdbtextfield.JDBTextField();
        txttransp = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField104 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField105 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField106 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField107 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField108 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField109 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField110 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField111 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField112 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField113 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField114 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField115 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField116 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField117 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField118 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField119 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField120 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField121 = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtidtransp = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField123 = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtidcli = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField125 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jDBTextField126 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel76 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jDBTable4 = new lib.jdb.control.jdbtable.JDBTable();
        btncanceliteve = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        btnexcluiiteve = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        btnnovoiteve = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        btnsalvaiteve = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        btnfinalizaitens = new javax.swing.JButton();
        btnnovave = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        btncancelave = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        btnsalvave = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        btnexcluive = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        btnsairve = new javax.swing.JButton();
        jDBTextField20 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jDBComboBox11 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        jDBTextField23 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jDBTextArea3 = new lib.jdb.control.jdbtextarea.JDBTextArea();
        txtidpedidoN = new lib.jdb.control.jdbtextfield.JDBTextField();
        NFE = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtPedidoNfe = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        PaneAdm = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jDBTextField130 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel81 = new javax.swing.JLabel();
        jDBTextField131 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField132 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField133 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField134 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField135 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField136 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField137 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField138 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField139 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField140 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jDBButtonNew17 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonCancel17 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonDelete16 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBButtonSave16 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBTextField2 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField3 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField6 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField7 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField8 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField9 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jDBTextField10 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel100 = new javax.swing.JLabel();
        jDBComboBox10 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        frmUsuario = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jDBTextField67 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField97 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField98 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField99 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField100 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jDBRadioButton2 = new lib.jdb.control.jdbradiobutton.JDBRadioButton();
        jDBRadioButton3 = new lib.jdb.control.jdbradiobutton.JDBRadioButton();
        jDBRadioButton4 = new lib.jdb.control.jdbradiobutton.JDBRadioButton();
        jDBRadioButton5 = new lib.jdb.control.jdbradiobutton.JDBRadioButton();
        jDBButtonNew12 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonCancel14 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonSave13 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonRefresh5 = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();
        jDBButtonFirst4 = new lib.jdb.control.jdbbuttonfirst.JDBButtonFirst();
        jDBButtonPrevious6 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBButtonNext6 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonLast4 = new lib.jdb.control.jdbbuttonlast.JDBButtonLast();
        jDBButtonDelete14 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBRadioButton1 = new lib.jdb.control.jdbradiobutton.JDBRadioButton();

        QueryPedido.setJDBConnection(DBCon);
        QueryPedido.setSQL("select * from CPCADPED");

        DBCon.setURL("jdbc:mysql://localhost/woodsoft");
        DBCon.setDriver("com.mysql.jdbc.Driver");
        DBCon.setUserName("root");

        QueryFornecedor.setJDBConnection(DBCon);
        QueryFornecedor.setSQL("Select * from CLIFORTR where tipo = 'Fornecedor'");
        QueryFornecedor.setSaveManually(true);
        QueryFornecedor.addSaveManuallyEventListener(new lib.jdb.jdbquery.event.SaveManuallyEventListener() {
            public void onSaveManually(lib.jdb.jdbquery.event.SaveManuallyEventObject evt) {
                QueryFornecedorOnSaveManually(evt);
            }
        });

        QueryPedidoItem.setJDBConnection(DBCon);
        QueryPedidoItem.setSQL("select * from CPITEPED");

        QueryRecebimento.setJDBConnection(DBCon);
        QueryRecebimento.setSQL("select * from cpcadrec where id_pedido = -1");

        QueryProduto.setJDBConnection(DBCon);
        QueryProduto.setSQL("");

        QueryGruPro.setJDBConnection(DBCon);
        QueryGruPro.setSQL("select * from ESGRUPRO");

        QueryBuscaForn.setJDBConnection(DBCon);
        QueryBuscaForn.setSQL("");

        QuerySubGru.setJDBConnection(DBCon);
        QuerySubGru.setSQL("Select * from essubgru");

        QueryTipoPro.setJDBConnection(DBCon);
        QueryTipoPro.setSQL("select * from ESTIPPRO");

        QueryOP.setJDBConnection(DBCon);
        QueryOP.setSQL("select  * from procadop");

        QueryIteOP.setJDBConnection(DBCon);
        QueryIteOP.setSQL("select * from proiteop");

        QueryCliente.setJDBConnection(DBCon);
        QueryCliente.setSQL("select * from CLIFORTR where tipo = 'Cliente'");

        QueryTransp.setJDBConnection(DBCon);
        QueryTransp.setSQL("select * from CLIFORTR where tipo = 'Transportadora'");

        QueryUsuario.setJDBConnection(DBCon);
        QueryUsuario.setSQL("select * from USUARIO");

        QueryUserAt.setJDBConnection(DBCon);
        QueryUserAt.setSQL("select * from USUARIO");

        QueryVendas.setJDBConnection(DBCon);
        QueryVendas.setSQL("select * from vecadped");

        QueryVendasItem.setJDBConnection(DBCon);
        QueryVendasItem.setSQL("select * from veiteped");

        QueryEstabelecimento.setJDBConnection(DBCon);
        QueryEstabelecimento.setSQL("select * from estab");

        QueryVeItem.setJDBConnection(DBCon);
        QueryVeItem.setSQL("");

        QuerySomaItensPed.setJDBConnection(DBCon);
        QuerySomaItensPed.setSQL("");

        QueryRecebimentoItem.setJDBConnection(DBCon);
        QueryRecebimentoItem.setSQL("");

        QueryPedRec.setJDBConnection(DBCon);
        QueryPedRec.setSQL("");

        QueryItePedRec.setJDBConnection(DBCon);
        QueryItePedRec.setSQL("");

        QueryQtdItem.setJDBConnection(DBCon);
        QueryQtdItem.setSQL("");

        QueryAltEst.setJDBConnection(DBCon);
        QueryAltEst.setSQL("");

        QueryBuscaCli.setJDBConnection(DBCon);
        QueryBuscaCli.setSQL("");

        QueryNFE.setJDBConnection(DBCon);
        QueryNFE.setSQL("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WOOD SOFT");
        setAutoRequestFocus(false);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                esconder(evt);
            }
        });

        jToolBar1.setRollover(true);

        btnCompras.setText("COMPRAS");
        btnCompras.setToolTipText("");
        btnCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprasMouseClicked(evt);
            }
        });
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        btnEstoque.setText("ESTOQUE");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnVendas.setText("VENDAS");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnAdmin.setText("ADMINISTRAÇÃO");
        btnAdmin.setToolTipText("");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        jButton7.setText("AJUDA");

        btnProducao.setText("PRODUÇÃO");
        btnProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducaoActionPerformed(evt);
            }
        });

        jButton6.setText("SAIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout jDBImageBlob1Layout = new javax.swing.GroupLayout(jDBImageBlob1);
        jDBImageBlob1.setLayout(jDBImageBlob1Layout);
        jDBImageBlob1Layout.setHorizontalGroup(
            jDBImageBlob1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDBImageBlob1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jDBImageBlob1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jDBImageBlob1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProducao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDBImageBlob1Layout.setVerticalGroup(
            jDBImageBlob1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDBImageBlob1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(26, 26, 26)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(23, 23, 23))
        );

        PaneCompras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PaneComprasFocusLost(evt);
            }
        });
        PaneCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaneComprasMouseEntered(evt);
            }
        });

        frmFornecedor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                frmFornecedorMouseMoved(evt);
            }
        });
        frmFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                frmFornecedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                frmFornecedorFocusLost(evt);
            }
        });

        btnCancelCad1.setJDBQuery(QueryFornecedor);
        btnCancelCad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelCad1ActionPerformed(evt);
            }
        });

        btnDeleteCad1.setJDBQuery(QueryFornecedor);
        btnDeleteCad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCad1ActionPerformed(evt);
            }
        });

        btnNewCad1.setJDBQuery(QueryFornecedor);
        btnNewCad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCad1ActionPerformed(evt);
            }
        });

        jDBButtonSave1.setJDBQuery(QueryFornecedor);
        jDBButtonSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonSave1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel15.setText("Cadastro de Fornecedores");

        txtIdFornecedor.setJDBQuery(QueryFornecedor);
        txtIdFornecedor.setEnabled(false);
        txtIdFornecedor.setFieldName("idclifor");
        txtIdFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFornecedorFocusLost(evt);
            }
        });

        txt_id_user_cad.setJDBQuery(QueryFornecedor);
        txt_id_user_cad.setEnabled(false);
        txt_id_user_cad.setFieldName("id_usuario");

        txtRazaoCad.setJDBQuery(QueryFornecedor);
        txtRazaoCad.setFieldName("razao");
        txtRazaoCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaoCadActionPerformed(evt);
            }
        });

        jDBTextField17.setJDBQuery(QueryFornecedor);
        jDBTextField17.setFieldName("fantasia");

        txtCpfCad.setJDBQuery(QueryFornecedor);
        txtCpfCad.setFieldName("cpf");

        txtInsEstCad.setJDBQuery(QueryFornecedor);
        txtInsEstCad.setFieldName("inscEst");

        jDBTextField21.setJDBQuery(QueryFornecedor);
        jDBTextField21.setFieldName("endereco");

        jDBTextField22.setJDBQuery(QueryFornecedor);
        jDBTextField22.setFieldName("bairro");

        jDBTextField25.setJDBQuery(QueryFornecedor);
        jDBTextField25.setFieldName("email");

        jDBTextField26.setJDBQuery(QueryFornecedor);
        jDBTextField26.setFieldName("telefone");

        jDBTextField28.setJDBQuery(QueryFornecedor);
        jDBTextField28.setFieldName("contato");

        jDBTextField29.setJDBQuery(QueryFornecedor);
        jDBTextField29.setFieldName("cep");
        jDBTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField29ActionPerformed(evt);
            }
        });

        jDBTextField30.setJDBQuery(QueryFornecedor);
        jDBTextField30.setFieldName("cidade");

        jDBLabelCount2.setText("ID Fornecedor");

        jDBLabelCount3.setText("Pessoa");

        jDBLabelCount5.setText("Razão");

        jDBLabelCount6.setText("Fantasia");

        jDBLabelCount7.setText("CNPJ");

        jDBLabelCount8.setText("CPF");

        jDBLabelCount9.setText("Inscrição Estadual");

        jDBLabelCount10.setText("Endereço");

        jDBLabelCount11.setText("Bairro");

        jDBLabelCount14.setText("Telefone");

        jDBLabelCount15.setText("E-mail");

        jDBLabelCount16.setText("Situação");

        jDBLabelCount17.setText("Nome Contato");

        jDBLabelCount18.setText("CEP");

        jDBLabelCount19.setText("Cidade");

        jDBLabelCount20.setText("UF");

        jDBLabelCount21.setText("ID Usuário");

        jButton11.setText("Sair");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jDBComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jDBComboBox1.setJDBQuery(QueryFornecedor);
        jDBComboBox1.setFieldName("uf");

        cboxTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jurídica", "Física" }));
        cboxTipoPessoa.setJDBQuery(QueryFornecedor);
        cboxTipoPessoa.setFieldName("pessoa");
        cboxTipoPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxTipoPessoaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboxTipoPessoaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cboxTipoPessoaMouseReleased(evt);
            }
        });
        cboxTipoPessoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboxTipoPessoaFocusLost(evt);
            }
        });

        jDBComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo", "Inapto", " " }));
        jDBComboBox3.setJDBQuery(QueryFornecedor);
        jDBComboBox3.setFieldName("situacao");

        btnProxCad1.setJDBQuery(QueryFornecedor);
        btnProxCad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProxCad1ActionPerformed(evt);
            }
        });

        btnAntCad1.setJDBQuery(QueryFornecedor);
        btnAntCad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntCad1ActionPerformed(evt);
            }
        });

        jDBTextField14.setJDBQuery(QueryFornecedor);
        jDBTextField14.setFieldName("cod_mun");

        jLabel103.setText("Cod. Município IBGE");

        jDBTextField16.setJDBQuery(QueryFornecedor);
        jDBTextField16.setFieldName("numero");

        jLabel104.setText("Numero");

        instrucaoTipoPessoa.setText("Selecione Pessoa Física/Jurídica para habilitar os campos abaixo");

        txtCnpjForn.setJDBQuery(QueryFornecedor);
        txtCnpjForn.setFieldName("cnpj");

        javax.swing.GroupLayout frmFornecedorLayout = new javax.swing.GroupLayout(frmFornecedor);
        frmFornecedor.setLayout(frmFornecedorLayout);
        frmFornecedorLayout.setHorizontalGroup(
            frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBLabelCount14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNewCad1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBLabelCount17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                                        .addComponent(jDBTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                                        .addComponent(txt_id_user_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                                        .addComponent(jDBLabelCount15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDBLabelCount21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(109, 109, 109))
                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmFornecedorLayout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(cboxTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBLabelCount16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jDBTextField17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                                    .addComponent(txtRazaoCad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBLabelCount7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCnpjForn, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpfCad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBLabelCount8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                                        .addComponent(jDBLabelCount9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtInsEstCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBLabelCount10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(jDBLabelCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                        .addGap(270, 270, 270)
                                                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jDBTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jDBLabelCount19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jDBTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jLabel104))
                                                                .addGap(38, 38, 38)
                                                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jDBLabelCount11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jDBTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(33, 33, 33)
                                                                .addComponent(jDBLabelCount18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(56, 56, 56)
                                                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jDBLabelCount20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jDBComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmFornecedorLayout.createSequentialGroup()
                                                        .addGap(604, 604, 604)
                                                        .addComponent(jDBTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(50, 50, 50)
                                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jDBTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel103)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmFornecedorLayout.createSequentialGroup()
                                                .addGap(343, 343, 343)
                                                .addComponent(instrucaoTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50))))
                                    .addComponent(jDBTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBLabelCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                                        .addGap(177, 177, 177)
                                        .addComponent(btnCancelCad1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(btnDeleteCad1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(btnAntCad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnProxCad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        frmFornecedorLayout.setVerticalGroup(
            frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmFornecedorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jButton11))
                .addGap(76, 76, 76)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instrucaoTipoPessoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRazaoCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInsEstCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCnpjForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jDBLabelCount10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBLabelCount18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel103))
                            .addComponent(jLabel104))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jDBTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDBTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                        .addComponent(jDBLabelCount11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_user_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelCad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteCad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewCad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProxCad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAntCad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        PaneCompras.addTab("Fornecedores", frmFornecedor);

        frmPedido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                frmPedidoMouseMoved(evt);
            }
        });
        frmPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frmPedidoMouseClicked(evt);
            }
        });

        id_pedido.setJDBQuery(QueryPedido);
        id_pedido.setFieldName("id_pedido");
        id_pedido.setName(""); // NOI18N
        id_pedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_pedidoKeyPressed(evt);
            }
        });
        id_pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_pedidoMouseClicked(evt);
            }
        });
        id_pedido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_pedidoFocusLost(evt);
            }
        });

        txtidforn.setJDBQuery(QueryPedido);
        txtidforn.setFieldName("cod_fornecedor");
        txtidforn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtidfornFocusLost(evt);
            }
        });

        jDBTextField5.setJDBQuery(QueryPedido);
        jDBTextField5.setEnabled(false);
        jDBTextField5.setFieldName("data_alt");

        txtnomefor.setJDBQuery(QueryBuscaForn);
        txtnomefor.setEnabled(false);
        txtnomefor.setFieldName("razao");

        jLabel1.setText("ID Pedido");

        jLabel2.setText("ID Fornecedor");

        jLabel3.setText("Data Emissão");

        jLabel4.setText("Situação");

        jLabel5.setText("Data Alteração");

        jLabel6.setText("Valor Frete");

        jLabel7.setText("Valor IPI total");

        jLabel8.setText("Valor ICMS total");

        jLabel9.setText("Valor Total");

        jLabel10.setText("Nome do Fornecedor");

        jLabel11.setText("CNPJ");

        txtcnpjfor.setJDBQuery(QueryBuscaForn);
        txtcnpjfor.setEnabled(false);
        txtcnpjfor.setFieldName("cnpj");

        jLabel12.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel12.setText("Pedido de Compras");

        tableiteped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Código Produto", "Descrição do Item", "Quantidade", "Unidade", "Valor Unitário", "IPI", "ICMS", "Total do Item", "Valor frete", "Desconto"
            }
        ));
        tableiteped.setJDBQuery(QueryPedidoItem);
        tableiteped.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tableitepedInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        tableiteped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableitepedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableiteped);

        btnnovoitem.setJDBQuery(QueryPedidoItem);
        btnnovoitem.setEnabled(false);
        btnnovoitem.setLabel("");
        btnnovoitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoitemActionPerformed(evt);
            }
        });

        btnproximoitem.setJDBQuery(QueryPedidoItem);
        btnproximoitem.setEnabled(false);
        btnproximoitem.setLabel("");

        btnanterioritem.setJDBQuery(QueryPedidoItem);
        btnanterioritem.setEnabled(false);
        btnanterioritem.setLabel("");

        btnexcluiitem.setJDBQuery(QueryPedidoItem);
        btnexcluiitem.setEnabled(false);
        btnexcluiitem.setLabel("");
        btnexcluiitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluiitemActionPerformed(evt);
            }
        });

        btncancelitem.setJDBQuery(QueryPedidoItem);
        btncancelitem.setEnabled(false);
        btncancelitem.setLabel("");
        btncancelitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelitemActionPerformed(evt);
            }
        });

        btnsaveitens.setJDBQuery(QueryPedidoItem);
        btnsaveitens.setEnabled(false);
        btnsaveitens.setLabel("");
        btnsaveitens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveitensActionPerformed(evt);
            }
        });

        btnatualizaitem.setJDBQuery(QueryPedidoItem);
        btnatualizaitem.setEnabled(false);
        btnatualizaitem.setText("");
        btnatualizaitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizaitemActionPerformed(evt);
            }
        });

        btnbuscapro.setText("Buscar Produto");
        btnbuscapro.setEnabled(false);
        btnbuscapro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaproActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnnovoitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnanterioritem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnproximoitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsaveitens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnexcluiitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnatualizaitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnbuscapro)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnnovoitem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncancelitem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnanterioritem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnproximoitem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnatualizaitem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexcluiitem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsaveitens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbuscapro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        paneItensPed.addTab("Itens do Pedido", jPanel2);

        btnexcluirped.setJDBQuery(QueryPedido);
        btnexcluirped.setEnabled(false);
        btnexcluirped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirpedActionPerformed(evt);
            }
        });

        btnnovoped.setJDBQuery(QueryPedido);
        btnnovoped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovopedActionPerformed(evt);
            }
        });

        btnsalvaped.setJDBQuery(QueryPedido);
        btnsalvaped.setEnabled(false);
        btnsalvaped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvapedActionPerformed(evt);
            }
        });

        btncancelaped.setJDBQuery(QueryPedido);
        btncancelaped.setEnabled(false);
        btncancelaped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelapedActionPerformed(evt);
            }
        });

        jButton8.setText("Sair");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jDBTextField4.setJDBQuery(QueryPedido);
        jDBTextField4.setEnabled(false);
        jDBTextField4.setFieldName("id_usuario");
        jDBTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField4ActionPerformed(evt);
            }
        });

        jDBLabelCount1.setText("id usuario");

        txtsituacao.setEnabled(false);

        txtdataemi.setMaxSelectableDate(new java.util.Date(253370775684000L));

        btnBuscaPedido.setText("Buscar Pedido");
        btnBuscaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaPedidoActionPerformed(evt);
            }
        });

        txtValorFrete.setEnabled(false);
        txtValorFrete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorFreteActionPerformed(evt);
            }
        });

        txtValorIpi.setEnabled(false);

        txtValorIcms.setEnabled(false);

        txtValorTotal.setEnabled(false);

        id_pedidoN.setJDBQuery(QueryPedido);
        id_pedidoN.setEnabled(false);
        id_pedidoN.setFieldName("id_pedido");
        id_pedidoN.setName(""); // NOI18N
        id_pedidoN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_pedidoNKeyPressed(evt);
            }
        });
        id_pedidoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_pedidoNActionPerformed(evt);
            }
        });
        id_pedidoN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_pedidoNMouseClicked(evt);
            }
        });
        id_pedidoN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_pedidoNFocusLost(evt);
            }
        });

        javax.swing.GroupLayout frmPedidoLayout = new javax.swing.GroupLayout(frmPedido);
        frmPedido.setLayout(frmPedidoLayout);
        frmPedidoLayout.setHorizontalGroup(
            frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneItensPed, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmPedidoLayout.createSequentialGroup()
                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmPedidoLayout.createSequentialGroup()
                                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(frmPedidoLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(94, 94, 94)
                                        .addComponent(btnBuscaPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(frmPedidoLayout.createSequentialGroup()
                                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(frmPedidoLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE))
                                            .addGroup(frmPedidoLayout.createSequentialGroup()
                                                .addComponent(id_pedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(46, 46, 46)))
                                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtidforn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtnomefor, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))))
                                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmPedidoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcnpjfor, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(frmPedidoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnnovoped, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btncancelaped, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))))
                            .addGroup(frmPedidoLayout.createSequentialGroup()
                                .addComponent(id_pedidoN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmPedidoLayout.createSequentialGroup()
                                .addComponent(btnsalvaped, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnexcluirped, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmPedidoLayout.createSequentialGroup()
                                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addGroup(frmPedidoLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtValorIpi)))
                                .addGap(18, 18, 18)
                                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmPedidoLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jDBTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(frmPedidoLayout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(72, 72, 72)
                                                    .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel5)))
                                                .addGroup(frmPedidoLayout.createSequentialGroup()
                                                    .addComponent(txtsituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtdataemi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(frmPedidoLayout.createSequentialGroup()
                                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(txtValorIcms, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(frmPedidoLayout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtValorTotal))))
                                .addGap(5, 5, 5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmPedidoLayout.createSequentialGroup()
                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBLabelCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValorFrete)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(402, 402, 402)))
                .addContainerGap())
        );
        frmPedidoLayout.setVerticalGroup(
            frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmPedidoLayout.createSequentialGroup()
                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmPedidoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel12))
                    .addGroup(frmPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnexcluirped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnsalvaped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btncancelaped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnnovoped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton8))))
                .addGap(43, 43, 43)
                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmPedidoLayout.createSequentialGroup()
                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidforn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnomefor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcnpjfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtdataemi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(id_pedidoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jDBTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorIpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorIcms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(paneItensPed)
                .addContainerGap())
        );

        PaneCompras.addTab("Pedidos de Compras", frmPedido);

        // Gerencia campos do novo item
        idforrecN.setVisible(false);
        idpedrecN.setVisible(false);
        idforrec.setVisible(true);
        idpedrec.setVisible(true);

        jLabel14.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel14.setText("Recebimento de Compras");

        jButton9.setText("Sair");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        txtVlrMerc.setJDBQuery(QueryRecebimento);
        txtVlrMerc.setEnabled(false);
        txtVlrMerc.setFieldName("vlr_merc");

        jDBTextField31.setJDBQuery(QueryRecebimento);
        jDBTextField31.setEnabled(false);
        jDBTextField31.setFieldName("vlr_iss");

        jDBTextField32.setJDBQuery(QueryRecebimento);
        jDBTextField32.setFieldName("serie");

        jDBTextField33.setJDBQuery(QueryRecebimento);
        jDBTextField33.setEnabled(false);
        jDBTextField33.setFieldName("vlr_frete");

        jDBTextField34.setJDBQuery(QueryRecebimento);
        jDBTextField34.setEnabled(false);
        jDBTextField34.setFieldName("vlr_icms");

        jDBTextField35.setJDBQuery(QueryRecebimento);
        jDBTextField35.setEnabled(false);
        jDBTextField35.setFieldName("vlr_total");

        txtdatarec.setJDBQuery(QueryRecebimento);
        txtdatarec.setFieldName("data_rec");

        txtdatacad.setJDBQuery(QueryRecebimento);
        txtdatacad.setEnabled(false);
        txtdatacad.setFieldName("data_cad");

        jDBTextField38.setJDBQuery(QueryRecebimento);
        jDBTextField38.setEnabled(false);
        jDBTextField38.setFieldName("id_usuario");

        jDBTextField40.setJDBQuery(QueryRecebimento);
        jDBTextField40.setEnabled(false);
        jDBTextField40.setFieldName("vlr_ipi");

        jDBLabelCount13.setText("ID Fornecedor");

        jDBLabelCount22.setText("ID Pedido");

        jDBLabelCount23.setText("Valor Mercadoria");

        jDBLabelCount24.setText("Valor ISS");

        jDBLabelCount25.setText("Valor IPI");

        jDBLabelCount26.setText("Série");

        jDBLabelCount27.setText("Valor Frete");

        jDBLabelCount28.setText("Valor ICMS");

        jDBLabelCount29.setText("Valor Total");

        jDBLabelCount30.setText("Data Recebimento");

        jDBLabelCount31.setText("Data de Cadastro");

        jDBLabelCount32.setText("ID usuário");

        jDBTextField39.setJDBQuery(QueryRecebimento);
        jDBTextField39.setFieldName("nota_fiscal");

        jDBLabelCount33.setText("Nota Fiscal");

        jDBTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Pedido", "Id Fornecedor", "Item", "Id Produto", "Qtde", "Valor Unit.", "Perc. ICMS", "Perc. IPI", "Título 9", "Valor Total"
            }
        ));
        jDBTable2.setJDBQuery(QueryRecebimentoItem);
        jScrollPane2.setViewportView(jDBTable2);

        btnsalvaitem.setJDBQuery(QueryRecebimentoItem);
        btnsalvaitem.setEnabled(false);
        btnsalvaitem.setText("Confirmar Recebimento");
        btnsalvaitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvaitemActionPerformed(evt);
            }
        });

        btnverificaitem.setText("Verifica Itens");
        btnverificaitem.setEnabled(false);
        btnverificaitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverificaitemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(btnverificaitem, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnsalvaitem, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsalvaitem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnverificaitem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane2.addTab("Itens do Recebimento", jPanel9);

        btnnovorec.setJDBQuery(QueryRecebimento);
        btnnovorec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovorecActionPerformed(evt);
            }
        });

        btncancelrec.setJDBQuery(QueryRecebimento);
        btncancelrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelrecActionPerformed(evt);
            }
        });

        btnsalvarrec.setJDBQuery(QueryRecebimento);
        btnsalvarrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarrecActionPerformed(evt);
            }
        });

        btnexcluirrec.setJDBQuery(QueryRecebimento);
        btnexcluirrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirrecActionPerformed(evt);
            }
        });

        idforrec.setJDBQuery(QueryRecebimento);
        idforrec.setFieldName("id_fornecedor");

        idpedrec.setJDBQuery(QueryRecebimento);
        idpedrec.setFieldName("id_pedido");
        idpedrec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idpedrecFocusLost(evt);
            }
        });

        idforrecN.setJDBQuery(QueryRecebimento);
        idforrecN.setFieldName("id_fornecedor");

        idpedrecN.setJDBQuery(QueryRecebimento);
        idpedrecN.setFieldName("id_pedido");
        idpedrecN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idpedrecNFocusLost(evt);
            }
        });

        javax.swing.GroupLayout frmRecebimentoLayout = new javax.swing.GroupLayout(frmRecebimento);
        frmRecebimento.setLayout(frmRecebimentoLayout);
        frmRecebimentoLayout.setHorizontalGroup(
            frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRecebimentoLayout.createSequentialGroup()
                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnnovorec, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btncancelrec, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnsalvarrec, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnexcluirrec, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmRecebimentoLayout.createSequentialGroup()
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jDBLabelCount13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(idforrec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(380, 380, 380)
                                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jDBLabelCount33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jDBLabelCount26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtVlrMerc, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBLabelCount23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(39, 39, 39)
                                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jDBLabelCount27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                                        .addGap(177, 177, 177)
                                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jDBLabelCount24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jDBTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jDBTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                                        .addGap(27, 27, 27)
                                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jDBLabelCount22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(idpedrec, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(idpedrecN, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(53, 53, 53)
                                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jDBLabelCount28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBTextField34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(49, 49, 49)
                                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jDBLabelCount25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(58, 58, 58)
                                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jDBLabelCount29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(45, 45, 45)
                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtdatarec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDBLabelCount30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))
                            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                .addComponent(idforrecN, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDBLabelCount32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDBTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDBLabelCount31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdatacad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        frmRecebimentoLayout.setVerticalGroup(
            frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel14))
                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnexcluirrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsalvarrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncancelrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnovorec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRecebimentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBLabelCount30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdatarec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdatacad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jDBLabelCount32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDBLabelCount29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jDBTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                .addComponent(jDBLabelCount25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jDBTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRecebimentoLayout.createSequentialGroup()
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jDBLabelCount13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(idforrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idpedrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRecebimentoLayout.createSequentialGroup()
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jDBLabelCount33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jDBTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idforrecN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idpedrecN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jDBLabelCount24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jDBTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtVlrMerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                        .addComponent(jDBLabelCount28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jDBTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        PaneCompras.addTab("Recebimento de Compras", frmRecebimento);

        jButton14.setText("Sair");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton1.setText("Recebimento de Notas Fiscais");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmRelCompLayout = new javax.swing.GroupLayout(frmRelComp);
        frmRelComp.setLayout(frmRelCompLayout);
        frmRelCompLayout.setHorizontalGroup(
            frmRelCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRelCompLayout.createSequentialGroup()
                .addContainerGap(995, Short.MAX_VALUE)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(frmRelCompLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmRelCompLayout.setVerticalGroup(
            frmRelCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmRelCompLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton14)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
        );

        PaneCompras.addTab("Relatórios", frmRelComp);

        PaneEstoque.setRequestFocusEnabled(false);
        PaneEstoque.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PaneEstoqueFocusGained(evt);
            }
        });

        jDBTextField50.setJDBQuery(QueryGruPro);
        jDBTextField50.setEnabled(false);
        jDBTextField50.setFieldName("idgrupoProduto");

        jDBTextField55.setJDBQuery(QueryGruPro);
        jDBTextField55.setFieldName("tipo");

        jDBTextField56.setJDBQuery(QueryGruPro);
        jDBTextField56.setFieldName("nome");

        jDBTextField57.setJDBQuery(QueryGruPro);
        jDBTextField57.setFieldName("abrev");

        btcancelagru.setJDBQuery(QueryGruPro);
        btcancelagru.setEnabled(false);
        btcancelagru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelagruActionPerformed(evt);
            }
        });

        btexcluigru.setJDBQuery(QueryGruPro);
        btexcluigru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluigruActionPerformed(evt);
            }
        });

        btprimeirogru.setJDBQuery(QueryGruPro);

        btultimogru.setJDBQuery(QueryGruPro);

        btnovogru.setJDBQuery(QueryGruPro);
        btnovogru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovogruActionPerformed(evt);
            }
        });

        btanteriorgru.setJDBQuery(QueryGruPro);

        btproximogru.setJDBQuery(QueryGruPro);

        btsalvagru.setJDBQuery(QueryGruPro);
        btsalvagru.setEnabled(false);
        btsalvagru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvagruActionPerformed(evt);
            }
        });

        btatualizagru.setJDBQuery(QueryGruPro);
        btatualizagru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btatualizagruActionPerformed(evt);
            }
        });

        jDBLabelCount48.setText("ID Grupo");

        jDBLabelCount49.setText("Tipo");

        jDBLabelCount50.setText("Nome do Grupo");

        jDBLabelCount51.setText("Abreviatura");

        jLabel18.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel18.setText("Cadastro de Grupos de Produto");

        jButton15.setText("Sair");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmGrupoProLayout = new javax.swing.GroupLayout(frmGrupoPro);
        frmGrupoPro.setLayout(frmGrupoProLayout);
        frmGrupoProLayout.setHorizontalGroup(
            frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmGrupoProLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDBLabelCount49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(frmGrupoProLayout.createSequentialGroup()
                        .addComponent(btnovogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btcancelagru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btsalvagru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btexcluigru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btatualizagru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDBLabelCount48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(frmGrupoProLayout.createSequentialGroup()
                        .addComponent(btprimeirogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btanteriorgru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btproximogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btultimogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDBTextField50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDBLabelCount50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDBTextField57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDBLabelCount51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jDBTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(491, Short.MAX_VALUE))
            .addGroup(frmGrupoProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        frmGrupoProLayout.setVerticalGroup(
            frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmGrupoProLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDBLabelCount48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDBTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDBLabelCount50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jDBTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDBLabelCount49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jDBLabelCount51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnovogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcancelagru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsalvagru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btexcluigru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btatualizagru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btprimeirogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btanteriorgru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btproximogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btultimogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        PaneEstoque.addTab("Grupos de Produto", frmGrupoPro);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Cadastro de Sub-Grupo de Produtos");

        jDBTextField11.setJDBQuery(QuerySubGru);
        jDBTextField11.setEnabled(false);
        jDBTextField11.setFieldName("idsubgrupopro");

        jDBTextField15.setJDBQuery(QuerySubGru);
        jDBTextField15.setFieldName("nome");

        jDBLabelCount12.setText("ID Sub-Grupo");

        jDBLabelCount52.setText("Descrição Sub-Grupo");

        jDBLabelCount53.setText("Grupo de Produto");

        jDBLookUpComboBox1.setJDBListQuery(QueryGruPro);
        jDBLookUpComboBox1.setJDBQuery(QuerySubGru);
        jDBLookUpComboBox1.setColumnsSize("600");
        jDBLookUpComboBox1.setInvisibleFields("idgrupoProduto abrev tipo");
        jDBLookUpComboBox1.setKeyField("idgrupoProduto");
        jDBLookUpComboBox1.setKeyListField("idgrupoProduto");
        jDBLookUpComboBox1.setPopUpWidth("300");

        btsalvasub.setJDBQuery(QuerySubGru);
        btsalvasub.setEnabled(false);
        btsalvasub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvasubActionPerformed(evt);
            }
        });

        btnovosub.setJDBQuery(QuerySubGru);
        btnovosub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovosubActionPerformed(evt);
            }
        });

        btcancelasub.setJDBQuery(QuerySubGru);
        btcancelasub.setEnabled(false);
        btcancelasub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelasubActionPerformed(evt);
            }
        });

        btatualizasub.setJDBQuery(QuerySubGru);

        btexcluisub.setJDBQuery(QuerySubGru);
        btexcluisub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluisubActionPerformed(evt);
            }
        });

        btprimeirosub.setJDBQuery(QuerySubGru);

        btanteriorsub.setJDBQuery(QuerySubGru);

        btproximosub.setJDBQuery(QuerySubGru);

        btultimosub.setJDBQuery(QuerySubGru);

        jButton16.setText("Sair");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmSubGrupoProLayout = new javax.swing.GroupLayout(frmSubGrupoPro);
        frmSubGrupoPro.setLayout(frmSubGrupoProLayout);
        frmSubGrupoProLayout.setHorizontalGroup(
            frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                .addGroup(frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBLabelCount52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDBTextField11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDBLabelCount12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                                .addComponent(btnovosub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btcancelasub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btsalvasub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btexcluisub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btatualizasub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                                .addComponent(btprimeirosub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btanteriorsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btproximosub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btultimosub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDBLookUpComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDBTextField15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)))
                        .addGap(0, 579, Short.MAX_VALUE)))
                .addContainerGap())
        );
        frmSubGrupoProLayout.setVerticalGroup(
            frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                .addGroup(frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel19))
                    .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton16)))
                .addGap(65, 65, 65)
                .addComponent(jDBLabelCount12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDBTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jDBLabelCount52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDBTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jDBLabelCount53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDBLookUpComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsalvasub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnovosub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcancelasub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btexcluisub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btatualizasub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btprimeirosub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btanteriorsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btproximosub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btultimosub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        PaneEstoque.addTab("Sub-Grupo de Produtos", frmSubGrupoPro);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Cadastro de Tipos de Produtos");

        jDBTextField58.setJDBQuery(QueryTipoPro);
        jDBTextField58.setEnabled(false);
        jDBTextField58.setFieldName("idtipoProduto");

        jDBTextField59.setJDBQuery(QueryTipoPro);
        jDBTextField59.setFieldName("tipo");

        jDBTextField60.setJDBQuery(QueryTipoPro);
        jDBTextField60.setFieldName("abrev");

        jLabel21.setText("Id Tipo Produto");

        jLabel22.setText("Tipo de Produto");

        jLabel23.setText("Abreviação");

        btcancelatipo.setJDBQuery(QueryTipoPro);
        btcancelatipo.setEnabled(false);
        btcancelatipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelatipoActionPerformed(evt);
            }
        });

        btnovotipo.setJDBQuery(QueryTipoPro);
        btnovotipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovotipoActionPerformed(evt);
            }
        });

        btsalvatipo.setJDBQuery(QueryTipoPro);
        btsalvatipo.setEnabled(false);
        btsalvatipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvatipoActionPerformed(evt);
            }
        });

        btexcluitipo.setJDBQuery(QueryTipoPro);
        btexcluitipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluitipoActionPerformed(evt);
            }
        });

        btatualizatipo.setJDBQuery(QueryTipoPro);
        btatualizatipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btatualizatipoActionPerformed(evt);
            }
        });

        btprimeirotipo.setJDBQuery(QueryTipoPro);

        btanteriortipo.setJDBQuery(QueryTipoPro);

        btproximotipo.setJDBQuery(QueryTipoPro);

        btultimotipo.setJDBQuery(QueryTipoPro);

        jButton17.setText("Sair");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmTipoProLayout = new javax.swing.GroupLayout(frmTipoPro);
        frmTipoPro.setLayout(frmTipoProLayout);
        frmTipoProLayout.setHorizontalGroup(
            frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmTipoProLayout.createSequentialGroup()
                .addGroup(frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmTipoProLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmTipoProLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jDBTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21)
                                .addComponent(jDBTextField60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(frmTipoProLayout.createSequentialGroup()
                                    .addComponent(btprimeirotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btanteriortipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btproximotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btultimotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmTipoProLayout.createSequentialGroup()
                                    .addComponent(btnovotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btcancelatipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btsalvatipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btexcluitipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btatualizatipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 592, Short.MAX_VALUE)))
                .addContainerGap())
        );
        frmTipoProLayout.setVerticalGroup(
            frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmTipoProLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jButton17))
                .addGap(47, 47, 47)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDBTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDBTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jDBTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcancelatipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnovotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsalvatipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btexcluitipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btatualizatipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btprimeirotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btanteriortipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btproximotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btultimotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        PaneEstoque.addTab("Tipo de Produto", frmTipoPro);

        jLabel16.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel16.setText("Cadastro de Produtos");

        jDBTextField41.setJDBQuery(QueryProduto);
        jDBTextField41.setEnabled(false);
        jDBTextField41.setFieldName("idproduto");

        jDBTextField42.setJDBQuery(QueryProduto);
        jDBTextField42.setFieldName("nome");

        jDBTextField43.setJDBQuery(QueryProduto);
        jDBTextField43.setFieldName("comprimento");

        jDBTextField44.setJDBQuery(QueryProduto);
        jDBTextField44.setFieldName("largura");

        jDBTextField45.setJDBQuery(QueryProduto);
        jDBTextField45.setFieldName("espessura");

        jDBTextField46.setJDBQuery(QueryProduto);
        jDBTextField46.setFieldName("peso");

        jDBTextField47.setJDBQuery(QueryProduto);
        jDBTextField47.setFieldName("unidMed");

        jDBTextField48.setJDBQuery(QueryProduto);
        jDBTextField48.setFieldName("conversao");

        jDBTextField49.setJDBQuery(QueryProduto);
        jDBTextField49.setFieldName("descricao");

        jDBTextField51.setJDBQuery(QueryProduto);
        jDBTextField51.setFieldName("ncm");

        jDBLabelCount34.setText("ID Produto");

        jDBLabelCount35.setText("Nome");

        jDBLabelCount36.setText("Comprimento");

        jDBLabelCount37.setText("Largura");

        jDBLabelCount38.setText("Espessura");

        jDBLabelCount39.setText("Peso");

        jDBLabelCount40.setText("Unid. Medida");

        jDBLabelCount41.setText("Conversão");

        jDBLabelCount42.setText("Descrição");

        jDBLabelCount43.setText("Observação");

        jDBLabelCount44.setText("NCM");

        jDBLabelCount45.setText("Id Tipo");

        jDBTextField54.setJDBQuery(QueryProduto);
        jDBTextField54.setEnabled(false);
        jDBTextField54.setFieldName("id_usuario");
        jDBTextField54.setName("jDBText Field54"); // NOI18N

        jDBLabelCount46.setText("Id Sub Grupo");

        jDBLabelCount47.setText("Id Usuário");

        jDBTextArea1.setJDBQuery(QueryProduto);
        jDBTextArea1.setFieldName("obs");

        jButton12.setText("Sair");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        btnovopro.setJDBQuery(QueryProduto);
        btnovopro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoproActionPerformed(evt);
            }
        });

        btcancelapro.setJDBQuery(QueryProduto);
        btcancelapro.setEnabled(false);
        btcancelapro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelaproActionPerformed(evt);
            }
        });

        btsalvapro.setJDBQuery(QueryProduto);
        btsalvapro.setEnabled(false);
        btsalvapro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvaproActionPerformed(evt);
            }
        });

        btexcluipro.setJDBQuery(QueryProduto);
        btexcluipro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluiproActionPerformed(evt);
            }
        });

        jDBLookUpComboBox2.setJDBListQuery(QueryTipoPro);
        jDBLookUpComboBox2.setJDBQuery(QueryProduto);
        jDBLookUpComboBox2.setInvisibleFields("idtipoProduto abrev");
        jDBLookUpComboBox2.setKeyField("idtipoProduto");
        jDBLookUpComboBox2.setKeyListField("idtipoProduto");

        jDBLookUpComboBox3.setJDBListQuery(QuerySubGru);
        jDBLookUpComboBox3.setJDBQuery(QueryProduto);
        jDBLookUpComboBox3.setInvisibleFields("idsubgrupopro idgrupoProduto");
        jDBLookUpComboBox3.setKeyField("idsubgrupopro");
        jDBLookUpComboBox3.setKeyListField("idsubgrupopro");

        jDBTextField129.setJDBQuery(QueryProduto);
        jDBTextField129.setFieldName("cfop");

        jLabel79.setText("CFOP");

        btanteriorpro.setJDBQuery(QueryProduto);
        btanteriorpro.setText("");

        btproximopro.setJDBQuery(QueryProduto);
        btproximopro.setText("");

        jDBTextField1.setJDBQuery(QueryProduto);
        jDBTextField1.setFieldName("quantidade");

        jLabel93.setText("Quantidade em Estoque");

        javax.swing.GroupLayout frmProdutosLayout = new javax.swing.GroupLayout(frmProdutos);
        frmProdutos.setLayout(frmProdutosLayout);
        frmProdutosLayout.setHorizontalGroup(
            frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmProdutosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmProdutosLayout.createSequentialGroup()
                        .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBLabelCount41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBTextField129, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79)))
                    .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmProdutosLayout.createSequentialGroup()
                            .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProdutosLayout.createSequentialGroup()
                                    .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnovopro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProdutosLayout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(242, 242, 242)))
                                    .addGap(18, 18, 18)
                                    .addComponent(btcancelapro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btsalvapro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btexcluipro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btanteriorpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(frmProdutosLayout.createSequentialGroup()
                                    .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDBLabelCount34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(frmProdutosLayout.createSequentialGroup()
                                            .addComponent(jDBTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(61, 61, 61)
                                            .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jDBLabelCount45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jDBLookUpComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDBLabelCount46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDBLookUpComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(103, 103, 103))
                                .addGroup(frmProdutosLayout.createSequentialGroup()
                                    .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(frmProdutosLayout.createSequentialGroup()
                                            .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jDBTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jDBLabelCount37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(54, 54, 54)
                                            .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jDBTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jDBLabelCount36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(47, 47, 47)
                                            .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jDBTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jDBLabelCount38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(62, 62, 62)
                                            .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jDBTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jDBLabelCount39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(46, 46, 46)
                                            .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jDBTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jDBLabelCount40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(41, 41, 41)
                                            .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel93)
                                                .addComponent(jDBTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jDBLabelCount42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btproximopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(frmProdutosLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDBLabelCount47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDBTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDBTextArea1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                            .addComponent(jDBTextField49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDBLabelCount43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(5, 5, 5)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        frmProdutosLayout.setVerticalGroup(
            frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmProdutosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btproximopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btsalvapro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btexcluipro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnovopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btcancelapro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(btanteriorpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLookUpComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLookUpComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jDBLabelCount35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField129, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jDBLabelCount42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDBTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jDBLabelCount43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        PaneEstoque.addTab("Produtos", frmProdutos);

        //seleciona o campo de texto correto
        txtidop.setVisible(true);
        txtidopN.setVisible(false);

        jLabel17.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel17.setText("Ordem de Produção");

        txtidop.setJDBQuery(QueryOP);
        txtidop.setFieldName("id_op");
        txtidop.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtidopFocusLost(evt);
            }
        });

        jDBTextField52.setJDBQuery(QueryOP);
        jDBTextField52.setFieldName("pedido_venda");

        txtanoop.setJDBQuery(QueryOP);
        txtanoop.setFieldName("ano_op");
        txtanoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanoopActionPerformed(evt);
            }
        });

        jDBTextField61.setJDBQuery(QueryOP);

        jDBTextField63.setJDBQuery(QueryOP);
        jDBTextField63.setEnabled(false);
        jDBTextField63.setFieldName("situacao");

        jDBTextField64.setJDBQuery(QueryOP);
        jDBTextField64.setFieldName("hora_inicio");

        jDBTextField65.setJDBQuery(QueryOP);
        jDBTextField65.setFieldName("hora_termino");

        jDBTextField66.setJDBQuery(QueryOP);
        jDBTextField66.setFieldName("cod_cliente");

        txtiduser.setJDBQuery(QueryOP);
        txtiduser.setEnabled(false);
        txtiduser.setFieldName("id_usuario");
        txtiduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiduserActionPerformed(evt);
            }
        });

        jLabel24.setText("ID O.P.");

        jLabel25.setText("Ano O.P.");

        jLabel26.setText("Pedido de Venda (Não Obrigatório)");

        jLabel27.setText("Data");

        jLabel28.setText("Tipo");

        jLabel29.setText("Situação");

        jLabel30.setText("Hora Inicio hh:mm:ss");

        jLabel31.setText("Hora Término hh:mm:ss");

        jLabel32.setText("Cod. Cliente (Não é obrigatório)");

        jLabel33.setText("Observação");

        jLabel34.setText("ID Usuário");

        novoiteop.setJDBQuery(QueryIteOP);
        novoiteop.setEnabled(false);
        novoiteop.setLabel("");
        novoiteop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoiteopActionPerformed(evt);
            }
        });

        canceliteop.setJDBQuery(QueryIteOP);
        canceliteop.setEnabled(false);
        canceliteop.setLabel("");
        canceliteop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceliteopActionPerformed(evt);
            }
        });

        salvaiteop.setJDBQuery(QueryIteOP);
        salvaiteop.setEnabled(false);
        salvaiteop.setLabel("");
        salvaiteop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaiteopActionPerformed(evt);
            }
        });

        excluiiteop.setJDBQuery(QueryIteOP);
        excluiiteop.setEnabled(false);
        excluiiteop.setLabel("");
        excluiiteop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiiteopActionPerformed(evt);
            }
        });

        jDBTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jDBTable3.setJDBQuery(QueryIteOP);
        jScrollPane3.setViewportView(jDBTable3);

        finalizaiteop.setText("Finalizar Itens");
        finalizaiteop.setEnabled(false);
        finalizaiteop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizaiteopActionPerformed(evt);
            }
        });

        btnbuscaproduto.setText("Buscar Produto");
        btnbuscaproduto.setEnabled(false);
        btnbuscaproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaprodutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(novoiteop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(canceliteop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salvaiteop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(excluiiteop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnbuscaproduto)
                        .addGap(45, 45, 45)
                        .addComponent(finalizaiteop, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(excluiiteop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salvaiteop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(canceliteop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novoiteop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnbuscaproduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finalizaiteop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Itens O.P.", jPanel12);

        jDBTextArea2.setFieldName("obs");

        novoop.setJDBQuery(QueryOP);
        novoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoopActionPerformed(evt);
            }
        });

        cancelop.setJDBQuery(QueryOP);
        cancelop.setEnabled(false);
        cancelop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelopActionPerformed(evt);
            }
        });

        salvaop.setJDBQuery(QueryOP);
        salvaop.setEnabled(false);
        salvaop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaopActionPerformed(evt);
            }
        });

        excluiop.setJDBQuery(QueryOP);
        excluiop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiopActionPerformed(evt);
            }
        });

        sairop.setText("Sair");
        sairop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairopActionPerformed(evt);
            }
        });

        jDBComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Com Pedido", "Estoque" }));
        jDBComboBox2.setJDBQuery(QueryOP);
        jDBComboBox2.setFieldName("tipo");

        BtnEncerraOp.setText("Encerrar O.P");
        BtnEncerraOp.setEnabled(false);
        BtnEncerraOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEncerraOpActionPerformed(evt);
            }
        });

        txtidopN.setJDBQuery(QueryOP);
        txtidopN.setEnabled(false);
        txtidopN.setFieldName("id_op");

        javax.swing.GroupLayout frmProducaoLayout = new javax.swing.GroupLayout(frmProducao);
        frmProducao.setLayout(frmProducaoLayout);
        frmProducaoLayout.setHorizontalGroup(
            frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmProducaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(frmProducaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProducaoLayout.createSequentialGroup()
                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frmProducaoLayout.createSequentialGroup()
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtanoop, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addGap(112, 112, 112)
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(frmProducaoLayout.createSequentialGroup()
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmProducaoLayout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProducaoLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jDBComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jDBTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(170, 170, 170)))
                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmProducaoLayout.createSequentialGroup()
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDBTextField66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(64, 64, 64)
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))
                                .addGap(30, 30, 30)
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jDBTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(txtiduser, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(153, 153, 153))
                            .addGroup(frmProducaoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sairop, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(jLabel27)
                                    .addComponent(jDBTextField61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(124, 124, 124))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProducaoLayout.createSequentialGroup()
                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBTextArea2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProducaoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(novoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(salvaop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(excluiop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(BtnEncerraOp, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)))
                        .addGap(205, 205, 205))
                    .addGroup(frmProducaoLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addContainerGap())
                    .addGroup(frmProducaoLayout.createSequentialGroup()
                        .addComponent(txtidopN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        frmProducaoLayout.setVerticalGroup(
            frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmProducaoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmProducaoLayout.createSequentialGroup()
                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sairop, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(novoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(salvaop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(excluiop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnEncerraOp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmProducaoLayout.createSequentialGroup()
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmProducaoLayout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel24))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jDBTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtanoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProducaoLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDBTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidopN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(frmProducaoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jDBTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtiduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(frmProducaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)))
                .addComponent(jDBTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        PaneProducao.addTab("Ordem de Produção", frmProducao);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Cadastro de Clientes");

        jDBLabelCount4.setText("ID Cliente");

        jDBTextField69.setJDBQuery(QueryCliente);
        jDBTextField69.setEnabled(false);
        jDBTextField69.setFieldName("idclifor");

        jDBLabelCount54.setText("Pessoa");

        jDBComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jurídica", "Física" }));
        jDBComboBox4.setJDBQuery(QueryCliente);
        jDBComboBox4.setFieldName("pessoa");

        jDBLabelCount55.setText("Situação");

        jDBComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo", "Inapto", " " }));
        jDBComboBox5.setJDBQuery(QueryCliente);
        jDBComboBox5.setFieldName("situacao");

        jDBTextField70.setJDBQuery(QueryCliente);
        jDBTextField70.setFieldName("razao");

        jDBLabelCount56.setText("Razão");

        jDBLabelCount57.setText("Fantasia");

        jDBTextField71.setJDBQuery(QueryCliente);
        jDBTextField71.setFieldName("fantasia");

        jDBLabelCount58.setText("Endereço");

        jDBTextField72.setJDBQuery(QueryCliente);
        jDBTextField72.setFieldName("endereco");

        jDBLabelCount59.setText("Telefone");

        jDBTextField73.setJDBQuery(QueryCliente);
        jDBTextField73.setFieldName("telefone");

        jDBTextField74.setJDBQuery(QueryCliente);
        jDBTextField74.setFieldName("contato");

        jDBLabelCount60.setText("Nome Contato");

        jDBTextField75.setJDBQuery(QueryCliente);
        jDBTextField75.setFieldName("bairro");

        jDBLabelCount61.setText("Bairro");

        jDBTextField76.setJDBQuery(QueryFornecedor);
        jDBTextField76.setFieldName("cidade");

        jDBLabelCount62.setText("Cidade");

        jDBTextField77.setJDBQuery(QueryCliente);
        jDBTextField77.setFieldName("cnpj");
        jDBTextField77.setMaxLength(new java.lang.Integer(14));

        jDBLabelCount63.setText("CNPJ");

        jDBTextField78.setJDBQuery(QueryCliente);
        jDBTextField78.setFieldName("email");

        jDBLabelCount64.setText("E-mail");

        jDBTextField79.setJDBQuery(QueryCliente);
        jDBTextField79.setFieldName("cep");
        jDBTextField79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField79ActionPerformed(evt);
            }
        });

        jDBLabelCount65.setText("CEP");

        jDBComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jDBComboBox6.setJDBQuery(QueryCliente);
        jDBComboBox6.setFieldName("uf");

        jDBLabelCount66.setText("UF");

        jDBTextField80.setJDBQuery(QueryCliente);
        jDBTextField80.setFieldName("cpf");

        jDBLabelCount67.setText("CPF");

        jDBTextField81.setJDBQuery(QueryCliente);
        jDBTextField81.setFieldName("inscEst");

        jDBLabelCount68.setText("Inscrição Estadual");

        jDBLabelCount69.setText("ID Usuário");

        jDBTextField82.setJDBQuery(QueryCliente);
        jDBTextField82.setEnabled(false);
        jDBTextField82.setFieldName("id_usuario");

        jDBButtonCancel12.setJDBQuery(QueryCliente);

        jDBButtonSave11.setJDBQuery(QueryCliente);
        jDBButtonSave11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonSave11ActionPerformed(evt);
            }
        });

        jDBButtonDelete12.setJDBQuery(QueryCliente);

        jDBButtonNew13.setJDBQuery(QueryCliente);
        jDBButtonNew13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonNew13ActionPerformed(evt);
            }
        });

        jDBTextField128.setJDBQuery(QueryCliente);
        jDBTextField128.setFieldName("pais");

        jLabel78.setText("País");

        jDBTextField12.setJDBQuery(QueryCliente);
        jDBTextField12.setFieldName("numero");

        jLabel101.setText("Numero");

        jDBTextField13.setJDBQuery(QueryCliente);
        jDBTextField13.setFieldName("cod_mun");

        jLabel102.setText("Cod. Município IBGE");

        jDBButtonNext1.setJDBQuery(QueryCliente);

        jDBButtonPrevious1.setJDBQuery(QueryCliente);

        javax.swing.GroupLayout ClientesLayout = new javax.swing.GroupLayout(Clientes);
        Clientes.setLayout(ClientesLayout);
        ClientesLayout.setHorizontalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClientesLayout.createSequentialGroup()
                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ClientesLayout.createSequentialGroup()
                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBLabelCount59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(79, 79, 79)
                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBLabelCount60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ClientesLayout.createSequentialGroup()
                                                .addComponent(jDBTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                                .addComponent(jDBTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(ClientesLayout.createSequentialGroup()
                                                .addComponent(jDBLabelCount64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jDBLabelCount69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(ClientesLayout.createSequentialGroup()
                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ClientesLayout.createSequentialGroup()
                                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jDBLabelCount58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBLabelCount57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBLabelCount56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(ClientesLayout.createSequentialGroup()
                                                        .addGap(52, 52, 52)
                                                        .addComponent(jDBLabelCount54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(ClientesLayout.createSequentialGroup()
                                                        .addGap(240, 240, 240)
                                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel101)
                                                            .addComponent(jDBTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(ClientesLayout.createSequentialGroup()
                                                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(ClientesLayout.createSequentialGroup()
                                                                        .addGap(60, 60, 60)
                                                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jDBLabelCount61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(jDBTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jDBLabelCount65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGroup(ClientesLayout.createSequentialGroup()
                                                                        .addGap(22, 22, 22)
                                                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jDBLabelCount62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(jDBTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(34, 34, 34)
                                                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jDBLabelCount66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jDBComboBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                            .addGroup(ClientesLayout.createSequentialGroup()
                                                                .addGap(255, 255, 255)
                                                                .addComponent(jDBTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                            .addComponent(jDBTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ClientesLayout.createSequentialGroup()
                                                .addComponent(jDBButtonNew13, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69)
                                                .addComponent(jDBButtonCancel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(jDBButtonDelete12, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(jDBButtonSave11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ClientesLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel78)
                                                    .addComponent(jDBTextField128, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel102)
                                                    .addComponent(jDBTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(109, 109, 109))
                            .addGroup(ClientesLayout.createSequentialGroup()
                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ClientesLayout.createSequentialGroup()
                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ClientesLayout.createSequentialGroup()
                                                .addGap(129, 129, 129)
                                                .addComponent(jDBComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jDBLabelCount55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jDBTextField71, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jDBTextField70, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ClientesLayout.createSequentialGroup()
                                        .addComponent(jDBLabelCount68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jDBTextField81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ClientesLayout.setVerticalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel35)
                .addGap(61, 61, 61)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBLabelCount56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBLabelCount57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBLabelCount58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel101))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBButtonDelete12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBButtonNew13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBButtonCancel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBButtonSave11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        PaneVendas.addTab("Cadastro de Clientes", Clientes);

        jDBLabelCount70.setText("ID Transportadora");

        jDBTextField83.setJDBQuery(QueryTransp);
        jDBTextField83.setEnabled(false);
        jDBTextField83.setFieldName("idclifor");

        jDBComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jurídica", "Física" }));
        jDBComboBox7.setJDBQuery(QueryTransp);
        jDBComboBox7.setFieldName("pessoa");

        jDBLabelCount71.setText("Pessoa");

        jDBComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo", "Inapto", " " }));
        jDBComboBox8.setJDBQuery(QueryTransp);
        jDBComboBox8.setFieldName("situacao");

        jDBLabelCount72.setText("Situação");

        jDBTextField84.setJDBQuery(QueryTransp);
        jDBTextField84.setFieldName("razao");

        jDBLabelCount73.setText("Razão");

        jDBLabelCount74.setText("Fantasia");

        jDBTextField85.setJDBQuery(QueryTransp);
        jDBTextField85.setFieldName("fantasia");

        jDBLabelCount75.setText("Endereço");

        jDBTextField86.setJDBQuery(QueryTransp);
        jDBTextField86.setFieldName("endereco");

        jDBLabelCount76.setText("Telefone");

        jDBTextField87.setJDBQuery(QueryTransp);
        jDBTextField87.setFieldName("telefone");

        jDBTextField88.setJDBQuery(QueryTransp);
        jDBTextField88.setFieldName("contato");

        jDBLabelCount77.setText("Nome Contato");

        jDBTextField89.setJDBQuery(QueryTransp);
        jDBTextField89.setFieldName("bairro");

        jDBLabelCount78.setText("Bairro");

        jDBTextField90.setJDBQuery(QueryTransp);
        jDBTextField90.setFieldName("email");

        jDBLabelCount79.setText("E-mail");

        jDBTextField91.setJDBQuery(QueryTransp);
        jDBTextField91.setFieldName("cidade");

        jDBLabelCount80.setText("Cidade");

        jDBTextField92.setJDBQuery(QueryTransp);
        jDBTextField92.setFieldName("cnpj");
        jDBTextField92.setMaxLength(new java.lang.Integer(14));

        jDBLabelCount81.setText("CNPJ");

        jDBButtonNew14.setJDBQuery(QueryTransp);
        jDBButtonNew14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonNew14ActionPerformed(evt);
            }
        });

        jDBButtonCancel13.setJDBQuery(QueryTransp);

        jDBButtonDelete13.setJDBQuery(QueryTransp);

        jDBTextField93.setJDBQuery(QueryTransp);
        jDBTextField93.setFieldName("cpf");

        jDBLabelCount82.setText("CPF");

        jDBComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jDBComboBox9.setJDBQuery(QueryTransp);
        jDBComboBox9.setFieldName("uf");

        jDBLabelCount83.setText("UF");

        jDBTextField94.setJDBQuery(QueryTransp);
        jDBTextField94.setFieldName("inscEst");

        jDBLabelCount84.setText("Inscrição Estadual");

        jDBTextField95.setJDBQuery(QueryTransp);
        jDBTextField95.setFieldName("cep");
        jDBTextField95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField95ActionPerformed(evt);
            }
        });

        jDBLabelCount85.setText("CEP");

        jDBTextField96.setJDBQuery(QueryTransp);
        jDBTextField96.setEnabled(false);
        jDBTextField96.setFieldName("id_usuario");

        jDBLabelCount86.setText("ID Usuário");

        jDBButtonSave12.setJDBQuery(QueryTransp);
        jDBButtonSave12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonSave12ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Cadastro de Transportadoras");

        jButton18.setText("Sair");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jDBTextField18.setJDBQuery(QueryTransp);
        jDBTextField18.setFieldName("numero");

        jDBTextField19.setJDBQuery(QueryTransp);
        jDBTextField19.setFieldName("cod_mun");

        jLabel105.setText("Cod. Município IBGE");

        jLabel106.setText("Numero");

        jDBButtonNext2.setJDBQuery(QueryTransp);

        jDBButtonPrevious2.setJDBQuery(QueryTransp);

        javax.swing.GroupLayout TransportadoraLayout = new javax.swing.GroupLayout(Transportadora);
        Transportadora.setLayout(TransportadoraLayout);
        TransportadoraLayout.setHorizontalGroup(
            TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransportadoraLayout.createSequentialGroup()
                .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransportadoraLayout.createSequentialGroup()
                        .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TransportadoraLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel36))
                            .addGroup(TransportadoraLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jDBLabelCount70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 912, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransportadoraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransportadoraLayout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDBTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addGap(50, 50, 50)
                .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDBLabelCount78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel105)
                    .addComponent(jDBTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransportadoraLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jDBButtonCancel13, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jDBButtonDelete13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jDBButtonSave12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDBButtonPrevious2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jDBButtonNext2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TransportadoraLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TransportadoraLayout.createSequentialGroup()
                            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TransportadoraLayout.createSequentialGroup()
                                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDBLabelCount76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDBTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(79, 79, 79)
                                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDBLabelCount77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDBTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TransportadoraLayout.createSequentialGroup()
                                            .addComponent(jDBTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                            .addComponent(jDBTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(TransportadoraLayout.createSequentialGroup()
                                            .addComponent(jDBLabelCount79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jDBLabelCount86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(TransportadoraLayout.createSequentialGroup()
                                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TransportadoraLayout.createSequentialGroup()
                                            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jDBLabelCount75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jDBTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jDBLabelCount74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jDBLabelCount73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(TransportadoraLayout.createSequentialGroup()
                                                    .addGap(349, 349, 349)
                                                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(TransportadoraLayout.createSequentialGroup()
                                                            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jDBTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jDBLabelCount80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jDBLabelCount85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(56, 56, 56)
                                                            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jDBLabelCount83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jDBComboBox9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(TransportadoraLayout.createSequentialGroup()
                                                            .addGap(255, 255, 255)
                                                            .addComponent(jDBTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(TransportadoraLayout.createSequentialGroup()
                                                    .addGap(52, 52, 52)
                                                    .addComponent(jDBLabelCount71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(jDBTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDBButtonNew14, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(109, 109, 109))
                        .addGroup(TransportadoraLayout.createSequentialGroup()
                            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TransportadoraLayout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addComponent(jDBComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDBLabelCount72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDBComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jDBTextField85, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDBTextField84, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDBTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBLabelCount81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDBTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBLabelCount82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TransportadoraLayout.createSequentialGroup()
                                    .addComponent(jDBLabelCount84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jDBTextField94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(20, 20, 20)))
        );
        TransportadoraLayout.setVerticalGroup(
            TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransportadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton18)
                .addGap(3, 3, 3)
                .addComponent(jLabel36)
                .addGap(68, 68, 68)
                .addComponent(jDBLabelCount70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TransportadoraLayout.createSequentialGroup()
                        .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106)
                            .addComponent(jDBLabelCount78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TransportadoraLayout.createSequentialGroup()
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBButtonCancel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonDelete13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonSave12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNext2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonPrevious2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TransportadoraLayout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDBLabelCount71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBLabelCount72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5)
                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDBTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDBLabelCount73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBLabelCount81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBLabelCount82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBLabelCount84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDBTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDBLabelCount74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBLabelCount80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBLabelCount83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDBTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDBLabelCount75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBLabelCount85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDBTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDBLabelCount76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBLabelCount77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBLabelCount79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBLabelCount86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TransportadoraLayout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(jDBButtonNew14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(TransportadoraLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jDBTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(96, Short.MAX_VALUE)))
        );

        PaneVendas.addTab("Cadastro de Transportadoras", Transportadora);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Vendas de Produtos");

        txtidpedido.setJDBQuery(QueryVendas);
        txtidpedido.setFieldName("id_pedido");
        txtidpedido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtidpedidoFocusLost(evt);
            }
        });

        txtdatapedido.setJDBQuery(QueryVendas);
        txtdatapedido.setEnabled(false);
        txtdatapedido.setFieldName("data");

        txttransp.setJDBQuery(QueryBuscaForn);
        txttransp.setEnabled(false);
        txttransp.setFieldName("razao");

        jDBTextField104.setJDBQuery(QueryVendas);
        jDBTextField104.setFieldName("vlr_mercadoria");

        jDBTextField105.setJDBQuery(QueryVendas);
        jDBTextField105.setFieldName("vlr_iss");

        jDBTextField106.setJDBQuery(QueryVendas);
        jDBTextField106.setFieldName("total");

        jDBTextField107.setJDBQuery(QueryVendas);
        jDBTextField107.setFieldName("data_entrega");

        jDBTextField108.setJDBQuery(QueryVendas);
        jDBTextField108.setFieldName("nota_fiscal");

        jDBTextField109.setJDBQuery(QueryVendas);
        jDBTextField109.setFieldName("serie");

        jDBTextField110.setJDBQuery(QueryVendas);
        jDBTextField110.setFieldName("data_emissao");

        jDBTextField111.setJDBQuery(QueryVendas);
        jDBTextField111.setFieldName("data_saida");

        jDBTextField112.setJDBQuery(QueryVendas);
        jDBTextField112.setFieldName("hora_saida");

        jDBTextField113.setJDBQuery(QueryVendas);
        jDBTextField113.setFieldName("base_icms");

        jDBTextField114.setJDBQuery(QueryVendas);
        jDBTextField114.setFieldName("vlr_icms");

        jDBTextField115.setJDBQuery(QueryVendas);
        jDBTextField115.setFieldName("base_icms_subs");

        jDBTextField116.setJDBQuery(QueryVendas);
        jDBTextField116.setFieldName("vlr_icms_subs");

        jDBTextField117.setJDBQuery(QueryVendas);
        jDBTextField117.setFieldName("vlr_frete");

        jDBTextField118.setJDBQuery(QueryVendas);
        jDBTextField118.setFieldName("vlr_seguro");

        jDBTextField119.setJDBQuery(QueryVendas);
        jDBTextField119.setFieldName("desconto");

        jDBTextField120.setJDBQuery(QueryVendas);
        jDBTextField120.setFieldName("desp_acessorias");

        jDBTextField121.setJDBQuery(QueryVendas);
        jDBTextField121.setFieldName("vlr_ipi");

        txtidtransp.setJDBQuery(QueryVendas);
        txtidtransp.setFieldName("id_transportador");
        txtidtransp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtidtranspFocusLost(evt);
            }
        });

        jDBTextField123.setJDBQuery(QueryVendas);
        jDBTextField123.setEnabled(false);
        jDBTextField123.setFieldName("id_usuario");

        txtidcli.setJDBQuery(QueryVendas);
        txtidcli.setFieldName("id_cliente");
        txtidcli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtidcliFocusLost(evt);
            }
        });

        jDBTextField125.setJDBQuery(QueryVendas);
        jDBTextField125.setEnabled(false);
        jDBTextField125.setFieldName("id_estab");
        jDBTextField125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField125ActionPerformed(evt);
            }
        });

        jLabel51.setText("ID Pedido");

        jLabel52.setText("Data Pedido");

        jLabel53.setText("Transportadora");

        jLabel54.setText("Valor Merc.");

        jLabel55.setText("Valor ISS");

        jLabel56.setText("Total");

        jLabel57.setText("Data Entrega");

        jLabel58.setText("Nota Fiscal");

        jLabel59.setText("Série");

        jLabel60.setText("Data Emissão");

        jLabel61.setText("Data Saída");

        jLabel62.setText("Hora Saída");

        jLabel63.setText("Base ICMS");

        jLabel64.setText("Valor ICMS");

        jLabel65.setText("Base ICMS Subs.");

        jLabel66.setText("Valor ICMS Subs.");

        jLabel67.setText("Valor Frete");

        jLabel68.setText("Valor Seguro");

        jLabel69.setText("Desconto");

        jLabel70.setText("Desp. Acessórias");

        jLabel71.setText("Valor IPI");

        jLabel72.setText("Id Transportadora");

        jLabel73.setText("ID Usuário");

        jLabel74.setText("ID Cliente");

        jLabel75.setText("ID Estab");

        jDBTextField126.setJDBQuery(QueryBuscaCli);
        jDBTextField126.setEnabled(false);
        jDBTextField126.setFieldName("razao");

        jLabel76.setText("Cliente");

        jDBTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Pedido", "Item", "Id Produto", "Qntde", "Vlr Unit.", "Perc. ICMS", "Perc. IPI", "Perc. ISS", "Vlr. Total"
            }
        ));
        jDBTable4.setJDBQuery(QueryVendasItem);
        jScrollPane4.setViewportView(jDBTable4);

        btncanceliteve.setJDBQuery(QueryVendasItem);
        btncanceliteve.setLabel("");
        btncanceliteve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanceliteveActionPerformed(evt);
            }
        });

        btnexcluiiteve.setJDBQuery(QueryVendasItem);
        btnexcluiiteve.setLabel("");
        btnexcluiiteve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluiiteveActionPerformed(evt);
            }
        });

        btnnovoiteve.setJDBQuery(QueryVendasItem);
        btnnovoiteve.setText("");
        btnnovoiteve.setToolTipText("");
        btnnovoiteve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoiteveActionPerformed(evt);
            }
        });

        btnsalvaiteve.setJDBQuery(QueryVendasItem);
        btnsalvaiteve.setText("");
        btnsalvaiteve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvaiteveActionPerformed(evt);
            }
        });

        btnfinalizaitens.setText("Finaliza Itens");
        btnfinalizaitens.setEnabled(false);
        btnfinalizaitens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizaitensActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnnovoiteve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncanceliteve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalvaiteve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnexcluiiteve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnfinalizaitens, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btncanceliteve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnovoiteve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnsalvaiteve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnexcluiiteve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfinalizaitens, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Itens da Venda", jPanel1);

        btnnovave.setJDBQuery(QueryVendas);
        btnnovave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovaveActionPerformed(evt);
            }
        });

        btncancelave.setJDBQuery(QueryVendas);
        btncancelave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelaveActionPerformed(evt);
            }
        });

        btnsalvave.setJDBQuery(QueryVendas);
        btnsalvave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvaveActionPerformed(evt);
            }
        });

        btnexcluive.setJDBQuery(QueryVendas);
        btnexcluive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluiveActionPerformed(evt);
            }
        });

        btnsairve.setText("Sair");
        btnsairve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairveActionPerformed(evt);
            }
        });

        jDBTextField20.setJDBQuery(QueryVendas);
        jDBTextField20.setFieldName("placa_vei");

        jLabel107.setText("Placa Veículo");

        jLabel108.setText("UF Placa");

        jDBComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jDBComboBox11.setJDBQuery(QueryVendas);
        jDBComboBox11.setFieldName("uf_vei");

        jDBTextField23.setJDBQuery(QueryVendas);
        jDBTextField23.setFieldName("pesobruto");

        jLabel109.setText("Peso Bruto");

        jLabel110.setText("Texto Legal NF-e");

        jDBTextArea3.setJDBQuery(QueryVendas);
        jDBTextArea3.setFieldName("textolegal");

        txtidpedidoN.setJDBQuery(QueryVendas);
        txtidpedidoN.setEnabled(false);
        txtidpedidoN.setFieldName("id_pedido");
        txtidpedidoN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtidpedidoNFocusLost(evt);
            }
        });

        javax.swing.GroupLayout VendasLayout = new javax.swing.GroupLayout(Vendas);
        Vendas.setLayout(VendasLayout);
        VendasLayout.setHorizontalGroup(
            VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VendasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel37)
                .addGap(340, 340, 340)
                .addComponent(btnnovave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncancelave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsalvave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnexcluive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsairve, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(VendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VendasLayout.createSequentialGroup()
                        .addComponent(jTabbedPane4)
                        .addContainerGap())
                    .addGroup(VendasLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VendasLayout.createSequentialGroup()
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(VendasLayout.createSequentialGroup()
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel76)
                                            .addComponent(jDBTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(VendasLayout.createSequentialGroup()
                                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel51)
                                                    .addGroup(VendasLayout.createSequentialGroup()
                                                        .addComponent(txtidpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtidpedidoN, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtidcli, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel74))
                                                .addGap(43, 43, 43)
                                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel72)
                                                    .addComponent(txtidtransp, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(39, 39, 39)
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(VendasLayout.createSequentialGroup()
                                                .addComponent(jLabel53)
                                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(VendasLayout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtdatapedido, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel52))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel61)
                                                            .addComponent(jDBTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(65, 65, 65)
                                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jDBTextField112, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel62))
                                                        .addGap(51, 51, 51)
                                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel60)
                                                            .addComponent(jDBTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(34, 34, 34)
                                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel57)
                                                            .addComponent(jDBTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(VendasLayout.createSequentialGroup()
                                                        .addGap(319, 319, 319)
                                                        .addComponent(jLabel107)
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                            .addGroup(VendasLayout.createSequentialGroup()
                                                .addComponent(txttransp, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(VendasLayout.createSequentialGroup()
                                                        .addComponent(jDBTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel108)
                                                            .addComponent(jDBComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jLabel109)
                                                    .addComponent(jDBTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(VendasLayout.createSequentialGroup()
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel58)
                                            .addComponent(jDBTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel59)
                                            .addComponent(jDBTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(VendasLayout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jDBTextField114, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel65)
                                            .addComponent(jDBTextField115, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel66)
                                            .addComponent(jDBTextField116, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(61, 61, 61)
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel67)
                                            .addComponent(jDBTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel68)
                                            .addComponent(jDBTextField118, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel71)
                                            .addComponent(jDBTextField121, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel55)
                                            .addComponent(jDBTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(VendasLayout.createSequentialGroup()
                                        .addComponent(jLabel63)
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel64)))
                                .addGap(91, 91, 91))
                            .addGroup(VendasLayout.createSequentialGroup()
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jDBTextField113, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel70))
                                    .addComponent(jDBTextField120, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel69)
                                    .addComponent(jDBTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54)
                                    .addComponent(jDBTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56)
                                    .addComponent(jDBTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDBTextField125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDBTextField123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(110, 110, 110))
                            .addGroup(VendasLayout.createSequentialGroup()
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel110)
                                    .addComponent(jDBTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        VendasLayout.setVerticalGroup(
            VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VendasLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(btnnovave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalvave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexcluive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsairve, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VendasLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VendasLayout.createSequentialGroup()
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VendasLayout.createSequentialGroup()
                                        .addComponent(jLabel60)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDBTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(VendasLayout.createSequentialGroup()
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel51)
                                            .addComponent(jLabel74)
                                            .addComponent(jLabel72))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtidpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtidcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtidtransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtidpedidoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VendasLayout.createSequentialGroup()
                                        .addComponent(jLabel62)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDBTextField112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VendasLayout.createSequentialGroup()
                                        .addComponent(jLabel57)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDBTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(VendasLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel76)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDBTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(VendasLayout.createSequentialGroup()
                                                .addComponent(jLabel59)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDBTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(VendasLayout.createSequentialGroup()
                                                .addComponent(jLabel58)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDBTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(VendasLayout.createSequentialGroup()
                                                        .addComponent(jLabel63)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jDBTextField113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(VendasLayout.createSequentialGroup()
                                                        .addComponent(jLabel66)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jDBTextField116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(VendasLayout.createSequentialGroup()
                                                    .addComponent(jLabel71)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jDBTextField121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(VendasLayout.createSequentialGroup()
                                                    .addComponent(jLabel64)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jDBTextField114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(VendasLayout.createSequentialGroup()
                                                    .addComponent(jLabel65)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jDBTextField115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(VendasLayout.createSequentialGroup()
                                                    .addComponent(jLabel68)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jDBTextField118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(VendasLayout.createSequentialGroup()
                                                .addComponent(jLabel67)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDBTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VendasLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel109)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDBTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel55)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDBTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(VendasLayout.createSequentialGroup()
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel52))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jDBTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdatapedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel107)
                                    .addComponent(jLabel108))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttransp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VendasLayout.createSequentialGroup()
                                    .addComponent(jLabel54)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDBTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VendasLayout.createSequentialGroup()
                                    .addComponent(jLabel69)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDBTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VendasLayout.createSequentialGroup()
                                    .addComponent(jLabel70)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDBTextField120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(VendasLayout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDBTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(VendasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VendasLayout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDBTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(VendasLayout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDBTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        PaneVendas.addTab("Vendas", Vendas);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Exportação TXT para emissão da NF-e");

        jButton3.setText("Gerar TXT do Pedido de Venda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel94.setText("Pedido de Venda");

        javax.swing.GroupLayout NFELayout = new javax.swing.GroupLayout(NFE);
        NFE.setLayout(NFELayout);
        NFELayout.setHorizontalGroup(
            NFELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NFELayout.createSequentialGroup()
                .addGroup(NFELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NFELayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel50))
                    .addGroup(NFELayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(NFELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPedidoNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel94)
                            .addComponent(jButton3))))
                .addContainerGap(863, Short.MAX_VALUE))
        );
        NFELayout.setVerticalGroup(
            NFELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NFELayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel50)
                .addGap(62, 62, 62)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPedidoNfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        PaneVendas.addTab("NF-e", NFE);

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel80.setText("Cadastro do Estabelecimento");

        jDBTextField130.setJDBQuery(QueryEstabelecimento);
        jDBTextField130.setEnabled(false);
        jDBTextField130.setFieldName("id_estab");

        jLabel81.setText("ID Estabelecimento");

        jDBTextField131.setJDBQuery(QueryEstabelecimento);
        jDBTextField131.setFieldName("razao_social");
        jDBTextField131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField131ActionPerformed(evt);
            }
        });

        jDBTextField132.setJDBQuery(QueryEstabelecimento);
        jDBTextField132.setFieldName("cnpj");

        jDBTextField133.setJDBQuery(QueryEstabelecimento);
        jDBTextField133.setFieldName("ins_est");

        jDBTextField134.setJDBQuery(QueryEstabelecimento);
        jDBTextField134.setFieldName("endereco");

        jDBTextField135.setJDBQuery(QueryEstabelecimento);
        jDBTextField135.setFieldName("telefone");

        jDBTextField136.setJDBQuery(QueryEstabelecimento);
        jDBTextField136.setFieldName("cep");

        jDBTextField137.setJDBQuery(QueryEstabelecimento);
        jDBTextField137.setFieldName("email");

        jDBTextField138.setJDBQuery(QueryEstabelecimento);
        jDBTextField138.setFieldName("data_cad");

        jDBTextField139.setJDBQuery(QueryEstabelecimento);
        jDBTextField139.setFieldName("data_alt");

        jDBTextField140.setJDBQuery(QueryEstabelecimento);
        jDBTextField140.setFieldName("cidade");

        jLabel82.setText("Razão Social");

        jLabel83.setText("CNPJ");

        jLabel85.setText("Inscrição Estadual");

        jLabel84.setText("Endereço");

        jLabel86.setText("Cidade");

        jLabel87.setText("UF");

        jLabel88.setText("CEP");

        jLabel89.setText("Data de Alteração");

        jLabel90.setText("Data de Cadastro");

        jLabel91.setText("Telefone");

        jLabel92.setText("Email");

        jDBButtonNew17.setJDBQuery(QueryEstabelecimento);

        jDBButtonCancel17.setJDBQuery(QueryEstabelecimento);

        jDBButtonDelete16.setJDBQuery(QueryEstabelecimento);
        jDBButtonDelete16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonDelete16ActionPerformed(evt);
            }
        });

        jDBButtonSave16.setJDBQuery(QueryEstabelecimento);

        jDBTextField2.setJDBQuery(QueryEstabelecimento);
        jDBTextField2.setFieldName("ins_Mun");

        jDBTextField3.setJDBQuery(QueryEstabelecimento);
        jDBTextField3.setFieldName("CNAE");

        jDBTextField6.setJDBQuery(QueryEstabelecimento);
        jDBTextField6.setFieldName("crt");

        jDBTextField7.setJDBQuery(QueryEstabelecimento);
        jDBTextField7.setFieldName("complemento");

        jDBTextField8.setJDBQuery(QueryEstabelecimento);
        jDBTextField8.setFieldName("numero");

        jDBTextField9.setJDBQuery(QueryEstabelecimento);
        jDBTextField9.setFieldName("cod_Mun");

        jLabel77.setText("Inscrição Municipal");

        jLabel95.setText("CNAE");

        jLabel96.setText("CRT");

        jLabel97.setText("Complemento");

        jLabel98.setText("Número");

        jLabel99.setText("Cod. Município IBGE");

        jDBTextField10.setJDBQuery(QueryEstabelecimento);
        jDBTextField10.setFieldName("bairro");

        jLabel100.setText("Bairro");

        jDBComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jDBComboBox10.setJDBQuery(QueryEstabelecimento);
        jDBComboBox10.setFieldName("uf");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jDBButtonNew17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDBButtonCancel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDBButtonSave16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDBButtonDelete16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addGap(212, 212, 212)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel98)
                                    .addComponent(jDBTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel86)
                                    .addComponent(jDBTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel100)
                                    .addComponent(jDBTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel97)
                                    .addComponent(jDBTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel87)
                                    .addComponent(jDBComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jDBTextField134, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel91)
                                            .addComponent(jDBTextField135, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jDBTextField131, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel88)
                                    .addComponent(jLabel83)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBTextField133, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField136, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel77)
                                            .addComponent(jDBTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel95)
                                            .addComponent(jDBTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel96)
                                            .addComponent(jDBTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDBTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel99)))
                            .addComponent(jLabel80)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel81)
                                    .addComponent(jDBTextField130, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel90)
                                    .addComponent(jDBTextField138, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel89)
                                    .addComponent(jDBTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel92)
                            .addComponent(jLabel82))
                        .addGap(107, 107, 107))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel80)
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(jLabel90))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBTextField130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBTextField138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBTextField131, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDBTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel85)
                                .addGap(12, 12, 12)
                                .addComponent(jDBTextField133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel96)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDBTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel77)
                                            .addComponent(jLabel95))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jDBTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel99)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDBTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel98)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDBTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel84)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDBTextField134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel86)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDBTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel97)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jDBTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel87)
                                .addGap(26, 26, 26))
                            .addComponent(jDBTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel100)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBTextField136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel92)
                        .addGap(11, 11, 11)
                        .addComponent(jDBTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addGap(11, 11, 11)
                        .addComponent(jDBTextField135, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBButtonNew17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonCancel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonDelete16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonSave16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        PaneAdm.addTab("Estabelecimento", jPanel3);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Cadastro de Usuários");

        jDBTextField67.setJDBQuery(QueryUsuario);
        jDBTextField67.setFieldName("id_usuario");

        jDBTextField97.setJDBQuery(QueryUsuario);
        jDBTextField97.setFieldName("nome");

        jDBTextField98.setJDBQuery(QueryUsuario);
        jDBTextField98.setFieldName("setor");

        jDBTextField99.setJDBQuery(QueryUsuario);
        jDBTextField99.setFieldName("login");

        jDBTextField100.setJDBQuery(QueryUsuario);
        jDBTextField100.setFieldName("senha");

        jLabel39.setText("ID Usuário");

        jLabel40.setText("Nome Do Usuário");

        jLabel41.setText("Setor");

        jLabel42.setText("Login");

        jLabel43.setText("Senha");

        jLabel44.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel44.setText("Estoque");

        jLabel45.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel45.setText("Compras");

        jLabel46.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel46.setText("Produção");

        jLabel47.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel47.setText("Vendas");

        jLabel48.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel48.setText("Administração");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setText("Permissões do Usuário (Acesso aos módulos)");

        jDBRadioButton2.setJDBQuery(QueryUsuario);
        jDBRadioButton2.setFieldName("estoque");
        jDBRadioButton2.setText("Liberado");

        jDBRadioButton3.setJDBQuery(QueryUsuario);
        jDBRadioButton3.setFieldName("producao");
        jDBRadioButton3.setText("Liberado");
        jDBRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBRadioButton3ActionPerformed(evt);
            }
        });

        jDBRadioButton4.setJDBQuery(QueryUsuario);
        jDBRadioButton4.setFieldName("vendas");
        jDBRadioButton4.setText("Liberado");
        jDBRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBRadioButton4ActionPerformed(evt);
            }
        });

        jDBRadioButton5.setJDBQuery(QueryUsuario);
        jDBRadioButton5.setFieldName("administracao");
        jDBRadioButton5.setText("Liberado");

        jDBButtonNew12.setJDBQuery(QueryUsuario);

        jDBButtonCancel14.setJDBQuery(QueryUsuario);

        jDBButtonSave13.setJDBQuery(QueryUsuario);

        jDBButtonRefresh5.setJDBQuery(QueryUsuario);

        jDBButtonFirst4.setJDBQuery(QueryUsuario);

        jDBButtonPrevious6.setJDBQuery(QueryUsuario);

        jDBButtonNext6.setJDBQuery(QueryUsuario);

        jDBButtonLast4.setJDBQuery(QueryUsuario);

        jDBButtonDelete14.setJDBQuery(QueryUsuario);

        jDBRadioButton1.setJDBQuery(QueryUsuario);
        jDBRadioButton1.setFieldName("compras");
        jDBRadioButton1.setText("Liberado");
        jDBRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmUsuarioLayout = new javax.swing.GroupLayout(frmUsuario);
        frmUsuario.setLayout(frmUsuarioLayout);
        frmUsuarioLayout.setHorizontalGroup(
            frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmUsuarioLayout.createSequentialGroup()
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38))
                    .addGroup(frmUsuarioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmUsuarioLayout.createSequentialGroup()
                                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jDBRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addComponent(jDBRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46)
                                    .addComponent(jDBRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47)
                                    .addComponent(jDBRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel39)
                                .addComponent(jLabel49)
                                .addGroup(frmUsuarioLayout.createSequentialGroup()
                                    .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel40)
                                        .addComponent(jDBTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(47, 47, 47)
                                    .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel41)
                                        .addComponent(jDBTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jDBTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(frmUsuarioLayout.createSequentialGroup()
                                    .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDBTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel42))
                                    .addGap(97, 97, 97)
                                    .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel43)
                                        .addComponent(jDBTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmUsuarioLayout.createSequentialGroup()
                                    .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(frmUsuarioLayout.createSequentialGroup()
                                            .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(frmUsuarioLayout.createSequentialGroup()
                                                    .addGap(150, 150, 150)
                                                    .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jDBButtonPrevious6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jDBButtonCancel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(56, 56, 56)
                                                    .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jDBButtonNext6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jDBButtonSave13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(jDBButtonFirst4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(62, 62, 62)
                                            .addComponent(jDBButtonLast4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(frmUsuarioLayout.createSequentialGroup()
                                            .addComponent(jDBButtonNew12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jDBButtonRefresh5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(63, 63, 63)
                                    .addComponent(jDBButtonDelete14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25))))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        frmUsuarioLayout.setVerticalGroup(
            frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmUsuarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel38)
                .addGap(31, 31, 31)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel49)
                .addGap(26, 26, 26)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBButtonNew12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonCancel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonSave13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonRefresh5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonDelete14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(frmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBButtonFirst4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonPrevious6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNext6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonLast4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        PaneAdm.addTab("Usuários", frmUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDBImageBlob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PaneCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 1159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PaneEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PaneProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PaneVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PaneAdm)
                .addGap(6, 6, 6))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDBImageBlob1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaneCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PaneEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PaneVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PaneProducao)
                    .addComponent(PaneAdm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        PaneEstoque.setVisible(false);
        PaneCompras.setVisible(false);
        PaneProducao.setVisible(false);
        PaneVendas.setVisible(false);
        PaneAdm.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseClicked
       
    }//GEN-LAST:event_btnComprasMouseClicked

    private void esconder(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_esconder
                       PaneCompras.setVisible(false);
                       PaneEstoque.setVisible(false);
                       PaneProducao.setVisible(false);
                       PaneVendas.setVisible(false);
                       PaneAdm.setVisible(false);
                       
                       btnCompras.setEnabled(false);
                       btnEstoque.setEnabled(false);
                       btnProducao.setEnabled(false);
                       btnVendas.setEnabled(false);
                       btnAdmin.setEnabled(false);
                       
                       
                       QueryUserAt.setSQL(" select * from USUARIO where id_usuario = '" + usuario + "'");
                       QueryUserAt.execQuery();
        
                       Boolean pcompras = Boolean.parseBoolean(QueryUserAt.getCurrentFieldValue("compras"));
                       Boolean pestoque = Boolean.parseBoolean(QueryUserAt.getCurrentFieldValue("estoque"));
                       Boolean pproducao = Boolean.parseBoolean(QueryUserAt.getCurrentFieldValue("producao"));
                       Boolean pvendas = Boolean.parseBoolean(QueryUserAt.getCurrentFieldValue("vendas"));
                       Boolean padmin = Boolean.parseBoolean(QueryUserAt.getCurrentFieldValue("administracao"));
                       
                      // iduser.setText(usuario);
                       
                      if (pcompras == true){
                        btnCompras.setEnabled(true);
                       };
                      if (pestoque == true){
                        btnEstoque.setEnabled(true);
                      };
                      if (pproducao == true){
                        btnProducao.setEnabled(true);
                       };
                      if (pvendas == true){
                        btnVendas.setEnabled(true);
                       };
                      if (padmin == true){
                        btnAdmin.setEnabled(true);
                       };

    }//GEN-LAST:event_esconder

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
       PaneCompras.setVisible(true);
       PaneEstoque.setVisible(false);
       PaneProducao.setVisible(false);
       PaneVendas.setVisible(false);
       PaneAdm.setVisible(false);
       
       id_pedidoN.setVisible(false);
       

    }//GEN-LAST:event_btnComprasActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        PaneCompras.setVisible(false);
        btnbuscapro.setEnabled(false);
        QueryPedido.setSQL("select * from CPCADPED where id_pedido = -1");
        QueryPedido.execQuery();
        QueryPedidoItem.setSQL("select * from CPITEPED where id_pedido = -1");
        QueryPedidoItem.execQuery();
        txtnomefor.setText("");
        txtcnpjfor.setText("");
        
         //altera campos busca
        id_pedido.setVisible(true);
        id_pedidoN.setVisible(false);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        PaneCompras.setVisible(false);
        
        //limpar registro na query
        QueryRecebimentoItem.setSQL("select * from cpiterec where id_pedido = -1");
        QueryRecebimentoItem.execQuery();
        QueryRecebimento.setSQL("select * from cpcadrec where id_pedido = -1");
        QueryRecebimento.execQuery();
        
        QueryProduto.setSQL("select * from escadpro where idproduto = -1");
        QueryProduto.execQuery();
        
                     // Gerencia campos do novo item
        idforrecN.setVisible(false);
        idpedrecN.setVisible(false);
        idforrec.setVisible(true);
        idpedrec.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        PaneEstoque.setVisible(true);
        PaneCompras.setVisible(false);
        PaneProducao.setVisible(false);
        PaneVendas.setVisible(false);
        PaneAdm.setVisible(false);
      
        //Ativa a query
        QueryProduto.setSQL("select * from escadpro");
        QueryProduto.execQuery();
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnnovopedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovopedActionPerformed
        txtsituacao.setText("Em Aberto");
        QueryPedido.setSQL("select * from CPCADPED");
        QueryPedido.execQuery();
        
        QueryPedidoItem.setSQL("select * from CPITEPED where id_pedido = -1" );
        QueryPedidoItem.execQuery();
        txtnomefor.setText("");
        txtcnpjfor.setText("");
        //regra botoes
        btnnovoped.setEnabled(false);
        btnexcluirped.setEnabled(false);
        btnBuscaPedido.setEnabled(false);
        btncancelaped.setEnabled(true);
        btnsalvaped.setEnabled(true);
        btnexcluirped.setEnabled(false);
        //altera campos busca
        id_pedidoN.setVisible(true);
        id_pedido.setVisible(false);
        
        
    }//GEN-LAST:event_btnnovopedActionPerformed

    private void jDBTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField4ActionPerformed

    private void jDBTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField29ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        PaneCompras.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnnovoitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoitemActionPerformed
        QueryPedidoItem.setSQL(" select * from CPITEPED where id_pedido = '" + id_pedido.getText() + "'" );
        QueryPedidoItem.execQuery();
        btnbuscapro.setEnabled(true);
        
        //libera botoes itens
        btnnovoitem.setEnabled(false);
        btncancelitem.setEnabled(true);   
        btnanterioritem.setEnabled(false);
        btnproximoitem.setEnabled(false);
        btnsaveitens.setEnabled(true);
        btnexcluiitem.setEnabled(false);
        btnatualizaitem.setEnabled(false);
    }//GEN-LAST:event_btnnovoitemActionPerformed

    private void btnnovorecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovorecActionPerformed
        btnexcluirrec.setEnabled(false);
        btnsalvarrec.setEnabled(true);
        btncancelrec.setEnabled(true);
        btnnovorec.setEnabled(false);
        
          // Gerencia campos do novo item
        idforrecN.setVisible(true);
        idpedrecN.setVisible(true);
        idforrec.setVisible(false);
        idpedrec.setVisible(false);

    }//GEN-LAST:event_btnnovorecActionPerformed

    private void btnexcluirrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirrecActionPerformed
        btnexcluirrec.setEnabled(false);
        btnsalvarrec.setEnabled(false);
        btncancelrec.setEnabled(false);
        btnnovorec.setEnabled(true);
        
                     // Gerencia campos do novo item
        idforrecN.setVisible(false);
        idpedrecN.setVisible(false);
        idforrec.setVisible(true);
        idpedrec.setVisible(true);
    }//GEN-LAST:event_btnexcluirrecActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        PaneEstoque.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnovoproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoproActionPerformed
        // regra botoes
        btnovopro.setEnabled(false);
        btcancelapro.setEnabled(true);
        btsalvapro.setEnabled(true);
        btexcluipro.setEnabled(false);
        btanteriorpro.setEnabled(false);
        btproximopro.setEnabled(false);

    }//GEN-LAST:event_btnovoproActionPerformed

    private void btexcluiproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluiproActionPerformed
        // regra botoes
        btnovopro.setEnabled(true);
        btcancelapro.setEnabled(false);
        btsalvapro.setEnabled(false);
        btexcluipro.setEnabled(true);
        btanteriorpro.setEnabled(true);
        btproximopro.setEnabled(true);
    }//GEN-LAST:event_btexcluiproActionPerformed

    private void btnProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducaoActionPerformed
        PaneEstoque.setVisible(false);
        PaneCompras.setVisible(false);
        PaneProducao.setVisible(true);
        PaneVendas.setVisible(false);
        PaneAdm.setVisible(false);
        
        //limpar query
        QueryOP.setSQL("select * from procadop where id_op = -1");
        QueryOP.execQuery();
        QueryIteOP.setSQL("select * from proiteop where id_op = -1");
        QueryIteOP.execQuery();
    }//GEN-LAST:event_btnProducaoActionPerformed

    private void btnNewCad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCad1ActionPerformed
        instrucaoTipoPessoa.setVisible(true);
        txtCnpjForn.setEnabled(false);
        txtCpfCad.setEnabled(false);
        txtInsEstCad.setEnabled(false);
        btnDeleteCad1.setEnabled(false);
        btnAntCad1.setEnabled(false);
        btnProxCad1.setEnabled(false);
        txtIdFornecedor.setEnabled(false);
    }//GEN-LAST:event_btnNewCad1ActionPerformed

    private void id_pedidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_pedidoFocusLost
        QueryPedidoItem.setSQL(" select * from CPITEPED where id_pedido = '" + id_pedido.getText() + "' order by num_item" );
        QueryPedidoItem.execQuery();       
        
        QueryPedido.setSQL(" select * from CPCADPED where id_pedido = '" + id_pedido.getText() + "'" );
        txtsituacao.setText(QueryPedido.getCurrentFieldValue("situacao"));
        QueryPedido.execQuery(); 
        
        QueryBuscaForn.setSQL("select * from CLIFORTR where idclifor = '"+ txtidforn.getText() + "'");
        QueryBuscaForn.execQuery();
        
        
        txtdataemi.setDate(QueryPedido.getCurrentFieldValueAsSQLDate("data_ent"));
        
          //regra botoes
        btnnovoped.setEnabled(false);
        btnexcluirped.setEnabled(true);
        btnBuscaPedido.setEnabled(false);
        btncancelaped.setEnabled(true);
        btnsalvaped.setEnabled(true);
        id_pedido.setEnabled(false);
        
        atualizaElementos();
    }//GEN-LAST:event_id_pedidoFocusLost

    private void jDBButtonSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonSave1ActionPerformed
        
    }//GEN-LAST:event_jDBButtonSave1ActionPerformed

    private void txtanoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanoopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanoopActionPerformed

    private void sairopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairopActionPerformed
        PaneProducao.setVisible(false);
 
    }//GEN-LAST:event_sairopActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
       PaneEstoque.setVisible(false);
        PaneCompras.setVisible(false);
        PaneProducao.setVisible(false);
        PaneVendas.setVisible(true);
        PaneAdm.setVisible(false);
        //oculta campo novo
        txtidpedidoN.setVisible(false);
    }//GEN-LAST:event_btnVendasActionPerformed

    private void jDBTextField79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField79ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField79ActionPerformed

    private void jDBButtonSave11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonSave11ActionPerformed
       QueryFornecedor.setNewCurrentFieldValue("tipo", "Cliente");
    }//GEN-LAST:event_jDBButtonSave11ActionPerformed

    private void jDBButtonNew13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonNew13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBButtonNew13ActionPerformed

    private void jDBButtonNew14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonNew14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBButtonNew14ActionPerformed

    private void jDBTextField95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField95ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField95ActionPerformed

    private void jDBButtonSave12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonSave12ActionPerformed
        QueryTransp.setNewCurrentFieldValue("tipo", "Transportadora");
    }//GEN-LAST:event_jDBButtonSave12ActionPerformed

    private void jDBRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBRadioButton4ActionPerformed

    private void jDBRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBRadioButton3ActionPerformed

    private void jDBRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBRadioButton1ActionPerformed

    private void jDBTextField125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField125ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField125ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
            PaneEstoque.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
            PaneEstoque.setVisible(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
            PaneEstoque.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
            PaneVendas.setVisible(false);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jDBTextField131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField131ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField131ActionPerformed

    private void jDBButtonDelete16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonDelete16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBButtonDelete16ActionPerformed

    
    
    private void btnbuscaproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaproActionPerformed
        new frmBuscaProduto().setVisible(true);
    }//GEN-LAST:event_btnbuscaproActionPerformed

    private void tableitepedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableitepedMouseClicked
      
   
    }//GEN-LAST:event_tableitepedMouseClicked

    private void btnatualizaitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizaitemActionPerformed
        
    }//GEN-LAST:event_btnatualizaitemActionPerformed

    private void btnsalvapedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvapedActionPerformed
        String dataatu=null,datasistema=null;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
       
       // QueryPedido.setNewCurrentFieldValueAsSQLDate("data_ent", data);
 //libera botoes itens
        btnnovoitem.setEnabled(true);
        btncancelitem.setEnabled(false);   
        btnanterioritem.setEnabled(false);
        btnproximoitem.setEnabled(false);
        btnsaveitens.setEnabled(true);
        btnexcluiitem.setEnabled(true);
        btnatualizaitem.setEnabled(false);
          
        dataatu = String.valueOf(dateFormat.format(txtdataemi.getDate()));
        datasistema = String.valueOf(dateFormat.format(new Date())); 
        QueryPedido.setNewCurrentFieldValue("id_usuario", usuario);
        QueryPedido.setNewCurrentFieldValue("data_cad", dataatu);
        QueryPedido.setNewCurrentFieldValue("data_alt", datasistema);
        
         //regra botoes
        btnnovoped.setEnabled(true);
        btnexcluirped.setEnabled(true);
        btnBuscaPedido.setEnabled(true);
        btncancelaped.setEnabled(false);
        btnsalvaped.setEnabled(false);
        id_pedido.setEnabled(false);
        
        // Salvar Valores Totais no Banco
        
        QueryPedido.setNewCurrentFieldValueAsDouble("valor_frete", Double.parseDouble(txtValorFrete.getText().replaceAll(",", ".")));
        QueryPedido.setNewCurrentFieldValueAsDouble("valor_ipi_total", Double.parseDouble(txtValorIpi.getText().replaceAll(",", ".")));
        QueryPedido.setNewCurrentFieldValueAsDouble("valor_icms_total", Double.parseDouble(txtValorIcms.getText().replaceAll(",", ".")));
        QueryPedido.setNewCurrentFieldValueAsDouble("valor_total", Double.parseDouble(txtValorTotal.getText().replaceAll(",", ".")));
        
         //altera campos busca
        id_pedido.setVisible(true);
        id_pedidoN.setVisible(false);
    }//GEN-LAST:event_btnsalvapedActionPerformed

    private void btnsaveitensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveitensActionPerformed
        int result;
        
        QueryPedidoItem.setNewCurrentFieldValue("id_pedido", id_pedido.getText());
        
        QueryVeItem.setSQL("select max(num_item) as uitem from cpiteped where id_pedido = '"+ id_pedido.getText()+"'");
        QueryVeItem.execQuery();
        //puxa dados do produto para os itens do pedido
        result = QueryVeItem.getCurrentFieldValueAsInteger("uitem");
        result+=1;
        QueryPedidoItem.setNewCurrentFieldValueAsInteger("num_item", result);
        QueryPedidoItem.setNewCurrentFieldValueAsInteger("idproduto", codbuscaproduto);
        QueryPedidoItem.setNewCurrentFieldValue("descricao_item", descricao);
        QueryPedidoItem.setNewCurrentFieldValue("unidade", unidade);
        QueryPedidoItem.setNewCurrentFieldValue("situacao", txtsituacao.getText());
        
        //libera botoes itens
        btnnovoitem.setEnabled(true);
        btncancelitem.setEnabled(false);   
        btnanterioritem.setEnabled(true);
        btnproximoitem.setEnabled(true);
        btnsaveitens.setEnabled(false);
        btnexcluiitem.setEnabled(true);
        btnatualizaitem.setEnabled(true);

        //soma valores totais do pedido
       // double tfrete;
        
        QuerySomaItensPed.setSQL("select SUM(frete) as totfrete from cpiteped where id_pedido = '"+ id_pedido.getText()+"'");
        QuerySomaItensPed.execQuery();
       // tfrete = QuerySomaItensPed.getCurrentFieldValueAsDouble("totfrete");
        QueryPedido.setNewCurrentFieldValueAsDouble("vlr_frete", QuerySomaItensPed.getCurrentFieldValueAsDouble("totfrete"));
    }//GEN-LAST:event_btnsaveitensActionPerformed

    private void btnDeleteCad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteCad1ActionPerformed

    private void btnCancelCad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelCad1ActionPerformed
        btnDeleteCad1.setEnabled(true);
        btnAntCad1.setEnabled(true);
        btnProxCad1.setEnabled(true);
        QueryFornecedor.last();
        
    }//GEN-LAST:event_btnCancelCad1ActionPerformed

    private void cboxTipoPessoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboxTipoPessoaFocusLost
        bloqueiaCamposTipoPessoa();
    }//GEN-LAST:event_cboxTipoPessoaFocusLost

    public void bloqueiaCamposTipoPessoa(){
      if(cboxTipoPessoa.getSelectedItem().toString().equals("Física")){
          txtCnpjForn.setEnabled(false);
          txtInsEstCad.setEnabled(false);
          txtInsEstCad.setText("");
          txtCpfCad.setEnabled(true);
          instrucaoTipoPessoa.setVisible(false);
      }
      else if(cboxTipoPessoa.getSelectedItem().toString().equals("Jurídica")){
          txtCpfCad.setEnabled(false);
          txtCpfCad.setText("");
          txtCnpjForn.setEnabled(true);
          txtInsEstCad.setEnabled(true);
          instrucaoTipoPessoa.setVisible(false);
      }
      else{
          txtCnpjForn.setEnabled(false);
          txtInsEstCad.setEnabled(false);
          txtCpfCad.setEnabled(false);
          instrucaoTipoPessoa.setVisible(true);
      }
    }
    private void btncancelitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelitemActionPerformed
        btnbuscapro.setEnabled(false);
        //libera botoes itens
        btnnovoitem.setEnabled(true);
        btncancelitem.setEnabled(false);   
        btnanterioritem.setEnabled(true);
        btnproximoitem.setEnabled(true);
        btnsaveitens.setEnabled(false);
        btnexcluiitem.setEnabled(true);
        btnatualizaitem.setEnabled(true);
    }//GEN-LAST:event_btncancelitemActionPerformed

    private void tableitepedInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tableitepedInputMethodTextChanged
      
    }//GEN-LAST:event_tableitepedInputMethodTextChanged

    private void txtidfornFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidfornFocusLost
         QueryBuscaForn.setSQL("select * from CLIFORTR where idclifor = '"+ txtidforn.getText() + "'");
        QueryBuscaForn.execQuery();
    }//GEN-LAST:event_txtidfornFocusLost

    private void frmPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmPedidoMouseClicked
        
    }//GEN-LAST:event_frmPedidoMouseClicked

    private void btncancelapedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelapedActionPerformed
        
        //regra botoes
        btnnovoped.setEnabled(true);
        btnexcluirped.setEnabled(false);
        btnBuscaPedido.setEnabled(true);
        btncancelaped.setEnabled(false);
        btnsalvaped.setEnabled(false);
        btnexcluirped.setEnabled(false);
        id_pedido.setEnabled(true);
        
        //Limpa Campos
        txtValorFrete.setText("");
        txtValorIcms.setText("");
        txtValorIpi.setText("");
        txtValorTotal.setText("");
        
         //altera campos busca
        id_pedido.setVisible(true);
        id_pedidoN.setVisible(false);
    }//GEN-LAST:event_btncancelapedActionPerformed

    private void btnexcluirpedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirpedActionPerformed
        //regra botoes
        btnnovoped.setEnabled(true);
        btnexcluirped.setEnabled(false);
        btnBuscaPedido.setEnabled(true);
        btncancelaped.setEnabled(false);
        btnsalvaped.setEnabled(false);
        id_pedido.setEnabled(true);
        
         //altera campos busca
        id_pedido.setVisible(true);
        id_pedidoN.setVisible(false);
    }//GEN-LAST:event_btnexcluirpedActionPerformed

    private void btnexcluiitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluiitemActionPerformed
        //libera botoes itens
        btnnovoitem.setEnabled(true);
        btncancelitem.setEnabled(false);   
        btnanterioritem.setEnabled(true);
        btnproximoitem.setEnabled(true);
        btnsaveitens.setEnabled(false);
        btnexcluiitem.setEnabled(true);
        btnatualizaitem.setEnabled(true);
    }//GEN-LAST:event_btnexcluiitemActionPerformed

    private void btnsalvarrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarrecActionPerformed
      
        QueryRecebimento.setNewCurrentFieldValue("id_usuario", usuario);
        
        //salva Dados do Pedido no recebimento
       // QueryRecebimento.setNewCurrentFieldValueAsInteger("id_pedido", QueryPedRec.getCurrentFieldValueAsInteger("id_pedido"));
       // QueryRecebimento.setNewCurrentFieldValueAsInteger("id_fornecedor", QueryPedRec.getCurrentFieldValueAsInteger("id_fornecedor"));
        QueryRecebimento.setNewCurrentFieldValueAsDouble("vlr_total", QueryPedRec.getCurrentFieldValueAsDouble("valor_total"));
        QueryRecebimento.setNewCurrentFieldValueAsDouble("vlr_ipi", QueryPedRec.getCurrentFieldValueAsDouble("valor_ipi_total"));
        QueryRecebimento.setNewCurrentFieldValueAsDouble("vlr_icms", QueryPedRec.getCurrentFieldValueAsDouble("valor_icms_total"));
        QueryRecebimento.setNewCurrentFieldValueAsDouble("vlr_iss", QueryPedRec.getCurrentFieldValueAsDouble("valor_iss_total"));
        QueryRecebimento.setNewCurrentFieldValueAsDouble("vlr_merc",QueryPedRec.getCurrentFieldValueAsDouble("valor_merc_total"));
        QueryRecebimento.setNewCurrentFieldValueAsDouble("vlr_frete",QueryPedRec.getCurrentFieldValueAsDouble("valor_frete"));
       
        btnverificaitem.setEnabled(true);
        btnexcluirrec.setEnabled(true);
        btnsalvarrec.setEnabled(false);
        btncancelrec.setEnabled(false);
        btnnovorec.setEnabled(true);
        
        btnverificaitem.setEnabled(true);
        
                     // Gerencia campos do novo item
        idforrecN.setVisible(true);
        idpedrecN.setVisible(true);
        idforrec.setVisible(false);
        idpedrec.setVisible(false);
    }//GEN-LAST:event_btnsalvarrecActionPerformed

    private void btnsalvaitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvaitemActionPerformed
         btnsalvaitem.setEnabled(false);
        btnverificaitem.setEnabled(true);
        
                     // Gerencia campos do novo item
        idforrecN.setVisible(false);
        idpedrecN.setVisible(false);
        idforrec.setVisible(true);
        idpedrec.setVisible(true);
       
        
    }//GEN-LAST:event_btnsalvaitemActionPerformed

    private void btnverificaitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverificaitemActionPerformed
 int qtditem=0,aux,idprod=0; 
 double qtdprod=0,estoqueatu=0;
  
        qtditem = 0;
//salva Dados dos Itens no recebimento
        QueryQtdItem.setSQL("select max(num_item) as nitem from cpiteped where id_pedido='"+idpedrecN.getText()+"'");
        QueryQtdItem.execQuery();
        qtditem = QueryQtdItem.getCurrentFieldValueAsInteger("nitem");
        
        for(aux =1;aux<= qtditem;aux++){
        QueryRecebimentoItem.insert();
        QueryRecebimentoItem.setNewCurrentFieldValueAsInteger("id_fornecedor", Integer.valueOf(idforrecN.getText()));
        QueryRecebimentoItem.setNewCurrentFieldValueAsInteger("idproduto", QueryItePedRec.getCurrentFieldValueAsInteger("idproduto"));
        QueryRecebimentoItem.setNewCurrentFieldValueAsInteger("id_pedido", QueryItePedRec.getCurrentFieldValueAsInteger("id_pedido"));
        QueryRecebimentoItem.setNewCurrentFieldValueAsInteger("idproduto", QueryItePedRec.getCurrentFieldValueAsInteger("idproduto"));
        QueryRecebimentoItem.setNewCurrentFieldValueAsInteger("item",QueryItePedRec.getCurrentFieldValueAsInteger("num_item"));
        QueryRecebimentoItem.setNewCurrentFieldValueAsDouble("qtde",QueryItePedRec.getCurrentFieldValueAsDouble("qntde"));
        QueryRecebimentoItem.setNewCurrentFieldValueAsDouble("vlr_unit",QueryItePedRec.getCurrentFieldValueAsDouble("valor_unit"));
        QueryRecebimentoItem.setNewCurrentFieldValueAsDouble("vlr_total",QueryItePedRec.getCurrentFieldValueAsDouble("valor_total_item"));
        
        QueryRecebimentoItem.save();
        
        QueryItePedRec.next(); 
        
        //Insere Quantidade no Estoque
        idprod = QueryRecebimentoItem.getCurrentFieldValueAsInteger("idproduto");
        QueryAltEst.setSQL("select * from escadpro where idproduto ='"+idprod+"'");
        QueryAltEst.execQuery();
        estoqueatu = QueryAltEst.getCurrentFieldValueAsDouble("quantidade");
        qtdprod = QueryRecebimentoItem.getCurrentFieldValueAsDouble("qtde")+estoqueatu;
        QueryAltEst.edit();
        QueryAltEst.setNewCurrentFieldValueAsDouble("quantidade", qtdprod);
        QueryAltEst.save();

        }
        
        btnsalvaitem.setEnabled(true);
        btnverificaitem.setEnabled(false);
        
    }//GEN-LAST:event_btnverificaitemActionPerformed

    private void btncancelrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelrecActionPerformed
        btnexcluirrec.setEnabled(false);
        btnsalvarrec.setEnabled(false);
        btncancelrec.setEnabled(false);
        btnnovorec.setEnabled(true);
        
               // Gerencia campos do novo item
        idforrecN.setVisible(false);
        idpedrecN.setVisible(false);
        idforrec.setVisible(true);
        idpedrec.setVisible(true);
    }//GEN-LAST:event_btncancelrecActionPerformed

    private void id_pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_pedidoMouseClicked
      atualizaElementos();
    }//GEN-LAST:event_id_pedidoMouseClicked

    private void id_pedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_pedidoKeyPressed
        atualizaElementos();
    }//GEN-LAST:event_id_pedidoKeyPressed

    private void txtValorFreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorFreteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorFreteActionPerformed

    private void btsalvaproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvaproActionPerformed
        QueryProduto.setNewCurrentFieldValue("id_usuario", usuario);
        
        // regra botoes
        btnovopro.setEnabled(true);
        btcancelapro.setEnabled(false);
        btsalvapro.setEnabled(false);
        btexcluipro.setEnabled(true);
        btanteriorpro.setEnabled(true);
        btproximopro.setEnabled(true);
    }//GEN-LAST:event_btsalvaproActionPerformed

    private void PaneEstoqueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PaneEstoqueFocusGained
        
    }//GEN-LAST:event_PaneEstoqueFocusGained

    private void novoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoopActionPerformed
        txtidop.setEnabled(false);
        //regra botoes
        novoop.setEnabled(false);
        cancelop.setEnabled(true);
        salvaop.setEnabled(true);
        excluiop.setEnabled(false);
        sairop.setEnabled(false);
        
        //seleciona o campo de texto correto
        txtidop.setVisible(false);
        txtidopN.setVisible(true);
    }//GEN-LAST:event_novoopActionPerformed

    private void cancelopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelopActionPerformed
        txtidop.setEnabled(true);
        //regra botoes
        novoop.setEnabled(true);
        cancelop.setEnabled(false);
        salvaop.setEnabled(false);
        excluiop.setEnabled(true);
        sairop.setEnabled(true);
        
        //seleciona o campo de texto correto
        txtidop.setVisible(true);
        txtidopN.setVisible(false);
    }//GEN-LAST:event_cancelopActionPerformed

    private void salvaopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaopActionPerformed
        txtidop.setEnabled(true);
        //regra botoes
        novoop.setEnabled(false);
        cancelop.setEnabled(false);
        salvaop.setEnabled(false);
        excluiop.setEnabled(true);
        sairop.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Preencha os Itens da O.P.");
        novoiteop.setEnabled(true);
        
        QueryOP.setNewCurrentFieldValue("id_usuario", usuario);
        QueryOP.setNewCurrentFieldValue("situacao", "Em Aberto");
        
        QueryIteOP.setSQL("select * from proiteop where id_op ='"+txtidopN.getText()+"'");
        QueryIteOP.execQuery();
        
        //seleciona o campo de texto correto
        txtidop.setVisible(false);
        txtidopN.setVisible(true);
    }//GEN-LAST:event_salvaopActionPerformed

    private void excluiopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiopActionPerformed
        txtidop.setEnabled(true);
        //regra botoes
        novoop.setEnabled(true);
        cancelop.setEnabled(false);
        salvaop.setEnabled(false);
        excluiop.setEnabled(true);
        sairop.setEnabled(true);
        novoiteop.setEnabled(false);
        //seleciona o campo de texto correto
        txtidop.setVisible(true);
        txtidopN.setVisible(false);
    }//GEN-LAST:event_excluiopActionPerformed

    private void novoiteopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoiteopActionPerformed
                //regra botoes
        novoiteop.setEnabled(false);
        canceliteop.setEnabled(true);
        salvaiteop.setEnabled(true);
        excluiiteop.setEnabled(false);
        btnbuscaproduto.setEnabled(true);
 
    }//GEN-LAST:event_novoiteopActionPerformed

    private void canceliteopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceliteopActionPerformed
        //regra botoes
        novoiteop.setEnabled(true);
        canceliteop.setEnabled(false);
        salvaiteop.setEnabled(false);
        excluiiteop.setEnabled(true);
        btnbuscaproduto.setEnabled(false);
    }//GEN-LAST:event_canceliteopActionPerformed

    private void salvaiteopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaiteopActionPerformed
       int result,idprod=0; 
       double estoqueatu=0,qtdprod=0;
//regra botoes
        novoiteop.setEnabled(true);
        canceliteop.setEnabled(false);
        salvaiteop.setEnabled(false);
        excluiiteop.setEnabled(true);
        finalizaiteop.setEnabled(true);
        btnbuscaproduto.setEnabled(false);
        

        
        QueryIteOP.setNewCurrentFieldValue("id_op", txtidop.getText());
        QueryIteOP.setNewCurrentFieldValue("ano_op", txtanoop.getText());
        
        QueryVeItem.setSQL("select max(item) as uitem from proiteop where id_op = '"+ txtidop.getText()+"'");
        QueryVeItem.execQuery();
        //puxa dados do produto para os itens do pedido
        result = QueryVeItem.getCurrentFieldValueAsInteger("uitem");
        result+=1;
        QueryIteOP.setNewCurrentFieldValueAsInteger("item", result);
        QueryIteOP.setNewCurrentFieldValueAsInteger("idproduto", codbuscaproduto);
        QueryIteOP.setNewCurrentFieldValue("desc_pro", descricao);
        QueryIteOP.setNewCurrentFieldValue("unidade", unidade);
        QueryIteOP.setNewCurrentFieldValueAsInteger("tipo", idtipopro);
        
        //Retira Quantidade no Estoque
        idprod = QueryIteOP.getCurrentFieldValueAsInteger("idproduto");
        QueryAltEst.setSQL("select * from escadpro where idproduto ='"+idprod+"'");
        QueryAltEst.execQuery();
        estoqueatu = QueryAltEst.getCurrentFieldValueAsDouble("quantidade");
        if (estoqueatu >= QueryIteOP.getCurrentFieldValueAsDouble("qntde")){
                qtdprod = estoqueatu-QueryIteOP.getCurrentFieldValueAsDouble("qntde");
                QueryAltEst.edit();
                QueryAltEst.setNewCurrentFieldValueAsDouble("quantidade", qtdprod);
                QueryAltEst.save();
        }else 
           JOptionPane.showMessageDialog(null, "Não tem quantidade necessária no estoque!! Operação Cancelada");
        
        
    }//GEN-LAST:event_salvaiteopActionPerformed

    private void finalizaiteopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizaiteopActionPerformed
        finalizaiteop.setEnabled(false);
        novoiteop.setEnabled(false);
        excluiiteop.setEnabled(false);
    }//GEN-LAST:event_finalizaiteopActionPerformed

    private void excluiiteopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiiteopActionPerformed
        //regra botoes
        novoiteop.setEnabled(true);
        canceliteop.setEnabled(false);
        salvaiteop.setEnabled(false);
        excluiiteop.setEnabled(true);
        finalizaiteop.setEnabled(false);
        btnbuscaproduto.setEnabled(false);
    }//GEN-LAST:event_excluiiteopActionPerformed

    private void txtiduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiduserActionPerformed

    private void BtnEncerraOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEncerraOpActionPerformed
     int idprod=0;
     double estoqueatu=0,qtdprod=0;
     String Item = null,Qtde = null,unidade=null;
        //pega o id do produto produzido
        while (Item == null || Item.equals("")) {
        Item = JOptionPane.showInputDialog("Qual o id do Produto Produzido?");
        if (Item == null || Item.equals("")) {
        JOptionPane.showMessageDialog(null,"Esse Item não existe!!");
                                             }
        }
        //busca a unidade de medida do produto
        QueryAltEst.setSQL("select unidMed from escadpro where idproduto ='"+Item+"'");
        QueryAltEst.execQuery();
        unidade = QueryAltEst.getCurrentFieldValue("unidMed");
        
        //pega a qntde produzida
        while (Qtde == null || Qtde.equals("")) {
        Qtde = JOptionPane.showInputDialog("Qual a quantidade produzida em "+unidade+" ?");
        if (Qtde == null || Qtde.equals("")) {
        JOptionPane.showMessageDialog(null,"Quantidade Incorreta!!");
                                             }
        }
        //Insere Quantidade no Estoque
        idprod = Integer.valueOf(Item);
        QueryAltEst.setSQL("select * from escadpro where idproduto ='"+idprod+"'");
        QueryAltEst.execQuery();
        estoqueatu = QueryAltEst.getCurrentFieldValueAsDouble("quantidade");
        qtdprod = estoqueatu+Double.valueOf(Qtde);
        QueryAltEst.edit();
        QueryAltEst.setNewCurrentFieldValueAsDouble("quantidade", qtdprod);
        QueryAltEst.save();
      
        JOptionPane.showMessageDialog(null, "Produto Inserido no Estoque!!");
        //muda situação op
        QueryOP.edit();
        QueryOP.setNewCurrentFieldValue("situacao", "Encerrado");
        QueryOP.save();
    /* 
        */
    }//GEN-LAST:event_BtnEncerraOpActionPerformed

    private void idpedrecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idpedrecFocusLost
        int pedido=0,fornecedor=0;
        
        String dataatu=null,datasistema=null;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        pedido = Integer.parseInt(idpedrec.getText());
        fornecedor = Integer.parseInt(idforrec.getText());
        
        //busca dados de recebimento existente
        QueryRecebimento.setSQL("select * from CPCADREC where id_pedido ='"+pedido+"' and id_fornecedor='"+fornecedor+"'");
        QueryRecebimento.execQuery();
        //busca dados do pedido
        QueryPedRec.setSQL("select * from CPCADPED where id_pedido ='"+pedido+"' and cod_fornecedor='"+fornecedor+"'" );
        QueryPedRec.execQuery();
        
        datasistema = String.valueOf(dateFormat.format(new Date())); 
        txtdatacad.setText(datasistema);
        
        QueryItePedRec.setSQL(" select * from CPITEPED where id_pedido = '" + pedido + "' order by num_item" );
        QueryItePedRec.execQuery();       
        
        QueryRecebimentoItem.setSQL("select * from CPITEREC where id_pedido ='"+pedido+"'and id_fornecedor='"+fornecedor+"'");
        QueryRecebimentoItem.execQuery();
        
       
      //  txtsituacao.setText(QueryPedido.getCurrentFieldValue("situacao"));
         
        
        //QueryBuscaForn.setSQL("select * from CLIFORTR where idclifor = '"+ txtidforn.getText() + "'");
       // QueryBuscaForn.execQuery();
        
        
        txtdataemi.setDate(QueryPedido.getCurrentFieldValueAsSQLDate("data_ent"));
        
          //regra botoes
        btnnovoped.setEnabled(false);
        btnexcluirped.setEnabled(true);
        btnBuscaPedido.setEnabled(false);
        btncancelaped.setEnabled(true);
        btnsalvaped.setEnabled(true);
        id_pedido.setEnabled(false);
        
    }//GEN-LAST:event_idpedrecFocusLost

    private void idpedrecNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idpedrecNFocusLost
    int pedido=0,fornecedor=0;
        
        String dataatu=null,datasistema=null;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        pedido = Integer.parseInt(idpedrecN.getText());
        fornecedor = Integer.parseInt(idforrecN.getText());
       

       
      //busca dados do pedido
        QueryPedRec.setSQL("select * from CPCADPED where id_pedido ='"+pedido+"' and cod_fornecedor='"+fornecedor+"'" );
        QueryPedRec.execQuery();
        
        datasistema = String.valueOf(dateFormat.format(new Date())); 
        txtdatacad.setText(datasistema);
        
        QueryItePedRec.setSQL(" select * from CPITEPED where id_pedido = '" + pedido + "' order by num_item" );
        QueryItePedRec.execQuery();       
        
        QueryRecebimentoItem.setSQL("select * from CPITEREC where id_pedido ='"+pedido+"'and id_fornecedor='"+fornecedor+"'");
        QueryRecebimentoItem.execQuery();
        
       
      //  txtsituacao.setText(QueryPedido.getCurrentFieldValue("situacao"));
         
        
        //QueryBuscaForn.setSQL("select * from CLIFORTR where idclifor = '"+ txtidforn.getText() + "'");
       // QueryBuscaForn.execQuery();
        
        
        txtdataemi.setDate(QueryPedido.getCurrentFieldValueAsSQLDate("data_ent"));
        
          //regra botoes
        btnnovoped.setEnabled(false);
        btnexcluirped.setEnabled(true);
        btnBuscaPedido.setEnabled(false);
        btncancelaped.setEnabled(true);
        btnsalvaped.setEnabled(true);
        id_pedido.setEnabled(false);
    }//GEN-LAST:event_idpedrecNFocusLost

    private void btnbuscaprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaprodutoActionPerformed
        new frmBuscaProduto().setVisible(true);
    }//GEN-LAST:event_btnbuscaprodutoActionPerformed

    private void txtidopFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidopFocusLost
    String Situacao = null;    
        //lista cabecalho OP
        QueryOP.setSQL("select * from procadop where id_op ='"+txtidop.getText()+"'");
        QueryOP.execQuery();
        //lista itens da OP
        QueryIteOP.setSQL("select * from proiteop where id_op ='"+txtidop.getText()+"'");
        QueryIteOP.execQuery();
        Situacao = QueryOP.getCurrentFieldValue("situacao");
        if (Situacao == "Em Aberto"){
        BtnEncerraOp.setEnabled(true);
        }else
            JOptionPane.showMessageDialog(null, "Essa O.P. já está encerrada!");
    }//GEN-LAST:event_txtidopFocusLost

    private void txtidtranspFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidtranspFocusLost
        QueryBuscaForn.setSQL("select * from CLIFORTR where idclifor = '"+ txtidtransp.getText() + "'");
        QueryBuscaForn.execQuery();
        
    }//GEN-LAST:event_txtidtranspFocusLost

    private void txtidcliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidcliFocusLost
        QueryBuscaCli.setSQL("select * from CLIFORTR where idclifor = '"+ txtidcli.getText() + "'");
        QueryBuscaCli.execQuery();
    }//GEN-LAST:event_txtidcliFocusLost

    private void btnsalvaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvaveActionPerformed
      String dataatu=null,datasistema=null;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        datasistema = String.valueOf(dateFormat.format(new Date())); 
         
        QueryVendas.setNewCurrentFieldValue("data", datasistema);
        QueryVendas.setNewCurrentFieldValue("id_usuario", usuario);
        QueryVendas.setNewCurrentFieldValueAsInteger("id_estab",QueryEstabelecimento.getCurrentFieldValueAsInteger("id_estab"));
        
        //regra botoes
        btnnovave.setEnabled(true);
        btncancelave.setEnabled(false);
        btnsalvave.setEnabled(false);
        btnexcluive.setEnabled(true);
        btnsairve.setEnabled(true);
      
        txtidpedido.setEnabled(true);
        txtidpedidoN.setVisible(false);
    }//GEN-LAST:event_btnsalvaveActionPerformed

    private void btnnovaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovaveActionPerformed
         //regra botoes
        btnnovave.setEnabled(false);
        btncancelave.setEnabled(true);
        btnsalvave.setEnabled(true);
        btnexcluive.setEnabled(false);
        btnsairve.setEnabled(false);
        
        txtidpedido.setEnabled(false);
        txtidpedidoN.setVisible(true);
        
        //limpa campos de pesquisa
        txtidcli.setText("");
        txtidtransp.setText("");
    }//GEN-LAST:event_btnnovaveActionPerformed

    private void btncancelaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelaveActionPerformed
       //regra botoes
        btnnovave.setEnabled(true);
        btncancelave.setEnabled(false);
        btnsalvave.setEnabled(false);
        btnexcluive.setEnabled(true);
        btnsairve.setEnabled(true);
        
        txtidpedido.setEnabled(true);
        txtidpedidoN.setVisible(false);
        //limpa campos de pesquisa
        txtidcli.setText("");
        txtidtransp.setText("");
    }//GEN-LAST:event_btncancelaveActionPerformed

    private void btnexcluiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluiveActionPerformed
        //regra botoes
        btnnovave.setEnabled(true);
        btncancelave.setEnabled(false);
        btnsalvave.setEnabled(false);
        btnexcluive.setEnabled(true);
        btnsairve.setEnabled(true);
        
        txtidpedido.setEnabled(true);
        txtidpedidoN.setVisible(false);
    }//GEN-LAST:event_btnexcluiveActionPerformed

    private void btnsairveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairveActionPerformed
        //regra botoes
        btnnovave.setEnabled(false);
        btncancelave.setEnabled(true);
        btnsalvave.setEnabled(true);
        btnexcluive.setEnabled(false);
        btnsairve.setEnabled(false);
        
        //limpa campos de pesquisa
        txtidcli.setText("");
        txtidtransp.setText("");
        
        QueryVendas.setSQL("select * from vecadped where id_pedido = -1");
        QueryVendas.execQuery();
        QueryVendasItem.setSQL("select * from veiteped where id_pedido = -1");
        QueryVendasItem.execQuery();
        
        PaneVendas.setVisible(false);
    }//GEN-LAST:event_btnsairveActionPerformed

    private void btnnovoiteveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoiteveActionPerformed
        //regra botoes
        btnnovoiteve.setEnabled(false);
        btncanceliteve.setEnabled(true);
        btnsalvaiteve.setEnabled(true);
        btnexcluiiteve.setEnabled(false);
        btnsairve.setEnabled(false);
        btnfinalizaitens.setEnabled(false);
    }//GEN-LAST:event_btnnovoiteveActionPerformed

    private void btncanceliteveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanceliteveActionPerformed
        //regra botoes
        btnnovoiteve.setEnabled(true);
        btncanceliteve.setEnabled(false);
        btnsalvaiteve.setEnabled(false);
        btnexcluiiteve.setEnabled(true);
        btnsairve.setEnabled(false);
    }//GEN-LAST:event_btncanceliteveActionPerformed

    private void btnsalvaiteveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvaiteveActionPerformed
        //regra botoes
        btnnovoiteve.setEnabled(true);
        btncanceliteve.setEnabled(false);
        btnsalvaiteve.setEnabled(false);
        btnexcluiiteve.setEnabled(true);
        btnsairve.setEnabled(false);
        btnfinalizaitens.setEnabled(true);
    }//GEN-LAST:event_btnsalvaiteveActionPerformed

    private void btnexcluiiteveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluiiteveActionPerformed
        //regra botoes
        btnnovoiteve.setEnabled(true);
        btncanceliteve.setEnabled(false);
        btnsalvaiteve.setEnabled(false);
        btnexcluiiteve.setEnabled(true);
        btnsairve.setEnabled(false);
        btnfinalizaitens.setEnabled(true);
    }//GEN-LAST:event_btnexcluiiteveActionPerformed

    private void btnfinalizaitensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizaitensActionPerformed
        //regra botoes
        btnsairve.setEnabled(true);
    }//GEN-LAST:event_btnfinalizaitensActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int cod_cliente=0,cod_produto=0,cod_transp=0;    
        String datasaida=null,dataemissao=null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      
        
//Buscas da NFE
        QueryVendas.setSQL("Select * from vecadped  where id_pedido ='"+txtPedidoNfe.getText()+"'");
        QueryVendas.execQuery();
        QueryVendasItem.setSQL("Select * from veiteped  where id_pedido ='"+txtPedidoNfe.getText()+"'");
        QueryVendasItem.execQuery();
        cod_cliente = QueryVendas.getCurrentFieldValueAsInteger("id_cliente");
        QueryCliente.setSQL("select * from clifortr where tipo = 'Cliente' and idclifor='"+cod_cliente+"'");
        QueryCliente.execQuery();
        cod_produto = QueryVendasItem.getCurrentFieldValueAsInteger("ESCADPRO_idproduto");
        QueryProduto.setSQL("Select * from escadpro where idproduto ='"+cod_produto+"'");
        QueryProduto.execQuery();
        cod_transp=QueryVendas.getCurrentFieldValueAsInteger("id_transportador");
        QueryTransp.setSQL("select * from clifortr where tipo = 'Transportadora' and idclifor='"+cod_transp+"'");
        QueryTransp.execQuery();
        
        //variaveis da nfe
        //Dados da nota 
        txtSerie = QueryVendas.getCurrentFieldValue("serie");
        txtNf = QueryVendas.getCurrentFieldValue("nota_fiscal");
        txtDataemissao = QueryVendas.getCurrentFieldValue("data_emissao");
        txtDatasaida = QueryVendas.getCurrentFieldValue("data_saida");
        txtHoraSaida = QueryVendas.getCurrentFieldValue("hora_saida");
        //Dados Estabelecimento
        XNome = QueryEstabelecimento.getCurrentFieldValue("razao_social");
        XFantasia = QueryEstabelecimento.getCurrentFieldValue("razao_social");
        IE = QueryEstabelecimento.getCurrentFieldValue("ins_est");
        IEST = "";
        IM = QueryEstabelecimento.getCurrentFieldValue("ins_Mun");
        CNAE = QueryEstabelecimento.getCurrentFieldValue("CNAE");
        CRT=String.valueOf(QueryEstabelecimento.getCurrentFieldValueAsInteger("crt"));
        CNPJ= QueryEstabelecimento.getCurrentFieldValue("cnpj");
        XLgr= QueryEstabelecimento.getCurrentFieldValue("endereco");
        Nro = QueryEstabelecimento.getCurrentFieldValue("numero");
        Cpl= QueryEstabelecimento.getCurrentFieldValue("complemento");
        Bairro= QueryEstabelecimento.getCurrentFieldValue("bairro");
        CMun = String.valueOf(QueryEstabelecimento.getCurrentFieldValueAsInteger("cod_Mun"));
        XMun= QueryEstabelecimento.getCurrentFieldValue("cidade");
        UF = QueryEstabelecimento.getCurrentFieldValue("uf");
        CEP = QueryEstabelecimento.getCurrentFieldValue("cep").replaceAll("-", "");
        fone = QueryEstabelecimento.getCurrentFieldValue("telefone").replaceAll("-", "");
        //Dados Cliente
        razaoCliente = QueryCliente.getCurrentFieldValue("razao");
        IECliente= QueryCliente.getCurrentFieldValue("inscEst");
        emailCliente= QueryCliente.getCurrentFieldValue("e-mail");
        CNPJCli= QueryCliente.getCurrentFieldValue("cnpj");
        LogrCli = QueryCliente.getCurrentFieldValue("endereco");
        NroCli = QueryCliente.getCurrentFieldValue("numero");
        BairroCli=QueryCliente.getCurrentFieldValue("bairro");
        codMunCli = QueryCliente.getCurrentFieldValue("cod_mun");
        MunCli = QueryCliente.getCurrentFieldValue("cidade");
        UFCli = QueryCliente.getCurrentFieldValue("uf");
        CEPCli= QueryCliente.getCurrentFieldValue("cep").replaceAll("-", "");
        foneCli=QueryCliente.getCurrentFieldValue("telefone").replaceAll("-", "");
        //Dados Item
        nItem= String.valueOf(QueryVendasItem.getCurrentFieldValueAsInteger("item"));
        codProd=String.valueOf(QueryVendasItem.getCurrentFieldValueAsInteger("ESCADPRO_idproduto"));
        descPro=QueryProduto.getCurrentFieldValue("nome");
        NCM=QueryProduto.getCurrentFieldValue("ncm");
        CFOP=QueryProduto.getCurrentFieldValue("cfop");
        UnidMed=QueryProduto.getCurrentFieldValue("unidMed");
        Qtde=String.valueOf(QueryVendasItem.getCurrentFieldValueAsInteger("qtde"));
        vlrUnit=String.valueOf(QueryVendasItem.getCurrentFieldValueAsDouble("vlr_unit"));
        vlrProd=String.valueOf(QueryVendasItem.getCurrentFieldValueAsDouble("vlr_total"));
        UnidTrib=QueryProduto.getCurrentFieldValue("unidMed");
        QtdeTrib=String.valueOf(QueryVendasItem.getCurrentFieldValueAsInteger("qtde"));
        vlrUnitTrib=String.valueOf(QueryVendasItem.getCurrentFieldValueAsDouble("vlr_unit"));
        //Dados de Transportadora
        RazaoTransp=QueryTransp.getCurrentFieldValue("razao");
        IETransp=QueryTransp.getCurrentFieldValue("inscEst");
        LogrTransp=QueryTransp.getCurrentFieldValue("endereco");
        UFTransp=QueryTransp.getCurrentFieldValue("uf");
        CidadeTransp=QueryTransp.getCurrentFieldValue("cidade");
        CNPJTransp=QueryTransp.getCurrentFieldValue("cnpj");
        Placa= QueryVendas.getCurrentFieldValue("placa_vei");
        UFPlaca= QueryVendas.getCurrentFieldValue("uf_vei");
        NFat = QueryVendas.getCurrentFieldValue("nota_fiscal"); 
        pesoBruto= String.valueOf(QueryVendas.getCurrentFieldValueAsDouble("pesobruto"));
        VlrOrig = String.valueOf(QueryVendas.getCurrentFieldValueAsDouble("total"));
        VlrLiq = String.valueOf(QueryVendas.getCurrentFieldValueAsDouble("total"));
        //Dados da duplicata
        //nDup="ALT";
        //dataVenc="ALT";
        //VlrDup="ALT";
        textolegal=QueryVendas.getCurrentFieldValue("textolegal");
        
        try {  
            // Gravando no arquivo TXT  
            File arquivo;  
  
            arquivo = new File("TXT/NFE"+txtNf+".txt");  
            FileOutputStream fos = new FileOutputStream(arquivo);  
            String texto = "NOTA FISCAL|1|"
                         + System.getProperty("line.separator")
                         + "A|2.00|NFe|"
                         + System.getProperty("line.separator")+
                         "B|41||VENDAS PRODUCAO ESTABELECIMENTO                            |0|55|"+txtSerie+"|"+txtNf+"|"+txtDataemissao+"|"+txtDatasaida+"|"+txtHoraSaida+"|1|4126306|1|1||1|1|3|2.2.14|"
                         + System.getProperty("line.separator")+
                         "C|"+XNome+"|"+XFantasia+"|"+IE+"|"+IEST+"|"+IM+"|"+CNAE+"|"+CRT+"|2014-10-31|"
                         + System.getProperty("line.separator")+
                         "C02|"+CNPJ+"|"
                         + System.getProperty("line.separator")+
                         "C05|"+XLgr+"|"+Nro+"|"+Cpl+"|"+Bairro+"|"+CMun+"|"+XMun+"|"+UF+"|"+CEP+"|1058|BRASIL|"+fone+"|"
                         + System.getProperty("line.separator")+
                         "E|"+razaoCliente+"|"+IECliente+"||"+emailCliente+"|"
                         + System.getProperty("line.separator")+
                         "E02|"+CNPJCli+"|"
                         + System.getProperty("line.separator")+
                         "E05|"+LogrCli+"|"+NroCli+"||"+BairroCli+"|"+codMunCli+"|"+MunCli+"|"+UFCli+"|"+CEPCli+"|1058|BRASIL|"+foneCli+"|"
                         + System.getProperty("line.separator")+ 
                         "H|"+nItem+"||"
                         + System.getProperty("line.separator")+
                         "I|"+codProd+"||"+descPro+"|"+NCM+"||"+CFOP+"|"+UnidMed+"|"+Qtde+"|"+vlrUnit+"|"+vlrProd+"||"+UnidTrib+"|"+QtdeTrib+"|"+vlrUnitTrib+"|||||1|||"
                         + System.getProperty("line.separator")+     
                         "M||"
                         + System.getProperty("line.separator")+
                         "N|"
                         + System.getProperty("line.separator")+
                         "N07|0|51|3|0.00|0.00|0.00|0.00|"
                         + System.getProperty("line.separator")+
                         "O|||||999|"
                         + System.getProperty("line.separator")+
                         "O08|53|"
                         + System.getProperty("line.separator")+
                         "Q|"
                         + System.getProperty("line.separator")+
                         "Q02|01|"+VlrLiq+"|0|0|"
                         + System.getProperty("line.separator")+
                         "S|"
                         + System.getProperty("line.separator")+
                         "S02|01|"+VlrLiq+"|0|0|"
                         + System.getProperty("line.separator")+
                         "W|"
                         + System.getProperty("line.separator")+
                         "W02|||||"+VlrLiq+"||||||0|0||"+VlrLiq+"||"
                         + System.getProperty("line.separator")+
                         "X|1|"
                         + System.getProperty("line.separator")+
                         "X03|"+RazaoTransp+"|"+IETransp+"|"+LogrTransp+"|"+UFTransp+"|"+CidadeTransp+"|"
                         + System.getProperty("line.separator")+
                         "X04|"+CNPJTransp+"|"
                         + System.getProperty("line.separator")+
                         "X18|"+Placa+"|"+UFPlaca+"||"
                         + System.getProperty("line.separator")+
                         "X26|0|"+UnidMed+"|||"+pesoBruto+"|"+pesoBruto+"|"
                         + System.getProperty("line.separator")+
                         "Y|"
                         + System.getProperty("line.separator")+
                         "Y02|"+NFat+"|"+VlrOrig+"||"+VlrLiq+"|"
                         + System.getProperty("line.separator")+
                         "Y07|"+nDup+"|"+dataVenc+"|"+VlrDup+"|"
                         + System.getProperty("line.separator")+
                         "Z||Texto Legal:"+textolegal;

                    ;  
            fos.write(texto.getBytes());  
            fos.close();  
              JOptionPane.showMessageDialog(null,"Arquivo de TXT gerado!!");
        }  
        catch (Exception ee) {  
            ee.printStackTrace();  
        }   
        
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void QueryFornecedorOnSaveManually(lib.jdb.jdbquery.event.SaveManuallyEventObject evt) {//GEN-FIRST:event_QueryFornecedorOnSaveManually
      String msg = "";
      String razao = QueryFornecedor.getNewCurrentFieldValue("razao");
      String fantasia = QueryFornecedor.getNewCurrentFieldValue("fantasia");
      String cpf = QueryFornecedor.getNewCurrentFieldValue("cpf");
      String cnpj = QueryFornecedor.getNewCurrentFieldValue("cnpj");
      String inscEst = QueryFornecedor.getNewCurrentFieldValue("inscEst");
      String cidade = QueryFornecedor.getNewCurrentFieldValue("cidade");
      String uf = QueryFornecedor.getNewCurrentFieldValue("uf");
      String endereco = QueryFornecedor.getNewCurrentFieldValue("endereco");
      String numero = QueryFornecedor.getNewCurrentFieldValue("numero");
      String bairro = QueryFornecedor.getNewCurrentFieldValue("bairro");
      String cep = QueryFornecedor.getNewCurrentFieldValue("cep");
      String telefone = QueryFornecedor.getNewCurrentFieldValue("telefone");
      String cod_mun = QueryFornecedor.getNewCurrentFieldValue("cod_mun");
      String contato = QueryFornecedor.getNewCurrentFieldValue("contato");
      String email = QueryFornecedor.getNewCurrentFieldValue("email");
      
      if(evt.isInserting()){
        QueryFornecedor.setNewCurrentFieldValue("pais", "Brasil");        
        if(razao.equals("")){ msg += "O campo \"Razão Social\" não pode estar vazio!\n"; }
        if(fantasia.equals("")){ msg += "O campo \"Nome Fantasia\" não pode estar vazio!\n"; }
        if(cboxTipoPessoa.getSelectedItem().toString().equals("Física")){
          if(cpf.equals("")){ msg += "O campo \"CPF\" não pode estar vazio!\n"; }
        } 
        else{
          if(cnpj.equals("  .   .   /    -  ")){ msg += "O campo \"CNPJ\" não pode estar vazio!\n"; }
          if(inscEst.equals("")){ msg += "O campo \"Inscrição Estadual\" não pode estar vazio!\n"; }
        }
        if(cidade.equals("")){ msg += "O campo \"Cidade\" não pode estar vazio!\n"; }
        if(uf.equals("")){ msg += "O campo \"UF\" não pode estar vazio!\n"; }
        if(endereco.equals("")){ msg += "O campo \"Endereco\" não pode estar vazio!\n"; }
        if(numero.equals("")){ msg += "O campo \"Número\" não pode estar vazio!\n"; }
        if(bairro.equals("")){ msg += "O campo \"Bairro\" não pode estar vazio!\n"; }
        if(cep.equals("")){ msg += "O campo \"CEP\" não pode estar vazio!\n"; }
        if(cod_mun.equals("")){ msg += "O campo \"Cod. Município IBGE\" não pode estar vazio!\n"; }
        if(telefone.equals("")){ msg += "O campo \"Telefone\" não pode estar vazio!\n"; }
        if(contato.equals("")){ msg += "O campo \"Nome Contato\" não pode estar vazio!\n"; }
        if(email.equals("")){ msg += "O campo \"Email\" não pode estar vazio!\n"; }
      }
      
      if(evt.isEditing()){
        if(!razao.equals(QueryFornecedor.IGNORE)){
            if(razao.equals("")){ msg += "O campo \"Razão Social\" não pode estar vazio!\n"; }
        }
        if(!fantasia.equals(QueryFornecedor.IGNORE)){
            if(fantasia.equals("")){ msg += "O campo \"Nome Fantasia\" não pode estar vazio!\n"; }
        }
        
        if(cboxTipoPessoa.getSelectedItem().toString().equals("Física")){
          if(!cpf.equals(QueryFornecedor.IGNORE)){
            if(cpf.equals("")){ msg += "O campo \"CPF\" não pode estar vazio!\n"; }
          }
        } 
        else{
          if(!cnpj.equals(QueryFornecedor.IGNORE)){
            if(cnpj.equals("  .   .   /    -  ")){ msg += "O campo \"CNPJ\" não pode estar vazio!\n"; }
          }
          if(!inscEst.equals(QueryFornecedor.IGNORE)){
            if(inscEst.equals("")){ msg += "O campo \"Inscrição Estadual\" não pode estar vazio!\n"; }
          }
        }
        
        if(!cidade.equals(QueryFornecedor.IGNORE)){
            if(cidade.equals("")){ msg += "O campo \"Cidade\" não pode estar vazio!\n"; }
        }
        if(!uf.equals(QueryFornecedor.IGNORE)){
            if(uf.equals("")){ msg += "O campo \"UF\" não pode estar vazio!\n"; }
        }
        if(!endereco.equals(QueryFornecedor.IGNORE)){
            if(endereco.equals("")){ msg += "O campo \"Endereco\" não pode estar vazio!\n"; }
        }
        if(!numero.equals(QueryFornecedor.IGNORE)){
            if(numero.equals("")){ msg += "O campo \"Número\" não pode estar vazio!\n"; }
        }
        if(!bairro.equals(QueryFornecedor.IGNORE)){
            if(bairro.equals("")){ msg += "O campo \"Bairro\" não pode estar vazio!\n"; }
        }
        if(!cep.equals(QueryFornecedor.IGNORE)){
            if(cep.equals("")){ msg += "O campo \"CEP\" não pode estar vazio!\n"; }
        }
        if(!cod_mun.equals(QueryFornecedor.IGNORE)){
            if(cod_mun.equals("")){ msg += "O campo \"Cod. Município IBGE\" não pode estar vazio!\n"; }
        }
        if(!telefone.equals(QueryFornecedor.IGNORE)){
            if(telefone.equals("")){ msg += "O campo \"Telefone\" não pode estar vazio!\n"; }
        }
        if(!contato.equals(QueryFornecedor.IGNORE)){
            if(contato.equals("")){ msg += "O campo \"Nome Contato\" não pode estar vazio!\n"; }
        }
        if(!email.equals(QueryFornecedor.IGNORE)){
            if(email.equals("")){ msg += "O campo \"Email\" não pode estar vazio!\n"; }
        }
      }
      
      if(msg.equals("")){
        QueryFornecedor.setNewCurrentFieldValue("tipo", "Fornecedor");
        QueryFornecedor.setNewCurrentFieldValue("id_usuario", usuario);
        if(QueryFornecedor.save()){
          JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
          btnDeleteCad1.setEnabled(true);
          btnAntCad1.setEnabled(true);
          btnProxCad1.setEnabled(true);
        }
      }
      else{
          JOptionPane.showMessageDialog(this, msg);
      }
    }//GEN-LAST:event_QueryFornecedorOnSaveManually

    private void txtRazaoCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaoCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaoCadActionPerformed

    private void txtIdFornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFornecedorFocusLost

    }//GEN-LAST:event_txtIdFornecedorFocusLost

    private void btnAntCad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntCad1ActionPerformed

    }//GEN-LAST:event_btnAntCad1ActionPerformed

    private void btnProxCad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProxCad1ActionPerformed

    }//GEN-LAST:event_btnProxCad1ActionPerformed

    private void cboxTipoPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxTipoPessoaMouseClicked
      bloqueiaCamposTipoPessoa();
    }//GEN-LAST:event_cboxTipoPessoaMouseClicked

    private void cboxTipoPessoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxTipoPessoaMousePressed
      bloqueiaCamposTipoPessoa();
    }//GEN-LAST:event_cboxTipoPessoaMousePressed

    private void cboxTipoPessoaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxTipoPessoaMouseReleased
      bloqueiaCamposTipoPessoa();
    }//GEN-LAST:event_cboxTipoPessoaMouseReleased

    private void txtidpedidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidpedidoFocusLost
      //lista cabecalho venda
        QueryVendas.setSQL("select * from vecadped where id_pedido ='"+txtidpedido.getText()+"'");
        QueryVendas.execQuery();
    //lista itens da venda
        QueryVendasItem.setSQL("select * from veiteped where id_pedido ='"+txtidpedido.getText()+"'");
        QueryVendasItem.execQuery();
       //busca novo cliente 
        QueryBuscaCli.setSQL("select * from CLIFORTR where idclifor = '"+ txtidcli.getText() + "'");
        QueryBuscaCli.execQuery();
        //busca nome transp
        QueryBuscaForn.setSQL("select * from CLIFORTR where idclifor = '"+ txtidtransp.getText() + "'");
        QueryBuscaForn.execQuery();
    }//GEN-LAST:event_txtidpedidoFocusLost

    private void txtidpedidoNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidpedidoNFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpedidoNFocusLost

    private void id_pedidoNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_pedidoNKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pedidoNKeyPressed

    private void id_pedidoNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_pedidoNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pedidoNMouseClicked

    private void id_pedidoNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_pedidoNFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pedidoNFocusLost

    private void id_pedidoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pedidoNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pedidoNActionPerformed

    private void btnBuscaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaPedidoActionPerformed
        new frmBuscaPedido().setVisible(true);
    }//GEN-LAST:event_btnBuscaPedidoActionPerformed

    private void btsalvagruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvagruActionPerformed
        // regra botoes
        btnovogru.setEnabled(true);
        btcancelagru.setEnabled(false);
        btsalvagru.setEnabled(false);
        btexcluigru.setEnabled(true);
        btatualizagru.setEnabled(true);
        btprimeirogru.setEnabled(true);
        btanteriorgru.setEnabled(true);
        btproximogru.setEnabled(true);
        btultimogru.setEnabled(true);
    }//GEN-LAST:event_btsalvagruActionPerformed

    private void btnovogruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovogruActionPerformed
        // regra botoes
        btnovogru.setEnabled(false);
        btcancelagru.setEnabled(true);
        btsalvagru.setEnabled(true);
        btexcluigru.setEnabled(false);
        btatualizagru.setEnabled(false);
        btprimeirogru.setEnabled(false);
        btanteriorgru.setEnabled(false);
        btproximogru.setEnabled(false);
        btultimogru.setEnabled(false);
    }//GEN-LAST:event_btnovogruActionPerformed

    private void btcancelagruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelagruActionPerformed
        // regra botoes
        btnovogru.setEnabled(true);
        btcancelagru.setEnabled(false);
        btsalvagru.setEnabled(false);
        btexcluigru.setEnabled(true);
        btatualizagru.setEnabled(true);
        btprimeirogru.setEnabled(true);
        btanteriorgru.setEnabled(true);
        btproximogru.setEnabled(true);
        btultimogru.setEnabled(true);
    }//GEN-LAST:event_btcancelagruActionPerformed

    private void btexcluigruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluigruActionPerformed
        // regra botoes
        btnovogru.setEnabled(true);
        btcancelagru.setEnabled(false);
        btsalvagru.setEnabled(false);
        btexcluigru.setEnabled(true);
        btatualizagru.setEnabled(true);
        btprimeirogru.setEnabled(true);
        btanteriorgru.setEnabled(true);
        btproximogru.setEnabled(true);
        btultimogru.setEnabled(true);
    }//GEN-LAST:event_btexcluigruActionPerformed

    private void btatualizagruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btatualizagruActionPerformed
        // regra botoes
        btnovogru.setEnabled(true);
        btcancelagru.setEnabled(false);
        btsalvagru.setEnabled(false);
        btexcluigru.setEnabled(true);
        btatualizagru.setEnabled(true);
        btprimeirogru.setEnabled(true);
        btanteriorgru.setEnabled(true);
        btproximogru.setEnabled(true);
        btultimogru.setEnabled(true);
    }//GEN-LAST:event_btatualizagruActionPerformed

    private void btnovosubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovosubActionPerformed
        // regra botoes
        btnovosub.setEnabled(false);
        btcancelasub.setEnabled(true);
        btsalvasub.setEnabled(true);
        btexcluisub.setEnabled(false);
        btatualizasub.setEnabled(false);
        btprimeirosub.setEnabled(false);
        btanteriorsub.setEnabled(false);
        btproximosub.setEnabled(false);
        btultimosub.setEnabled(false);
    }//GEN-LAST:event_btnovosubActionPerformed

    private void btnovotipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovotipoActionPerformed
        // regra botoes
        btnovotipo.setEnabled(false);
        btcancelatipo.setEnabled(true);
        btsalvatipo.setEnabled(true);
        btexcluitipo.setEnabled(false);
        btatualizatipo.setEnabled(false);
        btprimeirotipo.setEnabled(false);
        btanteriortipo.setEnabled(false);
        btproximotipo.setEnabled(false);
        btultimotipo.setEnabled(false);
    }//GEN-LAST:event_btnovotipoActionPerformed

    private void btcancelaproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelaproActionPerformed
        // regra botoes
        btnovopro.setEnabled(true);
        btcancelapro.setEnabled(false);
        btsalvapro.setEnabled(false);
        btexcluipro.setEnabled(true);
        btanteriorpro.setEnabled(true);
        btproximopro.setEnabled(true);
    }//GEN-LAST:event_btcancelaproActionPerformed

    private void btcancelatipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelatipoActionPerformed
        // regra botoes
        btnovotipo.setEnabled(true);
        btcancelatipo.setEnabled(false);
        btsalvatipo.setEnabled(false);
        btexcluitipo.setEnabled(true);
        btatualizatipo.setEnabled(true);
        btprimeirotipo.setEnabled(true);
        btanteriortipo.setEnabled(true);
        btproximotipo.setEnabled(true);
        btultimotipo.setEnabled(true);
    }//GEN-LAST:event_btcancelatipoActionPerformed

    private void btsalvatipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvatipoActionPerformed
        // regra botoes
        btnovotipo.setEnabled(true);
        btcancelatipo.setEnabled(false);
        btsalvatipo.setEnabled(false);
        btexcluitipo.setEnabled(true);
        btatualizatipo.setEnabled(true);
        btprimeirotipo.setEnabled(true);
        btanteriortipo.setEnabled(true);
        btproximotipo.setEnabled(true);
        btultimotipo.setEnabled(true);
    }//GEN-LAST:event_btsalvatipoActionPerformed

    private void btcancelasubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelasubActionPerformed
        // regra botoes
        btnovosub.setEnabled(true);
        btcancelasub.setEnabled(false);
        btsalvasub.setEnabled(false);
        btexcluisub.setEnabled(true);
        btatualizasub.setEnabled(true);
        btprimeirosub.setEnabled(true);
        btanteriorsub.setEnabled(true);
        btproximosub.setEnabled(true);
        btultimosub.setEnabled(true);
    }//GEN-LAST:event_btcancelasubActionPerformed

    private void btexcluitipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluitipoActionPerformed
        // regra botoes
        btnovotipo.setEnabled(true);
        btcancelatipo.setEnabled(false);
        btsalvatipo.setEnabled(false);
        btexcluitipo.setEnabled(true);
        btatualizatipo.setEnabled(true);
        btprimeirotipo.setEnabled(true);
        btanteriortipo.setEnabled(true);
        btproximotipo.setEnabled(true);
        btultimotipo.setEnabled(true);
    }//GEN-LAST:event_btexcluitipoActionPerformed

    private void btatualizatipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btatualizatipoActionPerformed
        // regra botoes
        btnovotipo.setEnabled(true);
        btcancelatipo.setEnabled(false);
        btsalvatipo.setEnabled(false);
        btexcluitipo.setEnabled(true);
        btatualizatipo.setEnabled(true);
        btprimeirotipo.setEnabled(true);
        btanteriortipo.setEnabled(true);
        btproximotipo.setEnabled(true);
        btultimotipo.setEnabled(true);
    }//GEN-LAST:event_btatualizatipoActionPerformed

    private void btsalvasubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvasubActionPerformed
        // regra botoes
        btnovosub.setEnabled(true);
        btcancelasub.setEnabled(false);
        btsalvasub.setEnabled(false);
        btexcluisub.setEnabled(true);
        btatualizasub.setEnabled(true);
        btprimeirosub.setEnabled(true);
        btanteriorsub.setEnabled(true);
        btproximosub.setEnabled(true);
        btultimosub.setEnabled(true);
    }//GEN-LAST:event_btsalvasubActionPerformed

    private void btexcluisubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluisubActionPerformed
        // regra botoes
        btnovosub.setEnabled(true);
        btcancelasub.setEnabled(false);
        btsalvasub.setEnabled(false);
        btexcluisub.setEnabled(true);
        btatualizasub.setEnabled(true);
        btprimeirosub.setEnabled(true);
        btanteriorsub.setEnabled(true);
        btproximosub.setEnabled(true);
        btultimosub.setEnabled(true);
    }//GEN-LAST:event_btexcluisubActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void frmFornecedorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmFornecedorMouseMoved
      bloqueiaCamposTipoPessoa();

    }//GEN-LAST:event_frmFornecedorMouseMoved

    private void frmFornecedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_frmFornecedorFocusGained

    }//GEN-LAST:event_frmFornecedorFocusGained

    private void frmFornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_frmFornecedorFocusLost

    }//GEN-LAST:event_frmFornecedorFocusLost

    private void PaneComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneComprasMouseEntered
      
    }//GEN-LAST:event_PaneComprasMouseEntered

    private void PaneComprasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PaneComprasFocusLost
       
    }//GEN-LAST:event_PaneComprasFocusLost

    private void frmPedidoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmPedidoMouseMoved
        QueryFornecedor.cancel();
    }//GEN-LAST:event_frmPedidoMouseMoved

    
    public void atualizaElementos(){
      double valor_total =0, ipi_total = 0, icms_total = 0, frete_total = 0;
      int rows = tableiteped.getRowCount();
        
      for(int i = 0; i < rows; i++){
        double total_item = 0, valor_unit = 0, qtd = 0, ipi = 0, icms = 0, frete = 0;
        qtd = Double.parseDouble(tableiteped.getValueAt(i, 4).toString().replaceAll(",", "."));
        valor_unit = Double.parseDouble(tableiteped.getValueAt(i, 7).toString().replaceAll(",", "."));
        ipi = Double.parseDouble(tableiteped.getValueAt(i, 8).toString().replaceAll(",", "."));
        icms = Double.parseDouble(tableiteped.getValueAt(i, 9).toString().replaceAll(",", "."));
        frete = Double.parseDouble(tableiteped.getValueAt(i, 11).toString().replaceAll(",", "."));
        
        total_item = qtd * valor_unit;
        ipi_total += ipi;
        icms_total += icms;              
        tableiteped.setValueAt(total_item, i, 10);
        valor_total += total_item;
        frete_total += frete;
      }  
        txtValorTotal.setText(String.valueOf(valor_total));
        txtValorIcms.setText(String.valueOf(icms_total));
        txtValorIpi.setText(String.valueOf(ipi_total));
        txtValorFrete.setText(String.valueOf(frete_total));
        
    }
    
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEncerraOp;
    private javax.swing.JPanel Clientes;
    private lib.jdb.connection.JDBConnection DBCon;
    private javax.swing.JPanel NFE;
    private javax.swing.JTabbedPane PaneAdm;
    private javax.swing.JTabbedPane PaneCompras;
    private javax.swing.JTabbedPane PaneEstoque;
    private javax.swing.JTabbedPane PaneProducao;
    private javax.swing.JTabbedPane PaneVendas;
    private lib.jdb.jdbquery.JDBQuery QueryAltEst;
    private lib.jdb.jdbquery.JDBQuery QueryBuscaCli;
    private lib.jdb.jdbquery.JDBQuery QueryBuscaForn;
    private lib.jdb.jdbquery.JDBQuery QueryCliente;
    private lib.jdb.jdbquery.JDBQuery QueryEstabelecimento;
    private lib.jdb.jdbquery.JDBQuery QueryFornecedor;
    private lib.jdb.jdbquery.JDBQuery QueryGruPro;
    private lib.jdb.jdbquery.JDBQuery QueryIteOP;
    private lib.jdb.jdbquery.JDBQuery QueryItePedRec;
    private lib.jdb.jdbquery.JDBQuery QueryNFE;
    private lib.jdb.jdbquery.JDBQuery QueryOP;
    private lib.jdb.jdbquery.JDBQuery QueryPedRec;
    private lib.jdb.jdbquery.JDBQuery QueryPedido;
    public static lib.jdb.jdbquery.JDBQuery QueryPedidoItem;
    private lib.jdb.jdbquery.JDBQuery QueryProduto;
    private lib.jdb.jdbquery.JDBQuery QueryQtdItem;
    private lib.jdb.jdbquery.JDBQuery QueryRecebimento;
    private lib.jdb.jdbquery.JDBQuery QueryRecebimentoItem;
    private lib.jdb.jdbquery.JDBQuery QuerySomaItensPed;
    private lib.jdb.jdbquery.JDBQuery QuerySubGru;
    private lib.jdb.jdbquery.JDBQuery QueryTipoPro;
    private lib.jdb.jdbquery.JDBQuery QueryTransp;
    private lib.jdb.jdbquery.JDBQuery QueryUserAt;
    private lib.jdb.jdbquery.JDBQuery QueryUsuario;
    private lib.jdb.jdbquery.JDBQuery QueryVeItem;
    private lib.jdb.jdbquery.JDBQuery QueryVendas;
    private lib.jdb.jdbquery.JDBQuery QueryVendasItem;
    private javax.swing.JPanel Transportadora;
    private javax.swing.JPanel Vendas;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious btanteriorgru;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious btanteriorpro;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious btanteriorsub;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious btanteriortipo;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh btatualizagru;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh btatualizasub;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh btatualizatipo;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel btcancelagru;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel btcancelapro;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel btcancelasub;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel btcancelatipo;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete btexcluigru;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete btexcluipro;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete btexcluisub;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete btexcluitipo;
    private javax.swing.JButton btnAdmin;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious btnAntCad1;
    private javax.swing.JButton btnBuscaPedido;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel btnCancelCad1;
    private javax.swing.JButton btnCompras;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete btnDeleteCad1;
    private javax.swing.JButton btnEstoque;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew btnNewCad1;
    private javax.swing.JButton btnProducao;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext btnProxCad1;
    private javax.swing.JButton btnVendas;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious btnanterioritem;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh btnatualizaitem;
    private javax.swing.JButton btnbuscapro;
    private javax.swing.JButton btnbuscaproduto;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel btncancelaped;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel btncancelave;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel btncancelitem;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel btncanceliteve;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel btncancelrec;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete btnexcluiitem;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete btnexcluiiteve;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete btnexcluirped;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete btnexcluirrec;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete btnexcluive;
    private javax.swing.JButton btnfinalizaitens;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew btnnovave;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew btnnovoitem;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew btnnovoiteve;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew btnnovoped;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew btnnovorec;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew btnovogru;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew btnovopro;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew btnovosub;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew btnovotipo;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext btnproximoitem;
    private javax.swing.JButton btnsairve;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave btnsalvaitem;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave btnsalvaiteve;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave btnsalvaped;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave btnsalvarrec;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave btnsalvave;
    public static lib.jdb.control.jdbbuttonsave.JDBButtonSave btnsaveitens;
    private javax.swing.JButton btnverificaitem;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst btprimeirogru;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst btprimeirosub;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst btprimeirotipo;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext btproximogru;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext btproximopro;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext btproximosub;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext btproximotipo;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave btsalvagru;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave btsalvapro;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave btsalvasub;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave btsalvatipo;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast btultimogru;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast btultimosub;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast btultimotipo;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel canceliteop;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel cancelop;
    private lib.jdb.control.jdbcombobox.JDBComboBox cboxTipoPessoa;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete excluiiteop;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete excluiop;
    private javax.swing.JButton finalizaiteop;
    private javax.swing.JPanel frmFornecedor;
    private javax.swing.JPanel frmGrupoPro;
    private javax.swing.JPanel frmPedido;
    private javax.swing.JPanel frmProducao;
    private javax.swing.JPanel frmProdutos;
    private javax.swing.JPanel frmRecebimento;
    private javax.swing.JPanel frmRelComp;
    private javax.swing.JPanel frmSubGrupoPro;
    private javax.swing.JPanel frmTipoPro;
    private javax.swing.JPanel frmUsuario;
    private lib.jdb.control.jdbtextfield.JDBTextField id_pedido;
    private lib.jdb.control.jdbtextfield.JDBTextField id_pedidoN;
    private lib.jdb.control.jdbtextfield.JDBTextField idforrec;
    private lib.jdb.control.jdbtextfield.JDBTextField idforrecN;
    private lib.jdb.control.jdbtextfield.JDBTextField idpedrec;
    private lib.jdb.control.jdbtextfield.JDBTextField idpedrecN;
    private javax.swing.JLabel instrucaoTipoPessoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel12;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel13;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel14;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel17;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete12;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete13;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete14;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete16;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst jDBButtonFirst4;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast jDBButtonLast4;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew12;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew13;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew14;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew17;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext1;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext2;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext6;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious1;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious2;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious6;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh jDBButtonRefresh5;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave1;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave11;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave12;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave13;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave16;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox1;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox10;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox11;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox2;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox3;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox4;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox5;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox6;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox7;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox8;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox9;
    private lib.jdb.control.jdbimageblob.JDBImageBlob jDBImageBlob1;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount1;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount10;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount11;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount12;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount13;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount14;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount15;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount16;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount17;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount18;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount19;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount2;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount20;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount21;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount22;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount23;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount24;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount25;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount26;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount27;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount28;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount29;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount3;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount30;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount31;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount32;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount33;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount34;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount35;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount36;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount37;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount38;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount39;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount4;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount40;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount41;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount42;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount43;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount44;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount45;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount46;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount47;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount48;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount49;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount5;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount50;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount51;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount52;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount53;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount54;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount55;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount56;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount57;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount58;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount59;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount6;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount60;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount61;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount62;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount63;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount64;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount65;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount66;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount67;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount68;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount69;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount7;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount70;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount71;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount72;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount73;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount74;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount75;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount76;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount77;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount78;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount79;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount8;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount80;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount81;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount82;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount83;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount84;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount85;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount86;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount9;
    private lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox jDBLookUpComboBox1;
    private lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox jDBLookUpComboBox2;
    private lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox jDBLookUpComboBox3;
    private lib.jdb.control.jdblookupfield.JDBLookUpField jDBLookUpField1;
    private lib.jdb.control.jdbradiobutton.JDBRadioButton jDBRadioButton1;
    private lib.jdb.control.jdbradiobutton.JDBRadioButton jDBRadioButton2;
    private lib.jdb.control.jdbradiobutton.JDBRadioButton jDBRadioButton3;
    private lib.jdb.control.jdbradiobutton.JDBRadioButton jDBRadioButton4;
    private lib.jdb.control.jdbradiobutton.JDBRadioButton jDBRadioButton5;
    private lib.jdb.control.jdbtable.JDBTable jDBTable2;
    private lib.jdb.control.jdbtable.JDBTable jDBTable3;
    private lib.jdb.control.jdbtable.JDBTable jDBTable4;
    private lib.jdb.control.jdbtextarea.JDBTextArea jDBTextArea1;
    private lib.jdb.control.jdbtextarea.JDBTextArea jDBTextArea2;
    private lib.jdb.control.jdbtextarea.JDBTextArea jDBTextArea3;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField1;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField10;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField100;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField104;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField105;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField106;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField107;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField108;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField109;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField11;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField110;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField111;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField112;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField113;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField114;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField115;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField116;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField117;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField118;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField119;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField12;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField120;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField121;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField123;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField125;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField126;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField128;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField129;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField13;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField130;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField131;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField132;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField133;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField134;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField135;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField136;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField137;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField138;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField139;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField14;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField140;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField15;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField16;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField17;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField18;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField19;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField2;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField20;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField21;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField22;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField23;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField25;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField26;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField28;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField29;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField3;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField30;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField31;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField32;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField33;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField34;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField35;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField38;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField39;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField4;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField40;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField41;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField42;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField43;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField44;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField45;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField46;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField47;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField48;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField49;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField5;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField50;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField51;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField52;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField54;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField55;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField56;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField57;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField58;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField59;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField6;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField60;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField61;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField63;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField64;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField65;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField66;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField67;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField69;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField7;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField70;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField71;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField72;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField73;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField74;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField75;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField76;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField77;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField78;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField79;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField8;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField80;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField81;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField82;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField83;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField84;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField85;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField86;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField87;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField88;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField89;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField9;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField90;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField91;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField92;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField93;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField94;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField95;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField96;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField97;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField98;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JToolBar jToolBar1;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew novoiteop;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew novoop;
    private javax.swing.JTabbedPane paneItensPed;
    private javax.swing.JButton sairop;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave salvaiteop;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave salvaop;
    private lib.jdb.control.jdbtable.JDBTable tableiteped;
    private lib.jdb.control.jdbtextfield.JDBTextField txtCnpjForn;
    private lib.jdb.control.jdbtextfield.JDBTextField txtCpfCad;
    private lib.jdb.control.jdbtextfield.JDBTextField txtIdFornecedor;
    private lib.jdb.control.jdbtextfield.JDBTextField txtInsEstCad;
    private javax.swing.JTextField txtPedidoNfe;
    private lib.jdb.control.jdbtextfield.JDBTextField txtRazaoCad;
    private javax.swing.JTextField txtValorFrete;
    private javax.swing.JTextField txtValorIcms;
    private javax.swing.JTextField txtValorIpi;
    private javax.swing.JTextField txtValorTotal;
    private lib.jdb.control.jdbtextfield.JDBTextField txtVlrMerc;
    private lib.jdb.control.jdbtextfield.JDBTextField txt_id_user_cad;
    private lib.jdb.control.jdbtextfield.JDBTextField txtanoop;
    private lib.jdb.control.jdbtextfield.JDBTextField txtcnpjfor;
    private lib.jdb.control.jdbtextfield.JDBTextField txtdatacad;
    private com.toedter.calendar.JDateChooser txtdataemi;
    private lib.jdb.control.jdbtextfield.JDBTextField txtdatapedido;
    private lib.jdb.control.jdbtextfield.JDBTextField txtdatarec;
    private lib.jdb.control.jdbtextfield.JDBTextField txtidcli;
    private lib.jdb.control.jdbtextfield.JDBTextField txtidforn;
    private lib.jdb.control.jdbtextfield.JDBTextField txtidop;
    private lib.jdb.control.jdbtextfield.JDBTextField txtidopN;
    private lib.jdb.control.jdbtextfield.JDBTextField txtidpedido;
    private lib.jdb.control.jdbtextfield.JDBTextField txtidpedidoN;
    private lib.jdb.control.jdbtextfield.JDBTextField txtidtransp;
    private lib.jdb.control.jdbtextfield.JDBTextField txtiduser;
    private lib.jdb.control.jdbtextfield.JDBTextField txtnomefor;
    private javax.swing.JTextField txtsituacao;
    private lib.jdb.control.jdbtextfield.JDBTextField txttransp;
    // End of variables declaration//GEN-END:variables
}
