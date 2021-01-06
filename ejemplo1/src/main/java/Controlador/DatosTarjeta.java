/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Administrador
 */
public class DatosTarjeta {
    String source_id; //card id
    Double amount;
    String currency;
    String order_id;
    String description;
    long deviceSessionId;
    Object customer;
    
    public DatosTarjeta(){
        
    }

    public DatosTarjeta(String source_id, Double amount, String currency, String order_id, String description, long deviceSessionId, Object customer) {
        this.source_id = source_id;
        this.amount = amount;
        this.currency = currency;
        this.order_id = order_id;
        this.description = description;
        this.deviceSessionId = deviceSessionId;
        this.customer = customer;
    }

    public String getSource_id() {
        return source_id;
    }

    public void setSource_id(String source_id) {
        this.source_id = source_id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDeviceSessionId() {
        return deviceSessionId;
    }

    public void setDeviceSessionId(long deviceSessionId) {
        this.deviceSessionId = deviceSessionId;
    }

    public Object getCustomer() {
        return customer;
    }

    public void setCustomer(Object customer) {
        this.customer = customer;
    }
    
}
