package pages;

public class NaguietaPaginaPrincipal extends BasePage {
    
    private String sectionLink = "//a[normalize-space()='%s' and @href]";

    public NaguietaPaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a https://naguieta.github.io/
    public void navigateToNaguieta() {
        navigateTo("https://naguieta.github.io");

    }

    public void clickOnSectionNavigationBar(String section) {
        // Reemplaza el marcador de posición en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);

    }

    

}

