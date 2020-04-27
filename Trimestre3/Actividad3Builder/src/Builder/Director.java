package Builder;

import PackHotel.Pack;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Pack contratarPackBasico(){
        return builder.añadirHabitacionSimple().añadirDesayuno().setTipo(TipoPack.PACK_BASICO).getResultado();
    }

    public Pack contratarPackRomance(){
        return builder.añadirHabitacionDoble().añadirCena().setTipo(TipoPack.PACK_ROMANCE).getResultado();
    }

    public Pack contratarPackFamiliar(){
        return builder.añadirHabitacionDoble().añadirCamaAdicional().añadirDesayuno().añadirAlmuerzo().añadirCena().añadirParqueAtracciones().añadirActividadesInfantiles().añadirCineEnPlaya().setTipo(TipoPack.PACK_FAMILIAR).getResultado();
    }

    public Pack contratarPackPadresRelajados(){
        return builder.añadirHabitacionDoble().añadirCamaAdicional().añadirDesayuno().añadirAlmuerzo().añadirCena().añadirActividadesInfantiles().añadirCursoSurf().añadirCineEnPlaya().setTipo(TipoPack.PACK_PADRES_RELAJADOS).getResultado();
    }

    public Pack contratarPackDeluxe(){
        return builder.añadirHabitacionSuite().añadirDesayuno().añadirAlmuerzo().añadirCena().añadirCursoSurf().añadirCineEnPlaya().setTipo(TipoPack.PACK_DELUXE).getResultado();
    }

    public Pack contratarPackDeluxeFamiliar(){
        return builder.añadirHabitacionSuite().añadirCamaAdicional().añadirDesayuno().añadirAlmuerzo().añadirCena().añadirParqueAtracciones().añadirCursoSurf().añadirActividadesInfantiles().añadirCineEnPlaya().setTipo(TipoPack.PACK_DELUXE_FAMILIAR).getResultado();
    }
}
