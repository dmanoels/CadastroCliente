package com.example.iaralopes.cadastrocliente;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

/**
 * Created by Iara Lopes on 01/10/2017.
 */

public class ClienteActivity extends Activity {

    EditText editCodigo, editNome, editTelefone, editCelular;
    Button btnCancelar, btnConfirmar;
    BancoDados db = new BancoDados(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        editCodigo = (EditText)findViewById(R.id.edCodigo);
        editNome = (EditText)findViewById(R.id.edNome);
        editTelefone = (EditText)findViewById(R.id.edTelefone);
        editCelular= (EditText)findViewById(R.id.edCelular);

        btnConfirmar = (Button)findViewById(R.id.btConfirmar);


    }

    public void clickConfirmar (View view) {
        db.addCliente(new Cliente(Integer.parseInt(editCodigo.getText().toString()), editNome.getText().toString(),
                editTelefone.getText().toString(), editCelular.getText().toString()));
        Toast.makeText(ClienteActivity.this, "Adicionado com sucesso", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
