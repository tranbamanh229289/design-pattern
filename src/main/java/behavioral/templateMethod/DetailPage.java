package behavioral.templateMethod;

public class DetailPage extends APageTemplate {
    @Override
    protected void showBody() {
        System.out.println("<body>This is body of detail page</body>");
    }
}
