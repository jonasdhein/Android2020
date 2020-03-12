package com.example.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    //Declarando as variáveis
    Context context = PrincipalActivity.this;
    Button btnSoma, btnSubtrai;
    TextView lblTexto;
    EditText txtCampo1, txtCampo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Referencia para o XML com o layout dos campos e botões
        setContentView(R.layout.activity_principal);

        //Criando o link com o layout
        btnSoma = findViewById(R.id.btnSomaPrincipal);
        lblTexto = findViewById(R.id.lblTextoPrincipal);
        txtCampo1 = findViewById(R.id.txtCampo1Principal);
        txtCampo2 = findViewById(R.id.txtCampo2Principal);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //juntando (concatenando) o texto dos dois campos
                //String wCampos = txtCampo1.getText().toString() + " - " +
                //        txtCampo2.getText().toString();

                //Verifica se tem valor informado
                if(!txtCampo1.getText().toString().equals("")){
                    //transformar o valor do campo1 para INTEIRO
                    int num1 = Integer.parseInt(txtCampo1.getText().toString());
                    int num2 = Integer.parseInt(txtCampo2.getText().toString());
                    //transformar um número em String
                    lblTexto.setText(String.valueOf(num1 + num2));

                    Tools.exibirMensagem(context,"Resultado");
                }
            }
        });
    }
}
