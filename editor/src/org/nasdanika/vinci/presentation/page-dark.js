$(document).ready( function() {
    $('.nsd-app-container').addClass(['border-bottom', 'border-dark']);
    $('.nsd-app-header').addClass('bg-${header-color}');
    $('.nsd-app-header .nav-link').addClass('text-light');
    $('.nsd-root-action').addClass(['display-4', 'text-light']);

    $('.nsd-app-navbar').addClass('bg-dark');
    $('.nsd-app-navbar nav.navbar').removeClass(['bg-light', 'navbar-light']);
    $('.nsd-app-navbar nav.navbar').addClass(['bg-dark', 'navbar-dark']);

    $('.nsd-app-navigation-panel').addClass(['col-auto', 'border-right', 'border-light', 'pb-1']);
    $('.nsd-app-content-panel').addClass(['col', 'p-1']);
    $('.nsd-app-footer').addClass(['bg-light', 'text-center']);
    $('.nsd-app-footer .nsd-footer-action').addClass('font-italic');
});
