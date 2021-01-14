package com.assignment;

/** Gränssnitt
 *  Kan innehålla konstanter och abstrakta metoder (kroppslösa, methods without a body)
 *
 * Kolla in Things och dess subklasser för att se hur implementeringen går till
 *
 *  (Se ett anna exempel: Actions.java)
 *
 */
public interface IThings {

    // Konstanter skrivs med UPPER_SNAKE_CASE och kan inte ändra värde under programmets livstid
    double THE_ANSWER = 42;

    // Abstrakta metoder har ingen implementering
    // De måste överskuggas i icke-abstrakta klasser som implementerar gränssnittet.
    // IThings implementeras i Things (abstrakt) så metoderna måste finnas (överskuggas) i Cars som ärver Things
    void damage();

    void repair();

}
