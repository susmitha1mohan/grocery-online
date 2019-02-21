$(function() {
	//active menu
	switch (menu) {
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#conctact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		if(menu=="Home")
		$('#listproducts').addClass('active');
	    $('#a_'+menu).addClass('active');
		break;
	}
});