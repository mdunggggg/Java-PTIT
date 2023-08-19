/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellojar;

import view.InvoiceView;
import vn.edu.ptit.Invoice;



/**
 *
 * @author Hoang Manh Dung - D21 ProPTIT
 */
public class HELLOJAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
    
}
