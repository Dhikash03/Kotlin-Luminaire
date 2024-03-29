//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*fun main() {

    val eclairage = AmpouleIncandescente();
    /**
     * Cycles d'éclairage et d'extinction d'une ampoule
     */
    var nbCycles = 0;
    do{
        eclairage.allumer();
        while(eclairage.etat() > 0 ){
            eclairage.diminuer();
        }
        println(eclairage.toString());
        nbCycles ++;
    }while (nbCycles < 1000 && eclairage.etat() != -1);
    println("nombre de cycles "+nbCycles);
}
*/

/*fun main() {

    val eclairage = AmpouleLed();
    /**
     * Cycles d'éclairage et d'extinction d'une ampoule
     */
    var nbCycles = 0;
    do{
        eclairage.allumer();
        while(eclairage.etat() > 0 ){
            eclairage.diminuer();
        }
        println(eclairage.toString());
        nbCycles ++;
    }while (nbCycles < 1000 && eclairage.etat() != -1);
    println("nombre de cycles "+nbCycles);
}*/

fun main() {

    val eclairage = Luminaire();
    /**
     * Cycles d'éclairage et d'extinction d'une ampoule
     */
    var nbCycles = 0;
    do{
        eclairage.allumer();
        while(eclairage.etat() > 0 ){
            eclairage.diminuer();
        }
        println(eclairage.toString());
        nbCycles ++;
    }while (nbCycles < 1000 && eclairage.etat() != -1);
    println("nombre de cycles "+nbCycles);

}