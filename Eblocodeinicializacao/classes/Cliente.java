package br.com.abc.javacore.Eblocodeinicializacao.classes;

public class Cliente {
    // 1 - Alocado espaço na memoria para o objeto que será criado
    // 1 = Cada atrubuto de clase é criado e inicializado com seus valore default ou valores expricitos
    // 3 - Bloco de inicializacao é executado
    //4 - O construtor é executado

    private int[] parcelas;

    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco");
        for(int i =1; i<=100;i++){
            parcelas[i-1] = i;
        }

    }

    public Cliente(){
        System.out.println("Dentro do construtor");
        for(int parcela : this.parcelas){
            System.out.print(parcela + " ");
        }
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }



}

