/**
 * 
 */
var modDish = null;
$(document).ready(function() {
	$("#newDish").attr("disabled", true);
	$('#newDish').click(function() {
		addDish();
		resetDish();
	});
	$('#cleanDish').click(function() {
		resetDish();
	});
	$('#dishs').change(function() {
		activateDishs();
		showImport();
	});
});
function activateDishs() {
	$("#newDish").attr("disabled", false);
	if ($("#dishs").val() == "null")
		$("#newDish").attr("disabled", true);
}
function showImport() {
	$("#importe").val($("#dishs option:selected").attr("data"));
}
function resetDish(){
	$("#dishs").val("null");
	$("#importe").val("");
	$("#newDish").attr("disabled", true);
	$("#newDish").children("span").removeClass("glyphicon-pencil").addClass("glyphicon-plus").attr("title", "Agregar");
}
function addDish(){
	if ($("#platos tbody").length == 0)
		$("#platos").append("<tbody></tbody>");
	if (modDish != null)
		delDish(modDish);
	$("#platos tbody").append(
	    "<tr>" +
	      "<td>" + $("#dishs").val() + "</td>" +
	      "<td>" + $("#dishs").children("option:selected").text() + "</td>" +
	      "<td>" + $("#importe").val() + "</td>" +
	      "<td>" +
	        "<button type='button' title='Editar'" +
	            "onclick='edtDish(this);' " +
	            "class='btn btn-default'>" +
	            "<span class='glyphicon glyphicon-pencil' />" +
	        "</button>" +
	        "<button type='button' title='Eliminar' " +
	                "onclick='delDish(this);' " +
	                "class='btn btn-default'>" +
	                "<span class='glyphicon glyphicon-trash' />" +
	        "</button>" +
	      "</td>" +
	    "</tr>"
	);
	calCosts();
}
function edtDish(obj){
	$("#newDish").children("span").removeClass("glyphicon-plus").addClass("glyphicon-pencil").attr("title", "Editar");
	modDish = obj;
	$(obj).parents("tr").each(function() {
		$("#dishs").val(this.cells[0].textContent);
		$("#importe").val(this.cells[2].textContent)
	});
	activateDishs();
}
function delDish(obj){
	$(obj).parents("tr").remove();
	calCosts();
}
function calCosts() {
	var costs = 0.0;
	$("#platos tbody tr").each(function() {
		costs += parseFloat(this.cells[2].textContent);
	});
	$("#costs").val(costs);
}