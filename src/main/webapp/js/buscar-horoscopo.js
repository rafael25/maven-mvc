/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(function () {
	$('#btn-buscar').click(function() {
		$.getJSON('horoscopo', {
			dia: parseInt($('#dia').val()),
			mes: parseInt($('#mes').val()),
			year: parseInt($('#year').val())
		})
		.done(function (data) {
			$('#griego > .contenido').html(data.zodiacos.griego.horoscopo);
			$('#griego > .titulo').html(data.zodiacos.griego.nombre);
			$('#chino > .titulo').html(data.zodiacos.chino.nombre);
			$('#chino > .contenido').html(data.zodiacos.chino.horoscopo);
			$('#maya > .titulo').html(data.zodiacos.maya.nombre);
			$('#maya > .contenido').html(data.zodiacos.maya.horoscopo);
		});
	});
});