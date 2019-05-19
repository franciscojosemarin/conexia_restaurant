/**
 * 
 */
var modDish = null;
var dishes = [];
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
	$('#btnSave').click(function() {
		hideMessages();
		$("#btnSave").attr("disabled", true);
		var formData = {
			'cliente' : $("#cliente").val(),
			'camarero' : $("#camarero").val(),
			'mesa' : $("#mesa").val(),
			'platos' : dishes
		}

		$.ajax({
			contentType : "application/json",
			url : '/invoice',
			data : JSON.stringify(formData),
			dataType : 'json',
			type : 'POST',
			success : function(data) {
				$('#btnSave').prop('disabled', false);
				showMessage(data);
				$('#clnSave').click();
				setTimeout(hideMessages, 5000);
			},
			error : function(jqXHR, textStatus, errorThrown) {
				$('#btnSave').prop('disabled', false);
				showErrors(jqXHR);
			}
		});
	});
	$('#clnSave').click(function() {
		$("#platos tbody").empty();
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
function resetDish() {
	$("#dishs").val("null");
	$("#importe").val("");
	$("#newDish").attr("disabled", true);
	$("#newDish").children("span").removeClass("glyphicon-pencil").addClass(
			"glyphicon-plus").attr("title", "Agregar");
}
function addDish() {
	if ($("#platos tbody").length == 0)
		$("#platos").append("<tbody></tbody>");
	if (modDish != null)
		delDish(modDish);
	$("#platos tbody")
			.append(
					"<tr>"
						+ "<td>" + $("#dishs").val() + "</td>"
						+ "<td>" + $("#dishs").children("option:selected").text() + "</td>"
						+ "<td>" + $("#importe").val() + "</td>"
						+ "<td>"
							+ "<button type='button' title='Editar' onclick='edtDish(this);' class='btn btn-sm btn-warning'>"
							+ "<span class='glyphicon glyphicon-pencil'/>"
							+ "</button>"
							+ "<button type='button' title='Eliminar' onclick='delDish(this);' class='btn btn-sm btn-danger'>"
							+ "<span class='glyphicon glyphicon-trash'/>"
							+ "</button>"
						+ "</td>"
				+ "</tr>");
	calCosts();
	var dish = {
		idPlato : $("#dishs").val(),
		plato : $("#dishs").children("option:selected").text(),
		importe : $("#importe").val()
	};
	dishes.push(dish);
}
function edtDish(obj) {
	console.log(obj);
	$("#newDish").children("span").removeClass("glyphicon-plus").addClass(
			"glyphicon-pencil").attr("title", "Editar");
	modDish = obj;
	$(obj).parents("tr").each(function() {
		$("#dishs").val(this.cells[0].textContent);
		$("#importe").val(this.cells[2].textContent)
	});
	activateDishs();
}
function delDish(obj) {
	$(obj).parents("tr").each(function() {
		dishes.splice(this.rowIndex - 1, 1)
	}).remove();
	calCosts();
}
function calCosts() {
	var costs = 0.0;
	$("#platos tbody tr").each(function() {
		costs += parseFloat(this.cells[2].textContent);
	});
	$("#costs").val(costs);
}
function hideMessages() {
	$(".alert").addClass('hide');
}
function showMessage(data) {
	if (data.message)
		$("#msg_success").text(data.message).removeClass('hide');
	if (data.error)
		$("#msg_error").text(data.error).removeClass('hide');
}
function showErrors(jqXHR) {
	if (jqXHR.status != 406) {
		console.log(jqXHR);
		console.log(textStatus);
		console.log(errorThrown);
		return;
	}
	var errors = JSON.parse(jqXHR.responseText);
	for ( const error in errors) {
		for ( const key in errors[error]) {
			$("#msg_" + key).text(errors[error][key]).removeClass('hide');
		}
	}
}