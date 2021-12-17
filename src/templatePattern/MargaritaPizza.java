package templatePattern;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Dit is wat het programma doet.
 */
public class MargaritaPizza extends Pizza{


    @Override
    public void kiesDeeg() {
        System.out.println("Speciaal pizzadeeg");
    }

    @Override
    public void addIngredients() {
        System.out.println("tomaten saus ");
        System.out.println("verse basilicum");
    }
}
