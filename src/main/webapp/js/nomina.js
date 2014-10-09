/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(function (){
    $('#boton').click(function(){
       $.getJSON('nomina')
        .done(function (data){
            $('#resultado').text('Nomina: '+data.nomina);
        }); 
    });
});