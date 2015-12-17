function validateUser() {
	$.ajax({
		url : "validate",
		type : "POST",
		data : {
			username : $('#username').val()
		},
		dataType : "JSON",
		success : function(result) {
			if ($.trim(result) == "true") {
				$('#errors').html('username is already taken by another user!').show();
			} else {
				$('#form-registration').submit();
			}
		},
		error : function() {
			alert('Some error occurred!');
		}
	});
}
