/**
 * 
 */
$(document).ready(function() {
	$('#newPlate').click(function() {
	});
	$('#newDish').click(function() {
		$("#detail").submit();
	});
	
});
function showImport(obj){
	$("#importe").val($("#dishs option:selected").attr("data"));
}