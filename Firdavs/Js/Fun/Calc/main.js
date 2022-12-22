var output = $('#output');
var input = $('.operation');

$(input).on('click', function () {
    let _this = $(this);
    let opertaion = _this.attr('data-operation');

    if (opertaion == 'back') {   
    } else if (opertaion == 'clear') {
    } else if (opertaion == 'invert') {
    } else if (opertaion == 'root') {
    } else if (opertaion == 'divide') {
    } else if (opertaion == 'multiply') {
    } else if (opertaion == 'plus') {
    } else if (opertaion == 'minus') {
    } else if (opertaion == 'point') {
    } else if (opertaion == 'equal') {
        
    }
    output.val(opertaion)
});