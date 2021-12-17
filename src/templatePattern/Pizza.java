package templatePattern;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Dit is wat het programma doet.
 */
public abstract class Pizza {
    public abstract void kiesDeeg();
    public abstract void addIngredients();

    public void verwarmen() {
        System.out.println("10 minuten in de oven");
    }

    public void voegToppingToe () {
        System.out.println("topping toegevoegd");
    }

    public void voegKaasToe () {
        System.out.println("kaas toegevoegd");
    }

    public final void bereidPizza() {
        kiesDeeg();
        addIngredients();
        verwarmen();
        voegToppingToe();
        voegKaasToe();
    }
}
