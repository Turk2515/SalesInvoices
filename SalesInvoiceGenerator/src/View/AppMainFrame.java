package View;

import Controller.ActionsListener;
import Controller.InvoiceSelectionListener;
import Models.Header;
import Models.HeaderTable;
import Models.Items;
import Models.ItemsTable;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

public class AppMainFrame extends javax.swing.JFrame {

    public AppMainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        invoicesTabelPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoicesTable = new javax.swing.JTable();
        invoiceHeaderPanel = new javax.swing.JPanel();
        invoiceNumerLabel = new javax.swing.JLabel();
        invoiceDateLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        invoiceTotalLabel = new javax.swing.JLabel();
        invoiceNumerValueLabel = new javax.swing.JLabel();
        invoiceDateValueLabel = new javax.swing.JLabel();
        customerNameValueLabel = new javax.swing.JLabel();
        invoiceTotalValueLabel = new javax.swing.JLabel();
        invoiceItemsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceItemsTable = new javax.swing.JTable();
        deleteInvoiceButton = new javax.swing.JButton();
        createNewInvoiceButton = new javax.swing.JButton();
        createNewLineButton = new javax.swing.JButton();
        deleteLineButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setPreferredSize(new java.awt.Dimension(1000, 550));
        setSize(new java.awt.Dimension(1000, 550));

        invoicesTabelPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoices Table"));

        invoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        invoicesTable.getSelectionModel().addListSelectionListener(invoiceSelectionListener);
        jScrollPane1.setViewportView(invoicesTable);

