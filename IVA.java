public class IVA {
    private float valorIVA;

    private Periodo periodo;



    //CONSTRUCTOR

    public IVA() {
        this.valorIVA = 0.0f;
        this.periodo = new Periodo();
    }


    //CONSTRUCTOR SOBRECARGADO

    public IVA(float valorIVA,Periodo periodo) {
        this.valorIVA = valorIVA;
        this.periodo = periodo;
    }

    //METODOS SET Y GET

    public float getValorIVA(){
        return this.valorIVA;
    }

    public void setValorIva(float valorIVA) {

        this.valorIVA = valorIVA;

    }

    public Periodo getPeriodo(){
        return periodo;
    }

    public void setPeriodo(Periodo periodo){
        this.periodo = periodo;
    }

    public String toString(){
        return "IVA: " + this.valorIVA + " Periodo: " + this.periodo + "]";
    }

}
