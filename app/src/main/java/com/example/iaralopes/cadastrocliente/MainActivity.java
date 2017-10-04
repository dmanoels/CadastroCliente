package com.example.iaralopes.cadastrocliente;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.EditText;
        import android.widget.ListView;
        import android.widget.Toast;

        import java.util.ArrayList;
        import java.util.List;

//referencia: https://www.youtube.com/watch?v=BA1naTy71Ec
public class MainActivity extends Activity {

    ListView listView;
    BancoDados db = new BancoDados(this);
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lbList);

        listarClientes();

//                /* TESTE DO CRUD */
//        //db.addCliente(new Cliente(2, "alice", "3333-9999", "9999-9999"));
//       // Cliente cliente = new Cliente();
//       // cliente.setCodigo(1);
//       // db.apagarCliente(cliente);
//
//        // Toast.makeText(MainActivity.this, "Apagado com sucesso", Toast.LENGTH_LONG).show();
//
//
//        Cliente cliente = db.selecionarCliente(2);
//
//       Log.d("Cliente Selecionado", "Codigo: " + cliente.getCodigo() + "Nome: " + cliente.getNome() +
//        "Telefone: " + cliente.getTelefone() + "Celular: " + cliente.getCelular());


    }

    public void listarClientes() {
        List<Cliente> clientes = db.listaTodosClientes();

        arrayList = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, arrayList);

        listView.setAdapter(adapter);



        for (Cliente c : clientes) {
//            Log.d("Lista", "\nID: " + c.getCodigo() + " Nome: " + c.getNome());

            arrayList.add(c.getNome());
            adapter.notifyDataSetChanged();
        }
    }

    public void onClickIncluir (View v) {
        startActivityForResult(new Intent(this, ClienteActivity.class), 1);
    }

}