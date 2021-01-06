
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>altaTarjeta</title>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script type="text/javascript" src="https://js.openpay.mx/openpay.v1.min.js"></script>
        <script type="text/javascript" src="js/recurso2.js"></script>
        
    </head>
    
    <body>
        <style type="text/css">
            .credit-card-div  span { padding-top:10px; }
            .credit-card-div img { padding-top:30px; }
            .credit-card-div .small-font { font-size:9px; }
            .credit-card-div .pad-adjust { padding-top:10px; }
        </style>
    <form action="pasoTarjeta" method="POST" id="customer-form">
        <input type="hidden" name="token_id" id="token_id"/>
            <div class="credit-card-div">
                <div class="panel panel-default" >
                    <div class="panel-heading">    

                        <div class="row">
                            <legend>Datos del cliente</legend>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <input type="text" size="20" autocomplete="on" name="client_name" placeholder="Nombre"/>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-12">
                                <input type="text" size="20" autocomplete="on" name="cliente_email" placeholder="Correo"/>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-12">
                                <input type="text" size="20" autocomplete="on" data-openpay-card="holder_name" placeholder="Nombre en la tarjeta"/>
                            </div>
                        </div>

                        <div class="row ">
                                <div class="col-md-12">
                                    <input type="text" class="form-control" pdata-openpay-card="card_number" placeholder="Ingresa el número de la tarjeta"/>
                                </div>
                        </div>

                        <div class="row ">
                                <div class="col-md-3 col-sm-3 col-xs-3">
                                    <span class="help-block text-muted small-font" > MM</span>
                                    <input type="text" class="form-control" data-openpay-card="expiration_month" placeholder="MM" />
                                </div>
                            <div class="col-md-3 col-sm-3 col-xs-3">
                                    <span class="help-block text-muted small-font" >YY</span>
                                    <input type="text" class="form-control" data-openpay-card="expiration_year" placeholder="YY" />
                                </div>
                            <div class="col-md-3 col-sm-3 col-xs-3">
                                    <span class="help-block text-muted small-font" > CCV2</span>
                                    <input type="text" class="form-control" data-openpay-card="cvv2" placeholder="CCV" />
                                </div>
                            <div class="col-md-3 col-sm-3 col-xs-3">
                                <img src="assets/img/1.png" class="img-rounded" />
                            </div>
                        </div>

                        <div class="row ">
                                <div class="col-md-6 col-sm-6 col-xs-6 pad-adjust">
                                    <input type="submit"  class="btn btn-danger" value="CANCEL" />
                                </div>
                                <div class="col-md-6 col-sm-6 col-xs-6 pad-adjust">
                                    <input type="submit" id="save-button" class="btn btn-warning btn-block" href="pasoTarjeta?accion=guardarT" value="Pagar"/>
                                </div>
                        </div>

                    </div>
                </div>
            </div>
    </form>
    </body>
</html>
