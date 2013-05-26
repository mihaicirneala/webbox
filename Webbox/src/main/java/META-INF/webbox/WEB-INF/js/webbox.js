$(document).ready(function() {
	$('#box').keypress(function (e) {
		  if (e.which == 13) {
			  box_enter();
		  }
	});	
});

function box_enter() {
	var q = $('#box').val();
	$.ajax({
		type : "GET",
		url : "/query",
		data : {
			q: q
		}
	}).done(function(data) {
		$('#box').val(data.q);
		$('.msg_holder').text(data.msg);
	});
	if (q == "clear" || q == "cls" || q == "box clear" || q == "box cls") {
		box_clear();
	}
	
}

function box_clear() {
	$('#box').val("");
	$('.msg_holder').text("...");
}
