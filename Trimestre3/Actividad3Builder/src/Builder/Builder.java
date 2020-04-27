package Builder;

import PackHotel.Pack;

public class Builder {
    private Pack pack;

    public Builder(){
        pack = new Pack();
    }

    public Builder setTipo(TipoPack tipoPack){
        pack.setTipoPack(tipoPack);
        return this;
    }

    public Builder añadirDesayuno(){
        pack.setDesayuno();
        return this;
    }

    public Builder añadirAlmuerzo(){
        pack.setAlmuerzo();
        return this;
    }

    public Builder añadirCena(){
        pack.setCena();
        return this;
    }

    public Builder añadirHabitacionSimple(){
        pack.setHabitacion_simple();
        return this;
    }

    public Builder añadirHabitacionDoble(){
        pack.setHabitacion_doble();
        return this;
    }

    public Builder añadirHabitacionSuite(){
        pack.setHabitacion_suite();
        return this;
    }

    public Builder añadirCamaAdicional(){
        pack.setCama_adicional();
        return this;
    }

    public Builder añadirParqueAtracciones(){
        pack.setParque_atracciones();
        return this;
    }

    public Builder añadirCursoSurf(){
        pack.setCurso_surf();
        return this;
    }

    public Builder añadirActividadesInfantiles(){
        pack.setActividades_infantiles();
        return this;
    }

    public Builder añadirCineEnPlaya(){
        pack.setCine_en_playa();
        return this;
    }

    public Pack getResultado(){
        return pack;
    }
}
