package com.example.meuapp;

import android.content.Context;
import android.widget.Toast;

public class Tools {

    //static = não precisa instanciar a Classe de origem do método
    //só é possível em algumas situações
    public static void exibirMensagem(Context telaOrigem, String mensagem){
        Toast.makeText(telaOrigem, mensagem, Toast.LENGTH_LONG).show();
    }

    public static int somarInteiros(int[] inteiros){
        int resultado = 0; //declarando o resultado da operação

        for(int i = 0; i < inteiros.length; i++){
            resultado += inteiros[i];
        }

        return resultado;
    }

    public static int somarInteiros(int numero1, int numero2){
        int resultado; //declarando o resultado da operação
        resultado = numero1 + numero2; //resultado recebe a soma dos 2 números
        return resultado; //retorna o resultado da operação
    }

}
