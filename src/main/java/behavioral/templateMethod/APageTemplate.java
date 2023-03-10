package behavioral.templateMethod;

public abstract class APageTemplate {
    protected void showHeader() {
        System.out.println("<header></header>");
    }

    protected void showFooter() {
        System.out.println("<footer></footer>");
    }

    protected abstract void showBody();

    protected void showPage() {
        this.showHeader();
        this.showBody();
        this.showFooter();
    }
}
