package school.entities;

public class entities03 {

    public String name;
    public Double n1;
    public Double n2;
    public Double n3;

    public double geral(){
        double resultado = n1 + n2 + n3;
        return resultado;
    }

    public Double missing(){
       double missing;
       missing = 60 - (this.n1 + this.n2 + this.n3);
        return missing;
    }

    public String toString(){
        if(this.n1 + this.n2 + this.n3 >= 60){
            System.out.println("FINAL GRADE = " + geral());
            System.out.println("Pass");
        }else {
            System.out.println("FINAL GRADE = " + geral());
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f",missing()) + " POINTS");
        }
        return "";
    }

}
