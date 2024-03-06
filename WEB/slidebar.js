function toggleNavbar() {
    const navLinks = document.querySelector('.nav-links');
    const navbar = document.querySelector('.navbar1');

    navbar.classList.toggle('active');
    navLinks.classList.toggle('active');
}