        javax.swing.GroupLayout invoicesTabelPanelLayout = new javax.swing.GroupLayout(invoicesTabelPanel);
        invoicesTabelPanel.setLayout(invoicesTabelPanelLayout);
        invoicesTabelPanelLayout.setHorizontalGroup(
            invoicesTabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoicesTabelPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        invoicesTabelPanelLayout.setVerticalGroup(
            invoicesTabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicesTabelPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        invoiceNumerLabel.setText("Invoice Number");

        invoiceDateLabel.setText("Invoice Date");

        customerNameLabel.setText("Customer Name");

        invoiceTotalLabel.setText("Invoice Total");

        javax.swing.GroupLayout invoiceHeaderPanelLayout = new javax.swing.GroupLayout(invoiceHeaderPanel);
        invoiceHeaderPanel.setLayout(invoiceHeaderPanelLayout);
        invoiceHeaderPanelLayout.setHorizontalGroup(
            invoiceHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoiceHeaderPanelLayout.createSequentialGroup()
                .addGroup(invoiceHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoiceHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(invoiceHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(invoiceHeaderPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(invoiceNumerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(invoiceDateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(customerNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(invoiceTotalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(invoiceHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoiceHeaderPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(invoiceDateValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoiceHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(invoiceHeaderPanelLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(invoiceNumerValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoiceHeaderPanelLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(invoiceHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(customerNameValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(invoiceTotalValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        invoiceHeaderPanelLayout.setVerticalGroup(
            invoiceHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoiceHeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoiceHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoiceHeaderPanelLayout.createSequentialGroup()
                        .addGroup(invoiceHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceNumerValueLabel)
                            .addComponent(invoiceNumerLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(invoiceHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceDateValueLabel)
                            .addComponent(invoiceDateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(invoiceHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerNameValueLabel)
                            .addComponent(customerNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invoiceTotalValueLabel))
                    .addGroup(invoiceHeaderPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(invoiceTotalLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        invoiceItemsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoice Items"));

        invoiceItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        jScrollPane2.setViewportView(invoiceItemsTable);

        javax.swing.GroupLayout invoiceItemsPanelLayout = new javax.swing.GroupLayout(invoiceItemsPanel);
        invoiceItemsPanel.setLayout(invoiceItemsPanelLayout);
        invoiceItemsPanelLayout.setHorizontalGroup(
            invoiceItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(invoiceItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(invoiceItemsPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        invoiceItemsPanelLayout.setVerticalGroup(
            invoiceItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(invoiceItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoiceItemsPanelLayout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        deleteInvoiceButton.setText("Delete Invoice");
        deleteInvoiceButton.addActionListener(actionsListener);

        createNewInvoiceButton.setText("Create New Invoice");
        createNewInvoiceButton.addActionListener(actionsListener);

        createNewLineButton.setText("Create New Line");
        createNewLineButton.addActionListener(actionsListener);

        deleteLineButton.setText("Delete Line");
        deleteLineButton.addActionListener(actionsListener);

        fileMenu.setText("File");

        loadFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        loadFileMenuItem.setText("Load File");
        loadFileMenuItem.addActionListener(actionsListener);
        fileMenu.add(loadFileMenuItem);

        saveFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveFileMenuItem.setText("Save File");
        saveFileMenuItem.addActionListener(actionsListener);
        fileMenu.add(saveFileMenuItem);

        jMenuBar1.add(fileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invoicesTabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invoiceItemsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoiceHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(createNewInvoiceButton)
                .addGap(95, 95, 95)
                .addComponent(deleteInvoiceButton)
                .addGap(212, 212, 212)
                .addComponent(createNewLineButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteLineButton)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(invoiceHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invoiceItemsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(invoicesTabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createNewInvoiceButton)
                        .addComponent(createNewLineButton)
                        .addComponent(deleteLineButton))
                    .addComponent(deleteInvoiceButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

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
            java.util.logging.Logger.getLogger(AppMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppMainFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JButton createNewInvoiceButton;
    private javax.swing.JButton createNewLineButton;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel customerNameValueLabel;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JButton deleteLineButton;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel invoiceDateLabel;
    private javax.swing.JLabel invoiceDateValueLabel;
    private javax.swing.JPanel invoiceHeaderPanel;
    private javax.swing.JPanel invoiceItemsPanel;
    private javax.swing.JTable invoiceItemsTable;
    private javax.swing.JLabel invoiceNumerLabel;
    private javax.swing.JLabel invoiceNumerValueLabel;
    private javax.swing.JLabel invoiceTotalLabel;
    private javax.swing.JLabel invoiceTotalValueLabel;
    private javax.swing.JPanel invoicesTabelPanel;
    private javax.swing.JTable invoicesTable;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables
    private ActionsListener actionsListener = new ActionsListener(this);
    private InvoiceSelectionListener invoiceSelectionListener = new InvoiceSelectionListener(this);
    private ArrayList<Header> headerArrayList;
    private ArrayList<Items> itemsArrayList;
    private HeaderTable headerTable = new HeaderTable();
    private ItemsTable itemsTable = new ItemsTable();
    CreateNewInvoice createNewInvoice = new CreateNewInvoice(this);
    CreateNewLine createNewLine = new CreateNewLine(this);

    public ActionsListener getActionsListener() {
        return actionsListener;
    }

    public ArrayList<Items> getItemsArrayList() {
        return itemsArrayList;
    }

    public void setItemsArrayList(ArrayList<Items> itemsArrayList) {
        this.itemsArrayList = itemsArrayList;
    }

    public void setActionsListener(ActionsListener actionsListener) {
        this.actionsListener = actionsListener;
    }
    
    public void setHeaderArrayList(ArrayList<Header> headerArrayList) {
        this.headerArrayList = headerArrayList;
    }

    public ArrayList<Header> getHeaderArrayList() {
        return headerArrayList;
    }
    
    public Header getNo(int no){
        for (Header header : headerArrayList){
            if (header.getInvoiceNumber() == no) {
                return header;
            }
        }
        return null;
    }

    public JTable getInvoicesTable() {
        return invoicesTable;
    }

    public void setInvoicesTable(JTable invoicesTable) {
        this.invoicesTable = invoicesTable;
    }

    public void setHeaderTable(HeaderTable headerTable) {
        this.headerTable = headerTable;
    }

    public HeaderTable getHeaderTable() {
        return headerTable;
        
    }

    public ItemsTable getItemsTable() {
        return itemsTable;
    }

    public void setItemsTable(ItemsTable itemsTable) {
        this.itemsTable = itemsTable;
    }
    
    public JLabel getCustomerNameValueLabel() {
        return customerNameValueLabel;
    }

    public void setCustomerNameValueLabel(JLabel customerNameValueLabel) {
        this.customerNameValueLabel = customerNameValueLabel;
    }

    public JLabel getInvoiceDateValueLabel() {
        return invoiceDateValueLabel;
    }

    public void setInvoiceDateValueLabel(JLabel invoiceDateValueLabel) {
        this.invoiceDateValueLabel = invoiceDateValueLabel;
    }

    public JLabel getInvoiceNumerValueLabel() {
        return invoiceNumerValueLabel;
    }

    public void setInvoiceNumerValueLabel(JLabel invoiceNumerValueLabel) {
        this.invoiceNumerValueLabel = invoiceNumerValueLabel;
    }

    public JLabel getInvoiceTotalValueLabel() {
        return invoiceTotalValueLabel;
    }

    public void setInvoiceTotalValueLabel(JLabel invoiceTotalValueLabel) {
        this.invoiceTotalValueLabel = invoiceTotalValueLabel;
    }

    public JTable getInvoiceItemsTable() {
        return invoiceItemsTable;
    }

    public void setInvoiceItemsTable(JTable invoiceItemsTable) {
        this.invoiceItemsTable = invoiceItemsTable;
    }
    
    public CreateNewInvoice getCreateNewInvoice() {
        return createNewInvoice;
    }

    public void setCreateNewInvoice(CreateNewInvoice createNewInvoice) {
        this.createNewInvoice = createNewInvoice;
    }
    
    public CreateNewLine getCreateNewLine() {
        return createNewLine;
    }

    public void setCreateNewLine(CreateNewLine createNewLine) {
        this.createNewLine = createNewLine;
    }

}
