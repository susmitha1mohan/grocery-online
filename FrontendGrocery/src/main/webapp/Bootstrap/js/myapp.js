$(function() {
	//active menu
	switch (menu) {
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#conctact').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		break;
	}
});