
$(document).ready(function () {
    $('.carousel.carousel-slider').carousel({ fullWidth: true });
    $('.modal').modal()
    // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
    $('.carousel').carousel({
        padding: 200
    });
    autoplay()
    function autoplay() {
        $('.carousel').carousel('next');
        setTimeout(autoplay, 4500);
    }
});


