/* Spanish initialisation for the jQuery UI date picker plugin. */
/* Written by Izzet Emre Erkan (kara@karalamalar.net). */
jQuery(function($){
	$.datepicker.regional['es'] = {
		closeText: 'kapat',
		prevText: '&#x3c;geri',
		nextText: 'ileri&#x3e',
		currentText: 'bugün',
		monthNames: ['Enero','Febrero','Marzo','Abril','Mayo','Jun',
		     		'Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'],
		monthNamesShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun',
		     		'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
		dayNames: ['Lunes','Martes','Miércoles','Jueves','Viernes','Sábado','Domingo'],
		dayNamesShort: ['Dom','Lun','Mar','Mier','Jue','Vie','Sab'],
		dayNamesMin: ['Dom','Lun','Mar','Mier','Jue','Vie','Sab'],
		weekHeader: 'Hf',
		dateFormat: 'dd/mm/yy',
		firstDay: 1,
		isRTL: false,
		showMonthAfterYear: false,
		yearSuffix: ''};
	$.datepicker.setDefaults($.datepicker.regional['es']);
});