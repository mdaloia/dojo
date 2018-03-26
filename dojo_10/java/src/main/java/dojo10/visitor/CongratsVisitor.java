package dojo10.visitor;

import dojo10.domain.Congrats;

/**
 * Interface de la estructura que sera usada para realizar la interaccion
 * entre las 2 capas (la de presentacion y la de dominio).
 * De esta forma aislamos en un solo punto la interaccion entre las mismas
 * para minimizar (o evitar) que una capa mas interna conozca una capa
 * mas externa.
 */
public interface CongratsVisitor {

    public void visit(Congrats congrats);

}
