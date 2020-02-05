$(document).ready( function() {
    $('.nsd-app-container').addClass(['border-bottom', 'border-dark']);
    $('.nsd-app-header').addClass('bg-${header-color}');
    $('.nsd-app-header .nav-link').addClass('text-light');
    $('.nsd-root-action').addClass(['display-4', 'text-light']);

    $('.nsd-app-navbar').addClass('bg-light');

    $('.nsd-app-navigation-panel').addClass(['col-auto', 'border-right', 'border-light', 'pb-1']); 
    $('.nsd-app-content-panel').addClass(['col', 'p-1']);
    $('.nsd-app-footer').addClass(['bg-dark', 'text-center']);
    $('.nsd-app-footer .nsd-footer-action').addClass(['text-light', 'font-italic']);
});
