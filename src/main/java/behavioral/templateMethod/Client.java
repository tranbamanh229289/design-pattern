package behavioral.templateMethod;

public class Client {
    public static void main(String[] args) {
        APageTemplate contactPage = new ContactPage();
        contactPage.showPage();

        APageTemplate detailPage = new DetailPage();
        detailPage.showPage();

        APageTemplate homePage = new HomePage();
        homePage.showPage();
    }
}
