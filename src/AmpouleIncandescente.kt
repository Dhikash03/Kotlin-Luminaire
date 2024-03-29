class AmpouleIncandescente: Eclairage {
    override fun allumer() {
        TODO("Not yet implemented")
    }

    override fun eteindre() {
        TODO("Not yet implemented")
    }

    override fun intensifier() {
        TODO("Not yet implemented")
    }

    override fun diminuer() {
        TODO("Not yet implemented")
    }

    override fun etat(): Int {
        TODO("Not yet implemented")
    }

    /**
     * @return l'état de l'objet sous la forme d'une chaîne de caractères
     */
    override fun toString(): String {
        return this.javaClass.name + " : " + this.etat
    }
}

