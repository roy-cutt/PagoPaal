/*
$(document).ready(function() {
    OpenPay.token.extractFormAndCreate(
      $('#processCard'),
      successCard,
      errorCard,
      _customerId);   
}
*/

$(document).ready(function() {
            
            function Save(){
            var url ="pasoTarjeta?accion=guardarT";
            $.ajax({
                type: 'POST',
                url : url,
                success: function (data, textStatus, jqXHR){
                }
            });
            
            OpenPay.setId('mikalxsdbk0bkgcfuamb');
            OpenPay.setApiKey('pk_4a6ca2abeaad4158b309a42beb63cdf5');
            OpenPay.setSandboxMode(true);
            
            $('#save-button').on('click', function(event) {
            event.preventDefault();
            Save();
            $("#save-button").prop( "disabled", true);
            OpenPay.token.extractFormAndCreate('customer-form', success_callbak, error_callbak);
            });
            
            var error_callbak = function(response) {
            var desc = response.data.description != undefined ? response.data.description : response.message;
            alert("ERROR [" + response.status + "] " + desc);
            $("#save-button").prop("disabled", false);
            };
            
            var success_callbak = function(response) {
              var token_id = response.data.id;
              $('#token_id').val(token_id);
              $('#customer-form').submit();
            };
    }

});