package org.example;

public class Vetores {
    private String[] elementos;
    private int tamanho;

    public Vetores(String[] elementos) {

    }
    public Vetores(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /* public void adiciona(String elemento){

        for (int i = 0; i < this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/

    public boolean adiciona(String elemento)  {
        aumentaCapacidade();
        if(tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    private void aumentaCapacidade() {
        if(this.tamanho == this.elementos.length) {
            String[] newElementos = new String[this.tamanho * 2];
            for(int i = 0; i < this.tamanho; i++) {
                newElementos[i] = this.elementos[i];
            }
            this.elementos = newElementos;
        }
    }

    public boolean adiciona(int posicao, String elemento)  {
        aumentaCapacidade();
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição: " + posicao + " é inválida");
        }
        for(int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }



    public String busca(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição: " + posicao + " é inválida");
        }
        return elementos[posicao];
    }

    // Mostra todos o tamnho dos vetores
    public int tamanho(){
        return this.tamanho;
    }


    public int busca(String elemento) {
            for(int i = 0; i < this.tamanho; i++) {
                if(this.elementos[i].equals(elemento)) {
                    return i;
                }
            }
        return -1; // -1 é uma posição que não existe
    }

    // Mostra todos os elementos
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(); // A classes StringBuilder serve para manipular e construir Strings de forma eficiente.
        s.append("["); //
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }

    // B D E F F -> posição a ser removida é 1 (G)
    // 0 1 2 3 4 -> TAMANHO DO VETOR  É 5
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]
  public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
  }
}
