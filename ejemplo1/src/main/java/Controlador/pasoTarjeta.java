
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.openpay.client.Address;
import mx.openpay.client.Customer;
import mx.openpay.client.core.OpenpayAPI;
import mx.openpay.client.core.requests.transactions.CreateCardChargeParams;
import mx.openpay.client.exceptions.OpenpayServiceException;
import mx.openpay.client.exceptions.ServiceUnavailableException;

/**
 *
 * @author Administrador
 */

//instruccion para llamar acciones al servlet  
//@WebServlet (name = "pasoTarjeta", urlPatterns = {"/pasoTarjeta"})
@WebServlet("/pasoTarjeta")
public class pasoTarjeta extends HttpServlet {
        //llamando al objeto API 
        OpenpayAPI api = new OpenpayAPI("https://sandbox-api.openpay.mx/v1/",
        "sk_a50a167cd47d48e7ab8ba13041554202", "mikalxsdbk0bkgcfuamb");
        Customer customer = new Customer();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, OpenpayServiceException, ServiceUnavailableException {
        response.setContentType("text/html;charset=UTF-8");
        
        String accion = request.getParameter("accion");
        final String idStore = "autxX03548";
        
        /*
        String nombre = request.getParameter("client_name");
        String correo = request.getParameter("");
        String nombreTarjeta = request.getParameter("");
        */
        
        if (accion.equalsIgnoreCase("guardarT")) {
            OpenpayAPI api = new OpenpayAPI("https://sandbox-api.openpay.mx", "sk_b05586ec98454522ac7d4ccdcaec9128", "maonhzpqm8xp2ydssovf");
            //Id de la tienda para identificar la procedencia del cliente
            customer.externalId(idStore);
            customer.name("Julian Gerardo");
            customer.lastName("López Martínez");
            customer.email("julian.martinez@gmail.com");
            customer.phoneNumber("4421432915");
            customer.requiresAccount(false);
            Address address = new Address();
            address.city("Queretaro");
            address.countryCode("MX");
            address.state("Queretaro");
            address.postalCode("79125");
            address.line1("Av. Pie de la cuesta #12");
            address.line2("Desarrollo San Pablo");
            address.line3("Qro. Qro.");
            customer.address(address);
            
            customer = api.customers().create(customer);
        }
        
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
                processRequest(request, response);
            } catch (OpenpayServiceException ex) {
                Logger.getLogger(pasoTarjeta.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ServiceUnavailableException ex) {
                Logger.getLogger(pasoTarjeta.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
                
            //String client_name = request.getParameter("client_name");
            //String cliente_email = request.getParameter("cliente_email");
            
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
