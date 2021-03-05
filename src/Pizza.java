public class Pizza {
    String masa;
    boolean relleno;
    int tipo;
    boolean salsa;
    String tipo_salsa;
    boolean cebolla;
    boolean sinGluten;
    boolean extraQueso;
    boolean piña;
    boolean champiñones;
    boolean jamon;

    public Pizza() {
    }


    public Pizza(String masa, boolean relleno,int tipo,boolean salsa, String tipo_salsa,boolean cebolla,boolean sinGluten,boolean extraQueso,boolean piña,boolean champiñones,boolean jamon) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.tipo_salsa = tipo_salsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;


    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setTipo_salsa(String tipo_salsa) {
        this.tipo_salsa = tipo_salsa;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }


    public void setPiña(boolean piña) {
        this.piña = piña;
    }


    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }


    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "masa='" + masa + '\'' +
                ", relleno=" + relleno +
                ", tipo=" + tipo +
                ", salsa=" + salsa +
                ", tipo_salsa='" + tipo_salsa + '\'' +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", jamon=" + jamon +
                '}';
    }
}

