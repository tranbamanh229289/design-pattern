package behavioral.templateMethod;

public class ContactPage extends APageTemplate {
    @Override
    protected void showBody() {
        System.out.println("<body>This is body of contact page</body>");
    }
}
