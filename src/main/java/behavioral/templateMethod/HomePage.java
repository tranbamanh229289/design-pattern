package behavioral.templateMethod;

public class HomePage extends APageTemplate {
    @Override
    protected void showBody() {
        System.out.println("<body> this is body of home page</body>");
    }
}
