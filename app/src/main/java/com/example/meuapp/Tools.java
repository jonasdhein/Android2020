package com.example.meuapp;

import android.content.Context;
import android.widget.Toast;

public class Tools {

    //static = não precisa instanciar a Classe de origem do método
    //só é possível em algumas situações
    public static void exibirMensagem(Context telaOrigem, String mensagem){
        Toast.makeText(telaOrigem, mensagem, Toast.LENGTH_LONG).show();
    }

}
