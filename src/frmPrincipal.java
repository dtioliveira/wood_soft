
public class frmPrincipal extends javax.swing.JFrame {
    static String usuario;

 
    public frmPrincipal() {
        initComponents();
         DBCon.connectDB();
         QueryFornecedor.execQuery();
         QueryRecebimento.execQuery();
         QueryProduto.execQuery();
         QueryGruPro.execQuery();
         QuerySubGru.execQuery();
         QueryTipoPro.execQuery();
         QueryOP.execQuery();
         QueryIteOP.execQuery();
         QueryCliente.execQuery();
         QueryTransp.execQuery();
         QueryUsuario.execQuery();
         QueryUserAt.execQuery();
         //QueryPedidoItem.execQuery();
        // System.out.println(QueryPedido.getParameters().toString());
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
        iduser = new javax.swing.JLabel();
        PaneCompras = new javax.swing.JTabbedPane();
        frmFornecedor = new javax.swing.JPanel();
        jDBButtonCancel3 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonDelete2 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBButtonNew3 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonSave1 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jLabel15 = new javax.swing.JLabel();
        jDBTextField13 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField14 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField16 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField17 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField18 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField19 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField20 = new lib.jdb.control.jdbtextfield.JDBTextField();
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
        jDBComboBox2 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        jDBComboBox3 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        frmPedido = new javax.swing.JPanel();
        id_pedido = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField2 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField3 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField5 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField6 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField7 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField8 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField9 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField10 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        situacao = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDBTextField12 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel12 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDBTable1 = new lib.jdb.control.jdbtable.JDBTable();
        jDBButtonNew1 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonNext1 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonPrevious1 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBButtonDelete1 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBButtonCancel2 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonSave5 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonRefresh2 = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();
        jDBButtonDelete3 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBButtonNew2 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonSave2 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonCancel1 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jButton8 = new javax.swing.JButton();
        jDBTextField4 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount1 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        atualizar = new javax.swing.JButton();
        frmRecebimento = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jDBTextField1 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField23 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField24 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField31 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField32 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField33 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField34 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField35 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField36 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField37 = new lib.jdb.control.jdbtextfield.JDBTextField();
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
        jDBButtonNew5 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonCancel5 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonPrevious2 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBButtonNext2 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonDelete5 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBButtonNew4 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonCancel4 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonSave3 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonDelete4 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        frmRelComp = new javax.swing.JPanel();
        PaneEstoque = new javax.swing.JTabbedPane();
        frmGrupoPro = new javax.swing.JPanel();
        jDBTextField50 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField55 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField56 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField57 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBButtonCancel7 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonDelete7 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBButtonFirst1 = new lib.jdb.control.jdbbuttonfirst.JDBButtonFirst();
        jDBButtonLast1 = new lib.jdb.control.jdbbuttonlast.JDBButtonLast();
        jDBButtonNew7 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonPrevious3 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBButtonNext3 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonSave6 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonRefresh1 = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();
        jDBLabelCount48 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount49 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount50 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount51 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jLabel18 = new javax.swing.JLabel();
        frmSubGrupoPro = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jDBTextField11 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField15 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount12 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount52 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount53 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLookUpComboBox1 = new lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox();
        jDBButtonSave7 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonNew8 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonCancel8 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonRefresh3 = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();
        jDBButtonDelete8 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBButtonFirst2 = new lib.jdb.control.jdbbuttonfirst.JDBButtonFirst();
        jDBButtonPrevious4 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBButtonNext4 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonLast2 = new lib.jdb.control.jdbbuttonlast.JDBButtonLast();
        frmTipoPro = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jDBTextField58 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField59 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField60 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jDBButtonCancel9 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonNew9 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonSave8 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonDelete9 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBButtonRefresh4 = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();
        jDBButtonFirst3 = new lib.jdb.control.jdbbuttonfirst.JDBButtonFirst();
        jDBButtonPrevious5 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBButtonNext5 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonLast3 = new lib.jdb.control.jdbbuttonlast.JDBButtonLast();
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
        jDBButtonNew6 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonCancel6 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonSave4 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonDelete6 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBLookUpComboBox2 = new lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox();
        jDBLookUpComboBox3 = new lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox();
        PaneProducao = new javax.swing.JTabbedPane();
        frmProducao = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jDBTextField27 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField52 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField53 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField61 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField62 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField63 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField64 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField65 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField66 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField68 = new lib.jdb.control.jdbtextfield.JDBTextField();
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
        jDBButtonNew11 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonCancel11 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonSave10 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonDelete11 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jScrollPane3 = new javax.swing.JScrollPane();
        jDBTable3 = new lib.jdb.control.jdbtable.JDBTable();
        jDBTextArea2 = new lib.jdb.control.jdbtextarea.JDBTextArea();
        jDBButtonNew10 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonCancel10 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonSave9 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonDelete10 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jButton13 = new javax.swing.JButton();
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
        Vendas = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        NFE = new javax.swing.JPanel();
        PaneAdm = new javax.swing.JTabbedPane();
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

        QueryPedidoItem.setJDBConnection(DBCon);
        QueryPedidoItem.setSQL("select * from CPITEPED");

        QueryRecebimento.setJDBConnection(DBCon);
        QueryRecebimento.setSQL("select * from CPCADREC");

        QueryProduto.setJDBConnection(DBCon);
        QueryProduto.setSQL("select * from ESCADPRO");

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WOOD SOFT");
        setAutoRequestFocus(false);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                esconderpainel(evt);
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

        iduser.setText("iduser");

        javax.swing.GroupLayout jDBImageBlob1Layout = new javax.swing.GroupLayout(jDBImageBlob1);
        jDBImageBlob1.setLayout(jDBImageBlob1Layout);
        jDBImageBlob1Layout.setHorizontalGroup(
            jDBImageBlob1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProducao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDBImageBlob1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDBImageBlob1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iduser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jDBImageBlob1Layout.setVerticalGroup(
            jDBImageBlob1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDBImageBlob1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(26, 26, 26)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(iduser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(30, 30, 30)
                .addComponent(jButton6))
        );

        jDBButtonCancel3.setJDBQuery(QueryFornecedor);

        jDBButtonDelete2.setJDBQuery(QueryFornecedor);

        jDBButtonNew3.setJDBQuery(QueryFornecedor);
        jDBButtonNew3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonNew3ActionPerformed(evt);
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

        jDBTextField13.setJDBQuery(QueryFornecedor);
        jDBTextField13.setEnabled(false);
        jDBTextField13.setFieldName("idclifor");

        jDBTextField14.setJDBQuery(QueryFornecedor);
        jDBTextField14.setFieldName("id_usuario");

        jDBTextField16.setJDBQuery(QueryFornecedor);
        jDBTextField16.setFieldName("razao");

        jDBTextField17.setJDBQuery(QueryFornecedor);
        jDBTextField17.setFieldName("fantasia");

        jDBTextField18.setJDBQuery(QueryFornecedor);
        jDBTextField18.setFieldName("cnpj");
        jDBTextField18.setMaxLength(new java.lang.Integer(14));

        jDBTextField19.setJDBQuery(QueryFornecedor);
        jDBTextField19.setFieldName("cpf");

        jDBTextField20.setJDBQuery(QueryFornecedor);
        jDBTextField20.setFieldName("inscEst");

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

        jDBComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MG", "MS", "MT", "PE", "PR", "RJ", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        jDBComboBox1.setJDBQuery(QueryFornecedor);
        jDBComboBox1.setFieldName("uf");

        jDBComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jurídica", "Física" }));
        jDBComboBox2.setJDBQuery(QueryFornecedor);
        jDBComboBox2.setFieldName("pessoa");

        jDBComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo", "Inapto", " " }));
        jDBComboBox3.setJDBQuery(QueryFornecedor);
        jDBComboBox3.setFieldName("situacao");

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
                                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBLabelCount14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBButtonNew3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(79, 79, 79)
                                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBLabelCount17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                .addComponent(jDBTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                                                .addComponent(jDBTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                .addComponent(jDBLabelCount15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jDBLabelCount21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jDBLabelCount10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBLabelCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDBLabelCount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                        .addGap(349, 349, 349)
                                                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jDBTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jDBLabelCount19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addComponent(jDBLabelCount18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(56, 56, 56)
                                                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jDBLabelCount20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jDBComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                                .addGap(255, 255, 255)
                                                                .addComponent(jDBTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                        .addGap(246, 246, 246)
                                                        .addComponent(jDBLabelCount11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                        .addGap(52, 52, 52)
                                                        .addComponent(jDBLabelCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                .addComponent(jDBTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(jDBTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jDBLabelCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                                .addGap(177, 177, 177)
                                                .addComponent(jDBButtonCancel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(74, 74, 74)
                                                .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(74, 74, 74)
                                                .addComponent(jDBButtonDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 194, Short.MAX_VALUE)))
                                .addGap(109, 109, 109))
                            .addGroup(frmFornecedorLayout.createSequentialGroup()
                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmFornecedorLayout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(jDBComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBLabelCount16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jDBTextField17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                                    .addComponent(jDBTextField16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBLabelCount7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBLabelCount8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmFornecedorLayout.createSequentialGroup()
                                        .addComponent(jDBLabelCount9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jDBTextField20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(jDBTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jDBTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBButtonCancel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNew3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        PaneCompras.addTab("Fornecedores", frmFornecedor);

        id_pedido.setJDBQuery(QueryPedido);
        id_pedido.setFieldName("id_pedido");
        id_pedido.setName(""); // NOI18N
        id_pedido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_pedidoFocusLost(evt);
            }
        });

        jDBTextField2.setJDBQuery(QueryPedido);
        jDBTextField2.setFieldName("cod_fornecedor");

        jDBTextField3.setJDBQuery(QueryPedido);
        jDBTextField3.setFieldName("data_ent");
        jDBTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField3ActionPerformed(evt);
            }
        });

        jDBTextField5.setJDBQuery(QueryPedido);
        jDBTextField5.setEnabled(false);
        jDBTextField5.setFieldName("data_alt");

        jDBTextField6.setJDBQuery(QueryPedido);
        jDBTextField6.setFieldName("valor_ipi_total");

        jDBTextField7.setJDBQuery(QueryPedido);
        jDBTextField7.setFieldName("valor_frete");

        jDBTextField8.setJDBQuery(QueryPedido);
        jDBTextField8.setFieldName("valor_icms_total");

        jDBTextField9.setJDBQuery(QueryPedido);
        jDBTextField9.setFieldName("valor_total");

        jDBTextField10.setJDBQuery(QueryBuscaForn);
        jDBTextField10.setFieldName("razao");

        jLabel1.setText("ID Pedido");

        jLabel2.setText("ID Fornecedor");

        jLabel3.setText("Data Emissão");

        jLabel4.setText("Situação");

        jLabel5.setText("Data Alteração");

        jLabel6.setText("Valor Frete");

        jLabel7.setText("Valor IPI total");

        jLabel8.setText("Valor ICMS total");

        jLabel9.setText("Valor Total");

        situacao.setJDBQuery(QueryPedido);
        situacao.setFieldName("situacao");

        jLabel10.setText("Nome do Fornecedor");

        jLabel11.setText("CNPJ");

        jDBTextField12.setJDBQuery(QueryBuscaForn);
        jDBTextField12.setFieldName("cnpj");

        jLabel12.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel12.setText("Pedido de Compras");

        jDBTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jDBTable1.setJDBQuery(QueryPedidoItem);
        jScrollPane1.setViewportView(jDBTable1);

        jDBButtonNew1.setJDBQuery(QueryPedidoItem);
        jDBButtonNew1.setLabel("");
        jDBButtonNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonNew1ActionPerformed(evt);
            }
        });

        jDBButtonNext1.setLabel("");

        jDBButtonPrevious1.setLabel("");

        jDBButtonDelete1.setLabel("");

        jDBButtonCancel2.setLabel("");

        jDBButtonSave5.setJDBQuery(QueryPedidoItem);
        jDBButtonSave5.setLabel("");

        jDBButtonRefresh2.setText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDBButtonNew1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDBButtonCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonSave5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBButtonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonRefresh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDBButtonNew1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBButtonCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDBButtonRefresh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonSave5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Itens do Pedido", jPanel2);

        jDBButtonNew2.setJDBQuery(QueryPedido);
        jDBButtonNew2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonNew2ActionPerformed(evt);
            }
        });

        jDBButtonSave2.setJDBQuery(QueryPedido);

        jDBButtonCancel1.setJDBQuery(QueryPedido);

        jButton8.setText("Sair");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jDBTextField4.setJDBQuery(QueryPedido);
        jDBTextField4.setFieldName("id_usuario");
        jDBTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField4ActionPerformed(evt);
            }
        });

        jDBLabelCount1.setText("id usuario");

        atualizar.setText("Atualizar Campos");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmPedidoLayout = new javax.swing.GroupLayout(frmPedido);
        frmPedido.setLayout(frmPedidoLayout);
        frmPedidoLayout.setHorizontalGroup(
            frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmPedidoLayout.createSequentialGroup()
                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmPedidoLayout.createSequentialGroup()
                                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBLabelCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmPedidoLayout.createSequentialGroup()
                                        .addComponent(jDBTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(frmPedidoLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(15, 15, 15))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmPedidoLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(atualizar)
                                .addGap(52, 52, 52)
                                .addComponent(jDBButtonNew2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDBButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(frmPedidoLayout.createSequentialGroup()
                                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(id_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmPedidoLayout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(jLabel10))
                                    .addGroup(frmPedidoLayout.createSequentialGroup()
                                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jDBTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDBTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmPedidoLayout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(frmPedidoLayout.createSequentialGroup()
                                        .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(6, 6, 6))
                                    .addComponent(jDBTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(frmPedidoLayout.createSequentialGroup()
                                    .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jDBTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(30, 30, 30)
                                    .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDBTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDBTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmPedidoLayout.createSequentialGroup()
                                    .addComponent(jDBButtonSave2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDBButtonDelete3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmPedidoLayout.createSequentialGroup()
                        .addGap(1013, 1013, 1013)
                        .addComponent(jDBTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                                .addComponent(jDBButtonDelete3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBButtonSave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBButtonNew2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(atualizar))
                            .addComponent(jButton8))))
                .addGap(40, 40, 40)
                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
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
                .addGap(6, 6, 6)
                .addGroup(frmPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        PaneCompras.addTab("Pedidos de Compras", frmPedido);

        jLabel14.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel14.setText("Recebimento de Compras");

        jButton9.setText("Sair");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jDBTextField1.setJDBQuery(QueryRecebimento);

        jDBTextField23.setJDBQuery(QueryRecebimento);

        jDBTextField24.setJDBQuery(QueryRecebimento);

        jDBTextField31.setJDBQuery(QueryRecebimento);

        jDBTextField32.setJDBQuery(QueryRecebimento);

        jDBTextField33.setJDBQuery(QueryRecebimento);

        jDBTextField34.setJDBQuery(QueryRecebimento);

        jDBTextField35.setJDBQuery(QueryRecebimento);

        jDBTextField36.setJDBQuery(QueryRecebimento);

        jDBTextField37.setJDBQuery(QueryRecebimento);

        jDBTextField38.setJDBQuery(QueryRecebimento);

        jDBTextField40.setJDBQuery(QueryRecebimento);

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

        jDBLabelCount33.setText("Nota Fiscal");

        jDBTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jDBTable2);

        jDBButtonNew5.setJDBQuery(null);
        jDBButtonNew5.setAutomaticAction(false);
        jDBButtonNew5.setLabel("");
        jDBButtonNew5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonNew5ActionPerformed(evt);
            }
        });

        jDBButtonCancel5.setLabel("");

        jDBButtonPrevious2.setLabel("");

        jDBButtonNext2.setLabel("");

        jDBButtonDelete5.setLabel("");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jDBButtonNew5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDBButtonCancel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDBButtonPrevious2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBButtonNext2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDBButtonDelete5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDBButtonNew5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonCancel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonPrevious2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNext2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonDelete5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane2.addTab("Itens do Recebimento", jPanel9);

        jDBButtonNew4.setJDBQuery(QueryRecebimento);
        jDBButtonNew4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonNew4ActionPerformed(evt);
            }
        });

        jDBButtonCancel4.setJDBQuery(QueryRecebimento);

        jDBButtonSave3.setJDBQuery(QueryRecebimento);

        jDBButtonDelete4.setJDBQuery(QueryRecebimento);
        jDBButtonDelete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonDelete4ActionPerformed(evt);
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
                        .addGap(32, 32, 32)
                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jDBButtonNew4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDBButtonCancel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jDBButtonSave3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDBButtonDelete4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmRecebimentoLayout.createSequentialGroup()
                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                        .addComponent(jDBTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(97, 97, 97)
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBLabelCount33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBLabelCount26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jDBLabelCount13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDBLabelCount32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDBTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmRecebimentoLayout.createSequentialGroup()
                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmRecebimentoLayout.createSequentialGroup()
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jDBTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBLabelCount27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmRecebimentoLayout.createSequentialGroup()
                                        .addGap(257, 257, 257)
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDBLabelCount24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                    .addComponent(jDBTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(45, 45, 45)
                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDBTextField36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDBLabelCount30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDBLabelCount31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDBTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(jDBButtonDelete4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBButtonSave3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBButtonCancel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBButtonNew4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRecebimentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                .addComponent(jDBLabelCount32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDBTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jDBLabelCount30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBLabelCount31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jDBTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDBLabelCount29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jDBTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                .addComponent(jDBLabelCount25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jDBTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRecebimentoLayout.createSequentialGroup()
                                        .addComponent(jDBLabelCount13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jDBTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRecebimentoLayout.createSequentialGroup()
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jDBLabelCount22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jDBTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(49, 49, 49)
                                .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jDBLabelCount24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBLabelCount27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(frmRecebimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jDBTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDBTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(frmRecebimentoLayout.createSequentialGroup()
                                        .addComponent(jDBLabelCount28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jDBTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PaneCompras.addTab("Recebimento de Compras", frmRecebimento);

        javax.swing.GroupLayout frmRelCompLayout = new javax.swing.GroupLayout(frmRelComp);
        frmRelComp.setLayout(frmRelCompLayout);
        frmRelCompLayout.setHorizontalGroup(
            frmRelCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1154, Short.MAX_VALUE)
        );
        frmRelCompLayout.setVerticalGroup(
            frmRelCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );

        PaneCompras.addTab("Relatórios", frmRelComp);

        PaneEstoque.setRequestFocusEnabled(false);

        jDBTextField50.setJDBQuery(QueryGruPro);
        jDBTextField50.setEnabled(false);
        jDBTextField50.setFieldName("idgrupoProduto");

        jDBTextField55.setJDBQuery(QueryGruPro);
        jDBTextField55.setFieldName("tipo");

        jDBTextField56.setJDBQuery(QueryGruPro);
        jDBTextField56.setFieldName("nome");

        jDBTextField57.setJDBQuery(QueryGruPro);
        jDBTextField57.setFieldName("abrev");

        jDBButtonCancel7.setJDBQuery(QueryGruPro);

        jDBButtonDelete7.setJDBQuery(QueryGruPro);

        jDBButtonFirst1.setJDBQuery(QueryGruPro);

        jDBButtonLast1.setJDBQuery(QueryGruPro);

        jDBButtonNew7.setJDBQuery(QueryGruPro);

        jDBButtonPrevious3.setJDBQuery(QueryGruPro);

        jDBButtonNext3.setJDBQuery(QueryGruPro);

        jDBButtonSave6.setJDBQuery(QueryGruPro);

        jDBButtonRefresh1.setJDBQuery(QueryGruPro);

        jDBLabelCount48.setText("ID Grupo");

        jDBLabelCount49.setText("Tipo");

        jDBLabelCount50.setText("Nome do Grupo");

        jDBLabelCount51.setText("Abreviatura");

        jLabel18.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel18.setText("Cadastro de Grupos de Produto");

        javax.swing.GroupLayout frmGrupoProLayout = new javax.swing.GroupLayout(frmGrupoPro);
        frmGrupoPro.setLayout(frmGrupoProLayout);
        frmGrupoProLayout.setHorizontalGroup(
            frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmGrupoProLayout.createSequentialGroup()
                .addGroup(frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmGrupoProLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18))
                    .addGroup(frmGrupoProLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBLabelCount49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frmGrupoProLayout.createSequentialGroup()
                                .addComponent(jDBButtonNew7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jDBButtonCancel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jDBButtonSave6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jDBButtonDelete7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jDBButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDBLabelCount48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frmGrupoProLayout.createSequentialGroup()
                                .addComponent(jDBButtonFirst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDBButtonPrevious3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDBButtonNext3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDBButtonLast1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDBTextField50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDBLabelCount50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDBTextField57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDBLabelCount51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jDBTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(491, Short.MAX_VALUE))
        );
        frmGrupoProLayout.setVerticalGroup(
            frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmGrupoProLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel18)
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
                    .addComponent(jDBButtonNew7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonCancel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonSave6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonDelete7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(frmGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBButtonFirst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonPrevious3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNext3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonLast1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(220, Short.MAX_VALUE))
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

        jDBButtonSave7.setJDBQuery(QuerySubGru);

        jDBButtonNew8.setJDBQuery(QuerySubGru);

        jDBButtonCancel8.setJDBQuery(QuerySubGru);

        jDBButtonRefresh3.setJDBQuery(QuerySubGru);

        jDBButtonDelete8.setJDBQuery(QuerySubGru);

        jDBButtonFirst2.setJDBQuery(QuerySubGru);

        jDBButtonPrevious4.setJDBQuery(QuerySubGru);

        jDBButtonNext4.setJDBQuery(QuerySubGru);

        jDBButtonLast2.setJDBQuery(QuerySubGru);

        javax.swing.GroupLayout frmSubGrupoProLayout = new javax.swing.GroupLayout(frmSubGrupoPro);
        frmSubGrupoPro.setLayout(frmSubGrupoProLayout);
        frmSubGrupoProLayout.setHorizontalGroup(
            frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                .addGroup(frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19))
                    .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBLabelCount52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDBTextField11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDBLabelCount12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                                .addComponent(jDBButtonNew8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDBButtonCancel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDBButtonSave7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDBButtonDelete8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDBButtonRefresh3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                                .addComponent(jDBButtonFirst2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDBButtonPrevious4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDBButtonNext4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDBButtonLast2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDBLookUpComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDBTextField15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)))))
                .addContainerGap(589, Short.MAX_VALUE))
        );
        frmSubGrupoProLayout.setVerticalGroup(
            frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmSubGrupoProLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel19)
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
                    .addComponent(jDBButtonSave7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNew8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonCancel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonDelete8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonRefresh3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(frmSubGrupoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBButtonFirst2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonPrevious4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNext4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonLast2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
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

        jDBButtonCancel9.setJDBQuery(QueryTipoPro);

        jDBButtonNew9.setJDBQuery(QueryTipoPro);

        jDBButtonSave8.setJDBQuery(QueryTipoPro);

        jDBButtonDelete9.setJDBQuery(QueryTipoPro);

        jDBButtonRefresh4.setJDBQuery(QueryTipoPro);

        jDBButtonFirst3.setJDBQuery(QueryTipoPro);

        jDBButtonPrevious5.setJDBQuery(QueryTipoPro);

        jDBButtonNext5.setJDBQuery(QueryTipoPro);

        jDBButtonLast3.setJDBQuery(QueryTipoPro);

        javax.swing.GroupLayout frmTipoProLayout = new javax.swing.GroupLayout(frmTipoPro);
        frmTipoPro.setLayout(frmTipoProLayout);
        frmTipoProLayout.setHorizontalGroup(
            frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmTipoProLayout.createSequentialGroup()
                .addGroup(frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmTipoProLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20))
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
                                    .addComponent(jDBButtonFirst3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jDBButtonPrevious5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jDBButtonNext5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jDBButtonLast3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmTipoProLayout.createSequentialGroup()
                                    .addComponent(jDBButtonNew9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDBButtonCancel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jDBButtonSave8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jDBButtonDelete9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDBButtonRefresh4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(602, Short.MAX_VALUE))
        );
        frmTipoProLayout.setVerticalGroup(
            frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmTipoProLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel20)
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
                    .addComponent(jDBButtonCancel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNew9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonSave8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonDelete9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonRefresh4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(frmTipoProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBButtonFirst3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonPrevious5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNext5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonLast3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
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

        jDBButtonNew6.setJDBQuery(QueryProduto);
        jDBButtonNew6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonNew6ActionPerformed(evt);
            }
        });

        jDBButtonCancel6.setJDBQuery(QueryProduto);

        jDBButtonSave4.setJDBQuery(QueryProduto);

        jDBButtonDelete6.setJDBQuery(QueryProduto);
        jDBButtonDelete6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonDelete6ActionPerformed(evt);
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

        javax.swing.GroupLayout frmProdutosLayout = new javax.swing.GroupLayout(frmProdutos);
        frmProdutos.setLayout(frmProdutosLayout);
        frmProdutosLayout.setHorizontalGroup(
            frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmProdutosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmProdutosLayout.createSequentialGroup()
                        .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(frmProdutosLayout.createSequentialGroup()
                                    .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDBButtonNew6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProdutosLayout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(242, 242, 242)))
                                    .addGap(18, 18, 18)
                                    .addComponent(jDBButtonCancel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDBButtonSave4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDBButtonDelete6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39))
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
                                        .addComponent(jDBLabelCount40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDBTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(243, 243, 243))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmProdutosLayout.createSequentialGroup()
                                    .addComponent(jDBLabelCount42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(205, 205, 205)))
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
                                .addGap(103, 103, 103)))
                        .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBLabelCount47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(frmProdutosLayout.createSequentialGroup()
                        .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBLabelCount41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBLabelCount44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDBTextArea1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                        .addComponent(jDBTextField49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDBLabelCount43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBLabelCount35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBTextField42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmProdutosLayout.setVerticalGroup(
            frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmProdutosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBButtonSave4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonDelete6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNew6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonCancel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jDBLabelCount40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jDBLabelCount42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDBTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jDBLabelCount43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PaneEstoque.addTab("Produtos", frmProdutos);

        jLabel17.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel17.setText("Ordem de Produção");

        jDBTextField27.setJDBQuery(QueryOP);
        jDBTextField27.setFieldName("id_op");

        jDBTextField52.setJDBQuery(QueryOP);
        jDBTextField52.setFieldName("pedido_venda");

        jDBTextField53.setJDBQuery(QueryOP);
        jDBTextField53.setFieldName("ano_op");
        jDBTextField53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField53ActionPerformed(evt);
            }
        });

        jDBTextField61.setJDBQuery(QueryOP);

        jDBTextField62.setJDBQuery(QueryOP);
        jDBTextField62.setFieldName("tipo");

        jDBTextField63.setJDBQuery(QueryOP);
        jDBTextField63.setFieldName("situacao");

        jDBTextField64.setJDBQuery(QueryOP);
        jDBTextField64.setFieldName("hora_inicio");

        jDBTextField65.setJDBQuery(QueryOP);
        jDBTextField65.setFieldName("hora_termino");

        jDBTextField66.setJDBQuery(QueryOP);
        jDBTextField66.setFieldName("cod_cliente");

        jDBTextField68.setJDBQuery(QueryOP);
        jDBTextField68.setFieldName("id_usuario");

        jLabel24.setText("ID O.P.");

        jLabel25.setText("Ano O.P.");

        jLabel26.setText("Pedido de Venda");

        jLabel27.setText("Data");

        jLabel28.setText("Tipo");

        jLabel29.setText("Situação");

        jLabel30.setText("Hora Inicio");

        jLabel31.setText("Hora Término");

        jLabel32.setText("Cod. Cliente");

        jLabel33.setText("Observação");

        jLabel34.setText("ID Usuário");

        jDBButtonNew11.setJDBQuery(QueryIteOP);
        jDBButtonNew11.setLabel("");

        jDBButtonCancel11.setJDBQuery(QueryIteOP);
        jDBButtonCancel11.setLabel("");

        jDBButtonSave10.setJDBQuery(QueryIteOP);
        jDBButtonSave10.setLabel("");

        jDBButtonDelete11.setJDBQuery(QueryIteOP);
        jDBButtonDelete11.setLabel("");

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

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jDBButtonNew11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDBButtonCancel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDBButtonSave10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDBButtonDelete11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDBButtonDelete11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonSave10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonCancel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNew11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Itens O.P.", jPanel12);

        jDBTextArea2.setFieldName("obs");

        jDBButtonNew10.setJDBQuery(QueryOP);

        jDBButtonCancel10.setJDBQuery(QueryOP);

        jDBButtonSave9.setJDBQuery(QueryOP);

        jDBButtonDelete10.setJDBQuery(QueryOP);

        jButton13.setText("Sair");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmProducaoLayout = new javax.swing.GroupLayout(frmProducao);
        frmProducao.setLayout(frmProducaoLayout);
        frmProducaoLayout.setHorizontalGroup(
            frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmProducaoLayout.createSequentialGroup()
                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmProducaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProducaoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmProducaoLayout.createSequentialGroup()
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addGroup(frmProducaoLayout.createSequentialGroup()
                                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(jDBTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(88, 88, 88)
                                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(jDBTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(86, 86, 86)
                                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jDBTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProducaoLayout.createSequentialGroup()
                                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(frmProducaoLayout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addGap(106, 106, 106))
                                            .addGroup(frmProducaoLayout.createSequentialGroup()
                                                .addComponent(jDBTextField62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(48, 48, 48)))
                                        .addGap(81, 81, 81)
                                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel29)
                                            .addComponent(jDBTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(101, 101, 101)
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jDBTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProducaoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jDBButtonNew10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDBButtonCancel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDBButtonSave9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDBButtonDelete10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(frmProducaoLayout.createSequentialGroup()
                                .addComponent(jDBTextArea2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jDBTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(frmProducaoLayout.createSequentialGroup()
                                    .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(frmProducaoLayout.createSequentialGroup()
                                            .addComponent(jLabel30)
                                            .addGap(51, 51, 51))
                                        .addGroup(frmProducaoLayout.createSequentialGroup()
                                            .addComponent(jDBTextField64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(35, 35, 35)))
                                    .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel31)
                                        .addComponent(jDBTextField65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel27)
                                        .addComponent(jDBTextField61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(29, 29, 29)))
                .addContainerGap())
            .addGroup(frmProducaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addComponent(jButton13)
                                .addComponent(jDBButtonNew10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBButtonCancel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBButtonSave9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBButtonDelete10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmProducaoLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(frmProducaoLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDBTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(frmProducaoLayout.createSequentialGroup()
                                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel26))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jDBTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jDBTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jDBTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(frmProducaoLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel24)))
                        .addGap(26, 26, 26)
                        .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frmProducaoLayout.createSequentialGroup()
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jDBTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(frmProducaoLayout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDBTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProducaoLayout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDBTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(frmProducaoLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmProducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        jDBComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MG", "MS", "MT", "PE", "PR", "RJ", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
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
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
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
                                                        .addGap(349, 349, 349)
                                                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(ClientesLayout.createSequentialGroup()
                                                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jDBTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jDBLabelCount62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addComponent(jDBLabelCount65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(56, 56, 56)
                                                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jDBLabelCount66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jDBComboBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                            .addGroup(ClientesLayout.createSequentialGroup()
                                                                .addGap(255, 255, 255)
                                                                .addComponent(jDBTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(ClientesLayout.createSequentialGroup()
                                                        .addGap(246, 246, 246)
                                                        .addComponent(jDBLabelCount61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(ClientesLayout.createSequentialGroup()
                                                        .addGap(52, 52, 52)
                                                        .addComponent(jDBLabelCount54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(ClientesLayout.createSequentialGroup()
                                                .addComponent(jDBTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(jDBTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jDBLabelCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ClientesLayout.createSequentialGroup()
                                                .addComponent(jDBButtonNew13, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(98, 98, 98)
                                                .addComponent(jDBButtonCancel12, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(97, 97, 97)
                                                .addComponent(jDBButtonDelete12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(54, 54, 54)
                                                .addComponent(jDBButtonSave11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(109, 109, 109))
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
                                    .addComponent(jDBLabelCount67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jDBLabelCount66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jDBButtonSave11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDBTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(141, Short.MAX_VALUE))
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

        jDBComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MG", "MS", "MT", "PE", "PR", "RJ", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
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

        javax.swing.GroupLayout TransportadoraLayout = new javax.swing.GroupLayout(Transportadora);
        Transportadora.setLayout(TransportadoraLayout);
        TransportadoraLayout.setHorizontalGroup(
            TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransportadoraLayout.createSequentialGroup()
                .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransportadoraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel36))
                    .addGroup(TransportadoraLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jDBLabelCount70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(905, Short.MAX_VALUE))
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
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
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
                                                    .addGap(246, 246, 246)
                                                    .addComponent(jDBLabelCount78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(TransportadoraLayout.createSequentialGroup()
                                                    .addGap(52, 52, 52)
                                                    .addComponent(jDBLabelCount71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(TransportadoraLayout.createSequentialGroup()
                                            .addComponent(jDBTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33)
                                            .addComponent(jDBTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(TransportadoraLayout.createSequentialGroup()
                                            .addComponent(jDBButtonNew14, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(98, 98, 98)
                                            .addComponent(jDBButtonCancel13, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(97, 97, 97)
                                            .addComponent(jDBButtonDelete13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(54, 54, 54)
                                            .addComponent(jDBButtonSave12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(37, 37, 37)
                .addComponent(jLabel36)
                .addGap(68, 68, 68)
                .addComponent(jDBLabelCount70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(523, Short.MAX_VALUE))
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
                        .addComponent(jDBLabelCount78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBLabelCount85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDBTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jDBButtonDelete13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBButtonNew14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBButtonCancel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBButtonSave12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(TransportadoraLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(TransportadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jDBTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDBTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(123, Short.MAX_VALUE)))
        );

        PaneVendas.addTab("Cadastro de Transportadoras", Transportadora);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Vendas de Produtos");

        javax.swing.GroupLayout VendasLayout = new javax.swing.GroupLayout(Vendas);
        Vendas.setLayout(VendasLayout);
        VendasLayout.setHorizontalGroup(
            VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VendasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel37)
                .addContainerGap(954, Short.MAX_VALUE))
        );
        VendasLayout.setVerticalGroup(
            VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VendasLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel37)
                .addContainerGap(601, Short.MAX_VALUE))
        );

        PaneVendas.addTab("Vendas", Vendas);

        javax.swing.GroupLayout NFELayout = new javax.swing.GroupLayout(NFE);
        NFE.setLayout(NFELayout);
        NFELayout.setHorizontalGroup(
            NFELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1119, Short.MAX_VALUE)
        );
        NFELayout.setVerticalGroup(
            NFELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );

        PaneVendas.addTab("NF-e", NFE);

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
                .addContainerGap(172, Short.MAX_VALUE))
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
                .addContainerGap(77, Short.MAX_VALUE))
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
                .addComponent(PaneProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PaneVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PaneAdm)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDBImageBlob1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaneCompras)
                    .addComponent(PaneEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PaneVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PaneProducao)
                    .addComponent(PaneAdm, javax.swing.GroupLayout.Alignment.TRAILING))
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

    private void esconderpainel(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_esconderpainel
                       PaneCompras.setVisible(false);
                       PaneEstoque.setVisible(false);
                       PaneProducao.setVisible(false);
                       PaneVendas.setVisible(false);
                       PaneAdm.setVisible(false);
                       iduser.setText(usuario);
                       
                       QueryUserAt.setSQL(" select * from USUARIO where id_usuario = '" + iduser.getText() + "'");
                       QueryUserAt.execQuery();
        
                       String pcompras = QueryUserAt.getCurrentFieldValue("compras");
                       String pestoque = QueryUserAt.getCurrentFieldValue("estoque");
                       String pproducao = QueryUserAt.getCurrentFieldValue("producao");
                       String pvendas = QueryUserAt.getCurrentFieldValue("vendas");
                       String padmin = QueryUserAt.getCurrentFieldValue("administracao");

                      if (pcompras == "false"){
                           btnCompras.setVisible(false);
                       };
                       if (pestoque == "false"){
                           btnEstoque.setVisible(false);
                       };
                       if (pproducao == "false"){
                           btnProducao.setVisible(false);
                       };
                       if (pvendas == "false"){
                           btnVendas.setVisible(false);
                       };
                       if (padmin == "false"){
                           btnAdmin.setVisible(false);
                       };

    }//GEN-LAST:event_esconderpainel

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
       PaneCompras.setVisible(true);
       PaneEstoque.setVisible(false);
       PaneProducao.setVisible(false);
       PaneVendas.setVisible(false);
       PaneAdm.setVisible(false);
    }//GEN-LAST:event_btnComprasActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        PaneCompras.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        PaneCompras.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        PaneEstoque.setVisible(true);
        PaneCompras.setVisible(false);
        PaneProducao.setVisible(false);
        PaneVendas.setVisible(false);
        PaneAdm.setVisible(false);
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void jDBButtonNew2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonNew2ActionPerformed
        QueryPedido.setSQL("select * from CPCADPED");
        QueryPedido.execQuery();

    }//GEN-LAST:event_jDBButtonNew2ActionPerformed

    private void jDBTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField4ActionPerformed

    private void jDBTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField29ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        PaneCompras.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jDBButtonNew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonNew1ActionPerformed
        QueryPedidoItem.setSQL(" select * from CPITEPED where id_pedido = '" + id_pedido.getText() + "'" );
        QueryPedidoItem.execQuery();
    }//GEN-LAST:event_jDBButtonNew1ActionPerformed

    private void jDBButtonNew4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonNew4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBButtonNew4ActionPerformed

    private void jDBButtonDelete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonDelete4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBButtonDelete4ActionPerformed

    private void jDBButtonNew5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonNew5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBButtonNew5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jDBButtonNew6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonNew6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBButtonNew6ActionPerformed

    private void jDBButtonDelete6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonDelete6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBButtonDelete6ActionPerformed

    private void btnProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducaoActionPerformed
        PaneEstoque.setVisible(false);
        PaneCompras.setVisible(false);
        PaneProducao.setVisible(true);
        PaneVendas.setVisible(false);
        PaneAdm.setVisible(false);
    }//GEN-LAST:event_btnProducaoActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed

        QueryPedidoItem.setSQL(" select * from CPITEPED where id_pedido = '" + id_pedido.getText() + "'" );
        QueryPedidoItem.execQuery();       
        
        QueryPedido.setSQL(" select * from CPCADPED where id_pedido = '" + id_pedido.getText() + "'" );
        QueryPedido.execQuery(); 
        
        QueryBuscaForn.setSQL("select * from CLIFORTR where idclifor = '"+ jDBTextField2.getText() + "'");
        QueryBuscaForn.execQuery();
    }//GEN-LAST:event_atualizarActionPerformed

    private void jDBTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField3ActionPerformed

    private void jDBButtonNew3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonNew3ActionPerformed
           
    }//GEN-LAST:event_jDBButtonNew3ActionPerformed

    private void id_pedidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_pedidoFocusLost
        QueryPedidoItem.setSQL(" select * from CPITEPED where id_pedido = '" + id_pedido.getText() + "'" );
        QueryPedidoItem.execQuery();       
        
        QueryPedido.setSQL(" select * from CPCADPED where id_pedido = '" + id_pedido.getText() + "'" );
        QueryPedido.execQuery(); 
        
        QueryBuscaForn.setSQL("select * from CLIFORTR where idclifor = '"+ jDBTextField2.getText() + "'");
        QueryBuscaForn.execQuery();
    }//GEN-LAST:event_id_pedidoFocusLost

    private void jDBButtonSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonSave1ActionPerformed
        QueryFornecedor.setNewCurrentFieldValue("tipo", "Fornecedor");
    }//GEN-LAST:event_jDBButtonSave1ActionPerformed

    private void jDBTextField53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField53ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        PaneProducao.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
       PaneEstoque.setVisible(false);
        PaneCompras.setVisible(false);
        PaneProducao.setVisible(false);
        PaneVendas.setVisible(true);
        PaneAdm.setVisible(false);
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
    private javax.swing.JPanel Clientes;
    private lib.jdb.connection.JDBConnection DBCon;
    private javax.swing.JPanel NFE;
    private javax.swing.JTabbedPane PaneAdm;
    private javax.swing.JTabbedPane PaneCompras;
    private javax.swing.JTabbedPane PaneEstoque;
    private javax.swing.JTabbedPane PaneProducao;
    private javax.swing.JTabbedPane PaneVendas;
    private lib.jdb.jdbquery.JDBQuery QueryBuscaForn;
    private lib.jdb.jdbquery.JDBQuery QueryCliente;
    private lib.jdb.jdbquery.JDBQuery QueryFornecedor;
    private lib.jdb.jdbquery.JDBQuery QueryGruPro;
    private lib.jdb.jdbquery.JDBQuery QueryIteOP;
    private lib.jdb.jdbquery.JDBQuery QueryOP;
    private lib.jdb.jdbquery.JDBQuery QueryPedido;
    private lib.jdb.jdbquery.JDBQuery QueryPedidoItem;
    private lib.jdb.jdbquery.JDBQuery QueryProduto;
    private lib.jdb.jdbquery.JDBQuery QueryRecebimento;
    private lib.jdb.jdbquery.JDBQuery QuerySubGru;
    private lib.jdb.jdbquery.JDBQuery QueryTipoPro;
    private lib.jdb.jdbquery.JDBQuery QueryTransp;
    private lib.jdb.jdbquery.JDBQuery QueryUserAt;
    private lib.jdb.jdbquery.JDBQuery QueryUsuario;
    private javax.swing.JPanel Transportadora;
    private javax.swing.JPanel Vendas;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnProducao;
    private javax.swing.JButton btnVendas;
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
    private javax.swing.JLabel iduser;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel1;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel10;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel11;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel12;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel13;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel14;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel2;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel3;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel4;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel5;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel6;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel7;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel8;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel9;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete1;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete10;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete11;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete12;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete13;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete14;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete2;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete3;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete4;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete5;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete6;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete7;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete8;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete9;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst jDBButtonFirst1;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst jDBButtonFirst2;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst jDBButtonFirst3;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst jDBButtonFirst4;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast jDBButtonLast1;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast jDBButtonLast2;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast jDBButtonLast3;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast jDBButtonLast4;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew1;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew10;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew11;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew12;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew13;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew14;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew2;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew3;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew4;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew5;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew6;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew7;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew8;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew9;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext1;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext2;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext3;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext4;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext5;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext6;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious1;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious2;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious3;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious4;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious5;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious6;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh jDBButtonRefresh1;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh jDBButtonRefresh2;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh jDBButtonRefresh3;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh jDBButtonRefresh4;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh jDBButtonRefresh5;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave1;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave10;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave11;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave12;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave13;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave2;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave3;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave4;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave5;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave6;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave7;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave8;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave9;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox1;
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
    private lib.jdb.control.jdbtable.JDBTable jDBTable1;
    private lib.jdb.control.jdbtable.JDBTable jDBTable2;
    private lib.jdb.control.jdbtable.JDBTable jDBTable3;
    private lib.jdb.control.jdbtextarea.JDBTextArea jDBTextArea1;
    private lib.jdb.control.jdbtextarea.JDBTextArea jDBTextArea2;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField1;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField10;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField100;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField11;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField12;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField13;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField14;
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
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField24;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField25;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField26;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField27;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField28;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField29;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField3;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField30;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField31;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField32;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField33;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField34;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField35;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField36;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField37;
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
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField53;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField54;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField55;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField56;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField57;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField58;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField59;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField6;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField60;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField61;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField62;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField63;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField64;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField65;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField66;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField67;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField68;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JToolBar jToolBar1;
    private lib.jdb.control.jdbtextfield.JDBTextField situacao;
    // End of variables declaration//GEN-END:variables
}
