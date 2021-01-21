package com.assignment;

/**
 * Ett mer avancerat exempel där vi överskuggar den inbyggda Object-klassens
 * metod toString() för att få en utskriven enum att skriva ut vad vi vill
 * i stället för sitt variabelnamn.
 *
 */
public enum ClothingCategoryAdvanced {

    STANDARD("Normalprissatt"), DEMO_PRODUCT("Provexemplar"), CUSTOMIZED("Specialbeställning");

    private String name;

    /** En enum-klass är automatiskt statisk, och dess konstruktor
     * kan bara åkallas direkt från själva enum-konstanten.
     *
     * Om vi har en konstruktor som tar emot en String kan vi skicka strängen
     * till konstruktorn med t.ex. DEMO_PRODUCT("foo").
     */
    ClothingCategoryAdvanced(String name) {
        this.name = name;
    }

    // Alla klasser har en toString() metod (hör till Object-klassen som alla klasser ärver)
    // Genom att överskugga den kan vi ändra på hur enum beter sig vid utskrift
    @Override
    public String toString() {
        return name;
    }

}