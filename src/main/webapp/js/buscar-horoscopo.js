/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(function () {
	$.getJSON('horoscopo')
		.done(function (data) {
			$('#griego > .contenido').text(data.zodiacos.griego.horoscopo);
			$('#griego > .titulo').text(data.zodiacos.griego.nombre);
			$('#chino > .titulo').text(data.zodiacos.chino.nombre);
			$('#chino > .contenido').text(data.zodiacos.chino.horoscopo);
			$('#maya > .titulo').text(data.zodiacos.maya.nombre);
			$('#maya > .contenido').text(data.zodiacos.maya.horoscopo);
		});
});